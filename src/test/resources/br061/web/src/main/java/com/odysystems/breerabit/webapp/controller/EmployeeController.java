package com.odysystems.breerabit.webapp.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.google.api.services.admin.directory.model.User;
import com.google.api.services.admin.directory.model.UserName;
import com.odysystems.breerabit.webapp.pojo.UltiEmployeeFormList;
import com.odysystems.model.Newuserrun;
import com.odysystems.service.GoogleUserService;
import com.odysystems.service.UltiProService;
import com.odysystems.service.impl.GoogleUserException;
import com.odysystems.soap.EmployeeP;
import com.odysystems.util.*;

@SessionAttributes(value = { "employeeList", "returnedList", "returnedUser" })
@Controller
public class EmployeeController extends BaseFormController {
	private UltiProService ulti = null;
	private GoogleUserService goog = null;
	private Log log = LogFactory.getLog(EmployeeController.class);

	public EmployeeController() {
		setCancelView("redirect:/home");
		setSuccessView("redirect:/employee/googleInit");
	}

	@Autowired
	public void setUlti(UltiProService ulti, GoogleUserService goog) {
		this.ulti = ulti;
		this.goog = goog;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/employee/googleInit")
	@ModelAttribute(value = "googUser")
	protected User showForm(HttpServletRequest request) throws Exception {
		String id = request.getParameter("id");
		User user = new User();
		user.setName(new UserName());

		if (!StringUtils.isBlank(id)) {
			user = goog.getUserByEmail(new String(id));

			if (user == null) {
				log.info("User not found");
				saveError(request, "User with the email address of " + new String(id)
						+ " was not found within the Google directory");
				User blankUser = new User();
				blankUser.setName(new UserName());

				return blankUser;
			} else {

				return user;
			}
		}

		return user;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employee/googleInit")
	public String onSubmit(@ModelAttribute(value = "googUser") User googUser, BindingResult errors,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		log.debug("Submitted a POST request");
		String referer = request.getHeader("Referer");

		if (request.getParameter("cancel") != null) {
			saveMessage(request, "Recieved a Cancel Request");
			return getCancelView();
		}

		User blankUser = new User();
		UserName name = new UserName();
		blankUser.setName(name);

		if (request.getParameter("add") != null) {

			try {
				User newUser = goog.createUser(googUser);

				String primaryEmail = newUser.getPrimaryEmail();
				saveMessage(request, "Successfully added " + primaryEmail + " to Google");
				setSuccessView("redirect:googleInit?id=" + primaryEmail);
				return getSuccessView();
			} catch (GoogleUserException e) {
				e.printStackTrace();
				saveError(request, e.getMessage());
				response.sendRedirect(response.encodeRedirectURL(referer));
				return null;
			}
		}
		if (request.getParameter("delete") != null) {
			goog.deleteUser(googUser.getPrimaryEmail());
			saveMessage(request, "Successfully deleted " + googUser.getPrimaryEmail() + " from Google");
			setSuccessView("redirect:googleInit");
			return getSuccessView();
		}
		if (request.getParameter("update") != null) {
			User updatedUser = goog.updateUser(googUser);
			saveMessage(request, "Successfully updated " + updatedUser.getPrimaryEmail());
			setSuccessView("redirect:googleInit?id=" + updatedUser.getPrimaryEmail());
			return getSuccessView();
		}

		if (request.getParameter("reset") != null) {
			log.debug("reseting the users password");
			googUser.setPassword("welcome to odyssey!");
			googUser.setChangePasswordAtNextLogin(true);
			goog.updateUser(googUser);
			saveMessage(request, "Successfully reset users password back to default");
			setSuccessView("redirect:googleInit?id=" + googUser.getPrimaryEmail());
			return getSuccessView();
		}

		return getCancelView();
	}

	private Map<String, String> setInitDates(Map<String, String> requestParams, HttpServletRequest request) {
		Calendar weekBack = Calendar.getInstance();
		weekBack.add(Calendar.DAY_OF_MONTH, 5);

		Calendar weeksFwd = Calendar.getInstance(); // this would default to now
		weeksFwd.add(Calendar.DAY_OF_MONTH, 30);

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String formattedBack = formatter.format(weekBack.getTime());
		String formattedFwd = formatter.format(weeksFwd.getTime());

		requestParams.put("beginDate", formattedBack);
		requestParams.put("endDate", formattedFwd);

		log.debug(formattedBack);
		log.debug(formattedFwd);
		return requestParams;
	}

	private Boolean testDates(HttpServletRequest request, Map<String, String> requestParams) {

		// Test for date range error
		String sBegin = requestParams.get("beginDate");
		String sEnd = requestParams.get("endDate");

		if (sBegin != null && !sBegin.isEmpty()) { // Test the dates
			log.debug(sBegin);
			log.debug(sEnd);
			DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
			DateTime jBegin = formatter.parseDateTime(sBegin);
			DateTime jEnd = formatter.parseDateTime(sEnd);
			log.debug(jBegin);
			log.debug(jEnd);
			Days d = Days.daysBetween(jBegin.toLocalDate(), jEnd.toLocalDate());
			int days = d.getDays();
			log.debug("range of days = " + days);

			if (days >= 60) {
				saveError(request, "Date range is greater than 60 days.");
				return true;
			}

			else
				return false;
		}

		return false;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/employee/newHireBrowser")
	public Model handleRequest(HttpServletRequest request, HttpServletResponse response,
			@RequestParam Map<String, String> requestParams, String query, Model model) throws Exception {

		// TODO: Attach the welcome presentation to the welcome email after downloading
		// and convertnig to PDF.

		if (model == null) {
			model = new ExtendedModelMap();
		}

		if (!requestParams.isEmpty()) {

			String referer = request.getHeader("Referer");
			if (referer == null) {
				referer = request.getContextPath();
			}
			;
			Boolean errorState = testDates(request, requestParams);
			if (errorState) {
				response.sendRedirect(response.encodeRedirectURL(referer));
			} else if (!errorState) {
				try {

					String sBegin = requestParams.get("beginDate");
					String sEnd = requestParams.get("endDate");

					log.debug(sBegin);
					log.debug(sEnd);

					List<EmployeeP> list = ulti.getNewEmployeeInfo(requestParams);
					UltiEmployeeFormList form = new UltiEmployeeFormList();
					form.setEmployees(list);

					log.debug("Adding Employee List with size " + list.size() + " to the model");
					model.addAttribute("employeeList", form);
				} catch (NullPointerException se) {
					saveError(request, se.getMessage());
					response.sendRedirect(response.encodeRedirectURL(referer));

				}
			}
		} else {
			requestParams = setInitDates(requestParams, request);
			List<EmployeeP> list = ulti.getNewEmployeeInfo(requestParams);
			UltiEmployeeFormList form = new UltiEmployeeFormList();
			form.setEmployees(list);
			model.addAttribute("employeeList", form);
		}
		return model;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/employee/employeesBrowser")
	public Model handleEmployeeBrowser(HttpServletRequest request, HttpServletResponse response,
			@RequestParam Map<String, String> requestParams, String query, Model model) throws Exception {

		// TODO: Send email to Pete and Bobby with new user summary
		// TODO: Return new user summary
		// TODO: Attach the welcome presentation to the welcome email after downloading
		// and convertnig to PDF.
		// TODO: Create activity log of bRabbit activity

		if (model == null) {
			model = new ExtendedModelMap();
		}

		if (!requestParams.isEmpty()) {

			String referer = request.getHeader("Referer");
			if (referer == null) {
				referer = request.getContextPath();
			}
			;

			@SuppressWarnings("unchecked")
			List<String> messages = (List<String>) request.getSession().getAttribute(BaseFormController.MESSAGES_KEY);

			@SuppressWarnings("unchecked")
			List<String> errors = (List<String>) request.getSession()
					.getAttribute(BaseFormController.ERRORS_MESSAGES_KEY);

			if (messages == null) {
				messages = new ArrayList<String>();
			}

			if (errors == null) {
				errors = new ArrayList<String>();
			}

			Boolean errorState = false;
			// Test for date range error
			String sBegin = requestParams.get("beginDate");
			String sEnd = requestParams.get("endDate");

			if (sBegin != null && !sBegin.isEmpty()) {
				log.debug(sBegin);
				log.debug(sEnd);
				DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
				DateTime jBegin = formatter.parseDateTime(sBegin);
				DateTime jEnd = formatter.parseDateTime(sEnd);
				log.debug(jBegin);
				log.debug(jEnd);
				Days d = Days.daysBetween(jBegin.toLocalDate(), jEnd.toLocalDate());
				int days = d.getDays();
				log.debug("range of days = " + days);
				if (days >= 60) {
					errors.add("Date range is greater than 60 days.");
					if (!errorState) {
						errorState = true;
					}
				}
			}

			if (errorState) {
				request.getSession().setAttribute(BaseFormController.ERRORS_MESSAGES_KEY, errors);
				response.sendRedirect(response.encodeRedirectURL(referer));
			} else if (!errorState) {
				log.debug("Error State = " + errorState);
				log.debug("In the Else If Clause");

				try {
					List<EmployeeP> list = ulti.getEmpInfo(requestParams);
					UltiEmployeeFormList form = new UltiEmployeeFormList();
					form.setEmployees(list);

					log.debug("Adding Employee List with size " + list.size() + " to the model");
					model.addAttribute("employeeList", form);
					// return model;
				} catch (NullPointerException se) {
					model.addAttribute("searchError", se.getMessage());
					request.getSession().setAttribute(BaseFormController.MESSAGES_KEY, messages);
					response.sendRedirect(response.encodeRedirectURL(referer));
				}



			}
		}
		return model;
	}

	@ModelAttribute("returnedList")
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.GET }, value = "/employee/returnedEmployee")
	public Model onSubmit(@RequestParam(value = "empID", required = false) String empID, HttpServletRequest request,
			HttpServletResponse response) {
		Model model = new ExtendedModelMap();
		log.debug("Made it here");
		String referer = request.getHeader("Referer");
		if (referer == null) {
			referer = request.getContextPath();
		}
		;

		HttpSession session = request.getSession(true);

		// If this is a single user then
		if (empID != null) {

			log.debug("The Create button was clicked for employee ID number #" + empID);
			model = singleCreate(request, empID, model);
			// model = listCreate(form, request, response, messages, errors, referer);

			return model;
		} else {
			log.debug("Multi create was toggled");
			UltiEmployeeFormList form = new UltiEmployeeFormList();
			try {
				form = (UltiEmployeeFormList) session.getAttribute("employeeList");
			} catch (NullPointerException e) {
				saveError(request, "Employee List Was Empty");
				try {
					response.sendRedirect(referer);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (request.getParameter("create") != null) {
				log.debug("The Create button was clicked");
				model = listCreate(form, request, response, referer, model);
			}

			return model;

		}

	}

	private Model singleCreate(HttpServletRequest request, String empID, Model model) {
		EmployeeP emp = new EmployeeP();
		emp.setPerson(ulti.getEmployeeById(empID));
		// Ulti only returns company code, not emp ID -- at least in their models anway.
		// So, manually set the employee ID here.
		// That didn't work

		List<EmployeeP> emps = new ArrayList<EmployeeP>();
		Map<String, String> map = new HashMap<String, String>();
		map.put("empId", empID);
		try {
			//Retrieves a list of employeeP objects based on Employee ID
			emps = ulti.getEmpInfo(map);
			
		} catch (Exception e1) {
			log.debug("Unable to retrieve a user with employee ID of " + empID);
		}
		log.debug("Creating a new google user for employee ID of :: " + empID);
		
		try {
			Newuserrun returned = goog.createUser(emps);
			saveMessage(request, "Successfully created the user");
			model.addAttribute(returned);
		} catch (GoogleUserException e) {
			saveError(request, "Google is out of licenses.  Add more license and try again.");
			return new ExtendedModelMap();
		}
		
		return model;

	}

	private Model listCreate(UltiEmployeeFormList form, HttpServletRequest request, HttpServletResponse response,
			String referer, Model model) {

		log.info("Initializing " + form.getEmployees().size() + " employees");

		List<EmployeeP> list = form.getEmployees();
		Newuserrun returnedUsers;
		try {
			returnedUsers = goog.createUser(list);
			saveMessage(request, "Successfully created " + list.size() + "new Users.");
		} catch (Exception e) {
			saveError(request, "Failed to create " + list.size() + "new Users.");
			e.printStackTrace();
			return model;
		}
		model.addAttribute("employeeList", form);
		model.addAttribute(returnedUsers);
		return model;

	}

}

package com.odysystems.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.api.services.admin.directory.model.User;
import com.odysystems.exceptions.NullEmailException;
import com.odysystems.exceptions.UserExistsException;
import com.odysystems.model.SSOUserModel;
import com.odysystems.service.UltiProService;
import com.odysystems.soap.EmployeeP;
import com.odysystems.soap.JaxWsHandlerResolver;
import com.odysystems.soap.ultipro.SSOuser.ArrayOfSsoUser;
import com.odysystems.soap.ultipro.SSOuser.EmployeeIdentifier;
import com.odysystems.soap.ultipro.SSOuser.EmployeeNumberIdentifier;
import com.odysystems.soap.ultipro.SSOuser.IEmployeeSsoUser;
import com.odysystems.soap.ultipro.SSOuser.ProxyIEmployeeSsoUser;
import com.odysystems.soap.ultipro.SSOuser.SsoUser;
import com.odysystems.soap.ultipro.SSOuser.SsoUserCreateResponse;
import com.odysystems.soap.ultipro.SSOuser.SsoUserDeleteResponse;
import com.odysystems.soap.ultipro.SSOuser.SsoUserGetResponse;
import com.odysystems.soap.ultipro.employeeAddress.Address;
import com.odysystems.soap.ultipro.employeeAddress.AddressFindResponse;
import com.odysystems.soap.ultipro.employeeAddress.IEmployeeAddress;
import com.odysystems.soap.ultipro.employeeAddress.ProxyIEmployeeAddress;
import com.odysystems.soap.ultipro.employeePerson.ArrayOfPerson;
import com.odysystems.soap.ultipro.employeePerson.Employee;
import com.odysystems.soap.ultipro.employeePerson.EmployeePerson;
import com.odysystems.soap.ultipro.employeePerson.EmployeeQuery;
import com.odysystems.soap.ultipro.employeePerson.IEmployeePerson;
import com.odysystems.soap.ultipro.employeePerson.ObjectFactory;
import com.odysystems.soap.ultipro.employeePerson.Person;
import com.odysystems.soap.ultipro.employeePerson.PersonFindResponse;
import com.odysystems.soap.ultipro.employeePerson.PersonGetResponse;
import com.odysystems.soap.ultipro.employeePerson.PersonUpdateResponse;
import com.odysystems.soap.ultipro.employeePerson.ProxyIEmployeePerson;
import com.odysystems.soap.ultipro.employeePerson.UpdatePerson;
import com.odysystems.soap.ultipro.login.ILoginService;
import com.odysystems.soap.ultipro.login.LoginService;
import com.odysystems.soap.ultipro.login.TokenRequest;
import com.odysystems.soap.ultipro.login.TokenResponse;
import com.odysystems.util.CryptKeeper;

/**
 * @author cuzimbob
 *
 */
@Service("UltiProService")
@WebService(serviceName = "UltiProService", endpointInterface = "com.odysystems.breerabit.webapp.soap.UltiPro")
public class UltiProServiceImpl extends BaseSoapService<Object> implements UltiProService {
	protected final transient Log log = LogFactory.getLog(UltiProServiceImpl.class);
	final String clientAccessKey = "3PC3J";
	final String userAPIKey = "BE08Z00000K0";
	private String token = new String();
	private Date tokenDate = new Date();
	public final static long MILLIS_PER_DAY = 24 * 60 * 60 * 1000L;
	GoogleUserServiceImpl googleService; // = new GoogleUserServiceImpl();

	@Autowired
	public void setManager(GoogleUserServiceImpl googleService) {
		this.googleService = googleService;
	}

	//
	public Person getEmployeeById(String empId){
		getAuthToken();
		com.odysystems.soap.ultipro.employeePerson.ObjectFactory factory = new com.odysystems.soap.ultipro.employeePerson.ObjectFactory();
		ProxyIEmployeePerson personProxy = new ProxyIEmployeePerson();
		// Set Authentication Header
		IEmployeePerson person = personProxy.getWSHttpBindingIEmployeePerson();
		((BindingProvider) person).getRequestContext().put("clientAccessKey", clientAccessKey);
		((BindingProvider) person).getRequestContext().put("token", token);
		
		JAXBElement<String> companyCode = factory.createEmployeeIdentifierCompanyCode("ODY");

		com.odysystems.soap.ultipro.employeePerson.Employee employee = factory.createEmployee();
		JAXBElement<String> jasEmployeeID = factory.createEmployeeNumberIdentifierEmployeeNumber(empId);
		employee.setEmployeeNumber(jasEmployeeID);

		com.odysystems.soap.ultipro.employeePerson.EmployeeNumberIdentifier eNID = new com.odysystems.soap.ultipro.employeePerson.EmployeeNumberIdentifier();
		eNID.setEmployeeNumber(jasEmployeeID);
		eNID.setCompanyCode(companyCode);

		com.odysystems.soap.ultipro.employeePerson.EmployeeIdentifier employeeIdentifier = factory.createEmployeeIdentifier();
		employeeIdentifier.setCompanyCode(companyCode);

		// Need JAXBElement<EmployeeIdentifier>
		PersonGetResponse response = person.getPersonByEmployeeIdentifier(eNID);
		Person employeePerson = response.getResults().getValue().getPerson().get(0);
		
		return employeePerson;
	}
	//

	public void updateEmails(EmployeeP emp, String primary, String alternate) {
		getAuthToken();
		Person personToUpdate = emp.getPerson();
		// Create Update Person Object
		com.odysystems.soap.ultipro.employeePerson.ObjectFactory factory = new com.odysystems.soap.ultipro.employeePerson.ObjectFactory();
		personToUpdate.setEmailAddress(factory.createPersonEmailAddress(primary));
		personToUpdate.setAlternateEmailAddress(factory.createPersonAlternateEmailAddress(alternate));
		ArrayOfPerson personArray = factory.createArrayOfPerson();
		personArray.getPerson().add(personToUpdate);
		
		UpdatePerson updatePerson = factory.createUpdatePerson();
		updatePerson.setEntities(factory.createArrayOfPerson(personArray));

		ProxyIEmployeePerson personProxy = new ProxyIEmployeePerson();
		// Set Authentication Header
		IEmployeePerson person = personProxy.getWSHttpBindingIEmployeePerson();
		((BindingProvider) person).getRequestContext().put("clientAccessKey", clientAccessKey);
		((BindingProvider) person).getRequestContext().put("token", token);
		person.updatePerson(personArray);

	}
	
	public void udpatePerson(Person personToUpdate){
		getAuthToken();
		log.info("Updating an Ultipro Person Entry");
		//TODO:  Check for required fields
		
		com.odysystems.soap.ultipro.employeePerson.ObjectFactory factory = new com.odysystems.soap.ultipro.employeePerson.ObjectFactory();
		UpdatePerson updatePerson = factory.createUpdatePerson();
		ArrayOfPerson personArray = factory.createArrayOfPerson();
		personArray.getPerson().add(personToUpdate);
		updatePerson.setEntities(factory.createArrayOfPerson(personArray));

		ProxyIEmployeePerson personProxy = new ProxyIEmployeePerson();
		// Set Authentication Header
		IEmployeePerson person = personProxy.getWSHttpBindingIEmployeePerson();
		((BindingProvider) person).getRequestContext().put("clientAccessKey", clientAccessKey);
		((BindingProvider) person).getRequestContext().put("token", token);
		PersonUpdateResponse response = person.updatePerson(personArray);
		log.debug("Has Errors is :: " + response.getResults().getValue().getResult().get(0).isHasErrors());
	}
//
	
	private Boolean isTokenCurrent() {
		if(token.isEmpty()) {
			return false;
		}
		Date now = new Date(System.currentTimeMillis());
		log.debug("Token Date is :: " + tokenDate + " And the current time is :: " + now);
		return Math.abs(now.getTime() - tokenDate.getTime()) < MILLIS_PER_DAY;
		
	}
	
	public Boolean isUserEmailCorrect(EmployeeP emp) {
		String primaryEmail;
		String alternateEmail;
		Boolean correctPrimary = false;
		Boolean correctAlternate = false;
		// Check if Primary Email is Correct

		try {
			primaryEmail = emp.getPerson().getEmailAddress().getValue().toLowerCase();
			correctPrimary = primaryEmail.contains("@odysseyconsult.com");
			log.debug("Primary email is correct ? " + correctPrimary);
		} catch (NullPointerException e1) {
			log.debug("Primary Email was null");
			primaryEmail = null;
		}

		// Check if Alternate Email is Correct
		try {
			alternateEmail = emp.getPerson().getAlternateEmailAddress().getValue().toLowerCase();
			correctAlternate = !alternateEmail.contains("@odysseyconsult.com");
			log.debug("Alternate email is correct ? " + correctAlternate);

		} catch (NullPointerException e1) {
			log.debug("Alternate email is null");
			alternateEmail = null;
		}

		if (correctPrimary && correctAlternate) {
			log.debug("Both primary and alternate were correct");
			return true;
		}

		log.debug("all tests failed, returning false");
		return false;
	}
	
	//
	public EmployeeP fixEmails(EmployeeP emp) throws UserExistsException, NullEmailException{
		//Setup Variables
		String op = new String();
		String oa = new String();
		String personal = new String();
		
		log.debug("Retrieving emails");
		try {
			op = emp.getPerson().getEmailAddress().getValue().toLowerCase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			oa = emp.getPerson().getAlternateEmailAddress().getValue().toLowerCase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.debug("op = " + op + " and oa = " + oa);
		
		if(op.isEmpty() && oa.isEmpty()){throw new NullEmailException("Employee must have at least one Email Address");}
		//Make sure that neither one contains an ODY email
		
		if(op.contains("odysseyconsult.com") || oa.contains("odysseyconsult.com")){
			String message = "Odyssey Account alraedy entered.  Will not fix.";
			throw new UserExistsException(message);
		}
		
		// Find the personal email
		if(!op.isEmpty()){log.debug("OP was not empty");personal = op;}
		if(!oa.isEmpty()){log.debug("OA was not empty");personal = oa;}
		
		
		log.debug("Primary was :: " + op + " And Alternate was :: " + oa);
		com.odysystems.soap.ultipro.employeePerson.ObjectFactory factory = new com.odysystems.soap.ultipro.employeePerson.ObjectFactory();
		emp.getPerson().setAlternateEmailAddress(factory.createPersonAlternateEmailAddress(personal));
		emp.getPerson().setEmailAddress(factory.createPersonEmailAddress(new String()));
		return emp;
	}

	//
	public List<EmployeeP> getNewEmployeeInfo(Map<String, String> requestParams){
		//Get the list that was requested
		List<EmployeeP> checkedList = new ArrayList<EmployeeP>();
		List<EmployeeP> ultiList = new ArrayList<EmployeeP>();
		try {
			ultiList = getEmpInfo(requestParams);
			log.debug("Size of list is :: " + ultiList.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Now check it against Google
		
		for(int i = 0; i < ultiList.size(); i++){
			EmployeeP employee = new EmployeeP();
			log.debug("Checking if employee has a Google Account");
			Boolean exists = googleService.userExist(ultiList.get(i).getPerson().getEmailAddress().getValue());
			log.debug("Does user exist? " + exists);
			if(!exists){
				employee = ultiList.get(i);
				checkedList.add(employee);
			}
			else{
				log.debug(ultiList.get(i).getPerson().getLastName().getValue() 
						+ ", " + ultiList.get(i).getPerson().getFirstName().getValue() 
						+ " already exists in Google, skipping employee."
						);
			}
		}
		
		
		log.debug("Size of checkedList is :: " + checkedList.size());
		
		return checkedList;
	}
	/**
	 * @return Returns a list of Employee Information This method differs from
	 *         getEmpInfo in that it is optimized and reduces the number of SOAP
	 *         calls
	 * @throws Exception
	 */

	public List<EmployeeP> getEmpInfo(Map<String, String> requestParams) throws Exception {
		// TODO: This logic makes multiple soap calls. Change this to make one
		// soap call per wsdl and return a list
		// then iterate through the list to create the pojo list.
		// http://stackoverflow.com/questions/739192/java-method-finding-object-in-array-list-given-a-known-attribute-value
		// ^^ that might be the right way to do it.
		// TODO: Create a POJO that moves all of the strings up to a top level
		log.debug("Getting an Authorization Token");
		getAuthToken();
		log.debug("Got a Token");
		// JAXBElement<String> queryElemenet = setQuery("King");
		List<EmployeePerson> peopleList = getPeopleList(requestParams);
		log.debug("Got a list of People.  Size of list is :: " + peopleList.size());
		List<EmployeeP> someResults = new ArrayList<EmployeeP>();
		for (int i = 0; i < peopleList.size(); i++) {
			String empId = peopleList.get(i).getEmployeeNumber().getValue();
			EmployeeP pojo = new EmployeeP();
			Employee employee = peopleList.get(i);
			Person person = peopleList.get(i).getPeople().getValue().getPerson().get(0);
			pojo.setEmployee(employee);
			pojo.setPerson(person);
			// pojo.setAddress(getEmployeeAddres(empId));
			// pojo.setEmployeeInformation(getEmployeeInfo(empId));
			// pojo.setEmployeeJob(getEmployeeJob(empId));
			someResults.add(pojo);
		}
		return someResults;

	}

	/**
	 * @throws Exception
	 *             Returns a Authentication Token to be used in other SOAP
	 *             requests
	 */
	private void getAuthToken(){
		// TODO: Change PT password to CharArray and ensure it's cleansed as
		// soon as it's not needed.
		if(!isTokenCurrent()){
			log.debug("Token was not current");
		CryptKeeper td = null;
		try {
			td = new CryptKeeper();
		} catch (Exception e) {
			log.error("Failed to get a Token");
		}
		
		
		String cryptPassword = "AXIZZ8O2xRpo/RGdO4Y3kQ==";
		String serviceName = "breer_service";
		String serviceSecret = td.decrypt(cryptPassword);

		TokenRequest tRequest = new TokenRequest();
		LoginService loginService = new LoginService();
		loginService.setHandlerResolver(new JaxWsHandlerResolver());
		ILoginService login = loginService.getWSHttpBindingILoginService();
		TokenResponse response = login.authenticate(tRequest, clientAccessKey, serviceSecret, userAPIKey, serviceName);
		
		token = response.getToken();
		
		}

	}

	private EmployeeQuery setQuery(Map<String, String> requestParams) {
		String operator = "=";
		String pFirstName = requestParams.get("firstName");
		String pLastName = requestParams.get("lastName");
		String pBeginDate = requestParams.get("beginDate");
		String pEndDate = requestParams.get("endDate");
		String pEmpId = requestParams.get("empId");
		String pEmpStatus = requestParams.get("empStatus");
		String pClientUser = requestParams.get("clientUser");

		log.debug("Setting Query");
		ObjectFactory employeeFactory = new ObjectFactory();
		com.odysystems.soap.ultipro.SSOuser.ObjectFactory ssoFactory = new com.odysystems.soap.ultipro.SSOuser.ObjectFactory();
		EmployeeQuery query = new EmployeeQuery();

		// Add check for null
		if (pLastName != null && pLastName != "") {
			JAXBElement<String> queryLastName = employeeFactory.createEmployeeQueryLastName(operator + pLastName);
			query.setLastName(queryLastName);
		}

		if (pFirstName != null && pFirstName != "") {
			JAXBElement<String> queryFirstName = employeeFactory.createEmployeeQueryFirstName(operator + pFirstName);
			query.setFirstName(queryFirstName);
		}

		if (pBeginDate != null && pEndDate != null && pBeginDate != "" && pEndDate != "") {
			log.debug("Setting query for last hire betwwen " + pBeginDate + " and " + pEndDate);
			JAXBElement<String> queryLastHire = employeeFactory
					.createEmployeeQueryLastHire(pBeginDate + "..." + pEndDate);
			query.setLastHire(queryLastHire);
		}

		if (pEmpId != null && pEmpId != "") {
			JAXBElement<String> queryEmpId = employeeFactory.createEmployeeQueryEmployeeNumber(operator + pEmpId);
			query.setEmployeeNumber(queryEmpId);
		}
		if (pEmpStatus != null && pEmpStatus != "") {
			JAXBElement<String> queryEmpStatus = employeeFactory.createEmployeeQueryStatus(operator + pEmpStatus);
			query.setStatus(queryEmpStatus);
		}
		if (pClientUser != null && pClientUser != "") {
			JAXBElement<String> querySSOClientName = ssoFactory.createSsoUserClientUserName(operator + pClientUser);
			query.setStatus(querySSOClientName);
		}

		return query;
	}

	private List<EmployeePerson> getPeopleList(Map<String, String> requestParams) {

		// TODO: Add query params
		ProxyIEmployeePerson personProxy = new ProxyIEmployeePerson();
		// Set Authentication Header
		IEmployeePerson person = personProxy.getWSHttpBindingIEmployeePerson();
		((BindingProvider) person).getRequestContext().put("clientAccessKey", clientAccessKey);
		((BindingProvider) person).getRequestContext().put("token", token);

		// Set Query
		EmployeeQuery query = setQuery(requestParams);
		// Get Response
		PersonFindResponse response;
		response = person.findPeople(query, clientAccessKey, token);
		// Extract the results
		List<EmployeePerson> employeePerson = response.getResults().getValue().getEmployeePerson();

		return employeePerson;

	}

	@SuppressWarnings("unused")
	private Address getEmployeeAddres(String empId) {

		// Proxy Class, Interface Class, Query Class, ObjectFactory Class,
		// Results Class, Response Class, Pojo Class
		// TODO: Turn this into a abstract class with the classes as parameters

		ProxyIEmployeeAddress proxy = new ProxyIEmployeeAddress();
		// Set Authentication Header
		IEmployeeAddress iface = proxy.getWSHttpBindingIEmployeeAddress();
		((BindingProvider) iface).getRequestContext().put("clientAccessKey", clientAccessKey);

		((BindingProvider) iface).getRequestContext().put("token", token);

		// Set Query
		com.odysystems.soap.ultipro.employeeAddress.EmployeeQuery query = new com.odysystems.soap.ultipro.employeeAddress.EmployeeQuery();
		com.odysystems.soap.ultipro.employeeAddress.ObjectFactory factory = new com.odysystems.soap.ultipro.employeeAddress.ObjectFactory();
		JAXBElement<String> employeeNumber = factory.createEmployeeQueryEmployeeNumber("=" + empId);
		query.setEmployeeNumber(employeeNumber);
		// Get Response
		AddressFindResponse response;
		response = iface.findAddresses(query);

		// Extract the results
		Address result = response.getResults().getValue().getEmployeeAddress().get(0).getAddresses().getValue()
				.getAddress().get(0);
		return result;
	}


	public void provisionSSO(String clientId, String employeeID, String email) {
		getAuthToken();
		com.odysystems.soap.ultipro.SSOuser.ObjectFactory ssoFactory = new com.odysystems.soap.ultipro.SSOuser.ObjectFactory();
		ArrayOfSsoUser arrayOfSsoUser = ssoFactory.createArrayOfSsoUser();

		SsoUser ssoUser = createSsoUser(clientId, employeeID, email);
		
		arrayOfSsoUser.getSsoUser().add(ssoUser);

		ProxyIEmployeeSsoUser personProxy = new ProxyIEmployeeSsoUser();
		IEmployeeSsoUser person = personProxy.getWSHttpBindingIEmployeeSsoUser();

		((BindingProvider) person).getRequestContext().put("clientAccessKey", clientAccessKey);
		((BindingProvider) person).getRequestContext().put("token", token);

		log.info("Provisioning an Ultipro SSO User");
		SsoUserCreateResponse response = person.createSsoUser(arrayOfSsoUser, clientAccessKey, token);

	}
	
	public SsoUser getSsoUser(String employeeID) {
		getAuthToken();
		
		com.odysystems.soap.ultipro.SSOuser.ObjectFactory ssoFactory = new com.odysystems.soap.ultipro.SSOuser.ObjectFactory();

		JAXBElement<String> companyCode = ssoFactory.createEmployeeIdentifierCompanyCode("ODY");

		com.odysystems.soap.ultipro.SSOuser.Employee employee = ssoFactory.createEmployee();
		JAXBElement<String> jasEmployeeID = ssoFactory.createEmployeeNumberIdentifierEmployeeNumber(employeeID);
		employee.setEmployeeNumber(jasEmployeeID);

		EmployeeNumberIdentifier eNID = new EmployeeNumberIdentifier();
		eNID.setEmployeeNumber(jasEmployeeID);
		eNID.setCompanyCode(companyCode);


		ProxyIEmployeeSsoUser personProxy = new ProxyIEmployeeSsoUser();
		IEmployeeSsoUser person = personProxy.getWSHttpBindingIEmployeeSsoUser();

		((BindingProvider) person).getRequestContext().put("clientAccessKey", clientAccessKey);
		((BindingProvider) person).getRequestContext().put("token", token);
		
		SsoUserGetResponse response = person.getSsoUserByEmployeeIdentifier(eNID);
		
		SsoUser ssoUser;
		try {
			ssoUser = response.getResults().getValue().getSsoUser().get(0);
		} catch (IndexOutOfBoundsException e) {
			log.debug("No User was returned from Ultipro");
			ssoUser = null;
		}
		
		return ssoUser;

	}
	
	public Boolean ssoConfigured(String employeeID){
		getAuthToken();
		
		com.odysystems.soap.ultipro.SSOuser.ObjectFactory ssoFactory = new com.odysystems.soap.ultipro.SSOuser.ObjectFactory();

		JAXBElement<String> companyCode = ssoFactory.createEmployeeIdentifierCompanyCode("ODY");

		com.odysystems.soap.ultipro.SSOuser.Employee employee = ssoFactory.createEmployee();
		JAXBElement<String> jasEmployeeID = ssoFactory.createEmployeeNumberIdentifierEmployeeNumber(employeeID);
		employee.setEmployeeNumber(jasEmployeeID);

		EmployeeNumberIdentifier eNID = new EmployeeNumberIdentifier();
		eNID.setEmployeeNumber(jasEmployeeID);
		eNID.setCompanyCode(companyCode);


		ProxyIEmployeeSsoUser personProxy = new ProxyIEmployeeSsoUser();
		IEmployeeSsoUser person = personProxy.getWSHttpBindingIEmployeeSsoUser();

		((BindingProvider) person).getRequestContext().put("clientAccessKey", clientAccessKey);
		((BindingProvider) person).getRequestContext().put("token", token);
		
		SsoUserGetResponse response = person.getSsoUserByEmployeeIdentifier(eNID);
		
		SsoUser ssoUser;
		try {
			ssoUser = response.getResults().getValue().getSsoUser().get(0);
			return true;
		} catch (IndexOutOfBoundsException e) {
			log.debug("No User was returned from Ultipro");
			return false;
		}
	}

	public void resetSSO(String employeeID, String clientID) {
		getAuthToken();
		com.odysystems.soap.ultipro.SSOuser.ObjectFactory ssoFactory = new com.odysystems.soap.ultipro.SSOuser.ObjectFactory();
		SsoUser ssoUser = createSsoUser(clientID, employeeID, null);
		ArrayOfSsoUser arraySso = new ArrayOfSsoUser();
		arraySso.getSsoUser().add(ssoUser);

		ProxyIEmployeeSsoUser personProxy = new ProxyIEmployeeSsoUser();
		IEmployeeSsoUser person = personProxy.getWSHttpBindingIEmployeeSsoUser();

		((BindingProvider) person).getRequestContext().put("clientAccessKey", clientAccessKey);
		((BindingProvider) person).getRequestContext().put("token", token);
		log.info("Deleting SSO User");
		SsoUserDeleteResponse result = person.deleteSsoUser(arraySso);
		
		

	}

	public List<SsoUser> synchSSO() throws Exception {
		// TODO: Get a list of e-mail addresses and names for people who's
		// employment status is Active
		Map<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("empStatus", "A");
		List<EmployeeP> ultiActiveEmployees = getShortEmpInfo(requestParams);
		log.debug("retrieved a list of active employees.  Size of list is :: " + ultiActiveEmployees.size());
		// TODO: Store those in a new ssoSynchModel
		List<SSOUserModel> ultiSSOUsers = new ArrayList<SSOUserModel>();
		for (int i = 0; i < ultiActiveEmployees.size(); i++) {
			SSOUserModel model = new SSOUserModel();

			String firstName = ultiActiveEmployees.get(i).getPerson().getFirstName().getValue().toString();
			String lastName = ultiActiveEmployees.get(i).getPerson().getLastName().getValue().toString();
			String name = lastName + ", " + firstName;
			try {
				model.setEmailAddress(ultiActiveEmployees.get(i).getPerson().getEmailAddress().getValue().toString());

			} catch (NullPointerException e) {
				log.debug(name + "has no email address");
			}
			model.setName(name);
			model.setEmpID(ultiActiveEmployees.get(i).getEmployee().getEmployeeNumber().getValue().toString());
			ultiSSOUsers.add(model);

		}
		log.debug("Created a list of employees for SSO Users");

		// TODO: For each employee get their client ID and store in
		// ssoSynchModel
		for (int i = 0; i < ultiSSOUsers.size(); i++) {
			SSOUserModel model = ultiSSOUsers.get(i);
			try {
				User googleUser = googleService.getUserByEmail(model.getEmailAddress());
				String clientID = googleUser.getId();
				model.setClientID(clientID);
				log.debug("Google Customer ID is :: " + clientID);
				ultiSSOUsers.set(i, model);
			} catch (NullPointerException e) {
				log.debug("couldnt retrieve client id for :: " + model.getName());
			}

		}
		log.debug("Added Client IDs to the Model");

		// TODO: Get a list of all SSO Users and store in a ultiPro SSO Model
		// TODO: If User Exists and Client ID is not in Ultipro SSO Model create
		// an SSO account
		com.odysystems.soap.ultipro.SSOuser.ObjectFactory ssoFactory = new com.odysystems.soap.ultipro.SSOuser.ObjectFactory();
		ArrayOfSsoUser arrayOfSsoUser = ssoFactory.createArrayOfSsoUser();

		for (int i = 0; i < ultiSSOUsers.size(); i++) {
			SSOUserModel model = ultiSSOUsers.get(i);

			String clientID = model.getClientID();
			Map<String, String> ssoParams = new HashMap<String, String>();
			ssoParams.put("clientUser", clientID);
			log.debug(clientID);
			boolean hasSSOaccount = false;
			try {
				SsoUser ssoUser = getSSOList(ssoParams).get(0);
				hasSSOaccount = true;
				model.setActivationKey(ssoUser.getActivationKey());
				log.debug("User has an SSO Account");
			} catch (NullPointerException e) {
				log.debug(model.getName() + " Does not have an SSO Account");
				hasSSOaccount = false;
				// Here's where we go and create the SSO User
			} catch (IndexOutOfBoundsException e1) {
				log.debug(model.getName() + " Does not have an SSO Account");
				hasSSOaccount = false;
			}
			if (!hasSSOaccount) {
				log.debug("no sso account exists.  This is where we would create those accounts");
				SsoUser ssoUser = createSsoUser(model.getClientID(), model.getEmpID(), model.getEmailAddress());
				arrayOfSsoUser.getSsoUser().add(ssoUser);
			}
			ultiSSOUsers.set(i, model);

		}

		ProxyIEmployeeSsoUser personProxy = new ProxyIEmployeeSsoUser();
		IEmployeeSsoUser person = personProxy.getWSHttpBindingIEmployeeSsoUser();

		((BindingProvider) person).getRequestContext().put("clientAccessKey", clientAccessKey);
		((BindingProvider) person).getRequestContext().put("token", token);

		SsoUserCreateResponse response = person.createSsoUser(arrayOfSsoUser, clientAccessKey, token);
		List<SsoUser> list = arrayOfSsoUser.getSsoUser();

		return list;

	}

	private SsoUser createSsoUser(String clientId, String employeeID, String email) {
		getAuthToken();
		com.odysystems.soap.ultipro.SSOuser.ObjectFactory ssoFactory = new com.odysystems.soap.ultipro.SSOuser.ObjectFactory();
		SsoUser ssoUser = ssoFactory.createSsoUser();

		JAXBElement<String> clientUserName = ssoFactory.createSsoUserClientUserName(clientId);
		

		JAXBElement<String> companyCode = ssoFactory.createEmployeeIdentifierCompanyCode("ODY");

		com.odysystems.soap.ultipro.SSOuser.Employee employee = ssoFactory.createEmployee();
		JAXBElement<String> jasEmployeeID = ssoFactory.createEmployeeNumberIdentifierEmployeeNumber(employeeID);
		employee.setEmployeeNumber(jasEmployeeID);

		EmployeeNumberIdentifier eNID = new EmployeeNumberIdentifier();
		eNID.setEmployeeNumber(jasEmployeeID);
		eNID.setCompanyCode(companyCode);
		JAXBElement<String> jaxEmail = ssoFactory.createSsoUserUltiProUserName(email);
		// Need JAXBElement<EmployeeIdentifier>
		JAXBElement<EmployeeIdentifier> jaxEmployeeID = ssoFactory.createEmployeeIdentifier(eNID);

		// empId.setCompanyCode(companyCode);
		ssoUser.setEmployeeIdentifier(jaxEmployeeID);
		ssoUser.setRetryAttempts(0);
		ssoUser.setStatus(1);
		ssoUser.setClientUserName(clientUserName);
		//Leave UltiProUserName blank, username may not always be email address.
		//ssoUser.setUltiProUserName(jaxEmail);
		log.debug("Client ID Is :: " + ssoUser.getClientUserName().getValue());
		return ssoUser;
	}

	private List<SsoUser> getSSOList(Map<String, String> requestParams) {
		getAuthToken();
		// TODO: Add query params
		ProxyIEmployeeSsoUser personProxy = new ProxyIEmployeeSsoUser();
		// Set Authentication Header
		IEmployeeSsoUser person = personProxy.getWSHttpBindingIEmployeeSsoUser();
		((BindingProvider) person).getRequestContext().put("clientAccessKey", clientAccessKey);
		((BindingProvider) person).getRequestContext().put("token", token);

		// Set Query
		com.odysystems.soap.ultipro.SSOuser.EmployeeQuery query = setSSOQuery(requestParams);
		// Get Response

		SsoUserGetResponse response;
		String pClientUser = requestParams.get("clientUser");
		log.debug(pClientUser);
		response = person.getSsoUserByClientUserName(pClientUser, clientAccessKey, token);
		// String empId =
		// response.getResults().getValue().getEmployeePerson().get(0).getEmployeeNumber().getValue();
		// log.debug(empId);
		// Extract the results
		String lastName = response.getResults().getValue().getSsoUser().get(0).getUltiProUserName().getValue()
				.toString();
		log.debug("Last name is :: " + lastName);
		List<SsoUser> employeePerson = response.getResults().getValue().getSsoUser();

		return employeePerson;

	}

	private List<EmployeeP> getShortEmpInfo(Map<String, String> requestParams) throws Exception {
		// TODO: This logic makes multiple soap calls. Change this to make one
		// soap call per wsdl and return a list
		// then iterate through the list to create the pojo list.
		// http://stackoverflow.com/questions/739192/java-method-finding-object-in-array-list-given-a-known-attribute-value
		// ^^ that might be the right way to do it.
		// TODO: Create a POJO that moves all of the strings up to a top level
		getAuthToken();
		log.debug("Got a Token");
		// JAXBElement<String> queryElemenet = setQuery("King");
		List<EmployeePerson> peopleList = getPeopleList(requestParams);
		log.debug("Got a list of People.  Size of list is :: " + peopleList.size());
		List<EmployeeP> someResults = new ArrayList<EmployeeP>();
		for (int i = 0; i < peopleList.size(); i++) {
			String empId = peopleList.get(i).getEmployeeNumber().getValue();
			EmployeeP pojo = new EmployeeP();
			Employee employee = peopleList.get(i);
			Person person = peopleList.get(i).getPeople().getValue().getPerson().get(0);
			pojo.setEmployee(employee);
			pojo.setPerson(person);
			// pojo.setAddress(getEmployeeAddres(empId));
			// pojo.setEmployeeInformation(getEmployeeInfo(empId));
			// pojo.setEmployeeJob(getEmployeeJob(empId));
			someResults.add(pojo);
		}
		return someResults;

	}

	private com.odysystems.soap.ultipro.SSOuser.EmployeeQuery setSSOQuery(Map<String, String> requestParams) {
		getAuthToken();
		String operator = "=";
		String pClientUser = requestParams.get("clientUser");
		String pCreateClient = requestParams.get("createClient");

		com.odysystems.soap.ultipro.SSOuser.ObjectFactory ssoFactory = new com.odysystems.soap.ultipro.SSOuser.ObjectFactory();
		com.odysystems.soap.ultipro.SSOuser.EmployeeQuery query = new com.odysystems.soap.ultipro.SSOuser.EmployeeQuery();

		if (pClientUser != null) {
			log.debug("creating a ssoClientName query");
			JAXBElement<String> querySSOClientName = ssoFactory
					.createGetSsoUserByClientUserNameClientUserName(pClientUser);
			query.setStatus(querySSOClientName);
		}

		return query;
	}

}

package com.odysystems.service.impl;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.springframework.ui.velocity.VelocityEngineUtils;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.admin.directory.Directory;
import com.google.api.services.admin.directory.DirectoryScopes;
import com.google.api.services.admin.directory.model.User;
import com.google.api.services.admin.directory.model.UserName;
import com.odysystems.dao.NewhirelogDao;
import com.odysystems.dao.NewuserrunDao;
import com.odysystems.dao.OrganizationsDao;
import com.odysystems.exceptions.NullEmailException;
import com.odysystems.exceptions.UserExistsException;
import com.odysystems.model.EmployeeList;
import com.odysystems.model.Newhirelog;
import com.odysystems.model.Newuserrun;
import com.odysystems.model.ReturnedUsers;
import com.odysystems.service.GoogleUserService;
import com.odysystems.soap.EmployeeP;

/**
 * @author cuzimbob Implements the Google Admin SDK
 *         https://developers.google.com/resources/api-libraries/documentation/
 *         admin/directory_v1/java/latest/
 *
 */
@Service("googleManager")
@WebService(serviceName = "googleService", endpointInterface = "com.odysystems.service.GoogleAutomatorInterface")
public class GoogleUserServiceImpl extends GoogleAuthHelper implements GoogleUserService {
	protected final transient Log log = LogFactory.getLog(GoogleUserServiceImpl.class);

	private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
	private static final String SERVICEACCT = "bobbyking@odysseyconsult.com";
	private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
	private static final String DEFAULTPASS = "welcome to odyssey!";
	private static final String APPNAME = "brabbit";
	private String WECOMEUSER = "welcomeEmailUser.vm";
	private String WELCOMESUP = "welcomeEmailSupervisor.vm";
	private String WELCOMETMS = "welcomeEmailTMS.vm";
	private String NEWPASS = "welcomeEmailPass.vm";
	private static final String WELCOMESUBJECT = "Congratulations on Completing Odyssey Systems Consulting Onboarding";
	private static final String PASSSUBJECT = "Details for Odyssey";
	private static final String ACTLIMITMSG = "Domain user limit reached.";

	private VelocityEngine velocityEngine;
	private ReturnedUsers returnedUsers;
	private UltiProServiceImpl ultipro;
	private OrganizationsDao orgs;
	private JavaMailSender mailSender;
	private NewuserrunDao newUserDao;
	private NewhirelogDao newhirelogDao;

	@Autowired
	public void setManagers(UltiProServiceImpl ultipro, OrganizationsDao orgs, NewuserrunDao newUserDao,
			NewhirelogDao newhirelogDao) {
		this.ultipro = ultipro;
		this.orgs = orgs;
		this.newUserDao = newUserDao;
		this.newhirelogDao = newhirelogDao;
	}

	@Autowired
	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	@Autowired
	public void setVelocityEngine(VelocityEngine velocityEngine) {
		this.velocityEngine = velocityEngine;
	}

	/*
	 * @Autowired(required = false) public void setMailMessage(final MimeMessage
	 * message) { this.message = message; }
	 */

	public void sendWelcomeEmail(final String username, final String empID, final EmployeeP ultiEmp) {
		log.debug("Sending Welcome Email to : " + username);
		Map<String, String> map = new HashMap<String, String>();
		map.put("empId", empID);

		String supervisorEmail = new String();
		try {
			String supervisorID = ultiEmp.getEmployeeJob().getSupervisor().getValue().getSupervisorEmpId().getValue();
			supervisorEmail = ultipro.getEmployeeById(supervisorID).getEmailAddress().getValue();
		} catch (Exception e1) {
			log.debug("No Supervisor was assigned");
			supervisorEmail = "bobbyking@odysseyconsult.com";
		}

		final User user = getUserByEmail(username);

		Map<String, Object> people = new HashMap<String, Object>();
		people.put("user", user);
		people.put("userEmail", username);
		people.put("altEmail", ultiEmp.getPerson().getAlternateEmailAddress().getValue());
		people.put("supervisor", supervisorEmail);
		people.put("empID", ultiEmp.getEmployee().getEmployeeNumber().getValue());
		people.put("pass", DEFAULTPASS);

		try {
			sendUserWelcomeEmail(people, WECOMEUSER, WELCOMESUBJECT);
		} catch (Exception e) {
			log.debug("Caught an error sending the welcome email");
			e.printStackTrace();
		}

		try {
			sendUserPasswordEmail(people, NEWPASS);
		} catch (Exception e) {
			log.debug("Caught an error sending the password email");
			e.printStackTrace();
		}
	}

	private void sendUserWelcomeEmail(final Map<String, Object> people, final String template, final String subject) {
		log.debug("Setting message");
		final User user = (User) people.get("user");

		MimeMessagePreparator preparator = new MimeMessagePreparator() {
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
				message.setFrom("help@odysseyconsult.com");

				try {
					message.addCc(people.get("userEmail").toString());
				} catch (NullPointerException e) {
					log.debug("primary email was null");
				}
				try {
					message.addTo(people.get("altEmail").toString());
				} catch (NullPointerException e) {
					log.debug("personal email was null");
				}
				try {
					message.addCc(people.get("supervisor").toString());
				} catch (NullPointerException e) {
					log.debug("supervisor email was null");
				}
				// TODO: Replace the below with email from Company Preferences
				message.addBcc("peterolsen@odysseyconsult.com");
				message.addBcc("bobbyking@odysseyconsult.com");
				message.addCc("thomasgillen@odysseyconsult.com");
				message.addCc("maxineferrara@odysseyconsult.com");

				log.debug("Set message cc's :: " + message.toString());
				message.setSubject(subject);

				// final Map<String, Object> model = new HashMap<String,
				// Object>();
				// Move Velocity file to the Database.
				@SuppressWarnings("deprecation")
				String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, template, people);
				message.setText(text, true);
				log.debug(text);

			}// prepare
		};// preparator
		log.debug("Sending Welcome Email");

		try {
			mailSender.send(preparator);
		} catch (MailException e) {
			log.debug("Mail Exception caught.  Probalby in test.");
		}
		log.debug("Welcome email sent");

	}

	private void sendUserPasswordEmail(final Map<String, Object> people, final String template) {
		log.debug("Setting up the password email");
		MimeMessagePreparator preparator = new MimeMessagePreparator() {
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
				try {
					message.addCc(people.get("userEmail").toString());
				} catch (NullPointerException e) {
					log.debug("primary email was null");
				}
				try {
					message.setTo(people.get("altEmail").toString());
				} catch (NullPointerException e) {
					log.debug("personal email was null");
				}
				message.addBcc("bobbyking@odysseyconsult.com");
				message.addBcc("peterolsen@odysseyconsult.com");
				message.setSubject(PASSSUBJECT);
				message.setFrom("help@odysseyconsult.com");
				@SuppressWarnings("deprecation")
				String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, template, people);
				message.setText(text, true);
				log.debug(text);

			}// prepare

		};// preparator
		log.debug("Sending Password Email");
		if (preparator != null) {
			log.debug("not null");
		}
		try {
			this.mailSender.send(preparator);
		} catch (MailException e) {
			log.debug("Mail Send Exception, may be in test.");
		}

	}

	public User getUserByEmail(String user) {

		Directory service = getDirectoryService();

		User result;
		try {
			log.debug("Looking up user with key of " + user);
			result = service.users().get(user).execute();
		} catch (Exception e) {
			log.debug("Caught an Exception");
			e.printStackTrace();
			result = null;
		}

		log.info("Retrieved a Google Identity");

		return result;

	}

	public boolean userExist(String email) {
		Directory service = getDirectoryService();
		try {
			log.debug("checking if " + email + " exists");
			service.users().get(email).execute();
			return true;
		} catch (GoogleJsonResponseException e) {
			e.getMessage();
			log.debug(e.getMessage());
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} catch (NullPointerException e) {
			log.debug("User was null, returning false");
			return false;
		}

	}

	public User createUser(String first, String last, String email) throws GoogleUserException {
		log.debug("Creating User from Strings");
		User hire = new User();
		UserName name = new UserName();
		name.setFamilyName(last);
		name.setGivenName(first);
		hire.setName(name);
		hire.setPassword(DEFAULTPASS);
		hire.setChangePasswordAtNextLogin(true);
		hire.setPrimaryEmail(email);
		return createUser(hire);
	}

	public User createUser(User user) throws GoogleUserException {
		Directory service = getDirectoryService();
		if (!userExist(user.getPrimaryEmail())) {
			user.setPassword(DEFAULTPASS);
			user.setChangePasswordAtNextLogin(true);
			try {
				return service.users().insert(user).execute();
			} catch (GoogleJsonResponseException e) {
				Throwable cause = e;
				log.debug(e.getMessage());
				log.debug(e.getDetails().getErrors().get(0).getMessage());
				String causeMessage = e.getDetails().getErrors().get(0).getMessage();
				if (causeMessage.equals(ACTLIMITMSG)) {
					String message = "Google License Limit reached.";

					/*
					 * { "code" : 412, "errors" : [ { "domain" : "global", "location" : "If-Match",
					 * "locationType" : "header", "message" : "Domain user limit reached.", "reason"
					 * : "limitExceeded" } ], "message" : "Domain user limit reached." }
					 * 
					 */

					throw new GoogleUserException(message, cause);
				} else
					throw new GoogleUserException("Something else happened with Google.");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return getUserByEmail(user.getPrimaryEmail());
	}

	/*
	 * (non-Javadoc) main entry point for initializing new users with google.
	 */

	public Newuserrun createUser(List<EmployeeP> employees) throws GoogleUserException {
		log.info("Creating New Google Users");
		// Nullify returnedUsers for a fresh start.
		returnedUsers = new ReturnedUsers();
		returnedUsers.setExisted(0);
		List<User> newUsers = new ArrayList<User>();
		List<EmployeeList> employeeList = new ArrayList<EmployeeList>();

		// Objects for persistent records
		Newuserrun userrun = new Newuserrun();
		userrun.setDate(new Timestamp(System.currentTimeMillis()));
		Set<Newhirelog> hirelogs = new HashSet<Newhirelog>();
		for (int i = 0; i < employees.size(); i++) {
			// Set Variables
			User user = new User();
			EmployeeList empList = new EmployeeList();
			EmployeeP emp = employees.get(i);
			Boolean exists = userExist(emp.getPerson().getEmailAddress().getValue());
			Newhirelog hirelog = new Newhirelog();

			hirelog.setNewuserrun(userrun); // creates bi-directional link between newhire and run
			if (exists) {
				returnedUsers.setExisted(returnedUsers.getExisted() + 1);
				user = getUserByEmail(emp.getPerson().getEmailAddress().getValue());
				empList.setGoogleSetup(false);
				empList.setUltiSSOSetup(false);
				hirelog.setEmailAddress(false);
				try {
					hirelog.setSso(ultipro.ssoConfigured(emp.getEmployee().getEmployeeNumber().getValue()));
				} catch (NullPointerException e) {
					log.debug("null employee id");
				}

			} else {
				try {
					log.info("Creating a new user");
					user = createUser(emp);

					empList.setGoogleSetup(true);
					empList.setUltiSSOSetup(true);
					empList.setOriginalAlternate(emp.getPerson().getAlternateEmailAddress().getValue());
					empList.setOriginalPrimary(emp.getPerson().getEmailAddress().getValue());
					try {
						empList.setEmpID(emp.getEmployee().getEmployeeNumber().getValue());
					} catch (NullPointerException e) {
						log.debug("null employee id");
					}
					empList.setEmail(user.getPrimaryEmail());
					empList.setFirstName(user.getName().getGivenName());

					// Set persistent log
					hirelog.setEmailAddress(true);
					hirelog.setSso(true);
					hirelog.setWelcomeEmail(true);
					hirelog.setGoogleClientId(user.getId());
					hirelog.setSsoClientId(ultipro.getSsoUser(emp.getEmployee().getEmployeeNumber().getValue())
							.getClientUserName().getValue());
					hirelog.setName(emp.getPerson().getLastName().getValue() + ", "
							+ emp.getPerson().getFirstName().getValue());
					hirelog.setPrimaryEmail(user.getPrimaryEmail());
					hirelog.setEmployeeID(emp.getEmployee().getEmployeeNumber().getValue());

					log.debug("Adding new User to the Employee List");
					employeeList.add(empList);
					log.debug("Adding new user to the newUsers list");
					newUsers.add(user);

				} catch (UserExistsException e) {
					log.debug("User " + emp.getPerson().getFirstName().getValue() + " "
							+ emp.getPerson().getLastName().getValue() + " already exists, no actions taken.");
					empList.setGoogleSetup(false);
					empList.setUltiSSOSetup(false);
				}

			}
			log.debug("Updating the new hire log");
			hirelogs.add(hirelog);

		}
		returnedUsers.setUsers(newUsers);
		returnedUsers.setCompleted(newUsers.size());
		returnedUsers.setEmployees(employeeList);
		userrun.setNewhirelogs(hirelogs);
		log.debug("Persisting hire logs");
		newUserDao.save(userrun);

		return userrun;
	}

	//

	/**
	 * @param user
	 * @return Returns an updated User from Google implements <href =
	 *         "https://developers.google.com/resources/api-libraries/documentation/admin/directory_v1/java/latest/"
	 *         />
	 */
	public User updateUser(User user) {
		Directory service = getDirectoryService();
		try {
			return service.users().update(user.getPrimaryEmail(), user).execute();
		} catch (IOException e) {
			log.debug("Unable to udpate user");
			return null;
		}
	}

	public User createUser(EmployeeP ultiNewHire) throws UserExistsException, GoogleUserException {
		Directory service = getDirectoryService();
		User hire = createGoogleUserPojo(ultiNewHire);
		hire.setPassword(DEFAULTPASS);
		hire.setChangePasswordAtNextLogin(true);

		Boolean exists = false;
		Boolean correct = ultipro.isUserEmailCorrect(ultiNewHire);
		User newUser = new User();

		log.debug(ultiNewHire.getEmployee().getEmployeeNumber().getValue());
		// If Primary email is correct then check if Google User exists
		if (correct) {
			exists = userExist(ultiNewHire.getPerson().getEmailAddress().getValue());
			log.debug(ultiNewHire.getPerson().getFirstName().getValue() + " Exists == " + exists);

			if (exists) {
				log.debug("User Already Exists");
				newUser = getUserByEmail(ultiNewHire.getPerson().getEmailAddress().getValue());

				log.debug("Existing Users Primary Email is :: " + newUser.getPrimaryEmail());

				// If the email address was correct (included @Odysseyconsult.com) and the user
				// Exists then there's nothing to do.
				// return the user untouched.
				// TODO: Add an SSO provisioning method here.
				return newUser;

			}
			// Since emails weren't correct, fix them.
		} else {
			log.debug("emails were incorrect, fixing them now");
			try {
				ultiNewHire = ultipro.fixEmails(ultiNewHire);
			} catch (NullEmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// now that they are fixed let's check if the user exists.
			exists = userExist(ultiNewHire.getPerson().getEmailAddress().getValue());
			log.debug(ultiNewHire.getPerson().getFirstName().getValue() + " Exists == " + exists);

		}
		// If the user still doesn't exist then we can create a new one.
		if (!exists) {
			log.debug("User did not exist, attempting to create user now");
			try {
				// Create a new primary Email made from first and last names
				String first = ultiNewHire.getPerson().getFirstName().getValue();
				String last = ultiNewHire.getPerson().getLastName().getValue();
				String domain = "@odysseyconsult.com";
				String newEmail = first + last + domain;
				int i = 0;
				// Now make sure that the email combination will work. Add a number to it if it
				// doesn't.
				while (userExist(newEmail) == true) {
					i++;
					log.debug(newEmail + " is taken.  Adding " + Integer.toString(i)
							+ " to the email address and trying again.");
					newEmail = first + last + Integer.toString(i) + domain;
				}

				// Now that we have a good email address add it to google.
				hire.setPrimaryEmail(newEmail);
				log.debug("Inserting User into google");
				newUser = service.users().insert(hire).execute();
				// Catch some google reponses
			} catch (GoogleJsonResponseException e) {
				Throwable cause = e;
				String msg = e.getMessage();
				String causeMessage = e.getDetails().getErrors().get(0).getMessage();
				if (msg.contains("INVALID_OU_ID")) {
					// Create New OU??
					log.debug("OU Does Not Exist, Creating User w/out OU");
					hire.setOrgUnitPath(null);
					try {
						newUser = service.users().insert(hire).execute();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					log.debug("Created New User without OU");
				}
				// Just in case something funky happens and the user really does exist.
				if (msg.contains("Entity already exists.")) {
					log.debug("User Already Exists");
					newUser = getUserByEmail(ultiNewHire.getPerson().getEmailAddress().getValue());
				}
				if(causeMessage.equals(ACTLIMITMSG)) {
					String message = "Google License Limit reached.";

					/*
					 * { "code" : 412, "errors" : [ { "domain" : "global", "location" : "If-Match",
					 * "locationType" : "header", "message" : "Domain user limit reached.", "reason"
					 * : "limitExceeded" } ], "message" : "Domain user limit reached." }
					 * 
					 */

					throw new GoogleUserException(message, cause);
				}
					
				

			} catch (IOException e) {
				e.printStackTrace();
			} 

		}
		// Probably not needed but here's a null check. Exits out if it was, sice
		// something really weird happened.
		if (newUser == null) {
			log.error("Object Is null");
			return null;
		}

		log.debug("Updating Ultipro");

		try {
			log.debug("Primary Email is :: " + newUser.getPrimaryEmail() + " And Alternate email is :: "
					+ ultiNewHire.getPerson().getAlternateEmailAddress().getValue());
			// Now that a new google user has been created, update the emails. ultiNewHire
			// should have the personal email added to it.
			ultipro.updateEmails(ultiNewHire, newUser.getPrimaryEmail(),
					ultiNewHire.getPerson().getAlternateEmailAddress().getValue());
		} catch (NullPointerException e) {
			log.debug("An Email Address was null.  Trying again without that email");

			try {
				ultipro.updateEmails(ultiNewHire, newUser.getPrimaryEmail(), newUser.getPrimaryEmail());
			} catch (NullPointerException e1) {
				log.debug("An email Address was null.  Continuing without updating Ultipro");
				return newUser;
			}
		}

		// Provision SSO User
		log.debug("Provisioning an SSO User using the primary email of :: " + newUser.getPrimaryEmail());
		log.debug(newUser.getId());
		log.debug(ultiNewHire.getEmployee().getEmployeeNumber().getValue());
		log.debug(newUser.getPrimaryEmail());

		ultipro.provisionSSO(newUser.getId(), ultiNewHire.getEmployee().getEmployeeNumber().getValue(),
				newUser.getPrimaryEmail());

		sendWelcomeEmail(newUser.getPrimaryEmail(), ultiNewHire.getEmployee().getEmployeeNumber().getValue(),
				ultiNewHire);

		return newUser;
	}

	public void deleteUser(String email) {
		Directory service = getDirectoryService();
		log.debug("Email is :: " + email);
		try {
			service.users().delete(email).execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Directory getDirectoryService() {
		List<String> scopes = Arrays.asList(DirectoryScopes.ADMIN_DIRECTORY_USER);
		Credential cred = null;
		try {
			cred = getAuthCredential(scopes, SERVICEACCT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Directory.Builder(HTTP_TRANSPORT, JSON_FACTORY, cred).setApplicationName(APPNAME).build();
	}

	private User createGoogleUserPojo(EmployeeP uHire) {
		// Set google pojos
		User gUser = new User();
		UserName gName = new UserName();

		// Set Mandatory Fields -- Required by Google API for creating a new
		// user.
		gName.setFamilyName(uHire.getPerson().getLastNameString());
		gName.setGivenName(uHire.getPerson().getFirstName().getValue());
		gUser.setName(gName);
		gUser.setPrimaryEmail(uHire.getPerson().getEmailAddress().getValue());
		gUser.setPassword(DEFAULTPASS);
		gUser.setChangePasswordAtNextLogin(true);

		// Set Optional Fields
		gUser.setIncludeInGlobalAddressList(true);

		try {
			String one = uHire.getEmployeeJob().getOrgLevel1().getValue();
			String two = uHire.getEmployeeJob().getOrgLevel2().getValue();
			String three = uHire.getEmployeeJob().getOrgLevel3().getValue();
			log.debug(one + " " + two + " " + three + " ");
			gUser.setOrgUnitPath(createOrgUnitPath(one, two, three));
		} catch (NullPointerException e) {
			log.info("New User is not assigned to an organization yet");
		}

		return gUser;

	}

	private String createOrgUnitPath(String one, String two, String three) {
		log.debug(one + " " + two + " " + three + " ");
		StringBuilder sb = new StringBuilder();
		sb.append("/Odyssey");
		sb.append("/");
		sb.append(orgs.getLabel(one));
		sb.append("/");
		sb.append(orgs.getLabel(two));
		sb.append("/");
		sb.append(orgs.getLabel(three));

		return sb.toString();
	}

}

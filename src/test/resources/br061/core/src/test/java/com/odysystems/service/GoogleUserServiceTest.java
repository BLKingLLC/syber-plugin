package com.odysystems.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.BindException;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.subethamail.wiser.Wiser;

import com.google.api.services.admin.directory.model.User;
import com.odysystems.exceptions.UserExistsException;
import com.odysystems.soap.EmployeeP;
import com.odysystems.soap.ultipro.EmployeeJob.Job;
import com.odysystems.soap.ultipro.employeePerson.Employee;
import com.odysystems.soap.ultipro.employeePerson.ObjectFactory;
import com.odysystems.soap.ultipro.employeePerson.Person;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext-resources.xml",
		"classpath:/applicationContext-dao.xml", "classpath:/applicationContext-service.xml",
		"classpath:/applicationContext-test.xml" })
public class GoogleUserServiceTest extends BaseManagerTestCase {
	private Log log = LogFactory.getLog(GoogleUserServiceTest.class);
	private int smtpPort;

	@Autowired
	private JavaMailSenderImpl mailSender;

	@Autowired
	private ApplicationContext applicationContext;
	@Autowired
	private GoogleUserService goog;

	@Autowired
	private UltiProService ulti;

	private static final String EMAIL = "testytest1234@odysseyconsult.com";
	private static final String FIRST = "Testy";
	private static final String LAST = "McFarlane";

	protected Wiser startWiser(int smtpPort) {
		Wiser wiser = new Wiser();
		wiser.setPort(smtpPort);
		try {
			wiser.start();
		} catch (RuntimeException re) {
			if (re.getCause() instanceof BindException) {
				int nextPort = smtpPort + 1;
				if (nextPort - smtpPort > 10) {
					log.error("Exceeded 10 attempts to start SMTP server, aborting...");
					throw re;
				}
				log.error("SMTP port " + smtpPort + " already in use, trying " + nextPort);
				return startWiser(nextPort);
			}
		}
		mailSender.setPort(smtpPort);
		return wiser;
	}

	@Before
	public void before() throws Exception {
		smtpPort = (new Random().nextInt(9999 - 1000) + 1000);
	}

	@Test
	public void atestCreateUser() throws Exception {

		User response = goog.createUser(FIRST, LAST, EMAIL);
		assertNotNull(response);

	}

	@Test
	public void btestGetUser() {
		User user = new User();
		try {
			user = goog.getUserByEmail(EMAIL);
		} catch (Exception e) {

		}
		assertNotNull(user);
	}

	@Test
	public void ctestDeleteUser() throws Exception {
		goog.deleteUser(EMAIL);
		User user = new User();
		try {
			user = goog.getUserByEmail(EMAIL);
		} catch (Exception e) {

		}

		assertNull(user);
	}

	@Test
	public void ddtestCreateUser() throws IOException {
		EmployeeP unh = new EmployeeP();
		Employee emp = new Employee();
		Person person = new Person();
		ObjectFactory employeePerson = new ObjectFactory();
		com.odysystems.soap.ultipro.EmployeeJob.ObjectFactory employeeJob = new com.odysystems.soap.ultipro.EmployeeJob.ObjectFactory();
		com.odysystems.soap.ultipro.EmployeeInfo.ObjectFactory employeeInfo = new com.odysystems.soap.ultipro.EmployeeInfo.ObjectFactory();

		Job job = new Job();

		person.setFirstName(employeePerson.createEmployeeFirstName(FIRST));
		person.setLastName(employeePerson.createEmployeeLastName(LAST));
		person.setLastNameString(LAST);
		person.setEmailAddress(employeePerson.createPersonEmailAddress(EMAIL));
		emp.setEmployeeNumber(employeeInfo.createEmployeeEmployeeNumber("696969"));
		emp.setCompanyCode(employeeInfo.createEmployeeCompanyCode("ODY"));
		job.setOrgLevel1(employeeJob.createJobOrgLevel1("13"));
		job.setOrgLevel2(employeeJob.createJobOrgLevel2("131"));
		job.setOrgLevel3(employeeJob.createJobOrgLevel3("1313"));
		unh.setPerson(person);
		unh.setEmployee(emp);
		unh.setEmployeeJob(job);
		// start SMTP Server
		Wiser wiser = startWiser(smtpPort);
		User user = null;
		try {
			user = goog.createUser(unh);
		} catch (UserExistsException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		assertNotNull(user);

		assertNotNull(ulti.getSsoUser("696969").getActivationKey());

		wiser.stop();
		assertTrue(wiser.getMessages().size() >= 1);
		// Now delete the user we just created
		try {
			ulti.resetSSO(EMAIL, user.getId());
			goog.deleteUser(EMAIL);

		} catch (Exception e) {
			log.error("Failed to delete " + EMAIL);
			e.printStackTrace();
		}
	}

	@Test
	public void etestUserExists() {

		assertTrue(goog.userExist(EMAIL));
	}

/*	@Test
	public void testSendEmail() {
		Wiser wiser = startWiser(smtpPort);
		goog.sendUserPasswordEmail("bobby.king@blking.net", "welcomeEmailPass.vm");
		wiser.stop();
		assertTrue(wiser.getMessages().size() >= 1);

	}*/
}

package com.demo.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class SendEmail {
	

		@Test
		public static void sentEmail() throws EmailException {
		
		System.out.println("===========Test Started=================");
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("kunal.dhote7799@gmail.com", "kunal7384"));
		email.setSSLOnConnect(true);
		email.setFrom("kunal.dhote7799@gmail.com");
		email.setSubject("Selenium Report");
		email.setMsg("This is a test mail regarding for Selenmium repoirt :-)");
		email.addTo("kunal7384@gmail.com");
		email.send();
		System.out.println("===========Test ENd=================");
	}
	
	
	

}

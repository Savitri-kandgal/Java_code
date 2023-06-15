package com.xworkz.contactdata.email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;

@Component
public class ContactDataEmail {

	private String host;
	private String user;
	private String pswd;
	private String to;
	private String port;
	
	public boolean sendMail(String email, String name) {
		 host = "smtp.office365.com";
		 user = "Savitri.Kandgal@outlook.com";
		 pswd = "Sav3@123";
		 to = email;
		 port="587";

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.office365.com");
		props.put("mail.smtp.port", port);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.debug", "true");
		props.put("mail.transport.protocal", "smtp");

		Session session = Session.getDefaultInstance(props, new Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(user, pswd);
			}
		});

		try {
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(user));
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
		//	msg.setReplyTo(new InternetAddress[] {new InternetAddress("Savitri.Kandgal@outlook.com"), new InternetAddress(to)});
			msg.setSubject("Registration Confirmation Mail");
			msg.setText("Hi " + name + ", your registration has been done successfully!");

			Transport.send(msg);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return true;
	}
}

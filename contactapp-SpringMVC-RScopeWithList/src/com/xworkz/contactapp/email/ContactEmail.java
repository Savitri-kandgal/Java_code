package com.xworkz.contactapp.email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.xworkz.contactapp.dto.ContactDTO;

public class ContactEmail {

	public boolean sendMail(ContactDTO dto) {
		
		String host = "smtp.office365.com";
		String user = "Savitri.Kandgal@outlook.com";
		String pswd = "Sav3@123";
		String to = dto.getEmail();
		
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
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
			msg.setSubject("Contact Update Confirmation Mail");
			StringBuffer sb = new StringBuffer();
			sb.append("Hi "+dto.getName()+", ");
			sb.append("your contact information has been updated successfully!!!");
		//	sb.append("Thanks&Regards,");
		//	sb.append("<br/>");
		//	sb.append("Xworkz");
			msg.setText(sb.toString());
			Transport.send(msg);
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return true;
	}
}

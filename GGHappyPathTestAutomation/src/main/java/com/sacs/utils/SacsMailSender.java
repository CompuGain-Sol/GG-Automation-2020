/*package com.sacs.utils;

import java.io.FileInputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;

import com.gg.sacs.report.DateTime;
import com.gg.sacs.report.EmailReportBean;
import com.gg.sacs.report.HTMLReport;


public class SacsMailSender {
	private static Logger MAILSENDERLOGGER = Logger.getLogger(SacsMailSender.class);
	private String auth = "true";
	
	public void sendMail(Map<String, List<EmailReportBean>> moduleMap, String suiteName,String browser) throws Exception{
	    try {
	    	String []SuiteNameUnit= suiteName.split(":");
	    	final Properties sendEmailProperties = new Properties();
			FileInputStream inStream = new FileInputStream("sendEmail.properties");
			sendEmailProperties.load(inStream);
			MAILSENDERLOGGER.info("sendEmailProperties: "+sendEmailProperties);
			
			if (sendEmailProperties.getProperty("SEND_EMAIL").equals("ON")) {
				Properties smtpProps = new Properties();
				smtpProps.put("mail.smtp.host", sendEmailProperties.getProperty("HOST"));
				smtpProps.put("mail.smtp.port", sendEmailProperties.getProperty("PORT").toString());
				smtpProps.put("mail.smtp.user", sendEmailProperties.getProperty("USER"));
				smtpProps.put("mail.smtp.auth", true);
				smtpProps.put("mail.smtp.starttls.enable", false);
			    
			    System.setProperty("java.net.preferIPv4Stack" , "false");
			    
			    Session session = Session.getDefaultInstance(smtpProps,
		                new javax.mail.Authenticator() {
		                      protected PasswordAuthentication getPasswordAuthentication() {
		                              return new PasswordAuthentication(sendEmailProperties.getProperty("USER"), sendEmailProperties.getProperty("PASSWORD"));
		                      }
		                });
			   
			   
			    session.setDebug(true);
			    
			    MimeMessage message = new MimeMessage(session);
		        message.setFrom(new InternetAddress(sendEmailProperties.getProperty("FROM")));
		        String[] recipient = sendEmailProperties.getProperty("TO").split(",");
		        addRecipients(recipient, message);
		        if(sendEmailProperties.getProperty("ADD_CC").equals("ON")){
		        	 String[] ccRecipient = sendEmailProperties.getProperty("CC").split(",");
				        addCCRecipients(ccRecipient, message);
		        }
		        message.setSubject(sendEmailProperties.getProperty("SUBJECT")+" "+SuiteNameUnit[0]+" ("+new DateTime().MMDDYYYYHHMM()+") " +SuiteNameUnit[1]);
		        message.setSentDate(new Date());
		        message.setText(sendEmailProperties.getProperty("TEXT"));
		        HTMLReport htmlReport = new HTMLReport();
		        message.setContent(htmlReport.mapValue(moduleMap, SuiteNameUnit[0]+":"+SuiteNameUnit[1], browser).toString(), "text/html");
		        Transport.send(message);
		       MAILSENDERLOGGER.info("========== Mail sent successfully =====");
			}
			else{
				MAILSENDERLOGGER.info("========== Send Email trigger in OFF mode =====");
				HTMLReport htmlReport = new HTMLReport();
		        htmlReport.mapValue(moduleMap, SuiteNameUnit[0]+":"+SuiteNameUnit[1]+":"+SuiteNameUnit[2],browser);
			}
			
	    } catch (MessagingException e) {
	    	MAILSENDERLOGGER.info("" + e);
	    }
	}
	
	public void sendMail_Parallel(Map<String, List<EmailReportBean>> moduleMap, String suiteName,String browser) throws Exception{
	    try {
	    	String []SuiteNameUnit= suiteName.split(":");
	    	final Properties sendEmailProperties = new Properties();
			FileInputStream inStream = new FileInputStream("sendEmail.properties");
			sendEmailProperties.load(inStream);
			MAILSENDERLOGGER.info("sendEmailProperties: "+sendEmailProperties);
			
			if (sendEmailProperties.getProperty("SEND_EMAIL").equals("ON")) {
				Properties smtpProps = new Properties();
				smtpProps.put("mail.smtp.host", sendEmailProperties.getProperty("HOST"));
				smtpProps.put("mail.smtp.port", sendEmailProperties.getProperty("PORT").toString());
				smtpProps.put("mail.smtp.user", sendEmailProperties.getProperty("USER"));
				smtpProps.put("mail.smtp.auth", true);
				smtpProps.put("mail.smtp.starttls.enable", false);
			    
			    System.setProperty("java.net.preferIPv4Stack" , "false");
			    
			    Session session = Session.getDefaultInstance(smtpProps,
		                new javax.mail.Authenticator() {
		                      protected PasswordAuthentication getPasswordAuthentication() {
		                              return new PasswordAuthentication(sendEmailProperties.getProperty("USER"), sendEmailProperties.getProperty("PASSWORD"));
		                      }
		                });
			   
			   
			    session.setDebug(true);
			    
			    MimeMessage message = new MimeMessage(session);
		        message.setFrom(new InternetAddress(sendEmailProperties.getProperty("FROM")));
		        String[] recipient = sendEmailProperties.getProperty("TO").split(",");
		        addRecipients(recipient, message);
		        if(sendEmailProperties.getProperty("ADD_CC").equals("ON")){
		        	 String[] ccRecipient = sendEmailProperties.getProperty("CC").split(",");
				        addCCRecipients(ccRecipient, message);
		        }
		        message.setSubject(sendEmailProperties.getProperty("SUBJECT")+" "+SuiteNameUnit[0]+" ("+new DateTime().MMDDYYYYHHMM()+") " +SuiteNameUnit[1]);
		        message.setSentDate(new Date());
		        message.setText(sendEmailProperties.getProperty("TEXT"));
		        HTMLReport htmlReport = new HTMLReport();
		        message.setContent(htmlReport.mapValue_Parallel(moduleMap, SuiteNameUnit[0]+":"+SuiteNameUnit[1], browser).toString(), "text/html");
		        Transport.send(message);
		       MAILSENDERLOGGER.info("========== Mail sent successfully =====");
			}
			else{
				MAILSENDERLOGGER.info("========== Send Email trigger in OFF mode =====");
				HTMLReport htmlReport = new HTMLReport();
		        htmlReport.mapValue_Parallel(moduleMap, SuiteNameUnit[0]+":"+SuiteNameUnit[1]+":"+SuiteNameUnit[2],browser);
			}
			
	    } catch (MessagingException e) {
	    	MAILSENDERLOGGER.info("" + e);
	    }
	}
	
	protected void addRecipients(String[] recipients, Message message) throws MessagingException, AddressException {
		try {
			for (int i = 0; i <= recipients.length - 1; i++) {
				String rec = recipients[i];
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(rec));
			}
		} catch (Exception e) {
			MAILSENDERLOGGER.info("" + e);
		}
	}
	
	protected void addCCRecipients(String[] recipients, Message message) throws MessagingException, AddressException {
		try {
			for (int i = 0; i <= recipients.length - 1; i++) {
				String rec = recipients[i];
				message.addRecipient(Message.RecipientType.CC, new InternetAddress(rec));
			}
		} catch (Exception e) {
			MAILSENDERLOGGER.info("" + e);
		}
	}
}
*/
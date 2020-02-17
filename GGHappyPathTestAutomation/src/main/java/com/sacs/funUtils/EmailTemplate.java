package com.sacs.funUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.log4j.Logger;



public class EmailTemplate implements SACSSetup {

	private static Logger logger = Logger.getLogger(EmailTemplate.class);
	String sformat=null,EnvDetails =null;
	
	public EmailTemplate() {
		//BeanFactory beanfactory = new BeanFactory();

		 sformat ="<!DOCTYPE html> <html><head><style>table {  font-family: arial, sans-serif;    border-collapse: collapse; "	+ "  width: 100%;}td,"
				+ " th { border: 1px solid #dddddd;    text-align: left;    padding: 8px;} tr:nth-child(even) {   background-color: #dddddd; }"+"</style> ";
					
		EnvDetails =sformat+"</head><body><table>"
				+ "  <tr>"
				+ "  <th>Environment</th> "
				+ "  <th>Browser</th> "
				+ "  <th>IP Address</th>"
				+ "  <th>Host Name</th>"
				+ "  </tr>"
				+ "  <tr>"
				+ "  <td>"+Configuration.getAutomationURL()+"</td>"
				+ "  <td>"+SBROWSER+"</td>"
				/*+ "  <td>"+beanfactory.getIpaddress()+"</td>"
				+ "  <td>"+beanfactory.getHostName()+"</td>"*/
				+ "  </tr>"
				+ "  </table>"
				+ "</body>"
				+ "</html> <br><br><br>"+"</head><body><table>  "
				+ "<tr>"
				+ "    <th>#Records</th>"
				+ "    <th>#Deleted</th>"
				+ "    <th>#Pending</th>"
				+ "    <th>ModuleName</th>"
				+ "  </tr>"
				+ "  <tr>";
	} 
	
	public String template(int snoOfRecords,int sdeletedRecords,int sPendingRecords,String sModuleName)
	{
				String sTable= 
					 "    <td>"+snoOfRecords+"</td>"
					+ "    <td>"+sdeletedRecords+"</td>"
					+ "    <td>"+sPendingRecords+"</td>"
					+ "    <td>"+sModuleName+"</td>"
					+ "  </tr>"
					+ "  </table>"
					+ "</body>"
					+ "</html>";
			
			
			return sformat+EnvDetails+sformat+sTable;
	}
	

	public String getFilePath(String sFilepath) {
		char cforwardslash = (char) 47;
		char cbackslash = (char) 92;
		String sPath = System.getProperty("user.dir").replace(cbackslash, cforwardslash) + sFilepath;

		File file = new File(sPath);
		if (file.exists()) {
			sPath = file.getAbsolutePath();
		} else {
			logger.info("File not Found");
		}
		return sPath;
	}

	public void postMail(int snoOfRecords,int sdeletedRecords,int sPendingRecords,String sModuleName) throws Exception {

		final Properties props = new Properties();
		props.load(new FileInputStream(getFilePath(sEMAILCONFIG)));
		props.put("mail.smtp.user", "vivek.kundarapu@Compugain.com");
		props.put("mail.smtp.host", "smtp.outlook.com");
		props.put("mail.smtp.port", "25");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.EnableSSL.enable", "true");
		props.setProperty("mail.smtp.port", "587");
		props.setProperty("mail.smtp.socketFactory.port", "587");
		
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(props.getProperty("UserName"), props.getProperty("Password"));
			}
		});
		Message msg = new MimeMessage(session);
		InternetAddress addressFrom = new InternetAddress(props.getProperty("sender"));
		msg.setFrom(addressFrom);
		msg.setText(props.getProperty("emailMessage"));
		msg.setSubject("Testing the execution");
		String[] recipient = null;
		if (Configuration.getEmailIdS() == null) {
			recipient = props.getProperty("recipients").split(",");
		} else {

			recipient = Configuration.getEmailIdS().split(","); // rohith.kakumani22@gmail.com,abhesheke@gmail.com;
			
		}

				InternetAddress[] addressTo = new InternetAddress[recipient.length];

		for (int i = 0; i < recipient.length; i++) {
			addressTo[i] = new InternetAddress(recipient[i]);
		}
		msg.setRecipients(Message.RecipientType.TO, addressTo);

		//BeanFactory beanfactory = new BeanFactory();

		StringBuffer body = new StringBuffer(template(snoOfRecords,sdeletedRecords,sPendingRecords,sModuleName));
		
		MimeBodyPart messageBodyPart = new MimeBodyPart();
		System.out.println(body.toString());
		messageBodyPart.setContent(body.toString(), "text/html");
		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(messageBodyPart);
		msg.setContent(multipart);
		Transport.send(msg);
		System.out.println("Job Done----");
	}
	public static void main(String[] args) throws Exception {
		
		EmailTemplate emailTemplate = new EmailTemplate();
		emailTemplate.postMail(10,10,10-5,"Account");
		}
}

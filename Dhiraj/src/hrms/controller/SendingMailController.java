package hrms.controller;

import hrms.cargo.SendingMailCargo;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendingMailController
 */

public class SendingMailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendingMailController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		final SendingMailCargo sendingMailCargo=new SendingMailCargo();
		sendingMailCargo.setFrom(request.getParameter("from"));
		sendingMailCargo.setTo(request.getParameter("to"));
		sendingMailCargo.setSubject(request.getParameter("subject"));
		sendingMailCargo.setUsername(request.getParameter("un"));
		sendingMailCargo.setPassword(request.getParameter("pwd"));
		sendingMailCargo.setMsg(request.getParameter("body"));
		
		
		String host = "smtp.mail.yahoo.com";

	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "587");
	      
	      Session session = Session.getInstance(props,
	    	      new javax.mail.Authenticator() {
	    	         protected PasswordAuthentication getPasswordAuthentication() {
	    	            return new PasswordAuthentication(sendingMailCargo.getUsername(),sendingMailCargo.getPassword());
	    	         }
	    	      });
	      try {
	          // Create a default MimeMessage object.
	          Message message = new MimeMessage(session);

	          // Set From: header field of the header.
	          message.setFrom(new InternetAddress(sendingMailCargo.getFrom()));

	          // Set To: header field of the header.
	          message.setRecipients(Message.RecipientType.TO,
	          InternetAddress.parse(sendingMailCargo.getTo()));

	          // Set Subject: header field
	          message.setSubject(sendingMailCargo.getSubject());

	          // Now set the actual message
	          message.setText(sendingMailCargo.getMsg());

	          // Send message
	          Transport.send(message);

	          System.out.println("Sent message successfully....");

	       } catch (MessagingException e) {
	             throw new RuntimeException(e);
	       }
	    }
	 }
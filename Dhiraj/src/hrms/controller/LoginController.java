package hrms.controller;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hrms.cargo.*;
import hrms.dao.LoginDAO;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LoginCargo log=new LoginCargo();
		log.setUsername(request.getParameter("userName"));
		log.setPassword(request.getParameter("password"));
		
		boolean flag=false;
		Cookie loginCookie = new Cookie("user", log.getUsername());
		
	    
		try{
			LoginDAO loginDAO=new LoginDAO();
			flag=loginDAO.validateUser(log);
			
			
			if(flag){
				response.addCookie(loginCookie);
					if(log.getUsername().equalsIgnoreCase("pradnya")){
						response.sendRedirect("Home.jsp");
					}else if(log.getUsername().equalsIgnoreCase("suman")){
						response.sendRedirect("Admin.jsp");
					}else if(log.getUsername().equalsIgnoreCase("deepak")){
						response.sendRedirect("Training.jsp");
					}					
					
				}else{
					response.sendRedirect("Login.html");
				}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
					
			
			
			
		
	}

}

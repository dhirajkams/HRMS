package hrms.controller;

import java.io.IOException;

import hrms.cargo.*;
import hrms.dao.ConnectionDAO;
import hrms.dao.CreateNewEmployeeDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import java.sql.PreparedStatement;

/**
 * Servlet implementation class CreateNewEmployeeServlet
 */

public class CreateNewEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static Logger log = Logger.getLogger(CreateNewEmployeeController.class.getName());
    /**
     * Default constructor. 
     */
    public CreateNewEmployeeController() {
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
		String action=request.getParameter("action");
		log.info(action);
		
	if (action!=null && action.equalsIgnoreCase("Insert"))
	{
		log.info("inside insert employee");
		
		EmployeeCargo emp=new EmployeeCargo();
		emp.setFirstName(request.getParameter("fname"));
		emp.setLastName(request.getParameter("lname"));
		emp.setDoj(request.getParameter("doj"));
		emp.setDesignation(request.getParameter("desig"));
		emp.setEmail(request.getParameter("email"));
		emp.setContactNo(request.getParameter("cn1"));
		emp.setUserName(request.getParameter("un"));
		emp.setPassword(request.getParameter("pwd"));
		
		
		
	
		try{
			int i=0;
			
			CreateNewEmployeeDAO createNewEmployeeDAO=new CreateNewEmployeeDAO();
			i=createNewEmployeeDAO.insertRecord(emp);
			
			
			if(i>0){
				request.setAttribute("Employee", emp);
				request.setAttribute("EmployeeCreatedSuccess", "Record created successfully!");
				RequestDispatcher rd = request.getRequestDispatcher("/CreateNewEmployee.jsp");
				rd.forward(request, response);
				/* request.getSession().setAttribute("Employee", emp);
				request.getSession().setAttribute("EmployeeCreatedSuccess", "Record created successfully!"); // This is for session
				response.sendRedirect("CreateNewEmployee.jsp");*/
			}
			else{
				response.sendRedirect("Error.jsp");
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}
	else if (action!=null && action.equalsIgnoreCase("Display"))
		{
		   
			response.sendRedirect("SearchByDate.jsp");
		}
	else if (action!=null && action.equalsIgnoreCase("Home")){
		response.sendRedirect("Home.jsp");
	}
	
	else if (action!=null && action.equalsIgnoreCase("Update")){
		response.sendRedirect("UpdatePinnacleEmployee.jsp");
	}
	else if (action!=null && action.equalsIgnoreCase("Delete")){
		response.sendRedirect("DeletePinnacleEmployee.jsp");
	}
				
				
				
			}
			
			
			
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	



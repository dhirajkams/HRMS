package hrms.controller;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;

import hrms.cargo.*;
import hrms.dao.CreateContractJoineeDAO;
/**
 * Servlet implementation class CreateContractJoineeServlet
 */

public class CreateContractJoineeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger Log = Logger.getLogger(CreateNewEmployeeController.class.getName());
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateContractJoineeController() {
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
		String action=request.getParameter("action");
		Log.info(action);
		{
			if(action!= null && action.equalsIgnoreCase("Submit"))
			{
		CreateContractJoineeCargo ccj=new CreateContractJoineeCargo();
		
		
		ccj.setName(request.getParameter("name"));
		ccj.setContactno(request.getParameter("contactno"));
		ccj.setHr(request.getParameter("hr"));
		ccj.setClient(request.getParameter("client"));
		ccj.setPosition(request.getParameter("position"));
		ccj.setDateofjoining(request.getParameter("dateofjoining"));
		ccj.setRecruiter(request.getParameter("recruiter"));
		ccj.setRelievingdate(request.getParameter("relievingdate"));
		ccj.setRate(request.getParameter("rate"));
		ccj.setCandidatesalary(request.getParameter("candidatesalary"));
		ccj.setEmail(request.getParameter("email"));
		
		
		try{
			int i=0;
		
		CreateContractJoineeDAO createContractJoineeDAO=new CreateContractJoineeDAO();
		i=createContractJoineeDAO.insertRecord(ccj);
		
		if(i>0){
			request.setAttribute("ContractJoinee", ccj);
			request.setAttribute("ContractJoineeCreatedSuccess", "Record created successfully!");
			RequestDispatcher rd = request.getRequestDispatcher("/CreateContractJoinees.jsp");
			rd.forward(request, response);
			
			System.out.println("dhiraj");
			/* request.getSession().setAttribute("Employee", emp);
			request.getSession().setAttribute("EmployeeCreatedSuccess", "Record created successfully!"); // This is for session
			response.sendRedirect("CreateNewEmployee.jsp");*/
		}
		else{
			response.sendRedirect("Error.jsp");
		}
		
 	}
		catch(Exception e)
		{
			System.out.println(e);
		}
			}
	  else if(action!= null && action.equalsIgnoreCase("Home")){
			response.sendRedirect("HR.jsp");
		}
	  else{
		  response.sendRedirect("Error.jsp");
		}
}
}
}
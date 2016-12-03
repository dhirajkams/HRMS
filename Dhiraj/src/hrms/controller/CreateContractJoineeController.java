package hrms.controller;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;

import hrms.cargo.*;
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
			if(action!= null && action.equalsIgnoreCase("submit"))
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
		
		
		
 try
 {
	    Class.forName("com.mysql.jdbc.Driver");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms","root","root");
		PreparedStatement ps=con.prepareStatement("insert into contract_joinee(name,contact_no,hr,client,position,date_of_joining,recruiter,relieving_date,rate,candidate_salary,email)values(?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,ccj.getName());
			ps.setString(2,ccj.getContactno());
			ps.setString(3,ccj.getHr());
			ps.setString(4,ccj.getClient());
			ps.setString(5,ccj.getPosition());
			ps.setString(6,ccj.getDateofjoining());
			ps.setString(7,ccj.getRecruiter());
			ps.setString(8,ccj.getRelievingdate());
			ps.setString(9,ccj.getRate());
			ps.setString(10,ccj.getCandidatesalary());
			ps.setString(11,ccj.getEmail());
			
			int rs=ps.executeUpdate();
			
			if(rs>0)
			{
				request.getSession().setAttribute("contractJoinee", ccj);
				request.getSession().setAttribute("ContractJoineeSuccess","Record Inserted Successfully");
				response.sendRedirect("CreateContractJoinee.jsp");
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
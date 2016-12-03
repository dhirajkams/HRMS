package hrms.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hrms.cargo.*;

/**
 * Servlet implementation class CreateNewContractJoinees
 */

public class CreateNewContractJoineesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateNewContractJoineesController() {
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
		String action=request.getParameter("action");
		if(action!=null && action.equalsIgnoreCase("Insert"))
		{
		ContractJoineesCargo contractJoinee = new ContractJoineesCargo();
		contractJoinee.setName(request.getParameter("Name"));
		contractJoinee.setContactNo(request.getParameter("Contact"));
		contractJoinee.setHr(request.getParameter("Hr"));
		contractJoinee.setClient(request.getParameter("Client"));
		contractJoinee.setPosition(request.getParameter("Position"));
		contractJoinee.setRecruiter(request.getParameter("Recruiter"));
		contractJoinee.setRelievingDate(request.getParameter("Relieving"));
		contractJoinee.setRate(request.getParameter("Rate"));
		contractJoinee.setCandidateSalary(request.getParameter("Candidate"));
		contractJoinee.setEmail(request.getParameter("Email"));
		contractJoinee.setDoj(request.getParameter("Doj"));
		
		try{
			//request.getSession().setAttribute("contractJoineeSuccess",null);
			System.out.println("Inside Try");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			PreparedStatement ps=con.prepareStatement("Insert into contract_joinee(name,contact_no,hr,client,position,recruiter,relieving_date,rate,candidate_salary,email,date_of_joining) values(?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,contractJoinee.getName());	
			ps.setString(2,contractJoinee.getContactNo());
			ps.setString(3,contractJoinee.getHr());
			ps.setString(4,contractJoinee.getPosition());
			ps.setString(5, contractJoinee.getClient());
			ps.setString(6,contractJoinee.getRecruiter());
			ps.setString(7,contractJoinee.getRelievingDate());
			ps.setString(8,contractJoinee.getRate());
			ps.setString(9,contractJoinee.getCandidateSalary());
			ps.setString(10,contractJoinee.getEmail());
			ps.setString(11,contractJoinee.getDoj());
			
			int rs=ps.executeUpdate();
			if(rs>0){
				request.getSession().setAttribute("contractJoinee", contractJoinee);
				request.getSession().setAttribute("contractJoineeSuccess", "Record created successfully!");
				response.sendRedirect("CreateContractJoinees.jsp");
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		}
			
			else if (action!=null && action.equalsIgnoreCase("Home")){
				response.sendRedirect("Home.jsp");
			}
			else{
				response.sendRedirect("Error.jsp");
			}
			
			
			
		}
		
		
		
		
	

}


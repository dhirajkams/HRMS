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
 * Servlet implementation class CreateContractBillServlet
 */

public class CreateContractBillController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateContractBillController() {
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
		
		
		if(action!=null && action.equalsIgnoreCase("submit"))
		{
			
		
		ContractBillCargo cb=new ContractBillCargo();
		cb.setName(request.getParameter("name"));
		cb.setInvoice_No(request.getParameter("invoiceno"));
		cb.setClient(request.getParameter("client"));
		cb.setStatus(request.getParameter("status"));
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			PreparedStatement ps=con.prepareStatement("insert into contractbill(Name,Invoice_No,Client,Billing_Amount,Status) values(?,?,?,?,?)");
			
			ps.setString(1,cb.getName());
			ps.setString(2,cb.getInvoice_No());
			ps.setString(3,cb.getClient());
			ps.setInt(4, cb.getBilling_Amount());
			ps.setString(5,cb.getStatus());
			
			int rs=ps.executeUpdate();
			if(rs>0){
				request.getSession().setAttribute("ContractBill",cb );
				request.getSession().setAttribute("ContractBillSuccess", "Record inserted successful");
				response.sendRedirect("CreateContractBill.jsp");
			}
			
			
			
		}
		catch(Exception e){
			
		}
	}
		else if(action!=null && action.equalsIgnoreCase("Home")){
			response.sendRedirect("Home.jsp");
		}

}
}
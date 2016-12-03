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
 * Servlet implementation class CreatePermentJoineeServlet
 */

public class CreatePermanentBillController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatePermanentBillController() {
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
	if (action!=null && action.equalsIgnoreCase("Submit"))
	{
		CreatePermanentBillCargo cpj =new CreatePermanentBillCargo();
		cpj.setName(request.getParameter("name"));
		cpj.setInvoice_id(request.getParameter("invoiceno"));
		cpj.setContact_no(request.getParameter("contactno"));
		cpj.setEmail(request.getParameter("email"));
		cpj.setPosition(request.getParameter("position"));
		cpj.setDate_of_position(request.getParameter("dateofjoining"));
		cpj.setClient(request.getParameter("client"));
		cpj.setClient_hr(request.getParameter("clientHR"));
		cpj.setRecruiter(request.getParameter("recruiter"));
		cpj.setTotal_CTC(request.getParameter("totalctc"));
	    cpj.setRemark(request.getParameter("remark"));
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms","root","root");
		
		PreparedStatement ps=con.prepareStatement("Insert into permanentjoinee(Name,Invoice_No,Contact_No,Email,Position,Date_Of_Joining,Client,Client_Hr,Recruiter,Total_CTC,Remark) values(?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,cpj.getName());
		ps.setString(2,cpj.getInvoice_id());
		ps.setString(3,cpj.getContact_no());
		ps.setString(4,cpj.getEmail());
		ps.setString(5,cpj.getPosition());
		ps.setString(6,cpj.getDate_of_position());
		ps.setString(7,cpj.getClient());
		ps.setString(8,cpj.getClient_hr());
		ps.setString(9,cpj.getRecruiter());
		ps.setString(10,cpj.getTotal_CTC());
		ps.setString(11,cpj.getRemark());
		
		int rs=ps.executeUpdate();
		if(rs>0)
		{
			request.getSession().setAttribute("CreatePermanentBill",cpj);
			request.getSession().setAttribute("PermanentBillSuccess","Record Inserted Successfully");
			response.sendRedirect("CreatePermanentBill.jsp");

		}
		}
		catch (Exception e)
		{
			System.out.println(e);
	}
	}
		 
	
	else if(action!= null && action.equalsIgnoreCase("Home"))
	{
		response.sendRedirect("HR.jsp");
	}	
	
	}
}
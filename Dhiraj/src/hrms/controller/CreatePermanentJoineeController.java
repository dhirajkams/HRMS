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
 * Servlet implementation class CreatePermanentJoineeServlet
 */

public class CreatePermanentJoineeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatePermanentJoineeController() {
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
		if(action!=null && action.equalsIgnoreCase("Submit")){
			
			PermanentJoineeCargo pj=new PermanentJoineeCargo();
			
			pj.setName(request.getParameter("name"));
			pj.setInvoice_No(request.getParameter("invoiceno"));
			pj.setContact_No(request.getParameter("contactno"));
			pj.setEmail(request.getParameter("email"));
			pj.setPosition(request.getParameter("position"));
			pj.setDate_Of_Joining(request.getParameter("dateofjoining"));
			pj.setClient(request.getParameter("client"));
			pj.setClient_Hr(request.getParameter("clientHR"));
			pj.setRecruiter(request.getParameter("recruiter"));
			pj.setTotal_CTC(request.getParameter("totalctc"));
			pj.setRemark(request.getParameter("remark"));
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				PreparedStatement ps=con.prepareStatement("insert into permanentjoinee(Name,Invoice_No,Contact_No,Email,Position,Date_Of_Joining,Client,Client_Hr,Recruiter,Total_CTC,Remark) values(?,?,?,?,?,?,?,?,?,?,?)");
				
				ps.setString(1,pj.getName());
				ps.setString(2,pj.getInvoice_No());
				ps.setString(3,pj.getContact_No());
				ps.setString(4,pj.getEmail());
				ps.setString(5,pj.getPosition());
				ps.setString(6,pj.getDate_Of_Joining());
				ps.setString(7,pj.getClient());
				ps.setString(8,pj.getClient_Hr());
				ps.setString(9,pj.getRecruiter());
				ps.setString(10,pj.getTotal_CTC());
				ps.setString(11,pj.getRemark());
				
				int rs=ps.executeUpdate();
				if(rs>0){
					request.getSession().setAttribute("PermanentJoinee", pj);
					request.getSession().setAttribute("PermanentJoineeSuccess","Record inserted successfully");
					response.sendRedirect("CreatePermanentJoinee.jsp");
				}
				
				
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
		else if((action!=null && action.equalsIgnoreCase("Home"))){
			response.sendRedirect("Home.jsp");
		}
	}

}

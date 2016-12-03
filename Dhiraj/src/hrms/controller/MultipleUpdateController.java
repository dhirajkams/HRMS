package hrms.controller;

import hrms.cargo.EmployeeCargo;
import hrms.cargo.MultipleUpdateCargo;
import hrms.dao.ConnectionDAO;
import hrms.dao.MultipleUpdateDAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultipleUpadateController
 */
public class MultipleUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultipleUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms","root","root");
			System.out.println("connection created");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from employee");
			ArrayList<EmployeeCargo> emp = new ArrayList<EmployeeCargo>();
			while(rs.next()){
				EmployeeCargo e = new EmployeeCargo();
				e.setEmpId(rs.getInt(1));
				e.setFirstName(rs.getString(2));
				e.setLastName(rs.getString(3));
				e.setDoj(rs.getString(4));
				e.setDesignation(rs.getString(5));
				e.setEmail(rs.getString(6));
				e.setContactNo(rs.getString(7));
				e.setUserName(rs.getString(8));
				
				emp.add(e);
				
			}
			
			request.getSession().setAttribute("empList", emp);
			response.sendRedirect("MultipleUpdateEmployee.jsp");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String[] id=request.getParameterValues("chk1");
		 
		MultipleUpdateCargo muc=new MultipleUpdateCargo();    
      
      muc.setEmp_Id(parsingArray(id));      //done
      muc.setFirstName(request.getParameterValues("fname"));
      muc.setLastName(request.getParameterValues("lname"));
      muc.setDate_Of_Joining(request.getParameterValues("doj"));
      muc.setDesig(request.getParameterValues("desig"));
      muc.setEmail(request.getParameterValues("email"));
      muc.setContact_No(request.getParameterValues("contact"));
      muc.setUserName(request.getParameterValues("un"));
      
      try{
    	  
    	  int i=0;
    	  MultipleUpdateDAO multipleUpdateDAO=new MultipleUpdateDAO();
    	  i=multipleUpdateDAO.multipleUpdate(muc);
    	  
    	  if(i>0){
    		  request.setAttribute("resultset", "rs");
    		  request.setAttribute("multipleUpdateSuccessful", "Record updated successfully");
    		  RequestDispatcher rd=request.getRequestDispatcher("/MultipleUpdateEmployee.jsp");
    		  rd.forward(request, response);
    		  
    		  
    		  
    		  
    	  }
    	  
    	 }
      catch(Exception e){
    	  e.printStackTrace();
      }
	
   }
	
	private int[] parsingArray(String[] id){
		int[] ids = new int[id.length];
		for(int i=0; i<id.length;i++){
			int a=Integer.parseInt(id[i]);
			ids[i] = a;
		}
		  
		 
		 return ids;
		 
	 }
}



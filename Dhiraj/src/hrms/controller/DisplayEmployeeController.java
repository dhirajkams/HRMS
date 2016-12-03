package hrms.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import hrms.cargo.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayEmployeeServlet
 */

public class DisplayEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("DisplayEmployee.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

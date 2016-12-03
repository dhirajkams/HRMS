package hrms.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hrms.cargo.*;
/**
 * Servlet implementation class CreateExpenseServlet
 */

public class CreateExpenseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateExpenseController() {
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
		Cookie[] cookies = request.getCookies();
		boolean isSessionValid = false;
		System.out.println("CreateExpenseController--- start");
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("user")){
				isSessionValid = true;
			}
		}
		if(!isSessionValid){
			System.out.println("No session information found. rediracting to Login page");
			response.sendRedirect("Login.html");
		}
		String action=request.getParameter("action");
		if(action!=null && action.equalsIgnoreCase("submit")){
			ExpenseCargo ex=new ExpenseCargo();
			
			ex.setDate(request.getParameter("date"));
			ex.setTransaction_Type(request.getParameter("transaction_type"));
			ex.setCheque_No(request.getParameter("chequeno"));
			ex.setBank_Name(request.getParameter("bankname"));
			ex.setAmount(request.getParameter("amount"));
			ex.setDescription(request.getParameter("description"));
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms","root","root");
				PreparedStatement ps=con.prepareStatement("insert into expense(Date,Transaction_Type,Cheque_No,Bank_Name,Amount,Description) values(?,?,?,?,?,?)");
				
				ps.setString(1, ex.getDate());
				ps.setString(2,ex.getTransaction_Type());
				ps.setString(3,ex.getCheque_No());
				ps.setString(4,ex.getBank_Name());
				ps.setString(5,ex.getAmount());
				ps.setString(6,ex.getDescription());
				
				int rs=ps.executeUpdate();
				
				if(rs>0){
					request.getSession().setAttribute("Expense",ex);
					request.getSession().setAttribute("ExpenseSuccess","Record inserted successfully");
					response.sendRedirect("CreateExpense.jsp");
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			
		}
		else if(action!=null && action.equalsIgnoreCase("Home")){
			response.sendRedirect("Home.jsp");
		}
		
	}

}

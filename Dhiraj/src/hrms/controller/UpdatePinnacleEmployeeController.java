package hrms.controller;

import hrms.cargo.EmployeeCargo;
import hrms.dao.UpdatePinnacleEmployeeDAO;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdatePinnacleEmployeeController
 */

public class UpdatePinnacleEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePinnacleEmployeeController() {
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
		
			
			EmployeeCargo emp=new EmployeeCargo();
			emp.setEmpId(Integer.parseInt(request.getParameter("empid")));
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
				UpdatePinnacleEmployeeDAO updatePinnacleEmployeeDAO=new UpdatePinnacleEmployeeDAO();
				i=updatePinnacleEmployeeDAO.updateEmployee(emp);
				
				if(i>0){
					request.setAttribute("Employee", emp);
					request.setAttribute("EmployeeCreatedSuccess", " Record Updated successfully!");
					RequestDispatcher rd = request.getRequestDispatcher("/UpdatePinnacleEmployee.jsp");
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
	}



package hrms.controller;

import hrms.cargo.EmployeeCargo;
import hrms.dao.DeletePinnacleEmployeeDAO;
import hrms.dao.UpdatePinnacleEmployeeDAO;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteEmployeeControlller
 */

public class DeleteEmployeePinnacleControlller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployeePinnacleControlller() {
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
		
		try{
			
			int i=0;
			DeletePinnacleEmployeeDAO deletePinnacleEmployeeDAO=new DeletePinnacleEmployeeDAO();
			i=deletePinnacleEmployeeDAO.deleteEmployee(emp);
			
			if(i>0){
				request.setAttribute("Employee", emp);
				request.setAttribute("EmployeeCreatedSuccess", " Record Updated successfully!");
				RequestDispatcher rd = request.getRequestDispatcher("/DeletePinnacleEmployee.jsp");
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

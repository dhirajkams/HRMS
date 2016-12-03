package hrms.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import hrms.controller.*;
import hrms.cargo.*;
import hrms.dao.*;
/**
 * Servlet implementation class SearchContractJoineeController
 */

public class SearchContractJoineeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchContractJoineeController() {
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
		
		SearchContractJoineeCargo searchContractJoineePojo=new SearchContractJoineeCargo();
		searchContractJoineePojo.setMonth(Integer.parseInt(request.getParameter("month")));
		searchContractJoineePojo.setYear(Integer.parseInt(request.getParameter("year")));
		searchContractJoineePojo.setStatus(request.getParameter("sts"));
		
		try{
			
			SearchContractJoineeCargo1 searchContractJoineeCargo1=new SearchContractJoineeCargo1();
			List<SearchContractJoineeCargo1> list=new ArrayList<SearchContractJoineeCargo1>();
			
			SearchContractJoineeDAO searchContractJoineeDAO=new SearchContractJoineeDAO();
			list=searchContractJoineeDAO.getUserDetails(searchContractJoineePojo);
			
			request.setAttribute("userDetails", list);
			RequestDispatcher rd = request.getRequestDispatcher("/SearchContractJoinee1.jsp");
			rd.forward(request, response);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

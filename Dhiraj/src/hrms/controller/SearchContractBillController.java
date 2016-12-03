package hrms.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hrms.cargo.SearchContractJoineeCargo;
import hrms.dao.SearchContractJoineeDAO;
import hrms.cargo.*;
import hrms.dao.*;
/**
 * Servlet implementation class SearchContractBillController
 */
@WebServlet("/SearchContractBillController")
public class SearchContractBillController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchContractBillController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	SearchContractBillCargo searchContractBillpojo= new SearchContractBillCargo();
	searchContractBillpojo.setMonth(request.getParameter("month"));
	searchContractBillpojo.setYear(request.getParameter("year"));
	searchContractBillpojo.setStatus(request.getParameter("status"));
	searchContractBillpojo.setName(request.getParameter("name"));
try{
	List<String> searchContractBillList = new ArrayList<String>();
	SearchContractBillDAO searchContractBillDAO = new SearchContractBillDAO();
	searchContractBillList = searchContractBillDAO.getUserDetails(searchContractBillpojo);
	request.setAttribute("searchContractBillList1", searchContractBillList);
	
	if(searchContractBillList.isEmpty()==false){
		RequestDispatcher rd=request.getRequestDispatcher("searchDisplay.jsp");
		rd.forward(request, response);
	}
	}
catch(Exception e)
{
	e.printStackTrace();
}
}

}

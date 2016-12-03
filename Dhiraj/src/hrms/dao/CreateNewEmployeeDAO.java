package hrms.dao;

import hrms.cargo.EmployeeCargo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateNewEmployeeDAO {
	Connection con;
	PreparedStatement ps;
	
	public int insertRecord(EmployeeCargo emp) throws Exception {
	
		String fname=emp.getFirstName();
		String lname=emp.getLastName();
		String doj=emp.getDoj();
		String desig=emp.getDesignation();
		String email=emp.getEmail();
		String con_no=emp.getContactNo();
		String user_name=emp.getUserName();
		String pwd=emp.getPassword();
		
		
		
		
		ConnectionDAO connectionDAO=new ConnectionDAO();
		con=connectionDAO.getConnection();
		
		ps=con.prepareStatement("Insert into employee(FirstName,LastName,Date_of_joining,Designation,Email,Contact_No,Username,Password) values(?,?,?,?,?,?,?,?)");
				
		ps.setString(1,fname);
		ps.setString(2,lname);
		ps.setString(3,doj);
		ps.setString(4,desig);
		ps.setString(5,email);
		ps.setString(6,con_no);
		ps.setString(7,user_name);
		ps.setString(8,pwd);
		
		
		int rs=ps.executeUpdate();
		
	
		return rs;
	}
}

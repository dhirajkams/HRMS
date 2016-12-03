package hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hrms.cargo.EmployeeCargo;

public class UpdatePinnacleEmployeeDAO {

	public int updateEmployee(EmployeeCargo emp) throws Exception {
		// TODO Auto-generated method stub
        
		int emp_id=emp.getEmpId();
		String fname=emp.getFirstName();
		String lname=emp.getLastName();
		String doj=emp.getDoj();
		String desig=emp.getDesignation();
		String email=emp.getEmail();
		String con_no=emp.getContactNo();
		String user_name=emp.getUserName();
		String pwd=emp.getPassword();
		
		
			Connection con=null;
			PreparedStatement ps=null;
			
			ConnectionDAO connectionDAO=new ConnectionDAO();
			con=connectionDAO.getConnection();
			
			String sql="update employee set FirstName= ? , LastName= ?, Date_of_joining= ? , Designation= ?, Email= ?,Contact_No=?, Username=?,Password=?"
					+"where Emp_Id= ?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1,fname);
			ps.setString(2,lname);
			ps.setString(3,doj);
			ps.setString(4,desig);
			ps.setString(5,email);
			ps.setString(6,con_no);
			ps.setString(7,user_name);
			ps.setString(8,pwd);
			ps.setInt(9,emp_id);
			
			int rs=ps.executeUpdate();
				
			
		
		
		
		return rs;
	}

}

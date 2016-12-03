package hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import hrms.cargo.EmployeeCargo;

public class DeletePinnacleEmployeeDAO {
	

	public int deleteEmployee(EmployeeCargo emp) throws Exception {
		// TODO Auto-generated method stub
		int emp_id=emp.getEmpId();
		
		
		Connection con=null;
		PreparedStatement ps=null;
		
		ConnectionDAO connectionDAO=new ConnectionDAO();
		con=connectionDAO.getConnection();
		
		String sql="Delete from employee where  Emp_Id= ?";
				
		ps=con.prepareStatement(sql);
		
		ps.setInt(1, emp_id);
		
		int rs=ps.executeUpdate();		
		
		return rs;
	}

}

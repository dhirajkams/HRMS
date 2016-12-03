package hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import hrms.cargo.MultipleUpdateCargo;

public class MultipleUpdateDAO {

	public int multipleUpdate(MultipleUpdateCargo muc) throws Exception  {
		int rs=0;
		
		int[] empid=muc.getEmp_Id();
		String[] fname=muc.getFirstName();
		String[] lname=muc.getLastName();
		String[] doj=muc.getDate_Of_Joining();
		String[] desig=muc.getDesig();
		String[] contact=muc.getContact_No();
		String[] email=muc.getEmail();
		String[] user=muc.getUserName();
		
		Connection con=null;
		PreparedStatement ps=null;
		
		ConnectionDAO connectionDAO=new ConnectionDAO();
		con=connectionDAO.getConnection();
		
		for(int j=0;j<empid.length;j++){
		
		String sql=("update employee set FirstName=?,LastName=?,Date_of_joining=?,Designation=?,Email=?,Contact_No=?,Username=? where Emp_Id=?");
		ps=con.prepareStatement(sql);
		
		ps.setString(1,fname[j]);
		ps.setString(2,lname[j]);
		ps.setString(3,doj[j]);
		ps.setString(4,desig[j]);
		ps.setString(5,contact[j]);
		ps.setString(6,email[j]);
		ps.setString(7,user[j]);
		ps.setInt(8,empid[j]);
		
		 rs=ps.executeUpdate();
		
		
		
		
		
		
		
		
		}	
		return rs;
	}

}

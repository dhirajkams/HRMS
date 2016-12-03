package hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hrms.cargo.LoginCargo;

public class LoginDAO {

	public boolean validateUser(LoginCargo log) throws Exception {
		// TODO Auto-generated method stub
		
		String username=log.getUsername();
		String password=log.getPassword();
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int count=0;
		boolean flag=false;
		
		ConnectionDAO getLoginInfo=new ConnectionDAO();
		con=getLoginInfo.getConnection();
		
		String sql="Select count(*) from login where USERNAME= ? AND PASSWORD= ?";
		ps=con.prepareStatement(sql);
		ps.setString(1,username);
		ps.setString(2,password);
		
		rs=ps.executeQuery();
		
		while(rs.next()){
			count=rs.getInt(1);
		}
		
		if(count==1){
			flag=true;
		}
		
				
				
		return flag;
	}

}

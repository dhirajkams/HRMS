package hrms.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDAO {
	
	public Connection getConnection() throws Exception{
		
		Connection con=null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms","root","root");
			System.out.println("Test 3 from kunal side again commit activity");
			}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}

}

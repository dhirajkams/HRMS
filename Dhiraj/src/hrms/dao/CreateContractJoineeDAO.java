package hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import hrms.cargo.CreateContractJoineeCargo;

public class CreateContractJoineeDAO {
	Connection con;
	PreparedStatement ps;
	

	public int insertRecord(CreateContractJoineeCargo ccj) throws Exception{
		
		
		
	
		String name=ccj.getName();
		String contactno=ccj.getContactno();
		String hr=ccj.getHr();
		String client=ccj.getClient();
		String position=ccj.getPosition();
		String dateofjoining=ccj.getDateofjoining();
		String recruiter=ccj.getRecruiter();
		String relieving_date=ccj.getRelievingdate();
		String rate=ccj.getRate();
		String candidate_salary=ccj.getCandidatesalary();
		String email=ccj.getEmail();
		
		ConnectionDAO connectionDAO=new ConnectionDAO();
		con=connectionDAO.getConnection();
		
		ps=con.prepareStatement("Insert into contract_joinee(name,contact_no,hr,client,position,date_of_joining,recruiter,relieving_date,rate,candidate_salary,email) values(?,?,?,?,?,?,?,?,?,?,?)");

		

		ps.setString(1,name);
		ps.setString(2,contactno);
		ps.setString(3,hr);
		ps.setString(4,client);
		ps.setString(5,position);
		ps.setString(6,dateofjoining);
		ps.setString(7,recruiter);
		ps.setString(8,relieving_date);
		ps.setString(9,rate);
		ps.setString(10,candidate_salary);
		ps.setString(11,email);
		
		
		
		int rs=ps.executeUpdate();
		
	
		return rs;
	}

	}



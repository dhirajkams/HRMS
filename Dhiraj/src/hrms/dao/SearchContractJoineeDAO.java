package hrms.dao;

import hrms.cargo.SearchContractJoineeCargo;
import hrms.cargo.SearchContractJoineeCargo1;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class SearchContractJoineeDAO {

	public  List<SearchContractJoineeCargo1> getUserDetails(SearchContractJoineeCargo searchContractJoineePojo) throws Exception {
		
		int month=searchContractJoineePojo.getMonth();
		int year=searchContractJoineePojo.getYear();
		String status=searchContractJoineePojo.getStatus();
		System.out.println(month+ "-"+year+"-"+status);
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<SearchContractJoineeCargo1> userDeatils=new ArrayList<SearchContractJoineeCargo1>();
		ConnectionDAO connectionDAO=new ConnectionDAO();
		con=connectionDAO.getConnection();
		
		
		
		String sql="Select cb.status,cj.name,cj.contact_no,cj.date_of_joining "
				+"from contract_joinee cj join contract_bill cb "
				+"on cj.serial_no=cb.Id "
				+"where substr(date_of_joining,1,2) like ? and substr(date_of_joining,7,9)= ? and cb.status=? ";
		System.out.println(sql);
		ps=con.prepareStatement(sql);
		
		ps.setString(1,"%"+String.valueOf(month)+"%");
		ps.setString(2,String.valueOf(year));
		ps.setString(3,status);
		
		rs=ps.executeQuery();
		
		while(rs.next()){
			SearchContractJoineeCargo1 searchCJpojo=new SearchContractJoineeCargo1();
			searchCJpojo.setStatus(rs.getString(1));
			searchCJpojo.setName(rs.getString(2));
			searchCJpojo.setContanct_no(rs.getString(3));
			searchCJpojo.setDate_of_joining(rs.getString(4));
			
			userDeatils.add(searchCJpojo);
			
		}
		return userDeatils;
		
		
		
	}

}

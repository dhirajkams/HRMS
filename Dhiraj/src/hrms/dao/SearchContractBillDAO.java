package hrms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import hrms.cargo.SearchContractBillCargo;

public class SearchContractBillDAO {

	public List<String> getUserDetails(SearchContractBillCargo searchcontractbillpojo) throws Exception
	{
		List<String> userDetails = new ArrayList<String>();
		try
		{
		Connection con = null;
		ResultSet rs = null;
		String month = searchcontractbillpojo.getMonth(); 
		String year = searchcontractbillpojo.getYear();
		String status = searchcontractbillpojo.getStatus();
		String name=searchcontractbillpojo.getName();
		ConnectionDAO getLoginInfo = new ConnectionDAO();
		con = getLoginInfo.getConnection();
		}
		catch(Exception e){
			
		}
		return userDetails;
}
}
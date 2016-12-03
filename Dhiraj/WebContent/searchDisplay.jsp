<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    List<String> searchContractJoineeList2 =new ArrayList<String>();
    searchContractJoineeList2 =(List<String>)request.getAttribute("searchContractJoineeList1");
    String[] singleContractJoineeArray=null;
    	for(int i=0;i<searchContractJoineeList2.size();i++)
	{
		String singleContractJoinee=(String)searchContractJoineeList2.get(i);	
	singleContractJoineeArray=singleContractJoinee.split(":");
	System.out.println(singleContractJoineeArray);
	
	String status=singleContractJoineeArray[0];
	String name=singleContractJoineeArray[1];
	String contact_no=singleContractJoineeArray[2];
	String date_of_joining=singleContractJoineeArray[3];

	System.out.println("Status:"+status+"Name:"+name+"Contact No:"+contact_no+"Date Of Joining:"+date_of_joining);
	}
%>
</body>
</html>
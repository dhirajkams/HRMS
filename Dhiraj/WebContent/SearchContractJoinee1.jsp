<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="hrms.cargo.*" %>
    <%@page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<SearchContractJoineeCargo1> employees =(List<SearchContractJoineeCargo1>)request.getAttribute("userDetails");
%>
<center>
<table border=1>
<tr>
<td>Status</td>
<td>Name</td>
<td>Contact_No</td>
<td>DOJ</td>
</tr>
<%
	for(SearchContractJoineeCargo1 emp : employees)
{

System.out.println("Inside while");
%>
<tr>

<td><%=emp.getStatus()%></td>
<td><%=emp.getName() %></td>
<td><%=emp.getContanct_no() %></td>
<td><%=emp.getDate_of_joining() %></td>




</tr>
<%
}
System.out.println("outside while");
%>
</table>
</center>
</body>
</html>
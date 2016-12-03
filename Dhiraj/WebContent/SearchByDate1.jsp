<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@page import="java.util.*" %>
   <%@page import="hrms.cargo.*" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<EmployeeCargo> employees =(List<EmployeeCargo>)session.getAttribute("empList");
%>
<center>
<table border=1>
<tr>
<td>Emp Id</td>
<td>First Name</td>
<td>Last Name</td>
<td>DOJ</td>
<td>Designation</td>
<td>Email</td>
<td>Contact No</td>
<td>User Name</td>
</tr>
<%
	for(EmployeeCargo emp : employees)
{

System.out.println("Inside while");
%>
<tr>

<td><%=emp.getEmpId() %></td>
<td><%=emp.getFirstName() %></td>
<td><%=emp.getLastName() %></td>
<td><%=emp.getDoj() %></td>
<td><%=emp.getDesignation() %></td>
<td><%=emp.getEmail() %></td>
<td><%=emp.getContactNo() %></td>
<td><%=emp.getUserName() %></td>



</tr>
<%
}
System.out.println("outside while");
%>
</table>
</center>

</body>
</html> 
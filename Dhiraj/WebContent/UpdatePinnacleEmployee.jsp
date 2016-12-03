<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="crimson">
<form action="UpdatePinnacleEmployeeController" method=post>
<table bgcolor="cornsilk" border="all">
<tr>
    <td>Emp_Id :</td>
    <td><input type="text" name="empid"></td>
</tr>
<tr>
    <td>First Name :</td>
    <td><input type="text" name="fname"></td>
</tr>
<tr>
    <td>Last Name  :</td>
    <td><input type="text" name="lname"></td>
</tr>
<tr>
    <td>Date of Joining :</td>
    <td><input type="date" name="doj"></td>
</tr>
<tr>
    <td>Designation :</td>
    <td><input type="text" name="desig"></td>
</tr>
<tr>
    <td>Email </td>
    <td><input type="text" name="email"></td>
</tr>
<tr>
    <td>Contact Number :</td>
    <td><input type="text" name="cn1"></td>
</tr>
<tr>
    <td>UserName :</td>
    <td><input type="text" name="un"></td>
</tr>
<tr>
    <td>Password :</td>
    <td><input type="password" name="pwd"></td>
</tr>
<tr>
   
 <td><input type="submit" name="action" value="UpdateInfo"></td>
  
    
    
    

</table>
<div>
<%
if(request.getAttribute("EmployeeCreatedSuccess") != null){
	out.print(request.getAttribute("EmployeeCreatedSuccess")  );
	request.removeAttribute("EmployeeCreatedSuccess"); 
}


%>
</div>
</body>
</html>
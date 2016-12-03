<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name=myForm action="UpdateNewPinnacleEmployeeController" method="post"><br><br>
<table border=1 bgcolor=pink>
<tr><td>Employee Id&nbsp;&nbsp;</td><td><input type="text" name=Emp_Id></td></tr>
<tr><td>First Name&nbsp;&nbsp;</td><td><input type="text" name=firstname></td></tr>
<tr><td>Last Name&nbsp;&nbsp;</td><td><input type="text" name=lastname></td></tr>
<tr><td>Date of Joining&nbsp;&nbsp;</td><td><input type="date" name=dateofjoining></td></tr>
<tr><td>Designation&nbsp;&nbsp;</td><td><input type="text" name=designation></td></tr>
<tr><td>Email&nbsp;&nbsp;</td><td><input type="text" name=email></td></tr>
<tr><td>Contact No&nbsp;&nbsp;</td><td><input type="text" name=contactno></td></tr>
<tr><td>User Name&nbsp;&nbsp;</td><td><input type="text" name=username></td></tr>
<tr><td>Password&nbsp;&nbsp;</td><td><input type="password" name=password></td></tr>
<tr><td><input type="submit" name=action  value=Home></td>
<td><input type="submit" name="action" value="Update_Record"></td></tr>
</table>
</form>

<div>
<%
if(request.getAttribute("NewEmployeeSuccess")!=null)
{
	out.print(request.getAttribute("NewEmployeeSuccess"));
	request.removeAttribute("NewEmployeeSuccess");
}
%>
</div>
</body>
</html>
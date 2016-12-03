<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="style.css" type="text/css" rel="stylesheet" >

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="javascript" >
function validateForm(){
	var x=document.forms["myForm"]["fname"].value;
	if(x==null || x==""){
		alert("Name must be filled out");
		return false;
	}
}

function validateForm() {
    var x = document.forms["myForm"]["email"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }
}
function validateForm() {
    var x = document.forms["myForm"]["email"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }
}
</script>
</head>
<body>
<h1>Create New Pinnacle Employee</h3>

<form name=myForm action="CreateNewEmployeeController" method="post" ><br><br>
<div id="main">
<table bgcolor="pink" border="all">
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
    <td><input type="submit" name="action" value="Insert"></td>
    <td><input type="submit" name="action" value="Display"></td>
</tr>
<tr>
<td><input type="submit" name="action" value="Update"></td>
<td><input type="submit" name="action" value="Delete"></td>
</tr>
<tr>
<td><input type="submit" name="action" value="Home"></td>
</tr>


</table>
</div>
</form>
<div>
<%
if(request.getAttribute("EmployeeCreatedSuccess") != null){
	out.print(request.getAttribute("EmployeeCreatedSuccess"));
	request.removeAttribute("EmployeeCreatedSuccess"); 
}


%>
</div>

</body>
</html>
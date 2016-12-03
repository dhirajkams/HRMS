<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="searchheaderForm" method="post" action="SendingMailController">
<table>
<tr><td bgcolor="#00FFFF" width="100px" colspan="6"><a href="home.jsp">HOME</a></td></tr>

<tr><td colspan="2"><h1>Send Mail to  Candidates </h1></td></tr>
<tr><td>From : </td><td><input type="text" name="from" ></td></tr>
<tr><td>To :</td><td><input type="text" name="to" ></td></tr>
<tr><td>UserName : </td><td><input type="text" name="un" ></td></tr>
<tr><td>Password :  </td><td><input type="password" name="pwd" ></td></tr>




<tr><td>Subject : </td><td><input type="text" name="subject" ></td></tr>
<tr><td>Message :</td><td><textarea rows="28" cols="105" name="body" ></textarea></td></tr>


<tr><td colspan="2" align="center"><input type="submit" value="SendMail" name="submit" onclick="return sendMail()"> </td></tr> 
</table>
</form>
</body>
</html>
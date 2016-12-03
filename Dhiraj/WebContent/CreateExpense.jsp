<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=pink>
<center>
<form action=CreateExpenseController method=post>
<table border=1 bgcolor=yellow>
<tr bgcolor=orange><td>Date&nbsp;&nbsp;</td><td><input type="date" name=date></td></tr>
<tr bgcolor=orange><td>Transaction Type&nbsp;&nbsp;</td><td><input type="text" name=transaction_type></td></tr>
<tr bgcolor=orange><td>Cheque_No&nbsp;&nbsp;</td><td><input type="text" name=chequeno></td></tr>
<tr bgcolor=orange><td>Bank Name&nbsp;&nbsp;</td><td><input type="text" name=bankname></td></tr>
<tr bgcolor=orange><td>Amount&nbsp;&nbsp;</td><td><input type="text" name=amount></td></tr>
<tr bgcolor=orange><td>Description&nbsp;&nbsp;</td><td><input type="text" name=description></td></tr>
<tr bgcolor=blue><td><input type="submit" name=action value=Submit></td>
<td><input type="submit" name=action value=Home></td></tr>
</table>
</form>
</center>
<% 
    if(session.getAttribute("ExpenseSuccess")!=null){
    	out.print(session.getAttribute("ExpenseSuccess"));
    	session.removeAttribute("ExpenseSuccess");
    }
%>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=orange>
<center>
<form action="CreatePermanentJoineeController" method=post>
<table border=1 bgcolor=yellow>
<tr><td>Name&nbsp;&nbsp;</td><td><input type="text" name="name"></td></tr>
<tr><td>InVoice No&nbsp;&nbsp;</td><td><input type="text" name="invoiceno"></td></tr>
<tr><td>Contact No&nbsp;&nbsp;</td><td><input type="text" name="contactno"></td></tr>
<tr><td>Email&nbsp;&nbsp;</td><td><input type="text" name="email"></td></tr>
<tr><td>Position&nbsp;&nbsp;</td><td><input type="text" name="position"></td></tr>
<tr><td>Date Of Joining&nbsp;&nbsp;</td><td><input type="date" name="dateofjoining"></td></tr>
<tr><td>Client&nbsp;&nbsp;</td><td><select name="client">
<option value="">--SELECT--</option>
<option value="NSDL">NSDL</option>
<option value="NSDL-Egovernance">NSDL-Egovernance</option>
<option value="NDML">NDML</option>
<option value="HDFC">HDFC</optio>
<option value="NSE-IT">Ugam Solutions</option>
<option value="Cogencis">Cogencis</option>
<option value="Kotak Mahindra">Kotak Mahindra</option>
<option value="Sapient">Sapient</option>
<option value="NSE-IT">NSE-IT</option>
</select></td></tr>
<tr><td>Client HR&nbsp;&nbsp;</td><td><input name="clientHR" type="text"></td></tr>
<tr><td>Recruiter&nbsp;&nbsp;</td><td><select name="recruiter">
<option value="">--Select--</option>
<option value="Surabhi">Surabhi</option>
<option value="Puja ">Puja </option>
<option value="Suman ">Suman </option>
<option value="PriyankaG">PriyankaG</option>
<option value="Suman">Suman</option>
<option value="Gayatri">Gayatri</option>
<option value="Sheetal">Sheetal</option>
<option value="Sanskriti">Sanskriti</option>
<option value="Prasiddhi">Prasiddhi</option>
<option value="Mohini">Mohini</option>
</select></td></tr>
<tr><td>Total CTC&nbsp;&nbsp;</td><td><input name="totalctc" type="text"></td></tr>
<tr><td>Remark&nbsp;&nbsp;</td><td><input name="remark" type="text"></td></tr>
<tr><td><input type="submit" name=action value="Submit"></td>
<td><input type="submit" name=action value="Home"></td>
</tr>
</table>
</form>

<div>
<%
if(request.getSession().getAttribute("PermanentJoineeSuccess")!=null)
{
	out.print(request.getSession().getAttribute("PermanentJoineeSuccess"));
	request.getSession().removeAttribute("PermanentJoineeSuccess");
}
%>
</div>
</center>
</body>
</html>
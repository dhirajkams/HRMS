<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="CreateContractJoineeController" method="post">
<table border=1 >
<tr><td>Name&nbsp;&nbsp;</td><td><input type="text" name=name></td></tr>
<tr><td>Contact No&nbsp;&nbsp;</td><td><input type="text" name=contactno></td></tr>
<tr><td>HR&nbsp;&nbsp;</td><td><input type="text" name=hr></td></tr>
<tr><td>Client&nbsp;&nbsp;</td><td><select name=client>
<option value="">Select</option>
<option value="NSDL">NSDL</option>
<option value="NSDL-Egovernance">NSDL-Egovernance</option>
<option value="NDML">NDML</option>
<option value="HDFC">HDFC</option>
<option value="Ugam Solutions">Ugam Solutions</option>
<option value="Bajaj Allianz">Bajaj Allianz</option>
<option value="Cogencis">Cogencis</option>
<option value="Kotak Mahindra">Kotak Mahindra</option>
<option value="Sapient">Sapient</option>
<option value="NSE-IT">NSE-IT</option>
<option value="Circular angle">Circular Angle</option>
<option value="XLNC">XLNC</option>
</select></td></tr>
<tr><td>Position&nbsp;&nbsp;</td><td><input type="text" name=position></td></tr>
<tr><td>Date Of Joining&nbsp;&nbsp;</td><td><input type="date" name=dateofjoining></td></tr>
<tr><td>Recruiter&nbsp;&nbsp;</td><td><select name=recruiter>
<option value="">Select</option>
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
</select>
<tr><td>Relieving Date&nbsp;&nbsp;</td><td><input type="date" name=relievingdate></td></tr>
<tr><td>Rate&nbsp;&nbsp;</td><td><input type="text" name=rate></td></tr>
<tr><td>Candidate Salary&nbsp;&nbsp;</td><td><input type="text" name=candidatesalary></td></tr>
<tr><td>Email&nbsp;&nbsp;</td><td><input type="text" name=email></td></tr>
</table><br>
<input type="submit" name=action value="Submit"><br>
<input type="submit" name=action  value="Home">
</form>
<div>
<%
if(request.getSession().getAttribute("ContractJoineeSuccess")!=null)
{
	out.print(request.getSession().getAttribute("ContractJoineeSuccess"));
	request.getSession().removeAttribute("ContractJoineeSuccess");
}
%>
</div>

</center>
</body>
</html>
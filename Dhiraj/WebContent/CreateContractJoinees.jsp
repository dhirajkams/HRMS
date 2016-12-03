<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua-green">
<form action="CreateNewContractJoineesController" method="post">
<center>
<table bgcolor="red" border="all">
	<tr>
		<td>Serial No :</td>
		<td><input type="text" name="serial" /></td>
	</tr>
	<tr>
		<td>Name :</td>
		<td><input type="text" name="Name" /></td>
	</tr>
	<tr>
		<td>Contact No :</td>
		<td><input type="text" name="Contact" /></td>
	</tr>
	<tr>
		<td>HR :</td>
		<td><input type="text" name="Hr" />  </td>
	</tr>
	<tr>
		<td>Client</td>
		<td>
			<select name="Client">
				<option value="">--SELECT--</option>
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
                 <option value="circular angle">Circular Angle</option>
                 <option value="XLNC">XLNC</option>
           </select>
		</td>
	</tr>
	<tr>
		<td>Position :</td>
		<td><input type="text" name="Position" ></td>
	</tr>
	<tr>
		<td>Date of joining :</td>
		<td><input type="date" name="Doj" ></td>
	</tr>
	<tr>
		<td>Recruiter :</td>
		<td>
			<select name="Recruiter">
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
           </select>
        </td>
	</tr>
	<tr>
		<td>Relieving Date :</td>
		<td><input type="date" name="Relieving" ></td>
	</tr>
	<tr>
		<td>Rate :</td>
		<td><input type="text" name="Rate" ></td>
	</tr>
	<tr>
		<td>Candidate Salary :</td>
		<td><input type="text" name="Candidate" ></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><input type="text" name="Email" ></td>
	</tr>
	<tr>
		
		<td><input type="submit" name="action" value="Insert" ></td>
		<td><input type="submit" name="action" value="Home" ></td>
	</tr>
</table>

</center>
</form>
<div>
<%
if(session.getAttribute("contractJoineeSuccess") != null){
	out.print(session.getAttribute("contractJoineeSuccess")  );
	session.removeAttribute("contractJoineeSuccess"); 
}


%>
</div>
</body>
</html>
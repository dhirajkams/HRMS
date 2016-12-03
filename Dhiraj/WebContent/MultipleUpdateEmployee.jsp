<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*" %>
<%@page import="hrms.cargo.EmployeeCargo" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="javascript">
function enable(id){
	/*if(document.searchresult.chk1.checked){
		document.searchresult.empid.disabled=false;
		document.searchresult.fname.disabled=false;
		document.searchresult.lname.disabled=false;
		document.searchresult.doj.disabled=false;
		document.searchresult.desig.disabled=false;
		document.searchresult.email.disabled=false;
		document.searchresult.contact.disabled=false;
		document.searchresult.un.disabled=false;
		document.searchresult.pwd.disabled=false;
	}
	
	if(!document.searchresult.chk1.checked){
		document.searchresult.empid.disabled=true;
		document.searchresult.fname.disabled=true;
		document.searchresult.lname.disabled=true;
		document.searchresult.doj.disabled=true;
		document.searchresult.desig.disabled=true;
		document.searchresult.email.disabled=true;
		document.searchresult.contact.disabled=true;
		document.searchresult.un.disabled=true;
		document.searchresult.pwd.disabled=true;
	
	}
	
	for(var i=0;i<=100;i++){
		if(document.searchresult.chk[i].checked){
			document.searchresult.empid[i].disabled=false;
			document.searchresult.fname[i].disabled=false;
			document.searchresult.lname[i].disabled=false;
			document.searchresult.doj[i].disabled=false;
			document.searchresult.desig[i].disabled=false;
			document.searchresult.email[i].disabled=false;
			document.searchresult.contact[i].disabled=false;
			document.searchresult.un[i].disabled=false;
			document.searchresult.pwd[i].disabled=false;
		}
		
		if(!document.searchresult.chk[i].checked){
			document.searchresult.empid[i].disabled=true;
			document.searchresult.fname[i].disabled=true;
			document.searchresult.lname[i].disabled=true;
			document.searchresult.doj[i].disabled=true;
			document.searchresult.desig[i].disabled=true;
			document.searchresult.email[i].disabled=true;
			document.searchresult.contact[i].disabled=true;
			document.searchresult.un[i].disabled=true;
			document.searchresult.pwd[i].disabled=true;
		
		}
		
		
	}*/
	
	//alert(id);
	var elements =	document.getElementsByClassName("empclass"+id);//.removeAttribute("disabled");
	for( i = 0; i <elements.length; i++){
		var element = elements[i];
		element.removeAttribute("disabled");
	}
	
}
</script>
</head>
<body>

<%
	List<EmployeeCargo> employees =(List<EmployeeCargo>)session.getAttribute("empList");
%>
<form name=searchresult action=MultipleUpdateController method=post>
<center>
<table border=1>
<tr>
<td>SrNo</td>
<td>First Name</td>
<td>Last Name</td>
<td>DOJ</td>
<td>Designation</td>
<td>Email</td>
<td>Contact No</td>
<td>UserName</td>

</tr>
<%
	for(EmployeeCargo emp : employees)
{

System.out.println("Inside while");
%>
<tr>
<td><input type="checkbox" onchange=enable(<%=emp.getEmpId()%>) name="chk1" value=<%=emp.getEmpId()%>></td>
<td><input type="text" name="fname" disabled="true" class="empclass<%=emp.getEmpId()%>" value=<%=emp.getFirstName() %>></td>
<td><input type="text" name=lname disabled="true" class="empclass<%=emp.getEmpId()%>" value=<%=emp.getLastName() %>></td>
<td><input type="text" name=doj disabled="true" class="empclass<%=emp.getEmpId()%>" value=<%=emp.getDoj() %>></td>
<td><input type="text" name=desig disabled="true" class="empclass<%=emp.getEmpId()%>" value=<%=emp.getDesignation() %>></td>
<td><input type="text" name=email disabled="true"  class="empclass<%=emp.getEmpId()%>" value=<%=emp.getEmail()%>></td>
<td><input type="text" name=contact disabled="true"  class="empclass<%=emp.getEmpId()%>" value=<%=emp.getContactNo() %>></td>
<td><input type="text" name=un disabled="true"  class="empclass<%=emp.getEmpId()%>" value=<%=emp.getUserName()%>></td>

</tr>
<%
}
System.out.println("outside while");

%>
<tr>
<td><input type="submit" name=action value="FinalUpdate"></td>
</tr>
</table>
</center>
</form>
<div>
<%
if(request.getAttribute("multipleUpdateSuccessful") != null){
	out.print(request.getAttribute("multipleUpdateSuccessful"));
	request.removeAttribute("multipleUpdateSuccessful"); 
}


%>
</div>
</body>
</html>
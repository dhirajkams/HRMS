<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
<center>
<form action="CreateContractBillController" method="post">
<table border=1 bgcolor=yellow>
<tr><td>Name:&nbsp;&nbsp;</td><td><select name="name">
                            <option value="">--Select--</option>
                      
                    <option value="  Kalpesh Gudekar   ">  Kalpesh Gudekar   </option>
                    
                    <option value=" Devendra Tipanna Kanchan  "> Devendra Tipanna Kanchan  </option>
                    
                    <option value=" Dinesh Vaishnav "> Dinesh Vaishnav </option>
                    
                    <option value=" kailash pavaskar"> kailash pavaskar</option>
                    
                    <option value=" Mohsin Kotawdekar"> Mohsin Kotawdekar</option>
                    
                    <option value=" PREETAM KHANDU MANE"> PREETAM KHANDU MANE</option>
                    
                    <option value=" Rohit Gupta  "> Rohit Gupta  </option>
                    
                    <option value=" sudhir sharma"> sudhir sharma</option>
                    
                    <option value=" VISHAL SINGH"> VISHAL SINGH</option>
                    
                    <option value="Aaditya Avinash Yadav">Aaditya Avinash Yadav</option>
                    
                    <option value="Aaditya Gajanan Bargode ">Aaditya Gajanan Bargode </option>
                    
                    <option value="Aakash B Barve">Aakash B Barve</option>
                    
                    <option value="Aarti Bankar">Aarti Bankar</option>
                    
                    <option value="Abhishek Yengandul ">Abhishek Yengandul </option>
                    
                    <option value="Abid Jabin Khan">Abid Jabin Khan</option>
                    
                    <option value="Aditya Shelar ">Aditya Shelar </option>
                    
                    <option value="Aditya Wargaonkar">Aditya Wargaonkar</option>
                    
                    <option value="Aditya Zanje">Aditya Zanje</option>
                    
                    <option value="Adwait Mohite">Adwait Mohite</option>
                    
                    <option value="AGNEL FLAVIA MARY">AGNEL FLAVIA MARY</option>
                    
                    <option value="Ahmed Raza Salahuddin Khan ">Ahmed Raza Salahuddin Khan </option>
                    
                    <option value="Aijaz Faqueer Mohd Shaikh">Aijaz Faqueer Mohd Shaikh</option>
                    
                    <option value="Ajay Menon">Ajay Menon</option>
                    
                    <option value="ajinkya dinesh Navghane">ajinkya dinesh Navghane</option>
                    
                    <option value="ajinkya jadhav">ajinkya jadhav</option>
                    
                    <option value="Akash Bansode">Akash Bansode</option>
                    
                    <option value="akash kottamale">akash kottamale</option>
                    
                    <option value="Akram Sabir Shaikh">Akram Sabir Shaikh</option>
                    
                    <option value="Akshay Jagtap">Akshay Jagtap</option>
                    </select></td></tr>
<tr><td>Invoice No:&nbsp;&nbsp;</td><td><input type="text" name=invoiceno></td></tr>
<tr><td>Client:&nbsp;&nbsp;</td><td><input type="text" name=client></td></tr>
<tr><td>Billing Amount:&nbsp;&nbsp;</td><td><input type="text" name=billing_amount></td></tr>
<tr><td>Status:&nbsp;&nbsp;</td><td><input type="text" name=status></td></tr>
<tr><td><input type="submit" name=action value=Submit></td>
<td><input type="submit" name=action value=Home></td>

</tr>
</table>

</form>
<div>
<%
if(request.getSession().getAttribute("ContractBillSuccess")!=null)
{
out.print(request.getSession().getAttribute("ContractBillSuccess"));
request.getSession().removeAttribute("ContractBillSuccess");
}
 %>
</div>
</center>
</body>
</html>
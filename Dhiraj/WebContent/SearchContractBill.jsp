<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CreateContractBillController" method=post>

Year&nbsp;&nbsp;<select name="year">
<option value="2013">2013</option>
<option value="2014">2014</option>
<option value="2015">2015</option>
<option value="2016" selected>2016</option>
</select>

 Month&nbsp;&nbsp;<select name="month">
 <option value="">All</option>
 <option value="02">January</option>
 <option value="03">February</option>
 <option value="04">March</option>
 <option value="05">April</option>
 <option value="06">May</option>
 <option value="07">June</option>
 <option value="08">July</option>
 <option value="09">August</option>
 <option value="10">September</option>
 <option value="11">October</option>
 <option value="12">November</option>
 <option value="12">December</option>
 </select>
 Status&nbsp;&nbsp;<select name="sts">
 <option value="">All Bills</option>
 <option value="Bill Not Cleared">Bill Not Cleared</option>
 <option value="Bill Cleared">Bill Cleared</option>
</select>
<input type="submit" name="submit" value="Search"><br>
 Name&nbsp;&nbsp;<select name="empName">
                    <option value="">--Select--</option>
                    
                    <option value=" PREETAM KHANDU MANE"> PREETAM KHANDU MANE</option>
                    
                    <option value=" VISHAL SINGH"> VISHAL SINGH</option>
                    
                    <option value="2 Employee Tushar Sinagare">2 Employee Tushar Sinagare</option>
                    
                    <option value="3 Employee Tushar">3 Employee Tushar</option>
                    
                    <option value="3 Employee Tushar Sinagare">3 Employee Tushar Sinagare</option>
                    
                    <option value="4 Employee Tushar">4 Employee Tushar</option>
                    
                    <option value="5 Employee Tushar">5 Employee Tushar</option>
                    
                    <option value="55 employee for Cogenice ">55 employee for Cogenice </option>
                    
                    <option value="71 employees for cogencis">71 employees for cogencis</option>
                    
                    <option value="8 Employee Tushar Sinagare">8 Employee Tushar Sinagare</option>
                    
                    <option value="89 Employee Cogencis">89 Employee Cogencis</option>
                    
                    <option value="Aarti Bankar">Aarti Bankar</option>
                    
                    <option value="Abhishek Yengandul">Abhishek Yengandul</option>
                    
                    <option value="Aditya Zanje">Aditya Zanje</option>
                    
                    <option value="Adwait Mohite">Adwait Mohite</option>
                    
                    <option value="Ajay Menon">Ajay Menon</option>
                    
                    <option value="Aniket Parab">Aniket Parab</option>
                    
                    <option value="Anil Yadav">Anil Yadav</option>
                    
                    <option value="Ashish Nikam">Ashish Nikam</option>
                    
                    <option value="Atul Pandey">Atul Pandey</option>
                    
                    <option value="Avinash Dhone">Avinash Dhone</option>
                    
                    <option value="Ayan Patel 6 employee">Ayan Patel 6 employee</option>
                    
                    <option value="Ayan Patel 6 Employees">Ayan Patel 6 Employees</option>
                    
                    <option value="Charmi Shah">Charmi Shah</option>
                    
                    <option value="Data Analyst-26 EMP">Data Analyst-26 EMP</option>
                    
                    <option value="Dnyaneshwar">Dnyaneshwar</option>
                    
                    <option value="Gajanan Tour">Gajanan Tour</option>
                    
                    <option value="Ganesh Dalvi">Ganesh Dalvi</option>
                    
                    <option value="Giridhar Bhandi">Giridhar Bhandi</option>
                    
                    <option value="Jagdeep Rajput">Jagdeep Rajput</option>
                    
                    <option value="Jagdish Gupta">Jagdish Gupta</option>
                    
                    <option value="Jyotirmayee Mansingh">Jyotirmayee Mansingh</option>
                    
                    <option value="Kalpesh">Kalpesh</option>
                    
                    <option value="Kalpesh Dumbre">Kalpesh Dumbre</option>
                    
                    <option value="Kuna Sahu">Kuna Sahu</option>
                    
                    <option value="Manasvi Bale">Manasvi Bale</option>
                    
                    <option value="Mayur Salaskar">Mayur Salaskar</option>
                    
                    <option value="Niraj Shetty">Niraj Shetty</option>
                    
                    <option value="Nitin Navale">Nitin Navale</option>
                    
                    <option value="Pallavi Manjrekar">Pallavi Manjrekar</option>
                    
                    <option value="Pankaj Dubey">Pankaj Dubey</option>
                    
                    <option value="Pradip Toraskar">Pradip Toraskar</option>
                    
                    <option value="Pradnya Bonde">Pradnya Bonde</option>
                    
                    <option value="Pranav Gurav">Pranav Gurav</option>
                    
                    <option value="Prashant Gupta">Prashant Gupta</option>
                    
                    <option value="priti sutar">priti sutar</option>
                    
                    <option value="Rahul Sarode ">Rahul Sarode </option>
                    
                    <option value="Ritesh R. Pathare">Ritesh R. Pathare</option>
                    
                    <option value="Royal Dsouza">Royal Dsouza</option>
                    
                    <option value="Sagar Patekar">Sagar Patekar</option>
                    
                    <option value="Sanket Hemant Shasane">Sanket Hemant Shasane</option>
                    
                    <option value="Sarfaraj Ahmed Khan">Sarfaraj Ahmed Khan</option>
                    
                    <option value="Shashwat Sharma">Shashwat Sharma</option>
                    
                    <option value="Shekhar Sapkale">Shekhar Sapkale</option>
                    
                    <option value="Shridhan Phalke">Shridhan Phalke</option>
                    
                    <option value="Shrinivas Pednekar">Shrinivas Pednekar</option>
                    
                    <option value="Siddharth Soni ">Siddharth Soni </option>
                    
                    <option value="Snehal Katkar">Snehal Katkar</option>
                    
                    <option value="Someshwary Rao Yajjala">Someshwary Rao Yajjala</option>
                    
                    <option value="Subhash Arvind Landge">Subhash Arvind Landge</option>
                    
                    <option value="Sunil Maurya">Sunil Maurya</option>
                    
                    <option value="Sushant Karande">Sushant Karande</option>
                    
                    <option value="Sushant Khandagale">Sushant Khandagale</option>
                    
                    <option value="Sushil Saldur">Sushil Saldur</option>
                    
                    <option value="Tejas Awate">Tejas Awate</option>
                    
                    <option value="Tejas Sunil Bhoir">Tejas Sunil Bhoir</option>
                    
                    <option value="Unnittan Charivuparampil ">Unnittan Charivuparampil </option>
                    
                    <option value="Vaishali Dhamane">Vaishali Dhamane</option>
                    
                    <option value="Vaishnavkumar Som ">Vaishnavkumar Som </option>
                    
                    <option value="Vijaykumar Kale">Vijaykumar Kale</option>
                    
                    <option value="Vinaykumar Kale">Vinaykumar Kale</option>
                    
                    <option value="Vishal Singh">Vishal Singh</option>
                    
                    <option value="Vishal Singh HDFC">Vishal Singh HDFC</option>
                    
                    <option value="Vishal Singh(HDFC)">Vishal Singh(HDFC)</option>
                    
                    <option value="Yogita Vartak">Yogita Vartak</option>
                    
                </select>
   
   <input type="submit" name="submit" value="Search By Employee Name">
                    
</form>
</body>
</html>
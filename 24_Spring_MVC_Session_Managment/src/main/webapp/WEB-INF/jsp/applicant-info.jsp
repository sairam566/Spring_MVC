<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Application</title>
</head>
<body>
	<div style="text-align: center;">
		<h2>Application-Info</h2>
		<form:form modelAttribute="loanApplicationForm">
			<p style="color: red;">
				<form:errors path="*"/>
			</p>
		Name : <form:input path="applicationName"/> <br/>
		Mobile No : <form:input path="phoneNo"/> <br/>
		Email : <form:input path="email"/> <br/>
		DOB(dd/MM/yyyy) : <form:input path="dob"/> <br/>
		Gender : Male : <form:radiobutton path="gender" value="Male"/>  Female : <form:radiobutton path="gender" value="Female"/> <br/>
		Identification Type: 
		<form:select path="identificationType">
			<form:option value="">Select</form:option>
			<form:option value="aadhar">Aadhar Card</form:option>
			<form:option value="pancard">Pan Card</form:option>
			<form:option value="voter">Voter Card</form:option>
		</form:select> <br/>
		Identification No : <form:input path="identificationNo"/> <br/>
		<input type="submit" value="Next">
		</form:form>
	</div>
</body>
</html>
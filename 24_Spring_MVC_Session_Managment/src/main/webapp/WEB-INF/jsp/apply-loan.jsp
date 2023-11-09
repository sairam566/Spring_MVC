<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply Loan</title>
</head>
<body>
	<div style="text-align: center;">
		<h2>Apply Info</h2>
		<form:form modelAttribute="loanApplicationForm" action="apply-loan.htm">
			<p style="color: red;">
				<form:errors path="*"/>
			</p>
		Occupation : <form:input path="occupation"/> <br/>
		Company / Business Name : <form:input path="company"/> <br/>
		Experience : <form:input path="experience"/> <br/>
		Gross Salary : <form:input path="grossSalary"/> <br/>
		Loan Type : <form:select path="loanType">
			<form:option value="">Select</form:option>
			<form:option value="personal">Personal</form:option>
			<form:option value="gold">Gold</form:option>
			<form:option value="house">House</form:option>
		</form:select> <br/>
		Loan Amount : <form:input path="loanAmount"/> <br/>
		Tenure : <form:input path="tenure"/> <br/>
		<input type="submit" value="apply">
		</form:form>
	</div>
</body>
</html>
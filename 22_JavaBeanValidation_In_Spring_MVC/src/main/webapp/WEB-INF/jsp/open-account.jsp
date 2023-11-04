<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>open account</title>
	</head>
	<body style="font-family: Gill Sans, sans-serif; font-size: 18px;">
		<h2>open account</h2>
		<form:form modelAttribute="openAccountForm">
			<p style="color: red;">
				<form:errors path="*"/>
			</p>
			Mobile No: <form:input path="mobileNo"/><br/>
			Firstname: <form:input path="firstName"/><br/>
			Lastname: <form:input path="lastName"/><br/>
			Email Address: <form:input path="emailAddress"/><br/>
			Dob (dd/MM/yyyy): <form:input path="dob"/><br/>
			Gender: Male: <form:radiobutton path="gender" value="Male"/> (or) Female: <form:radiobutton path="gender" value="Female"/> <br/>
			Panno: <form:input path="panNo"/><br/>
			<input type="submit" value="open account"/>						
		</form:form>
	</body>
</html>
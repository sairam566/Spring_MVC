<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Table</title>
</head>
<body>
	<h2>Book Table</h2>

	<form:form modelAttribute="bookTableForm">
		<p style="color: red;">
			<form:errors path="*" />
		</p>
		Customer Name : <form:input path="customerName" />
		<br />
		Persons : <form:input path="persons" />
		<br />
		Reservation Date (DD/MM/YYYY): <form:input path="reservationDate" />
		<br />
		Time Slot : <form:select path="timeSlot">
			<form:option value="">Select</form:option>
			<form:option value="11:30">11:30</form:option>
			<form:option value="12:30">12:30</form:option>
			<form:option value="1:30">1:30</form:option>
			<form:option value="2:30">2:30</form:option>
			<form:option value="3:30">3:30</form:option>
			<form:option value="4:30">4:30</form:option>
			<form:option value="7:30">7:30</form:option>
			<form:option value="8:30">8:30</form:option>
			<form:option value="9:30">9:30</form:option>
			<form:option value="10:30">10:30</form:option>
		</form:select>
		<br />
		Reservation Hotal Name : 
		<form:select path="restaurantName">
			<form:option value="">Select</form:option>
			<c:forEach items="${restaurants}" var="restaurant">
				<form:option value="${restaurant.key}">${restaurant.value}</form:option>
			</c:forEach>
		</form:select>
		<br />
		contact Number :<form:input path="contactNo" />
		<br />
		Email :<form:input path="email" />
		<br />
		Address :<form:textarea path="address" />
		<br />
		Coupon Code : <form:input path="coupon" />
		<input type="submit" value="Book-Table">
	</form:form>
</body>
</html>
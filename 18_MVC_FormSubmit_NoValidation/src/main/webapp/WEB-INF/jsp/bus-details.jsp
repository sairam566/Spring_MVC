<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bus Details</title>
</head>
<body style="font-family: Gill Sans, sans-serif; font-size: 18px;">
		<h2>Bus Details</h2>
		<table>
			<tr>
				<th>Bus No#</th>
				<th>Bus Name</th>
				<th>Driver Mobile</th>
				<th>Driver Email</th>
			</tr>
			<c:forEach items="${buses}" var="bus">
				<tr>
					<td>${bus.busNo}</td>
					<td>${bus.busName}</td>
					<td>${bus.mobileNo}</td>
					<td>${bus.emailAddress}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available Buses</title>
</head>
<body>
	<h1>Available Buses</h1>
	<table>
		<tr>
			<th>order no</th>
			<th>description</th>
			<th>status</th>
		</tr>
		<c:forEach items="${buslist}" var="buses">
		<tr>
			<td><a href="${pageContext.request.contextPath}/${buses.busNo}/busdetails.htm">${buses.busNo}</a></td>
			<td>${buses.busModelNo}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
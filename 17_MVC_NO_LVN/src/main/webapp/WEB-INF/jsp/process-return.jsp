<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Process Returns</title>
	</head>
	<body style="font-family: Gill Sans, sans-serif; font-size: 18px;">
		<h2>Process Returns</h2>
		<form action="${pageContext.request.contextPath}/return-order.htm">
			Order No: <input type="text" name="orderNo"/><br/>
			<input type="submit" value="return"/>
		</form>
	</body>
</html>
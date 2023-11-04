<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>account details</title>
	</head>
	<body style="font-family: Gill Sans, sans-serif; font-size: 18px;">
		<h2>account details</h2>
		account no: ${account.accountNo} <br/>
		account holder name: ${account.accountHolderName}<br/>
		balance: ${account.balance}<br/>
		status: ${account.status}<br/>
	</body>
</html>
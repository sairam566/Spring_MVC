<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
</head>
<body>
	<div style="align-content: center;">
		<form:form modelAttribute="itemForm">
			Search By Name : <form:input path="value"/>
			<input type="submit" value="Search">
		</form:form>
	</div>
</body>
</html>
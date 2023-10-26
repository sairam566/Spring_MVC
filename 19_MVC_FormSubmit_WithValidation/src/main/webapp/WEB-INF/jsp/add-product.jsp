<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add Product</title>
	</head>
	<body style="font-family: Gill Sans, sans-serif; font-size: 18px;">
		<h2>Add Product</h2>
		<form:form modelAttribute="productForm">
			<p style="color: red;">
				<form:errors path="*"/>
			</p>
			Product Name: <form:input path="productName"/> <br/>
			Description: <form:input path="description"/> <br/>
			Manufacturer: <form:input path="manufacturer"/><br/>
			Category: 
			<form:select path="category">
				<form:option value="electronics">electronics</form:option>
				<form:option value="fashion">fashion</form:option>
				<form:option value="footwear">foot wear</form:option>
			</form:select>
			<br/>
			Price: <form:input path="price"/><br/>
			<input type="submit" value="add product"/>
		</form:form>
	</body>
</html>
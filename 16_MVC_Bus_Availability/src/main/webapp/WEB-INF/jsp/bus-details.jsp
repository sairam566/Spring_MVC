<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bus Details</title>
</head>
<body>
	<h1>Bus Details</h1>
	<table>
		<tr>
			<td>Bus No:</td>
			<td>${busInfo.busNo}</td>
		</tr>
		<tr>
			<td>Model No:</td>
			<td>${busInfo.busModelNo}</td>
		</tr>
		<tr>
			<td>Source : </td>
			<td>${busInfo.source}</td>
		</tr>
		<tr>
			<td>Destination:</td>
			<td>${busInfo.destination}</td>
		</tr>
		<tr>
			<td>ManufacturedDate:</td>
			<td>${busInfo.manufacturedDate}</td>
		</tr>
	</table>
</body>
</html>
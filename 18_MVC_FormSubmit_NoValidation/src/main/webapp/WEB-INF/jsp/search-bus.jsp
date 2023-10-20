<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Bus</title>
</head>
<body style="font-family: Gill Sans, sans-serif; font-size: 18px;">
	<h2>Search Bus</h2>
	<form action="${pageContext.request.contextPath}/do-search-bus.htm"
		method="post">
		<table>
			<tr>
				<td>Bus# :</td>
				<td><input type="text" name="busNo" /></td>
				<td>Bus Name:</td>
				<td><input type="text" name="busName" /></td>
			</tr>
			<tr>
				<td>From Date(dd-MM-yyyy):</td>
				<td><input type="text" name="fromDate" /></td>
				<td>To Date (dd-MM-yyyy):</td>
				<td><input type="text" name="toDate" /></td>
			</tr>
			<tr>
				<td>Mobile#:</td>
				<td><input type="text" name="mobileNo" /></td>
				<td>Email Address:</td>
				<td><input type="email" name="emailAddress" /></td>
			</tr>
			<tr>
				<td colspan="4"><input type="submit" value="Search" /></td>
			</tr>
		</table>
	</form>

</body>
</html>
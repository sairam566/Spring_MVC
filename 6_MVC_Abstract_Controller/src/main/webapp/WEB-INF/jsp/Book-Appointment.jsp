<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Appointment</title>
</head>
<body>
	<h1>Book Doctor Appointment</h1>
	<form action="${pageContext.request.contextPath}/doBookAppointment.htm" method="post">
		Name : <input type="text" name="patientName"> <br/>
		Age  : <input type="text" name="age"> <br/>
		Gender: Male: <input type="radio" name="gender" value="Male"/> or Female: <input type="radio" name="gender" value="Female"/><br/>
		Appointment Date: <input type="datetime" name="appointmentDate"/><br/>
		Mobile: <input type="text" name="mobileNo"/><br/>
		Doctor Name: <input type="text" name="doctorName"/><br/>
		<input type="submit" value="book appointment">
	</form>
</body>
</html>
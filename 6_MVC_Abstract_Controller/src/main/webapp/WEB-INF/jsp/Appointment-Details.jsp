<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Appointment Information</title>
	</head>
	<body style="font-family: sans-serif; font-size: 14px; align-content: center;">
		<h1>Appointment Information</h1>
		<p>
			Your appointment has been confirmed, below are the details for your reference.			
		</p>
		Appointment No: ${appointment.appointmentNo} <br/>
		Patient Name: ${appointment.patientName}<br/>
		Doctor Name: ${appointment.doctorName}<br/>
		Appointment Date: ${appointment.appointmentDate}<br/>
		<p>
			Please arrive 15 minutes before the appointment time for serving you better!
		</p>
	</body>
</html>
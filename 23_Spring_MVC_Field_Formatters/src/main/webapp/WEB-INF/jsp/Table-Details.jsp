<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table Details</title>
</head>
<body style="align-content: center;">
	Booking Reference No: ${booking.referenceNo} <br/>
	Contact Person : ${booking.contactPerson} <br/>
	Contact Number : ${booking.contactNo} <br/>
	Restaurant Name : ${booking.restaurantName} <br/>
	Reservation Date/Time : ${booking.bookingDateTime} <br/>
	Coupon Applied : ${booking.coupon} <br/>
</body>
</html>
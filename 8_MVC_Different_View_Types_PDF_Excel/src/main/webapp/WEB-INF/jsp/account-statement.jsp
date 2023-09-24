<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Statement</title>
</head>
<body>
	<h1>Account-Statement</h1>
	<form action="${pageContext.request.contextPath}/fetchDate.htm" method="post">
		<table>
			<tr>
				<td>From Date(dd/mm/yyyy) :</td>
				<td><input type="text" name="fromDate" /></td>
				<td>To Date(dd/mm/yyyy) :</td>
				<td><input type="text" name="toDate" /></td>
			</tr>
			<tr>
				<td>Account No :</td>
				<td><input type="text" name="accountNo" /></td>
				<td colspan="2"><input type="submit" value="view statement">
				</td>
			</tr>
		</table>
	</form>
	<c:if test="${transactions ne null}">
		<table>
			<tr>
				<td>Export:</td>
				<td colspan="1"><a
					href="${pageContext.request.contextPath}/fetchDate.htm?fromDate=<%=((LocalDate)request.getAttribute("fromDate")).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))%>&toDate=<%=((LocalDate)request.getAttribute("toDate")).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))%>&accountNo=${accountNo}&viewType=pdf">pdf</a></td>
				<td colspan="2"><a
					href="${pageContext.request.contextPath}/fetchDate.htm?fromDate=<%=((LocalDate)request.getAttribute("fromDate")).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))%>&toDate=<%=((LocalDate)request.getAttribute("toDate")).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))%>&accountNo=${accountNo}&viewType=xls">xls</a></td>
			</tr>
			<tr>
				<th>Date</th>
				<th>Reference No</th>
				<th>Amount</th>
				<th>Transaction Type</th>
			</tr>
			<c:forEach items="${transactions}" var="transaction">
				<tr>
					<td>${transaction.transactionDate}</td>
					<td>${transaction.transactionRefNo}</td>
					<td>${transaction.amount}</td>
					<td>${transaction.transactionType}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>
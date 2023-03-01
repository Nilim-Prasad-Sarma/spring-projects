<%@page import="com.te.empwebapp.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="navBar.jsp"%>

<%
Employee employee = (Employee) request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	<h1>
		Welcome
		<%=employee.getEmpName()%></h1>
</body>
</html>
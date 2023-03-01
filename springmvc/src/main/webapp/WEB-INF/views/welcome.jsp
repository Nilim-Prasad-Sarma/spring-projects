<%@page import="com.te.springmvc.pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
/* String name = (String) request.getAttribute("a");
String pass = (String) request.getAttribute("b"); */

Employee data = (Employee) request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: red">
		Welcome
		<%=data.getEmpName()%>
	</h1>
</body>
</html>
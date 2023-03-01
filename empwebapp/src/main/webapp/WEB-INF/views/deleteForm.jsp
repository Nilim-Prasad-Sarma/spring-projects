<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="navBar.jsp"%>
<%
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if (msg != null && !msg.isEmpty()) {
	%>
	<%=msg%>
	<%
	}
	%>
	<br>
	<br>
	<form action="./delete" method="post">
		<input type="text" placeholder="Enter the empId" name="empId">
		<input type="submit" value="Delete">
	</form>
</body>
</html>
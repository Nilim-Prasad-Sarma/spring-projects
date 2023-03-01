<%@page import="com.te.empwebapp.entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
List<Employee> employees = (List<Employee>) request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1px" cellpadding="10px" cellspacing="0px">
		<tr>
			<td>Name</td>
			<td>Email</td>
		</tr>
		<%
		for (Employee employee : employees) {
		%>
		<tr>
			<td><%=employee.getEmpName()%></td>
			<td><%=employee.getEmailId()%></td>
		</tr>

		<%
		}
		%>




	</table>
</body>
</html>
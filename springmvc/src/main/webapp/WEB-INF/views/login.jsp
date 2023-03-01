<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String errMsg = (String) request.getAttribute("errMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if (errMsg != null && !errMsg.isEmpty()) {
	%>
	<%=errMsg%>
	<%
	}
	%>


	<fieldset>
		<legend>Employee Login Form</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td><label>Enter your name:</label></td>
					<td><input type="text" placeholder="enter your name"
						name="empName"></td>
				</tr>

				<tr>
					<td><label>Enter your password:</label></td>
					<td><input type="password" placeholder="enter your password"
						name="empPass"></td>
				</tr>
			</table>
			<input type="submit" value="Login">
		</form>
	</fieldset>
</body>
</html>
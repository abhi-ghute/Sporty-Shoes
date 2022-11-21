<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div align="center">
<h1>Login Page</h1>

<div style="border:3px solid black;width:25%;border-radius:20px;padding:20px" align="center">
<form:form action="loginCheck" method="post" modelAttribute="login">
	<table border="1">
		<tr>
			<td>User Name:</td>
			<td><form:input path="userName"/></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><form:input path="password"/></td>
		</tr>
		<tr>
			<td><input type="reset" value="Reset"></td>
			<td><input type="submit" value="Login"></td>
		</tr>
	</table>
</form:form>
</div>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<jsp:include page="header.jsp"></jsp:include>
<h2>Create User</h2>
	<form:form action="create" method="POST" modelAttribute="user">
		<table border="1">
			<tr>
				<th><label>Name</label></th>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<th><label>Email</label></th>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<th><label>Password</label></th>
				<td><form:input path="password" type="password"/></td>
			</tr>
			<tr>
				<th><label>Mobile No.</label></th>
				<td><form:input path="mob" /></td>
			</tr>
			<tr>
				<th><label>Age</label></th>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<th><label>Address</label></th>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Create"></td>
			</tr>
		</table>
	</form:form>
</div>
</body>
</html>
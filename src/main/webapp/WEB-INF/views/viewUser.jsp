<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div align="center">
<h2>User Details</h2>
	<form:form action="update" method="POST" modelAttribute="user">
		<table border="1">
			<tr>
				<th><label>Name</label></th>
				<td><form:input path="name" readonly="true"/></td>
			</tr>

			<tr>
				<th><label>Email</label></th>
				<td><form:input path="email" readonly="true"/></td>
			</tr>
			<tr>
				<th><label>Mobile No.</label></th>
				<td><form:input path="mob" readonly="true"/></td>
			</tr>
			<tr>
				<th><label>Age</label></th>
				<td><form:input path="age" readonly="true"/></td>
			</tr>
			<tr>
				<th><label>Address</label></th>
				<td><form:input path="address" readonly="true"/></td>
			</tr>
		</table>
	</form:form>
</div>
</body>
</html>
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
<h2>Search User</h2>
	<form action="search" method="POST">
		<table border="1">
			<tr>
				<th><label>Email</label></th>
				<td><input name="email" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Search"></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>
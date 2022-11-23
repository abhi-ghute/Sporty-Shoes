<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>
	<div align="center">
		<h2>Add Shoes</h2>
		<form:form action="addshoes" method="POST" modelAttribute="shoes"
			enctype="multipart/form-data">
			<table border="1">
				<tr>
					<th><label>Shoes Name</label></th>
					<td><form:input path="name" /></td>
				</tr>

				<tr>
					<th><label>Shoes for</label></th>
					<td><form:checkbox path="MWK" value="ALL"/>ALL<form:checkbox
							path="MWK" value="MEN" />MEN <form:checkbox path="MWK"
							value="WOMEN" />WOMEN <form:checkbox path="MWK" value="KIDS" />KIDS</td>
				</tr>
				<tr>
					<th><label>Shoes type</label></th>
					<td><form:select path="shoesType">
					<form:option value="Casual"></form:option>
					<form:option value="Foraml"></form:option>
					<form:option value="Running"></form:option>
					<form:option value="GYM"></form:option>
					</form:select>
					</td>
				</tr>
				<tr>
					<th><label>size</label></th>
					<td><form:input path="size" /></td>
				</tr>
				<tr>
					<th><label>price</label></th>
					<td><form:input path="price" /></td>
				</tr>
				<tr>
					<th><label>image</label></th>
					<td><input name="image" type="file" accept="image/*" /></td>
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
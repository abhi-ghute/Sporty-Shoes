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

<table align="center"  style=text-align:left;>
	
	<form:form action="getReport" method="POST" modelAttribute="report">
	
		<tr>
			<th>From:</th>
			<td><form:input path="from" type="date"/> </td>
			<th>to:</th>
			<td><form:input path="to" type="date"/> </td>
		</tr>
		<tr></tr>
		<tr>
			<th><label>Shoes type :</label></th>
					<td><form:select path="type">
					<form:option value="Casual"></form:option>
					<form:option value="Foraml"></form:option>
					<form:option value="Running"></form:option>
					<form:option value="GYM"></form:option>
					</form:select>
					</td>
		</tr>
		<tr></tr>
		<tr>
			<th colspan="2"><button>Get Purchase Report</button></th>
		</tr>>
		
	</form:form>
</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.center {
  margin: auto;
  width: 50%;
  height: 250px;
  border: 3px solid green;
  padding: 10px;
}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<table align="center" border="1">
<tr>
<th>Name</th>
<th>Email</th>
<th>Mobile No.</th>
<th>Age</th>
<th>Address</th>
</tr>
<c:forEach items="${report}" var="item">
	
	<tr>
		<td><c:out value="${item.name}"/></td>
		<td><c:out value="${item.email}"/></td>
		<td><c:out value="${item.mob}"/></td>
		<td><c:out value="${item.age}"/></td>
		<td><c:out value="${item.address}"/> RS.</td>
	</tr>  	
</c:forEach>
	
</table>
</body>
</html>
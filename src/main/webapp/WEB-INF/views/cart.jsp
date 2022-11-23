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
<c:forEach items="${shoes}" var="item">
	
	<div class="center">
		<div style="float: left;"><img src=<c:url value="${item.imagePath}"/> style="width: 300px; height: 200px;"></div>
		<div style="margin-top: 40px; margin-left: 350px;">
		<div style="font-weight: bold;  font-size: 30px; color: lime;"><c:out value="${item.name}"/></div>
		<div style="font-weight: bold;  font-size: 15px; color: gray;"><label>FOR </label><c:out value="${item.MWK}"/></div>
		<div style="font-weight: bold;  font-size: 20px;"><label></label><c:out value="${item.shoesType}"/></div>
		<div style="font-weight: bold;  font-size: 20px;"><label>Size : </label><c:out value="${item.size}"/></div>
		<div style="font-weight: bold;  font-size: 20px;"><label>Price : </label><c:out value="${item.price}"/> RS.</div>
		</div>
	</div>
  	
</c:forEach>
</body>
</html>
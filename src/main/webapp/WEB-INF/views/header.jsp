<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<style>
* {
	box-sizing: border-box;
}

.header {
	overflow: hidden;
	background-color: #f1f1f1;
	padding: 20px 10px;
}

.header a {
	float: left;
	color: black;
	text-align: center;
	padding: 12px;
	text-decoration: none;
	font-size: 18px;
	line-height: 25px;
	border-radius: 4px;
}

.header a.logo {
	font-size: 25px;
	font-weight: bold;
}

.header a:hover {
	background-color: #ddd;
	color: black;
}

.header a.active {
	background-color: dodgerblue;
	color: white;
}

.header-right {
	float: right;
}

@media screen and (max-width: 500px) {
	.header a {
		float: none;
		display: block;
		text-align: left;
	}
	.header-right {
		float: none;
	}
}
</style>
</head>
<body>
	<div class="header">
		<a href="#default" class="logo">Sporty</a>
		<div class="header-right">
			<%
			String admin = (String)session.getAttribute("user");
			if(admin!=null && admin.equals("admin")) {%>
				<a href="report">Purchase Report</a>
				<a href="searchuser">Search Users</a>
				<a href="users">Users List</a>
				<a href="shoes">Add Shoes</a>
				<a href="logout">Logout</a>

			<%}else if(admin!=null){%>
				<a href="index">Home</a>
				<a href="cart">Cart</a>
				<a href="logout">Logout</a>
			<%}
			else{%>
			<a href="index">Home</a>
			<a href="login">Login</a>
		<%}
			%>
			
			
		</div>
	</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
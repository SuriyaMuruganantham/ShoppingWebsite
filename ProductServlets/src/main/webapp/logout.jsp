
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Thank you!</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<style>
#header
{
text-align:Justify;
color:
}
body
{
 background-color:#e6ffff;
background-image: url("shp.jpg");
 background-repeat: no-repeat;
        background-position: right top;
         background-size: auto; */
         background-size: contain;
        background-size: cover;
}
</style>
</head>
<body>
	<%
		session.invalidate();
	%>
	<b>
		<h1>Thanks for visiting our website, Will see you soon!</h1>
		<a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a>
</body>
</html>
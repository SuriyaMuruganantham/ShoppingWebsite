<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard Page</title>
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
marquee{

font size:20px;
color:#ffbf80
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

<body>
	<%
		String usernameSession = (String) session.getAttribute("username");
		if (session.getAttribute("username") == null) {
			response.sendRedirect("invalid.jsp?error=1");
		}
	%>
	<div class="container mt-3">
		<h2 id="header">Welcome to Shopping World</h2>
		<marquee>Enjoy shopping and had a Exclusive offers...!!!</marquee>
		  <a href="logout.jsp"><span class="glyphicon glyphicon-log-out mt-3"></span> Logout</a>
		 <a href="productview.jsp"> <button class="btn btn-info mt-3">view Products</button></a>
		  <a href="fetch.jsp"> <button class="btn btn-info mt-3">Search product</button></a>
		    <a href="product"> <button class="btn btn-info mt-3">View Price</button></a>
		   		</div>
		</body>
		</html>

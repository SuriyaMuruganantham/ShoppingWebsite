<%@page import="java.util.Objects"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
String id = request.getParameter("dashboard.jsp");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "nproduct";
String userid = "root";
String password = "Mysql@123";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<style>
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
#header
{
color:light blue
}
table, th, td {
  border: 1px solid white;
  border-collapse: collapse;
}
th, td {
  background-color:#ffcccc;
}
</style>

<h1>Products</h1>
<table class="table table-striped">
					<thead>
					<table style="width:100%">
					 
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>Category</th>
							<th>LastUpdated</th>
						</tr>
						
					</thead>
					<tbody>

<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from product";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
 
<tr>
<th><%=resultSet.getInt("Id") %></th>
<th><%=resultSet.getString("Name") %></th>
<th><%=resultSet.getString("Category") %></th>
<th><%=resultSet.getDate("LastUpdated") %></th>
</tr>
</tbody>

<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
<a href="dashboard.jsp"><span class="glyphicon glyphicon-log-in"></span> DashboardPage</a>
 <a href="product"> <button class="btn btn-info">View Price</button></a>
</table>
</body>
</html>

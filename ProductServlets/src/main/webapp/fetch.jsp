<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
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


input[type=text] {
  width: 100%;
  box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
  font-size: 16px;
  background-color: white;
  background-position: 10px 10px; 
  background-repeat: no-repeat;
  padding: 12px 20px 12px 40px;
}
</style>
</head>
<body>

<h2>Search the Product by ProductID</h2>

	<form action="fetchproduct" method="post"> 
  ENTER ID<input type="text" name="id" placeholder="Search..">
 <input type="submit" class="btn btn-primary mt-3" value="search">
</form>

</body>
</html>


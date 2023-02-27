<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IceCream</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>

<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
   	<img alt="" src="https://t4.ftcdn.net/jpg/02/17/36/83/360_F_217368346_U0trhJeBSG7M9feVwW073Eb3m9j5CIcW.jpg" width="150" height="100" class="d-inline-block align-text-top">
    </a>
    <a href="icecream">Select</a>
     <a href="index.jsp">Home</a>
  </div>
</nav>
<h1>Searching.....</h1>

<form action="search">
		Search By Id : <input type="text" name="id" required="required"/>
		<input type="submit" value="Search"/>
	</form>
	<h3>
		<span style="">The Searched results are: </span><br>
		<span style="color: blue;">Name: </span>${dto.getName()} <br>
		<span style="color: blue;">BrandName: </span>${dto.getBrandName()} <br>
		<span style="color: blue;">Color: </span>${dto.getColor()} <br>
		<span style="color: blue;">Type: </span>${dto.getType()} <br>
		<span style="color: blue;">Price: </span>${dto.getPrice()}
	</h3>

</body>
</html>
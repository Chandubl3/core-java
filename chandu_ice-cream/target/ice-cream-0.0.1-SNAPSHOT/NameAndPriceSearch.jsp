<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IceCream</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>

<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
    <img alt="" src="https://t4.ftcdn.net/jpg/02/17/36/83/360_F_217368346_U0trhJeBSG7M9feVwW073Eb3m9j5CIcW.jpg" width="100" height="100">
    <marquee><h1 class="text-uppercase">Welcome to IceCream Parlor.....</h1></marquee>
    </a>
    <div class="btn-group" role="group">
    <button id="btnGroupDrop1" type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
      Selete
    </button>
    <ul class="dropdown-menu" aria-labelledby="btnGroupDrop1">
      <li><a class="dropdown-item" href="icecream">Save</a></li>
      <li><a class="dropdown-item" href="index.jsp">Home</a></li>
    </ul>
    </div>
  
  </div>
</nav>

<div class="typing">
        <h2 class="text-uppercase">Searching By Name And Price.....</h2>
    </div>
    
<form action="searchbynameandprice">
	<div class="input-group mb-3">
		<input type="text" name="name"/>
		<input type="submit" value="Search"/>
		
		<input type="text" name="price"/>
		<input type="submit" value="Search"/>
	</div>
</form>

	<div >
		<table class="table table-dark table-striped">
			<tr class="table-primary">
				<th class="table-secondary">ID</th>
				<th class="table-primary">Name</th>
				<th class="table-primary">BrandName</th>
				<th class="table-primary">Color</th>
				<th class="table-primary">Type</th>
				<th class="table-primary">Price</th>
			</tr>

			<c:forEach items="${list}" var="l">
				<tr class="table-primary">
					<td class="table-primary">${l.id}</td>
					<td class="table-primary">${l.name}</td>
					<td class="table-primary">${l.brandName}</td>
					<td class="table-primary">${l.color}</td>
					<td class="table-primary">${l.type}</td>
					<td class="table-primary">${l.price}</td>
				</tr>
			</c:forEach>
		</table>
	</div>


</body>
</html>
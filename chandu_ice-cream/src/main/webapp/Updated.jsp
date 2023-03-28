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
    <a href="index.jsp">Home</a>
   </div>
</nav>

<div class="typing">
        <h2 class="text-uppercase">Updated the IceCream Details.....</h2>
    </div>

<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message}<br></span>
	</c:forEach>
	
	<div><span style="color: green;">${message}</span></div>
	
	<form action="update" method="post">
	
	<div class="mb-3">
		<label for="formFile" class="form-label">Id</label>
		<input type="text" class="form-control" name="id" readonly="readonly" value="${dto.id}"/>
	</div>
	
	
	<div class="input-group mb-3">
		<label class="input-group-text" for="inputGroupSelect01">Name</label>
			<select name="name"required="required" class="form-select" id="inputGroupSelect01" aria-label="Disabled select example">
				<option selected value="${dto.name}">${dto.name}</option>
				<c:forEach items="${name}" var="n">
					<option value="${n}">${n}</option>
				</c:forEach>
			</select>	
	</div>	
		
	<div class="input-group mb-3">
	<label class="input-group-text" for="inputGroupSelect01">BrandName</label>
	<input type="text" name ="brandName" readonly="readonly" value="${dto.brandName}"/>
	</div>
	
	<div class="input-group mb-3">
		<label class="input-group-text" for="inputGroupSelect01">Color</label>
			<select name="color" required="required" class="form-select" id="inputGroupSelect01" aria-label="Disabled select example">
				<option selected value="${dto.color}">${dto.color}</option>
				<c:forEach items="${color}" var="c">
					<option value="${c}">${c}</option>
				</c:forEach>
			</select>
	</div>
	
	<div class="input-group mb-3">
		<label class="input-group-text" for="inputGroupSelect01">Type</label>
		<select name="type" required="required" class="form-select" id="inputGroupSelect01" aria-label="Disabled select example">
			<option selected value="${dto.type}">${dto.type}</option>
				<c:forEach items="${type}" var="t">
					<option value="${t}">${t}</option>
				</c:forEach>
		</select>
	</div>
	
	<div class="input-group mb-3">
	<label class="input-group-text" for="inputGroupSelect01">Price</label>
	<input type="text" required="required" name="price" value="${dto.price}"/>
	</div>
	
	<input type="submit" value="Update"/>
	
	</form>
	
</body>
</html>
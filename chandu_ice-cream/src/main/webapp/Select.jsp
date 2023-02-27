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

<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
   	<img alt="" src="https://t4.ftcdn.net/jpg/02/17/36/83/360_F_217368346_U0trhJeBSG7M9feVwW073Eb3m9j5CIcW.jpg" width="150" height="100" class="d-inline-block align-text-top">
    </a>
    <a href="index.jsp">Home</a>
  </div>
</nav>
<h1>Select the IceCream.....</h1>

<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message}<br></span>
	</c:forEach>
	
	<form action="icecream" method="post">
	<pre>

	Name : <select name="name"required="required"  >
				<option value="">SELECT</option>
				<c:forEach items="${name}" var="n">
					<option value="${n}">${n}</option>
				</c:forEach>
			</select>
	BrandName : <input type="text" required="required" name ="brandName" value="${dto.brandName}"/>
	Color : <select name="color" required="required">
				<option value="">SELECT</option>
				<c:forEach items="${color}" var="c">
					<option value="${c}">${c}</option>
				</c:forEach>
			</select>
	Type : <select name="type" required="required">
				<option value="">SELECT</option>
				<c:forEach items="${type}" var="t">
					<option value="${t}">${t}</option>
				</c:forEach>
			</select>
	Price : <input type="text" required="required" name="price" value="${dto.price}"/>
	<input type="submit" value="Save"/>
	</pre>
	</form>
	
</body>
</html>
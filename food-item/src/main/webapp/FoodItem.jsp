<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>
<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
    <img alt="" src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" width="80" height="50" class="d-inline-block align-text-top">
    </a>
    <a href="index.jsp">Home</a>
  </div>
</nav>
<h1>Page to send Food Item.....</h1>

<form action="send" method="post">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label"></label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="enter the food items" name="name">
</div>

<div>
<select class="form-select" aria-label="Default select example" name="type">
  <option selected>Select Food type</option>
  <option value="Veg">Veg</option>
  <option value="NonVeg">Non-Veg</option>
  <option value="Both">Both</option>
</select>
</div>

<div>
<label for="customRange2" class="form-label">Example range</label>
<input type="range" class="form-range" min="0" max="5" id="customRange2" name= "quantity">
</div>

<input type="submit" value="send"/>
</form>

</body>
</html>
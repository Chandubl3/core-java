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

<form action="Attend" method="post">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label"></label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="enter the name" name="name">
</div>

<div>
<select class="form-select" aria-label="Default select example" name="company">
  <option selected>Select Company</option>
  <option value="X-workz-Raj">X-workz-Raj</option>
  <option value="X-workz-BTM">X-workz-BTM</option>
  <option value="X-workz">X-workz</option>
</select>
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label"></label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="enter the role" name="role">
</div>

<input type="submit" value="Attend"/>
</form>
</body>
</html>
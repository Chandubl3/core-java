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
<h1>Page to Bekery Details.....</h1>

<form action="bekery" method="post">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label"></label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="enter the bekeryName" name="bekeryName">
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label"></label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="enter the ownerName" name="ownerName">
</div>

<div class="mb-3">
<label>married</label>
<button type="button" class="btn btn-primary btn-sm" value="true" name="married">Yes</button>
<button type="button" class="btn btn-secondary btn-sm" value="false" name="married">No</button>
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label"></label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="enter the ownerWifeName" name="ownerWifeName">
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label"></label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="enter the famouaIn" name="famouaIn">
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label"></label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="enter the scine" name="scine">
</div>

<input type="submit" value="DisplaySuccess"/>
</form>
</body>
</html>
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
      <li><a class="dropdown-item" href="index.jsp">Home</a></li>
       <li><a class="dropdown-item" href="ImageUpload">ImageUpload</a></li>
    </ul>
    </div>
  
  </div>
</nav>
  
  <div class="typing">
        <h2 class="text-uppercase">Displaying Image.....</h2>
    </div>
    <img alt="" src="display?fileName=icecream.jsp">

</body>
</html>
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
        <li><a class="dropdown-item" href="icecream">Save</a></li>
      	<li><a class="dropdown-item" href="Search.jsp">Search</a></li>
      	<li><a class="dropdown-item" href="BrandNameSearch.jsp">SearchByBrandName</a>
      	<li><a class="dropdown-item" href="NameAndPriceSearch.jsp">NameAndPriceSearch</a></li>
      	<li><a class="dropdown-item" href="SearchAll.jsp">SearchAll</a>
      	<li><a class="dropdown-item" href="ImageUpload.jsp">ImageUpload</a>
      	<li><a class="dropdown-item" href="ImageDisplay.jsp">ImageDisplay</a>
       </ul>
     </div>
  </div>
</nav>

<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="3" aria-label="Slide 4"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="4" aria-label="Slide 5"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="https://lh3.googleusercontent.com/p/AF1QipPjo4pPhrawp4KOYHHCvzImOFGG-YoCigKtrFK1=w1080-h608-p-no-v0" class="d-block w-100" height="450" alt="...">
    </div>
    <div class="carousel-item">
      <img src="https://arunicecreams.in/images/About-Us-Img.jpg" class="d-block w-100"  height="450" alt="...">
    </div>
    <div class="carousel-item">
      <img src="http://lh3.googleusercontent.com/6cT4UBhNnWvFg4PvaMkRfckLbDiBQKgU2Wbrijp_2y_WQWke0wT05Uc2s-e0tWyilUqKRKdqfQJTGoV188-t1d2yyJoE=s750" class="d-block w-100"  height="450" alt="...">
    </div>
    <div class="carousel-item">
      <img src="https://lh3.googleusercontent.com/V7VU10NI2sh1hqTw842SmRTaITjYrF3Wjv8E1RgnTBccPwp7nfmFuu4XKnSpoOr5kEhHAVWiKGBi2ob0gjF6R9zHeg=w400-rw" class="d-block w-100"  height="450" alt="...">
    </div>
    <div class="carousel-item">
      <img src="https://mir-s3-cdn-cf.behance.net/projects/404/75b98c130893441.Y3JvcCw5MzIsNzI5LDM5LDA.jpg" class="d-block w-100"  height="450" alt="...">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>

</body>
</html>
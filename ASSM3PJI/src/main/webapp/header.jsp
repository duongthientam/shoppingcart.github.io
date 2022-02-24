<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="giaodien.css" rel="stylesheet"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<style>
header {
background-color:#424242;
}
#icon {


padding:20px 20px 20px 20px;


}
#tieude {
 font-size:1em;
 color:white;

}
#tieude2 {
color:#00BFFF;
 font-size:0.5em;


}
.d-flex {
width:100%;
}
.dropdown-menu {
padding:0px;
margin:0px;

}



</style>
</head>
<body>
<header>
<nav class="navbar navbar-expand-lg navbar-light bg-lights">
  <div class="container-fluid">
    <span class="navbar-nav me-auto mb-2 mb-lg-0"	id="icon"><a class="navbar-brand" href="#"><span id="tieude">PRJ321x</span><div id="tieude2">Welcome to my website</div></a></span>
   <div class="collapse navbar-collapse" id="navbarSupportedContent">
  
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <div class="dropdown">
  <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">
    Categories
  </a>

  <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
    <li><a class="dropdown-item" href="#">Action</a></li>
    <li><a class="dropdown-item" href="#">Another action</a></li>
    <li><a class="dropdown-item" href="#">Something else here</a></li>
  </ul>
</div>

       
     
      <form class="d-flex" action="SearchController2">
        <input class="form-control me-2" type="text" placeholder="What are you looking for?" name="s">
        
        <input class="btn btn-outline-success" type="submit" value="Search">
      </form>
    </div>
  </div>
  </nav>
  
  
  
  
  
<ul class="nav nav-tabs">
  <li class="nav-item">
    <a class="nav-link" aria-current="page" href="home.jsp" style="color:#FA8258";>Home</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#" style="color:white">Products</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#" style="color:white">About Us</a>
  </li>
  <li class="nav-item"  style="float:right;">
    <a class="nav-link" href="login.jsp"  style="color:white">Login</a>
  </li>
  <li class="nav-item"  style="float:right;">
    <a class="nav-link" href="login.jsp"  style="color:white">Register</a>
  </li>
</ul>
</header>
</body>
</html>
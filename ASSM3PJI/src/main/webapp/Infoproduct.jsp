<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width: 300px;
  margin: auto;
  text-align: center;
  font-family: arial;
  
}

.price {
  color: grey;
  font-size: 22px;
}

.card button {
  border: none;
  outline: 0;
  padding: 12px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}

.card button:hover {
  opacity: 0.7;
}
</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<c:import url="header.jsp"></c:import>
<body>
<div>


<div class="card">
<h2 style="text-align:center">${product.name}</h2>
  <img src="${product.src}" alt="Denim Jeans" style="height:300px;"> 
  <h1>${product.type}</h1>
  <p class="price"> ${product.price}</p>
  <p>${product.description}</p>
  <p><a href="/ASSM3PJI/AddToCartController?id=${product.id}&action=add"><button>Add to Cart</button></a></p>
 <p><a href="/ASSM3PJI/AddToCartController?id=${product.id}&action=delete"><button>Delete to Cart</button></a></p>
</div>
</div>
</body>

<c:import url="footer.jsp"></c:import>

</body>
</html>
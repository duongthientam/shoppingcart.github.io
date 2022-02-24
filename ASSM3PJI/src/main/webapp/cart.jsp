
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>Shopping Cart</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}
input[type=text] {
  width: 59%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
}
table {
margin-top: 100px;
  border-collapse: collapse;
  width: 100%;
  
  
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #424242;
  color: white;
}
</style>
</head>
<body>
	<c:import url="header.jsp"></c:import>
	<table>
		<tr>
			<th>Product in cart:1</th>
			<th>Price</th>
			<th>Quanlity</th>
			<th>Amount</th>
		</tr>
		 
		 <c:forEach var="c" items="${sessionScope.cart.getItem()}">
		<tr>
			<td>${c.name}</td>
			<td>${c.price}</td>
			<td>${c.number}</td>
			<td><fmt:formatNumber type = "number" groupingUsed = "false" value = "${c.price * c.number}" /></td>
      
         
			
		</tr>
		  </c:forEach> 
		<tr>
			
			<td style="background-color:white">Total:${sessionScope.cart.getAmount()}</td>
		</tr>


	</table>
<div class="container">
 <form action="PayController" method="get">
  <div class="row">
    <div class="col-25">
      <label for="name">Customer name</label>
    </div>
    <div class="col-75">
      <input type="text" id="name" name="name" placeholder="Your name..">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="address">Customer address</label>
    </div>
    <div class="col-75">
      <input type="text" id="address" name="address" placeholder="Your address..">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="discout">Discount code(if any:)</label>
    </div>
    <div class="col-75">
       <input type="text" id="discount" name="discount" placeholder="Your last name..">
    </div>
  </div>
  <div class="row">
     <input  class="col-25" type="submit" value="OK">
    </div>
  
  
 </form>
 
</div>

	<c:import url="footer.jsp"></c:import>
</body>

</html>
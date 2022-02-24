<%@page import="controller.product.ListController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
/* wrapper */
.main-product {
border: 1px solid #DCDCDC;
}
.content-product-h3 {
 
}
.wrapper {
  padding: 2rem;
  background-color:white;
}

.products ul {
  display: inline-block;
}

.products ul .main-product {
  margin-bottom: 2rem;
  margin-right: 1rem;
  display: block;
  float: left;
  width: 24%;
}

.products ul .no-margin {
  margin-right: 0;
}

.products ul .img-product img {
  width: 100%;
}

.content-product .content-product-h3 {
  padding:0px;
  overflow: hidden;
  color: #222;
  font-weight: 500;
  font-size: 16px;
 
  
  line-height: 19px;
  margin: 0px;
}
.content-product-h3 .contentp .content-product-deltals {
}

.content-product .content-product-deltals {
  display: flex;
  
  padding-top: 0rem;
}

.main-product .content-product .content-product-deltals .price {
  color: #c7b200;
  font-weight: 700;
  margin-right: 1rem;
  vertical-align: middle;
  font-size: 20px;
}

.content-product .content-product-deltals .price .money {
  
}
.content-product {
margin-left:20px;
}
.money {
color:#CC3300;
}

.content-product .content-product-deltals .btn-cart {
  background: #f1df11;
  border-radius: 5px;
  color: #fff;
  font-weight: 500;
}

.content-product .content-product-deltals .btn-cart:hover {
  background: #c7b200;
}

/* footer */
.footer-item {
  padding: .5rem 2rem;
  background: #f1df11;
  display: flex;

}

.footer-item .img-footer {
  align-items: center;
  display: flex;
}

.footer-item .img-footer img {
  width: 100%;
}

.footer-item .social-footer {
  display: flex;
  align-items: center;
  width: 100%;
  justify-content: flex-end;
}

.footer-item .social-footer li a {
  color: #000000;
  font-size: 2rem;
}

.footer-item .social-footer li:last-child {
  margin-left: .5rem;
}
</style>

</head>
<body>
<c:import url="header.jsp"></c:import>

<!-- content -->
    <section class="wrapper">
        <div class="products">
            <ul>
            <c:forEach var="p" items="${products}">
                <li class="main-product">
                    <div class="img-product">
                        <img class="img-prd"
                            src="${p.src}"
                            alt="">
                    </div>
                    <div class="content-product">
                        <h3 class="content-product-h3">${p.type}</h3>
                         <span class="contentp">${p.name}</span>
                        <div class="content-product-deltals">
                            <div class="price">
                                <a href="/ASSM3PJI/InformationProductController?id=${p.id}" class="money" style="text-decoration: none;">${p.price}</a>
                               
                            </div>
                           
                        </div>
                    </div>
                </li>
                
                 </c:forEach>
            </ul>
        </div>
    </section>
   <!-- https://www.thanhlongdev.com/huong-dan-xay-dung-mot-shopping-cart-bang-html-css-javascript/ -->
    
<c:import url="footer.jsp"></c:import>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: manu
  Date: 14/04/20
  Time: 9:45 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h3>Product Details</h3>
            <p class="load"></p>
        </div>

        <div class="container" ng-app = "cartApp">
            <div class="row">
                <div class="col-md-5">
                    <img src="src/main/webapp/WEB-INF/images/5.png" alt="image" style="width: 20vw; height: 20vh;" class="home-image" />
                </div>
                <div class="col-md-5">
                    <h4>${product.get().productName}</h4>
                    <p>${product.get().productDescription}</p>

                    <p><strong>Category</strong> : ${product.get().productCategory}</p>

                    <h4>${product.get().productPrice} Rs</h4>
                    <br>
                    <c:set var="role" scope="page" value="${param.role}" />
                    <c:set var="url" scope="page" value="/product/productList" />
                    <c:if test='${role="admin"}'>
                        <c:set var="url" scope="page" value="/admin/productInventory" />
                    </c:if>
                    <p ng-controller = "cartCtrl">
                        <a href="<c:url value="${url}" />" class="btn btn-default"></a>
                        <a href="#" class="btn btn-warning btn-lg" ng-click = "addToCart('${product.get().productId}')">
                            <span class="glyphicon glyphicon-shopping-cart"></span>Add to cart
                        </a>
                        <a href="<spring:url value="/cart" />" class="btn btn-default">
                            <span class="glyphicon glyphicon-hand-right"></span> Cart
                        </a>
                    </p>
                </div>
            </div>
        </div>







    </div>
</div>


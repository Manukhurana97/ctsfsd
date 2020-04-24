<%--
  Created by IntelliJ IDEA.
  User: manu
  Date: 15/04/20
  Time: 12:40 am
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h3>Menu</h3>
            <p class="load"><a href="/admin/addProduct"> Add New Product</a> </p>
        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
            </thead>

            <c:forEach items="${products}" var="product">
                <tr>

                        <td>${product.productId}</td>
                        <td>${product.productName}</td>
                        <td>${product.productCategory}</td>
                        <td>${product.productPrice}</td>
                        <td>
                            <a href="<spring:url value="/Product/${product.productId}" />">
                                Product Details
                            </a>
                            <a href="<spring:url value="/admin/Product/editProduct/${product.productId}" />">
                                Product edit
                            </a>
                            <a href="<spring:url value="/admin/Product/DeleteProduct/${product.productId}" />">
                                Delete Product
                            </a>
                        </td>

                </tr>
            </c:forEach>

        </table>
    </div>
</div>
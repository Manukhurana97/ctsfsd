<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h3>Menu</h3>
            <p class="load">Check </p>
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
                    <a href="/Product/${product.productId}">acb
                        <td>${product.productId}</td>
                        <td>${product.productName}</td>
                        <td>${product.productCategory}</td>
                        <td>${product.productPrice}</td>
                    </a>

                </tr>
            </c:forEach>

        </table>
    </div>
</div>
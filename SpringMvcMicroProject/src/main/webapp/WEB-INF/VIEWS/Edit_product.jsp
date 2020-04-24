<%--
  Created by IntelliJ IDEA.
  User: manu
  Date: 15/04/20
  Time: 11:41 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h3>Edit Product</h3>
            <p class="load">abc</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/Product/editProduct" method="post"
                   modelAttribute="product" enctype="multipart/form-data">
            <form:hidden path="productId" value=""/>

            <div class="form-group">
                <label for="name">Product Name</label>
                <form:input path="productName" id="name" cssClass="form-control" value=""/>
            </div>

            <div class="form-group">
                <label for="category">Category</label><br>
                <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category"
                                                                 value="Starter"/>Starter</label>
                <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category"
                                                                 value="Maincourse"/>Maincourse</label>
                <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category"
                                                                 value="Desert"/>Desert</label>
            </div>

            <div class="form-group">
                <label for="description">Description</label>
                <form:textarea path="productDescription" id="description" cssClass="form-control" value=""/>
            </div>

            <div class="form-group">
                <label for="price">Proce</label>
                <form:input path="productPrice" id="price" cssClass="form-control" value=""/>
            </div>


            <div class="form-group">
                <label for="unitInStock">Quantity</label>
                <form:input path="unitInStock" id="unitInStock" cssClass="form-control" value=""/>
            </div>


            <div class="form-group">
                <label class="control-label" for="productImage">Image</label>
                <form:input path="productImage" id="productImage" type="file" cssClass="form:input-large"/>
            </div>
            <br><br>
            <input type="submit" value="Submit" class="btn btn-success"/>
            <a href="/admin/productInventory" class="btn btn-info">Inventry</a>
        </form:form>
    </div>
</div>

</body>
</html>

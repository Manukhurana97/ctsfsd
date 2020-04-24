<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: manu
  Date: 15/04/20
  Time: 1:11 am
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Add Employee</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>

<body>
<div class="container my-5">
    <h3> Add Product</h3>
    <div class="card">
        <div class="card-body">
            <div class="col-md-10">


                <form:form actionfor="${pageContext.request.contextPath}/admin/product/addProduct" method="post"
                           modelAttribute="product" enctype="multipart/form-data">
                    <div class="form-group">
                        <label for="name">Name</label> <form:errors path="productName" cssStyle="color: #ff0000"/>
                        <form:input path="productName" id="name" cssClass="form-control"/>
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
                        <label for="description">Product Description</label>
                        <form:textarea path="productDescription" id="description" cssClass="form-control"/>
                    </div>

                    <div class="form-group">
                        <label for="price">Product Price</label> <form:errors path="productPrice" cssStyle="color: #ff0000"/>
                        <form:input path="productPrice" id="price" cssClass="form-control"/>
                    </div>



                    <div class="form-group">
                        <label for="unitInStock">Stock Quantity</label> <form:errors path="unitInStock"
                                                                                      cssStyle="color: #ff0000"/>
                        <form:input path="unitInStock" id="unitInStock" cssClass="form-control"/>
                    </div>



                    <div class="form-group">
                        <label class="control-label" for="productImage">Upload Picture</label>
                        <form:input path="productImage" id="productImage" type="file" cssClass="form:input-large"/>
                    </div>
                    <br><br>
                    <input type="submit" value="Submit" class="btn btn-success"/>
                    <a href="/admin/productInventory" class="btn btn-info">Check Inventry</a>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>

</html>
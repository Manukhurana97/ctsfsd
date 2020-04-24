<%--
  Created by IntelliJ IDEA.
  User: manu
  Date: 14/04/20
  Time: 9:50 pm
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>
<body>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h3>Register User</h3>
            <p class="load"></p>
        </div>


        <form:form action="${pageContext.request.contextPath}/register" method="post" modelAttribute="customer">

            <h3>User Details</h3>

            <div class="form-group">
                <label for="name">Username</label> <form:errors path="username" cssStyle="color: #ff0000"/>
                <form:input path="username" id="name" cssClass="form-control"/>
            </div>

            <div class="form-group">
                <label for="name">Email</label> <form:errors path="customerEmail" cssStyle="color: #ff0000"/>
                <form:input path="customerEmail" id="name" cssClass="form-control"/>
            </div>


            <div class="form-group">
                <label for="name">Phoneno</label> <form:errors path="customerPhone" cssStyle="color: #ff0000"/>
                <form:input path="customerPhone" id="name" cssClass="form-control"/>
            </div>


            <div class="form-group">
                <label for="password">Password</label><form:errors path="password" cssClass="color: #ff0000"/>
                <form:password path="password" id="password" cssClass="form-control"/>
            </div>

            <h3>Shipping address</h3>

            <div class="form-group">
                <label for="shippingStreet">Street</label>
                <form:input path="shippingAddress.streetName" id="shippingStreet" cssClass="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingApartmentNumber">Appartment No</label>
                <form:input path="shippingAddress.apartmentNumber" id="shippingApartmentNumber"
                            cssClass="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingCity">City</label>
                <form:input path="shippingAddress.city" id="shippingCity" cssClass="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingState">State</label>
                <form:input path="shippingAddress.state" id="shippingState" cssClass="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingCountry">Country</label>
                <form:input path="shippingAddress.country" id="shippingCountry" cssClass="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingZipCode">Zipcode</label>
                <form:input path="shippingAddress.zipCode" id="shippingZipCode" cssClass="form-control"/>
            </div>


            <input type="submit" value="Register" class="btn btn-success"/>


        </form:form>
    </div>
</div>

</body>
</html>
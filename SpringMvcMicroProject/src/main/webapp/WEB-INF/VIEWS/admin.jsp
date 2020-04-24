<%--
  Created by IntelliJ IDEA.
  User: manu
  Date: 15/04/20
  Time: 12:30 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h3>Admin Console</h3>

        </div>
<%--        <c:if test="${pageContext.request.userPrincipal.name != null}">--%>
<%--        <h4>Products: <strong>${pageContext.request.userPrincipal.name}</strong></h4>--%>
<%--        </c:if>--%>
        <h4>
            <a href="/admin/productInventory"  class="btn btn-primary">Menu</a>

        </h4>


    </div>
</div>

</body>
</html>

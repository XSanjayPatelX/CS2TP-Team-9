<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
</head>
<body>
<%@ include file="parts/header.jsp" %>
<div class="container">
    <h1 class="heading">Product List</h1>
    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
            <th>Image</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.description}</td>
                <td>${product.price}</td>
                <td><img src="${product.imageUrl}" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%@ include file="parts/footer.jsp" %>
</body>
</html>
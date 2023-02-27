<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title> Edit Products </title>
<!-- jquery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
    <!-- bootstrap -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
          crossorigin="anonymous" />
</head>
<body class="bg-secondary">
<div class="d-flex justify-content-center">
<h2 class="text-white">Food4U Edit Product List</h2>
</div>
<c:forEach var="product" items="${products}">
<c:if test="${product.stock < 50}">
<div class="mx-2">
    <div class="alert alert-success alert-dismissible" role="alert">
        <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <strong><p>Product ID: ${product.id} stock is low</p></strong>
    </div>
</div>
</c:if>
</c:forEach>
<c:forEach var="product" items="${products}">
<div class="d-inline-block mb-3">
    <div class="card mx-2 bg-danger" style="width: 100%;">
        <div class="card-body">
            <p class="card-text">Name: ${product.food}</p>
            <p class="card-text">ID: ${product.id}</p>
            <p class="card-text">Description: ${product.description}</p>
        </div>
        <ul class="list-group list-group-flush">
            <li class="list-group-item bg-danger">Price: ${product.price}</li>
            <li class="list-group-item bg-danger">Category: ${product.category}</li>
            <li class="list-group-item bg-danger">Stock: ${product.stock}</li>
        </ul>
        <div class="card-body">
            <a href="#" class="card-link link-secondary">Created at: ${product.createdAt}</a>
            </br>
            <a href="#" class="card-link link-secondary">Updated at: ${product.updatedAt}</a>
            </br>
            <a href="<c:url value='/showUpdateForm?id=${product.id}'/>" class="btn btn-dark">Update</a>
        </div>
    </div>
</div>
</c:forEach>

</body>
</html>

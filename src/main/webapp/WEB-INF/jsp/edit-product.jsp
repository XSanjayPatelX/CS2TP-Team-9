<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <html>
  <head>
    <title> Edit Products </title>
    <link rel="icon" type="image/x-icon" href="/images/favicon.ico">
    <!-- jquery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
    <!-- bootstrap -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous" />
    <link rel="stylesheet" type="text/css" href="editProducts.css">
  </head>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div>
      <h2 class="mx-auto">Edit Products</h2>
    </div>
    <!-- Container wrapper -->
    <div class="container-fluid">
      <!-- Toggle button -->
      <button class="navbar-toggler" type="button" data-mdb-toggle="collapse" data-mdb-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <i class="fas fa-bars"></i>
      </button>
      <!-- Collapsible wrapper -->
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <!-- Left links -->
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link" href="#">Dashboard</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Team</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Projects</a>
          </li>
        </ul>
        <!-- Left links -->
      </div>
      <!-- Collapsible wrapper -->
      <!-- Right elements -->
      <div class="d-flex align-items-center">
        <!-- Icon -->
        <a class="text-reset me-3" href="#">
          <i class="fas fa-shopping-cart"></i>
        </a>
        <!-- Right elements -->
      </div>
      <!-- Container wrapper -->
  </nav>
  <body class="bg-dark">
    <c:forEach var="product" items="${products}">
      <c:if test="${product.stock < 50}">
        <div class="mx-2 mt-3">
          <div class="alert alert-success alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
            <strong>
              <p>Product ID: ${product.id} stock is low</p>
            </strong>
          </div>
        </div>
      </c:if>
    </c:forEach>
    <c:forEach var="product" items="${products}">
      <div class="d-inline-block">
        <div class="card bg-secondary mb-3">
          <img class="card-img-top" src="/images/${product.image}" alt="${product.altText}" width="50" height="150" />
          <div class="card-body">
            <p class="card-text">Name: ${product.food}</p>
            <p class="card-text">ID: ${product.id}</p>
            <p class="card-text">Description: ${product.description}</p>
          </div>
          <ul class="list-group list-group-flush">
            <li class="list-group-item bg-secondary">Price: ${product.price}</li>
            <li class="list-group-item bg-secondary">Category: ${product.category}</li>
            <li class="list-group-item bg-secondary">Stock: ${product.stock}</li>
          </ul>
          <div class="card-body">
            <a href="#" class="card-link link-secondary">Updated at: ${product.updatedAt}</a>
            </br>
            <a href="
									<c:url value='/showUpdateForm?id=${product.id}'/>" class="mt-2 btn btn-dark">Update </a>
          </div>
        </div>
      </div>
    </c:forEach>
    <div class="d-inline-block ml-5 mt-5 mb-3">
      <div class="card bg-danger">
        <div class="card-body">
          <a href="<c:url value='/newProduct'/>" class="btn btn-dark"></a>
        </div>
      </div>
    </div>
  </body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Edit Product</title>
  <link rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
        integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
        crossorigin="anonymous" />
</head>
<body class="bg-dark">
<div class="container">
  <h3 class="text-white">${title}</h3>
  <hr/>
  <form action="${pageContext.request.contextPath}/save" method="POST">
    <input type="text" name="food" value="${products.food}" class="form-control col-4 mb-4" placeholder="Enter Name" />
    <input type="text" name="price" value="${products.price}" class="form-control col-4 mb-4" placeholder="Enter Price" />
    <input type="text" name="image" value="${products.image}" class="form-control col-4 mb-4" placeholder="Enter Image" />
    <input type="text" name="description" value="${products.description}" class="form-control col-4 mb-4" placeholder="Enter Description" />
    <input type="text" name="category" value="${products.category}" class="form-control col-4 mb-4" placeholder="Enter Category" />
    <input type="text" name="stock" value="${products.stock}" class="form-control col-4 mb-4" placeholder="Enter Stock" />
    <input type="text" name="altText" value="${products.altText}" class="form-control col-4 mb-4" placeholder="Enter Alt Text" />
    <input type="text" readonly name="updatedAt" value="${products.updatedAt}" class="form-control col-4 mb-4" placeholder="" />
    <input type="text" readonly name="id" value="${products.id}" class="form-control col-4 mb-4" placeholder="" />
    <button type="submit" class="btn btn-info col-2">Save</button>
  </form>
  <hr/>
  <a href="${pageContext.request.contextPath}/view">Back to list</a>
</div>
</body>
</html>

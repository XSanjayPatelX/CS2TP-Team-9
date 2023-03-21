<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Products</title>
</head>
<body>
<h1>All Products</h1>
<ul>
    <c:forEach items="${items}" var="item">
        <% System.out.println(item); %>
    </c:forEach>
</ul>
</body>
</html>

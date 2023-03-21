<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu</title>
    <link rel="stylesheet" href="css/product.css" />
    <link rel="stylesheet" href="css/homepage.css" />
  </head>
  <body class="background-contact">
    <%@ include file="parts/header.jsp" %>
      <div class="nav-menu">
          <ul>
              <li>
                <button class="opt-btn" id="our-products">Whole Menu</button>
              </li>
              <li>
                <button class="opt-btn" id="specials">Specials</button>
              </li>
              <li>
                <button class="opt-btn" id="vegan">Vegan</button>
              </li>
              <li>
                <button class="opt-btn" id="Burgers">Burgers</button>
              </li>
              <li>
                <button class="opt-btn" id="Drinks">Drinks</button>
              </li>
              <li>
                <button class="opt-btn" id="Sides">Sides</button>
              </li>
              <li>
                <button class="opt-btn" id="Deserts">Desserts</button>
              </li>
          </ul>
      </div>
    </div>
    <!-- Code for each of the products-->
    <div class="products-list-opt">
        <c:forEach items="${items}" var="item">
            <div class="product">
                <div class="product-img">
                    <img src="/images/${item.getImage()}" alt="${item.getAltText()}">
                </div>
                <div class="description">
                    <p>${item.getFood()}</p>
                    <p2>${item.getDesc()}</p2>
                    <br>
                    <div class="cost">&pound;${item.getPrice()}</div>
                    <a href="#" class="basket-btn">Add to Basket</a>
                </div>
            </div>
        </c:forEach>
    </div>

    <br><br>
    <%@ include file="parts/footer.jsp" %>
    <script src="https://kit.fontawesome.com/c54d8b2ca0.js" crossorigin="anonymous"></script>
    <script src="js/products.js"></script>
  </body>
</html>
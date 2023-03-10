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
      <div class="opt-itms">
        <!-- Vegan products -->
        <!-- Vegan Burger -->
        <div class="opt-itm our-products Burgers vegan">
          <div class="product">
            <div class="product-img">
              <img src="images/VeggieBurger.jpg">
            </div>
            <div class="description">
              <p>Vegan Burger</p>
              <p2>Plant based burger to suit your cravings!</p2>
              <br>
              <div class="cost">&#163;3.49 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Vegan Kebab -->
        <div class="opt-itm our-products vegan">
          <div class="product">
            <div class="product-img">
              <img src="images/VeggieKebab.jpg">
            </div>
            <div class="description">
              <p>Vegan Kebab</p>
              <p2>Plant based Kebab to nourish your tastebuds!</p2>
              <br>
              <div class="cost">&#163;6.99 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Vegan Pizza -->
        <div class="opt-itm our-products vegan">
          <div class="product">
            <div class="product-img">
              <img src="images/VeggiePizza.jpg">
            </div>
            <div class="description">
              <p>Vegan Pizza</p>
              <p2>Plant based pizza to attack your hunger!</p2>
              <br>
              <div class="cost">&#163;9.99 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Vegan Tocos -->
        <div class="opt-itm our-products vegan">
          <div class="product">
            <div class="product-img">
              <img src="images/VeggieTaco2.jpg">
            </div>
            <div class="description">
              <p>Vegan Tacos</p>
              <p2>Plant based tocos grilled for perfection!</p2>
              <br>
              <div class="cost">&#163;2.99 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Vegan Wrap -->
        <div class="opt-itm our-products specials vegan">
          <div class="product">
            <div class="product-img">
              <img src="images/VeggieWrap.jpg">
            </div>
            <div class="description">
              <p>Vegan Wrap</p>
              <p2>Juicy wraps to nourish your hunger!</p2>
              <br>
              <div class="cost">&#163;3.49 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Burger products -->
        <!-- Hamburger -->
        <div class="opt-itm our-products Burgers">
          <div class="product">
            <div class="product-img">
              <img src="images/Hamburger.jpg">
            </div>
            <div class="description">
              <p>Hamburger</p>
              <p2>Made with 100% beef to meet your needs!</p2>
              <br>
              <div class="cost">&#163;1.99 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Double Hamburger -->
        <div class="opt-itm our-products Burgers">
          <div class="product">
            <div class="product-img">
              <img src="images/DoubbleHamBurger.jpg">
            </div>
            <div class="description">
              <p>Double Hamburger</p>
              <p2>Feeling hungry? great choice!</p2>
              <br>
              <div class="cost">&#163;2.79 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Cheeseburger -->
        <div class="opt-itm our-products Burgers">
          <div class="product">
            <div class="product-img">
              <img src="images/Cheaseburger.jpg">
            </div>
            <div class="description">
              <p>Cheese Burger</p>
              <p2>Cheesy addition to your burger</p2>
              <br>
              <div class="cost">&#163;0.99 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Chicken burger -->
        <div class="opt-itm our-products specials Burgers">
          <div class="product">
            <div class="product-img">
              <img src="images/Chickenburger.jpg">
            </div>
            <div class="description">
              <p>Chicken Burger</p>
              <p2>Feeling a bit southern, try me?</p2>
              <br>
              <div class="cost">&#163;2.19 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Fish burger -->
        <div class="opt-itm our-products Burgers">
          <div class="product">
            <div class="product-img">
              <img src="images/Fishburger.jpg">
            </div>
            <div class="description">
              <p>Fish Burger</p>
              <p2>Feeling fishy today? Nice choice!</p2>
              <br>
              <div class="cost">&#163;0.99 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Drink product -->
        <!-- Apple Juice -->
        <div class="opt-itm our-products Drinks">
          <div class="product">
            <div class="product-img">
              <img src="images/applejuice.jpg">
            </div>
            <div class="description">
              <p>Apple Juice</p>
              <p2>Cannot go wrong with this, works every way!</p2>
              <br>
              <div class="cost">&#163;0.79 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Orange Juice -->
        <div class="opt-itm our-products Drinks">
          <div class="product">
            <div class="product-img">
              <img src="images/orange.jpg">
            </div>
            <div class="description">
              <p>Orange Juice</p>
              <p2>Strong taste to attack your tastebuds!</p2>
              <br>
              <div class="cost">&#163;0.79 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Coke -->
        <div class="opt-itm our-products specials Drinks">
          <div class="product">
            <div class="product-img">
              <img src="images/Coke.jpg">
            </div>
            <div class="description">
              <p>Coke</p>
              <p2>Add flavour to your meal, cant go wrong!</p2>
              <br>
              <div class="cost">&#163;1.49 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Water -->
        <div class="opt-itm our-products Drinks">
          <div class="product">
            <div class="product-img">
              <img src="images/Water.jpg">
            </div>
            <div class="description">
              <p>Water</p>
              <p2>Classic, cannot go wrong with that!</p2>
              <br>
              <div class="cost">&#163;1.10 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- sparkling Water -->
        <div class="opt-itm our-products Drinks">
          <div class="product">
            <div class="product-img">
              <img src="images/sparklingwater.jpg">
            </div>
            <div class="description">
              <p>Sparkling Water</p>
              <p2>Add a fizzy sparkle to your meal!</p2>
              <br>
              <div class="cost">&#163;1.29 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Sides Product -->
        <!-- French Fries -->
        <div class="opt-itm our-products specials Sides">
          <div class="product">
            <div class="product-img">
              <img src="images/fries.jpg">
            </div>
            <div class="description">
              <p>French Fries</p>
              <p2>Crispy fries, best with a meal!</p2>
              <br>
              <div class="cost">&#163;2.30 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Potato Wedges -->
        <div class="opt-itm our-products Sides">
          <div class="product">
            <div class="product-img">
              <img src="images/PotatoWedges.jpg">
            </div>
            <div class="description">
              <p>Potato Wedges</p>
              <p2>Soft and tasty, best with a meal!</p2>
              <br>
              <div class="cost">&#163;2.30 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Mashed Potato -->
        <div class="opt-itm our-products Sides">
          <div class="product">
            <div class="product-img">
              <img src="images/MashedPotato.jpg">
            </div>
            <div class="description">
              <p>Mashed Potato</p>
              <p2>Soft and mushy, best with a meal!</p2>
              <br>
              <div class="cost">&#163;1.69 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Corn On The Cob -->
        <div class="opt-itm our-products Sides">
          <div class="product">
            <div class="product-img">
              <img src="images/CornOnTheCob.jpg">
            </div>
            <div class="description">
              <p>Corn On The Cob</p>
              <p2>Juicy and tasty, best with a meal!</p2>
              <br>
              <div class="cost">&#163;1.29 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Baked Beans -->
        <div class="opt-itm our-products Sides">
          <div class="product">
            <div class="product-img">
              <img src="images/BakedBeans.jpg">
            </div>
            <div class="description">
              <p>Baked Beans</p>
              <p2>Soft and flavourful, best with a meal!</p2>
              <br>
              <div class="cost">&#163;1.69 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Desserts -->
        <!-- IceCream -->
        <div class="opt-itm our-products Deserts">
          <div class="product">
            <div class="product-img">
              <img src="images/IceCream.jpg">
            </div>
            <div class="description">
              <p>Ice Cream</p>
              <p2>Creamy deluxe to attack your tastebuds!</p2>
              <br>
              <div class="cost">&#163;1.99 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Chocolate Chip Cookies -->
        <div class="opt-itm our-products specials Deserts">
          <div class="product">
            <div class="product-img">
              <img src="images/ChocolateChipCookies.jpg">
            </div>
            <div class="description">
              <p>Chocolate Chip Cookies</p>
              <p2>Mesmerizing Chocolate masterclass heaven!</p2>
              <br>
              <div class="cost">&#163;2.49 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Chocolate Chip Muffin -->
        <div class="opt-itm our-products Deserts">
          <div class="product">
            <div class="product-img">
              <img src="images/ChocolateChipMuffin.jpg">
            </div>
            <div class="description">
              <p>Chocolate Chip Muffin</p>
              <p2>Soft Chocolate heaven, nice choice!</p2>
              <br>
              <div class="cost">&#163;1.79 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Cheasecake -->
        <div class="opt-itm our-products Deserts">
          <div class="product">
            <div class="product-img">
              <img src="images/Cheasecake.jpg">
            </div>
            <div class="description">
              <p>Cheesecake</p>
              <p2>Feeling a bit Cheesy? nice choice!</p2>
              <br>
              <div class="cost">&#163;2.29 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
        <!-- Brownies -->
        <div class="opt-itm our-products Deserts">
          <div class="product">
            <div class="product-img">
              <img src="images/Brownie.jpg">
            </div>
            <div class="description">
              <p>Brownies</p>
              <p2>Had a rough day? end it well with a Brownie!</p2>
              <br>
              <div class="cost">&#163;1.29 </span>
              </div>
              <a href="#" class="basket-btn">Add to Basket</a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <br><br>
    <%@ include file="parts/footer.jsp" %>
    <script src="https://kit.fontawesome.com/c54d8b2ca0.js" crossorigin="anonymous"></script>
    <script src="js/products.js"></script>
  </body>
</html>
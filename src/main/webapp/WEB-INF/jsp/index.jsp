<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link href="css/homepage.css" rel="stylesheet">
  </head>
  <body class="background-home">
  <%@ include file="parts/header.jsp" %>
    <div class="main-text-container">
      <p class="main-heading"> FOOD <span class="italic-heading">4</span> U </p>
      <p class="heading-sub-paragraph">Restaurant Like Experience at home !</p>
      <a href="" class="heading-sub-link">More Info</a>
    </div>
    <div class="main-container-information-container">
      <div class="main-info-sub-container">
        <div class="small-text">Why choose us ?</div>
        <div class="main-text">QUALITY</div>
        <div class="sub-text">Being a 5 rated restaurant in hygiene, <p> we can guarantee you that the highest quality raw materials
          <p>and ingredients are used for preparing your desired dish.
        </div>
        <div class="action-button">
          <a href="">
            <button>Learn More</button>
          </a>
        </div>
      </div>
      <div class="main-info-sub-container">
        <div class="small-text">Why choose us ?</div>
        <div class="main-text">competitive PRICING</div>
        <div class="sub-text">Our prices are highly competitive because we believe in feeding <P> others and keeping margins low. </div>
        <div class="action-button">
          <a href="">
            <button>Learn More</button>
          </a>
        </div>
      </div>
    </div>
    <%@ include file="parts/footer.jsp" %>
  </body>
</html>
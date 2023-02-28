<html>
  <head>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/login.css" rel="stylesheet">
    <title>Login</title>
  </head>
  <body>
    <main>
      <div class="box">
        <div class="login-box">Log in</div>
        <form class="form" method="POST">
          <h2>${errorMsg}</h2>
          <input class="block" type="email" name="email" placeholder="Email" />
          <input class="block" type="password" name="password" placeholder="Password" />
          <br />
          <button class="block" id="login-btn">Log in</button>
          <p>Not a member? <a href="register">Register here</a></p>
        </form>
      </div>
    </main>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
  </body>
</html>
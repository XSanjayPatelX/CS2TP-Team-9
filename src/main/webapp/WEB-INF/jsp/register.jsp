<html>

<head>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/login.css" rel="stylesheet">

    <title>Register</title>
</head>

<body>
    <main>
        <div class="box">
            <div class="login-box">Register</div>
                <form class="form" action="" method="post">
                    <input class="block" type="text" name="first_name" placeholder="First Name">
                    <input class="block" type="text" name="last_name" placeholder="Last Name">
                    <input class="block" type="email" name="email_address" placeholder="Email">
                    <input class="block" type="password" name="password" placeholder="Password">
                    <input class="block" type="text" name="address" placeholder="Address">
                    <input class="block" type="text" name="city" placeholder="City">
                    <input class="block" type="text" name="postcode" placeholder="Postcode">
                    <button class="block" id="login-btn">Sign Up</button>
                </form>
                <p class="block">Already a member?</p>
                <button class="block" id="login-btn">Login</button>
        </div>
    </main>

   <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
   <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

   <script src="js/main.js"></script>
</body>
</html>

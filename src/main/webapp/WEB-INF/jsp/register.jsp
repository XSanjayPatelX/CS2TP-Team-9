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
                    <input class="block" type="text" name="First Name" placeholder="First Name">
                    <input class="block" type="text" name="Last Name" placeholder="Last Name">
                    <input class="block" type="email" name="Email" placeholder="Email">
                    <input class="block" type="password" name="Password" placeholder="Password">
                    <input class="block" type="text" name="Address Line 1" placeholder="Address Line 1">
                    <input class="block" type="text" name="Address Line 2" placeholder="Address Line 2">
                    <input class="block" type="text" name="City" placeholder="City">
                    <input class="block" type="text" name="Postcode" placeholder="Postcode">
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

<!DOCTYPE html>
<html>
<head>
    <!-- bootstrap -->
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

    <!-- custom -->
    <link href="css/login.css" rel="stylesheet">

    <title>Register</title>
</head>
<body>
    <h1>Register</h1>
    <form action="index.php" method="post">
        <input type="text" name="username" placeholder="Username">
        <input type="email" name="email" placeholder="Email">
        <input type="password" name="password" placeholder="Password">
        <input type="submit" name="register" value="Register">
    </form>
    <p>Already a member? <a href="login">Sign in</a>.</p>
</body>
</html>
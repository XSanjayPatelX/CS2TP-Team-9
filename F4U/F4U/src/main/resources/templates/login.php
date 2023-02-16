<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <?php if (isset($_SESSION['message'])) : ?>
        <p><?php echo $_SESSION['message']; ?></p>
    <?php endif; ?>
    <form action="index.php" method="post">
        <input type="text" name="username" placeholder="Username">
        <input type="password" name="password" placeholder="Password">
        <input type="submit" name="login" value="Login">
    </form>
    <p>Not a member? <a href="register.php">Sign up</a>.</p>
</body>
</html>

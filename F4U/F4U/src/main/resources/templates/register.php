<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h1>Register</h1>
    <?php if (isset($_SESSION['message'])) : ?>
        <p><?php echo $_SESSION['message']; ?></p>
    <?php endif; ?>
    <form action="index.php" method="post">
        <input type="text" name="username" placeholder="Username">
        <input type="email" name="email" placeholder="Email">
        <input type="password" name="password" placeholder="Password">
        <input type="submit" name="register" value="Register">
    </form>
    <p>Already a member? <a href="login.php">Sign in</a>.</p>
</body>
</html>

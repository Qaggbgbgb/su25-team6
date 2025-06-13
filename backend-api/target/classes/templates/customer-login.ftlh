<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/css/styless.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link
        href="https://fonts.googleapis.com/css2?family=Exile&family=Roboto:ital,wght@0,100..900;1,100..900&display=swap"
        rel="stylesheet">
    <title>Login Page</title>
</head>
<body>
    <section class="container">
        <div class="left-side">
            <form action="/customers/Login" method="post">
                <h1>Customer Login</h1>
                <span class="please">Please login to continue to your account.</span>
                <input placeholder="  UserName" name="username" type="text">
                <input placeholder="  Password" name="password" type="password">
                <button type="submit" class="sign-button">Login</button>
            </form>
            <a href="/customers"> <button class="sign-button">Return to Home Page</button></a>
        </div>
        <div class="right-side">
            <img src="/images/game1.png" alt="Game Image">
        </div>
    </section>

</body>
</html>
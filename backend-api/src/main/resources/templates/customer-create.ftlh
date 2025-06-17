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
    <title>Sign Up</title>
</head>

<body>
    <section class="container">
        <div class="left-side">
            <form action="/customers/signUp" method="post">
                <h1>Customer Sign Up</h1>
                <span class="please">Please login to continue to your account.</span>
                <input placeholder="  UserName" name="userName" type="text">
                <input placeholder="  Password" name="password" type="password">
             
                <select class="form-select" name="role" aria-label="Select example">
                    <option selected>Open this select menu</option>
                    <option value="customer">Customer</option>
                    <option value="developer">Developer</option>
                </select>

                <button type="submit" class="sign-button">Sign Up</button>

            </form>
            <a href="/"> <button class="sign-button">Cancel</button></a>
        </div>
        <div class="right-side">
            <img src="/images/game1.png" alt="Game Image">



        </div>
    </section>
</body>

</html>
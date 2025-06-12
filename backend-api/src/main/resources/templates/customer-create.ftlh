<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link rel="stylesheet" type="text/css" href="/css/styless.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Exile&family=Roboto:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <title>Login Page</title>
</head>
<body>
    <section class="container">
        <div class="left-side">
            <form action="/customers/signUp" method="post" >
            <h1>Customer Sign Up</h1>
            <span class="please">Please login to continue to your account.</span>
           <input placeholder="  UserName" name="userName" type="text">
            <input placeholder="  Password" name="password" type="password">
             <input placeholder="  Game Library Name" type="text">
            <button class="dev-change">Switch to Developer</button>
            <button type="submit" class="sign-button">Sign Up</button>
           
            <!-- <div class="do"><hr><span class="or-span">or</span><hr></div>
            <span class="need">Already Hav an Account? <span class="create-span">SignIn</span></span> -->
            </form>
            <a href="/"> <button class="sign-button">Cancel</button></a>
        </div>
        <div class="right-side">
            <div><img src="/game1.png"></div>
            
        </div>
    </section>
</body>
</html>
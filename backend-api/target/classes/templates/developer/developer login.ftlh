<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Figma Export</title>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Inter:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <div class="container">
        
<div style="width: 1440px; height: 1024px; background: white; overflow: hidden; border-radius: 32px; justify-content: flex-start; align-items: flex-start; display: inline-flex">
  <div style="flex: 1 1 0; align-self: stretch; padding: 32px; position: relative; flex-direction: column; justify-content: flex-start; align-items: flex-start; display: inline-flex">
    <div style="align-self: stretch; flex: 1 1 0; padding-left: 64px; padding-right: 64px; flex-direction: column; justify-content: center; align-items: flex-start; gap: 32px; display: flex">
      <div style="align-self: stretch; flex-direction: column; justify-content: center; align-items: flex-start; gap: 12px; display: flex">
        <div style="text-align: center; color: #232323; font-size: 40px; font-family: Inter; font-weight: 700; line-height: 44px; word-wrap: break-word">Developer Login</div>
        <div style="align-self: stretch; color: #969696; font-size: 18px; font-family: Inter; font-weight: 400; line-height: 27px; word-wrap: break-word">Please login to continue to your account.</div>
      </div>

        <form action="/Developers/login" method="post">
            <label for="username">username</label>
            <input type="text" id="username" name="username" required autocomplete="username">

            <label for="password">Password</label>
            <input type="password" id="password" name="password" required autocomplete="current-password">
            <button type="submit"> Log In</button>

        </form>
        <a class="register-link" href="/Developers/signup">New Developer? Signup here</a>
         <div style="width: 189px; height: 22px; color: black; font-size: 18px; font-family: Inter; font-weight: 600; line-height: 21.60px; word-wrap: break-word"> Switch to Customer</div>
    </div>
  </div>
  <div style="width: 849px; align-self: stretch; padding: 12px; background: #5DE285; outline: 1px black solid; outline-offset: -1px; justify-content: center; align-items: center; gap: 10px; display: flex">
    <div style="flex: 1 1 0; align-self: stretch; position: relative; border-radius: 24px; justify-content: flex-start; align-items: flex-start; gap: 10px; display: flex">
      <img style="width: 587px; height: 502px; left: 119px; top: 234px; position: absolute; border-radius: 35px" src="images/game1.png" />
    </div>
  </div>
</div>
</div>
 
</body>
</html>
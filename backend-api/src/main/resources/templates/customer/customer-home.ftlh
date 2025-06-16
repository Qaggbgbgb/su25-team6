<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
  <!-- <link rel="stylesheet"  type="text/css" href="/ccs/style.css"> -->
  <link rel="stylesheet" type="text/css" href="/css/styles.css">

  <title>Home Page</title>
</head>

<body>
  <nav class="navbar navbar-expand-lg bg-primary">

    <div class="container-fluid">
      <a class="navbar-brand" href="/customers">Game Platform</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/customers">Home</a>
          </li>
<<<<<<< HEAD
           <#if Session.SPRING_SECURITY_CONTEXT??>
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/customers/library">Game Library</a>
          </li>
         
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/logout">Log Out</a>
          </li>
          <#else>
           <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/customers/Login">Login</a>
          </li>
           <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/customers/signUp">Sign Up</a>
          </li>
          </#if> 
       
          
          </ul>
=======
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="">Game Library</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/customers/signUp">Login/SignUp</a>
          </li>

>>>>>>> 8620326 (some changes)
        </ul>

      </div>
    </div>
  </nav>
<<<<<<< HEAD
 <section class="welcome">
  <h1>Available Games</h1>

  <form action="/games/name" class="d-flex mt-3 justify-content-center" role="search" style="gap: 2rem;">
    <input name="name" class="form-control" type="text" placeholder="Search by Name" aria-label="Search" style="max-width: 300px;">
    <button class="btn btn-outline-success" type="submit">Search</button>
  </form>
</section>


<section class="games-list">
  <#list gamesList as games>
    <div class="card" style="width: 18rem; margin: auto;">
      <img src="${games.profilePicturePath}" class="card-img-top" alt="..." style="height: 200px; object-fit: cover;">
      <div class="card-body text-center">
        <h5 class="card-title">${games.gameName}</h5>
        <a href="/customers/add-game/${games.gameId}" class="btn btn-primary">Add Game</a>
      </div>
    </div>
  </#list>
  <div class="container mt-4">
  <div class="card" style="width: 30rem;">
    <div class="card-header">
      <h5 class="mb-0">Chat Box</h5> 
    </div>
    <form action="/chat/update" method="post" >
    <div class="card-body">
      
      <div class="border p-2 mb-3" style="height: 200px; overflow-y: auto; background-color: #f8f9fa; white-space: pre-wrap;">
        ${allChats!""}
      </div>
      <textarea class="form-control mb-2" name="input" rows="3" placeholder="Type your message here..." required></textarea>

      <input type="hidden" name="chatId" value="2">
       <button type="submit" class="btn btn-primary" style="width: 10rem;">Send Chat</button>
    
    </div>
    </form>
  </div>
</div>
</section>
<section>
  

</section>

=======
  <section class="welcome">
    <h1>Available Games</h1>
    
    <form action="/games/name" class="d-flex mt-3 mt-lg-0" role="search" style="margin-left: 2rem;">
      <input name="name" class="form-control me-2" type="text" placeholder="Search by Name" aria-label="Search"> <button
        class="btn btn-outline-success" type="submit">Search</button>
    </form>
    
  </section>
  <section class="animal-list position-relative">
<#list gamesList as games>
      <div class="card mx-auto" style="width: 18rem;">
<img src="${games.profilePicturePath}" class="card-img-top" alt="..." style="height: 200px; object-fit: cover;">

  <div class="card-body">
    <h5 class="card-title" >${games.gameName}</h5>
    
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
</#list>
  

  </section>
>>>>>>> 8620326 (some changes)
  <footer>
    <h4>Follow Us</h4>
    <!-- <div class="icon-list">
      <img class="icon" src="instagram.png">
      <img class="icon" src="facebook.png">
      <img class="icon" src="linkedin.png">
      <img class="icon" src="twitter.png">

    </div> -->
  </footer>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
    crossorigin="anonymous"></script>
<<<<<<< HEAD
  <!-- <script src="script.js" defer></script> -->
=======
  <script src="script.js" defer></script>
>>>>>>> 8620326 (some changes)
</body>

</html>
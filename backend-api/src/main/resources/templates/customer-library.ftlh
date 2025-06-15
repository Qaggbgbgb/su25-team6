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
         
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/customers/signUp">Sign Out</a>
          </li>

        </ul>

      </div>
    </div>
  </nav>
  <section class="welcome">
    <h1>Customer Games</h1>
    
    <form action="/games/name/customer" class="d-flex mt-3 mt-lg-0" role="search" style="margin-left: 2rem;">
      <input name="name" class="form-control me-2" type="text" placeholder="Search by Name" aria-label="Search"> <button
        class="btn btn-outline-success" type="submit">Search</button>
    </form>
    
  </section>
  <section class="games-list position-relative">
<#list customersGames as customerGames>
      <div class="card mx-auto" style="width: 18rem;">
<img src="${customerGames.profilePicturePath}" class="card-img-top" alt="..." style="height: 200px; object-fit: cover;">

  <div class="card-body">
    <h5 class="card-title" >${customerGames.gameName}</h5>
    
    <a href="" class="btn btn-primary">Game Added</a>
  </div>
</div>
</#list> 

  

  </section>
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
  <script src="script.js" defer></script>
</body>

</html>
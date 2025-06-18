<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
 
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Figma Export</title>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Inter:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="styles.css">
</head>
<body>
<div style="width: 1440px; height: 1000px; position: relative; background: #537ADD; overflow: hidden">
  <div style="width: 1440px; height: 203px; left: 0px; top: 0px; position: absolute; background: #5DE285; overflow: hidden">
    <div style="left: 1033px; top: 56px; position: absolute; justify-content: flex-end; align-items: center; gap: 48px; display: inline-flex">
      <div style="justify-content: center; display: flex; flex-direction: column; color: black; font-size: 20px; font-family: Inter; font-weight: 500; line-height: 30px; word-wrap: break-word">home</div>
      <div style="justify-content: center; display: flex; flex-direction: column; color: black; font-size: 20px; font-family: Inter; font-weight: 500; line-height: 30px; word-wrap: break-word">review</div>
      <div style="padding-left: 24px; padding-right: 24px; padding-top: 14px; padding-bottom: 14px; box-shadow: 0px 1px 2px rgba(0, 0, 0, 0.05); border-radius: 8px; justify-content: center; align-items: center; gap: 8px; display: flex">
        <div style="justify-content: center; display: flex; flex-direction: column; color: black; font-size: 16px; font-family: Inter; font-weight: 500; line-height: 24px; word-wrap: break-word">services</div>
      </div>
    </div>
    <div style="left: 80px; top: 67px; position: absolute; justify-content: center; display: flex; flex-direction: column; color: black; font-size: 20px; font-family: Inter; font-weight: 500; line-height: 30px; word-wrap: break-word">Game Platform</div>
  </div>
  <div style="width: 609px; height: 278px; left: 135px; top: 293px; position: absolute; overflow: hidden">
    <div style="width: 716px; height: 407px; left: 0px; top: -65px; position: absolute; justify-content: center; display: flex; flex-direction: column; color: black; font-size: 64px; font-family: Inter; font-weight: 500; line-height: 96px; word-wrap: break-word">Game Store<br/></div>
  </div>
  <div class="container" style="margin-top: 600px;display: flex">
    <h1>Here are your published games:</h1>
    <a href="/games/createForm" class="btn btn-outline-primary" style="float:right;">Publish New Game</a>

    <form action="/games/gameName">
        <input type="text" name="key" placeholder="Search By Name &#128270;">
    </form>

    <!-- Games Table -->
    <table class="table table-striped rounded-3 overflow-hidden">
        <tr>
            <th>gameId</th>
            <th>gameName</th>
            <th>profolioPicturePath</th>
            <th>edit games</th>
        </tr>
        <#list gameList as game>
        <tr>
            <td>
                <a href="/games/${game.gameId?c}" style="color:#000000">${games.gameId?c}</a>
            </td>
            <td>${games.gameName}</td>
            <td>
                <a href="/games/profolioPicturePath/${game.profolioPicturePath}" style="color:#000000">${games.profolioPicturePath}</a>
            </td>
            <td>
               <a href="/developer/gamestore/updateForm/${game.gameId?c}" class="btn btn-primary">Edit
            Student</a>
            </td>
        </tr>
        </#list>
    </table>

</div>
  </div>
</body>
</html>
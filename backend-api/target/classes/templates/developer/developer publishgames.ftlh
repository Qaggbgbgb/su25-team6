<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>gamestore pb</title>
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
  <div style="width: 609px; height: 442px; left: 152px; top: 293px; position: absolute; overflow: hidden">
    <div class="container" style="margin-top: 15px;" >
    <h1>publish a game</h1>
    <form id= new-game action="/games" method="post" enctype="multipart/form-data">
      
      <input type="text" id="name" name="name" placeholder="Enter Full Name" required/>
     
      
 
      <input type="text" id="id" name="id" placeholder=" Enter id" required/>
 
      
      <input type="text" id="profilePicturePath" name="profilePicturePath" placeholder="Enter profilePicturePath" required />

      <input type="file" id="game image" name="game image" placeholder="gameimage" required/>
        
      
      <button type="submit" onclick="window.location.href='developer viewpublishedgames.ftlh'">Save Changes</button>
      <a href="developer gamestore basic.ftlh" class="btn btn-outline-danger" >Cancel</a>
    </form>

    </div>
</div>
</body>
</html>
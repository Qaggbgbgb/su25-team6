// package com.example.Game_Platform.GameStore;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.Game_Platform.Developer.Developer;
// import com.example.Game_Platform.Game.Game;

// @Controller
// public class GameStoreController {

// @Autowired
// private GameStoreService gameStoreService;

// @GetMapping("/gameStore")
//   public Object getAllGameStores(Model model) {
//     model.addAttribute("gamestores",gameStoreService.getAllGameStores());
//     return "developer/gamestore-list";
//   }
// @GetMapping("/gameStore/{id}")
//   public Object getGameStoreById(@PathVariable long storeId, Model model) {
//     model.addAttribute("gamestore", gameStoreService.getGameStoreById(storeId));
//     return  "developer/gamestore-details";
//   }

//  @GetMapping("/gameStore/createForm")
//   public Object showCreateForm(Model model) {
//     Game game = new Game();
//     model.addAttribute("game", game);
//     model.addAttribute("title", "publish new games");
//     return "developer/developer publishgames";
//   }

  

    
// }

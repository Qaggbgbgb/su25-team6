package com.example.Game_Platform.GameStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.Game_Platform.Developer.Developer;
// import com.example.Game_Platform.Game.Game;

@Controller
public class GameStoreController {

@Autowired
private GameStoreService gameStoreService;

@GetMapping("/gameStore")
  public Object getAllGameStores(Model model) {
    return gameStoreService.getAllGameStores();
    
  }
@GetMapping("/gameStore/{id}")
  public GameStore getGameStoreById(@PathVariable long storeId) {
    return gameStoreService.getGameStoreById(storeId);
    
  }
@GetMapping("/gameStore/developer/{developer_Id}")
 public GameStore getGameStoreByDeveloperId(@PathVariable Long developer_id){
    return gameStoreService.getGameStoreByDeveloperId(developer_id);
 }
    
}

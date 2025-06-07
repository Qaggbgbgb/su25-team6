package com.example.Game_Platform.GameStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Game_Platform.Developer.Developer;
import com.example.Game_Platform.Game.Game;

@RestController
public class GameStoreController {

@Autowired
private GameStoreService gameStoreService;
@GetMapping("/gamestore")
  public Object getAllGameStores() {
    return gameStoreService.getAllGameStores();
  }
@GetMapping("/gamestore/{id}")
  public GameStore getGameStoreById(@PathVariable long storeId) {
    return gameStoreService.getGameStoreById(storeId);
  }

@PostMapping("/gamestore")
  public void publishGame(@RequestBody Game game,Developer developer) {
    gameStoreService.publishGames(developer,game);
  }


    
}

package com.example.Game_Platform.GameStore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Game_Platform.Developer.Developer;
import com.example.Game_Platform.Game.Game;


@Service
public class GameStoreService {
    

    @Autowired
    private GameStoreRepository gameStoreRepository;

public Object getAllGameStores() {
    return gameStoreRepository.findAll();
  }

public GameStore getGameStoreById(@PathVariable long storeId) {
    return gameStoreRepository.findById(storeId).orElse(null);
  }

public Object getGameStoreByDeveloper(Developer developer) {
    return gameStoreRepository.getGameStoreByDeveloper(developer);
  }
public void publishGames(Developer developer,Game game){
   
    gameStoreRepository.getGameStoreByDeveloper(developer).getGames().add(game);
}

public List<Game> viewPublishedGames(Developer developer){
    
    return gameStoreRepository.getGameStoreByDeveloper(developer).getGames();}
    

public Object addGameStore(GameStore gameStore) {
    return gameStoreRepository.save(gameStore);
  }


}

package com.example.Game_Platform.Game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    /**
     * Get all games
     * @return
     */
    public Object getAllGames() {
        return gameRepository.findAll();
    }
    
    /**
     * Get game by Id
     * 
     * @param gameId
     * @return
     */
    public Game getGameById(Long gameId) {
        return gameRepository.findById(gameId).orElse(null);
    }

    /**
     * Get Game by name
     * 
     * @param name
     * @return
     */
    public Object getGameByName(String name) {
        return gameRepository.getGameByGameName(name);
    }

    /**
     * Add new Game
     * 
     * @param game
     * @return
     */
    public Object addGame(Game game) {
        return gameRepository.save(game);
    }

    /**
     * Update a game
     * @param game
     * @return
     */
    public Object updateGame(Game game) {
        return gameRepository.save(game);
    }

    /**
     * 
     * @param gameId
     * @return
     */

    public void deleteGameById(Long gameId) {
        gameRepository.deleteById(gameId);
    }

    /**
     * 
     * @param gameLibraryId
     * @return
     */

    public List<Game> getGamesByGameLibraryId(Long gameLibraryId) {
        return gameRepository.getGamesByGameLibraryId(gameLibraryId);
    }

    public List<Game> getGamesByStoreId(Long storeId){
        return gameRepository.getGamesByStoreId(storeId);
    }


}

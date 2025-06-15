package com.example.Game_Platform.GameLibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Game_Platform.Customer.CustomerRepository;
import com.example.Game_Platform.Game.Game;

@Service
public class GameLibraryService {

    @Autowired
    private GameLibraryRepository gameLibraryRepository;
    
    @Autowired
    private CustomerRepository customerRepository;
    /**
     * Get all Libraries
     * @return
     */
    public Object getAllGameLibraries() {
        return gameLibraryRepository.findAll();
    }

    /**
   * Get Library by ID
   *
   * @param gameLibraryId 
   * @return 
   */
  public GameLibrary getGameLibraryById(Long gameLibraryId) {
    return gameLibraryRepository.findById(gameLibraryId).orElse(null);
  }

    /**
   * Add new gameLibrary
   *
   * @param gameLibrary 
   * @return 
   */
  public Object addGameLibrary(GameLibrary gameLibrary) {
    return gameLibraryRepository.save(gameLibrary);
  }


  /**
   * Update gameLibrary
   *
   *
   * @param gameLibrary
   * @return 
   */
  
  public GameLibrary updateGameLibrary( GameLibrary gameLibrary) {
    return gameLibraryRepository.save(gameLibrary);
  }

  /**
   * Delete gameLibrarybyID
   *
   * @param gameLibraryId 
   * @return 
   */
  public Object deleteGameLibrary(Long gameLibraryId) {
    gameLibraryRepository.deleteById(gameLibraryId);
    return gameLibraryRepository.findAll();
  }

  /**
   * 
   */


}

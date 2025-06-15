package com.example.Game_Platform.GameLibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameLibraryController {
    
  @Autowired
  private GameLibraryService gameLibraryService;

  /**
  * Endpoint to get All Libraries
  *
  * @return 
   */
  @GetMapping("/gameLibraries")
  public Object getAllGameLibraries() {
    return gameLibraryService.getAllGameLibraries();
  }

   /**
   * Endpoint to get gameLibrary by ID
   *
   * @param id 
   * @return 
   */
  @GetMapping("/gameLibraries/{id}")
  public GameLibrary getGameLibraryById(@PathVariable Long id) {
    return gameLibraryService.getGameLibraryById(id);
  }

//     /**
//    * Endpoint to get game libraries by user name
//    *
//    * @param userName 
//    * @return
//    */
//   @GetMapping("/gameLibraries/name")
//   public Object getGameLibrariesByUserName(@RequestParam String userName ) {
//     if (userName != null) {
//       return gameLibraryService.getGameLibrariesByUserName(userName);
//     } else {
//       return gameLibraryService.getAllGameLibraries();
//     }
//   }

    /**
   * Endpoint to add GameLibrary
   *
   * @param gameLibrary 
   * @return 
   */
     @PostMapping("/gameLibraries")
     public Object addGameLibrary(@RequestBody GameLibrary gameLibrary) {
     return gameLibraryService.addGameLibrary(gameLibrary);
  }



  /**
   * Endpoint to delete a game library by ID
   *
   * @param gameLibraryId 
   * @return 
   */
  @DeleteMapping("/gameLibraries/{gameLibraryId}")
  public Object deleteGameLibrary(@PathVariable Long gameLibraryId ) {
    return gameLibraryService.deleteGameLibrary(gameLibraryId);
  }

  /**
   * Enppoint to update game Library 
   * 
   * @param gameLibraryId
   * @param gameLibrary
   * @return
   * 
   */
  // @PutMapping("/gameLibraries/{gameLibraryId}")
  // public Object updateGameLibray(@PathVariable Long gameLibraryId, @RequestBody GameLibrary gameLibrary) {
  //     gameLibrary.setGameLibraryId(gameLibraryId);
  //     gameLibraryService.updateGameLibrary(gameLibrary);
  //     return gameLibraryService.getGameLibraryById(gameLibraryId);    
  // }
  
}

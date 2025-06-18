
package com.example.Game_Platform.Game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.Game_Platform.Customer.CustomerRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@Controller
public class GameController {
    
    @Autowired
    private GameService gameService;

    @Autowired
    private CustomerRepository customerRepository;

    // /**
    //  * Enpoint to get all games
    //  * 
    //  * @return
    //  */
    // @GetMapping("/games")
    // public Object getAllGames(Model model) {
    //     model.addAttribute("gameList", gameService.getAllGames());
    //     model.addAttribute("title", "All Games");
    //     return "developer viewpublishedgames";
    // }


    // /**
    //  * Enpoint to get all games
    //  * 
    //  * @return
    //  */
    // @GetMapping("/games")
    // public Object getAllGames() {
    //     return gameService.getAllGames();
    // }



    // /**
    //  * Endpoint to get game by name
    //  * @param name
    //  * @return
    //  */
    // @GetMapping("/games/name")
    // public Object getGameByName(@RequestParam String name) {
    //     if (name != null) {
    //         return gameService.getGameByName(name);
    //     } else {
    //         return gameService.getAllGames();
    //     }
    // }
    

    /**
     * 
     * 
     * @param name
     * @return
     */
    @GetMapping("/games/name")
    public Object getGameByGameName(@RequestParam String name, Model model) {
        if (name != null) {
            model.addAttribute("gamesList", gameService.getGameByName(name));
            return "customer-home";
        } else {
            return "redirect:/customers/";
        }
        
    }





    // /**
    //  * Endpoint to update Game
    //  * @param gameId
    //  * @param game
    //  * @return
    //  */
    @PostMapping("/games/update/{gameId}")
  public Object updateGame(@PathVariable Long gameId,  Game game, @RequestParam MultipartFile picture) {
    gameService.updateGame(gameId, game, picture);
    return "redirect:/Developers/games/{developer_id}" + gameId;
  }


    // /**
    //  * Enpoint to delete game by ID
    //  * @param gameId
    //  * @return
    //  */
    @GetMapping("/games/delete/{gameId}")
  public Object deleteGame(@PathVariable Long gameId) {
    gameService.deleteGame(gameId);
    return "redirect:/Developers/games/{developer_id}";
  }




    /**
     * Enpoint to add new games
     * 
     * @param game
     * @return
     */
    @PostMapping("/games")
  public Object addGame(Game game, @RequestParam MultipartFile picture) {
    // return studentService.addStudent(student, picture);
    Game newGame = gameService.addGame(game, picture);
    return "redirect:/Developers/games/{developer_id}" + newGame.getGameId();
  }


    // /**
    //  * Endpoint to get game by gameId
    //  * @param gameId
    //  * @return
    //  */
    // @GetMapping("/games/{gameId}")
    // public Game getGameById(@PathVariable Long gameId) {
    //     return gameService.getGameById(gameId);
    // }
    
    

//     /**
//      * Enpoint to get games by GameLibrary Id
//      * 
//      * @param gameLibraryId
//      * @return
//      */
//     @GetMapping("/games/gameLibraryId/{gameLibraryId}")
//     public Object getGamesBygameLibraryId(@RequestParam Long gameLibraryId) {
//         return gameService.getGamesByGameLibraryId(gameLibraryId);
//     }
   
 @GetMapping("/games/gameStore/{storeId}")
   public List<Game> getGamesByStoreId(@PathVariable Long storeId) {
     return gameService.getGamesByStoreId(storeId);
  
   }


//  @PostMapping("/games")
//    public Object publishGames(Game game) {
//      // return studentService.addStudent(student, picture);
//      Game newGame = gameService.addGame(game);
//      return "redirect:/developer/developer viewpublishedgames" + newGame.getGameId();
//    }

   




}

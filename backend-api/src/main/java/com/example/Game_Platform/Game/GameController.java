package com.example.Game_Platform.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Game_Platform.Customer.CustomerRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@Controller
public class GameController {
    
    @Autowired
    private GameService gameService;

    /**
     * Enpoint to get all games
     * 
     * @return
     */
    @GetMapping("/customers")
    public Object getAllGames(Model model) {
        model.addAttribute("gamesList", gameService.getAllGames());
        model.addAttribute("title", "All Games");
        return "customer-home";
    }


    // /**
    //  * Enpoint to get all games
    //  * 
    //  * @return
    //  */
     @GetMapping("/games")
     public Object getAllGames(Model model) {
         model.addAttribute("games", gameService.getAllGames());
         return "gamestore/gamestore viewpubishedgames";
     }

    @GetMapping("/games/{gameId}")
     public Object getGameById(@PathVariable Long gameId, Model model) {
        model.addAttribute("game", gameService.getGameById(gameId));
        return "games/game-details";
     }


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
    




    /**
     * 
     * 
     * @param name
     * @return
     */
    //@GetMapping("/games/name")
    //public Object getGameByGameName(@RequestParam String name, Model model) {
    //   if (name != null) {
    //        model.addAttribute("gamesList", gameService.getGameByName(name));
     //       return "customer-home";
    //    } else {
    //        return "redirect:/customers/";
    //   }
        
   // }
    





    // /**
    //  * Endpoint to update Game
    //  * @param gameId
    //  * @param game
    //  * @return
    //  */
    // @PutMapping("/games/{gameId}")
    // public Game updateGame(@PathVariable Long gameId, @RequestBody Game game) {
    //     game.setGameId(gameId);
    //     gameService.updateGame(game);
    //     return gameService.getGameById(gameId);
    // }


    // /**
    //  * Enpoint to delete game by ID
    //  * @param gameId
    //  * @return
    //  */
    // @DeleteMapping("/games/{gameId}")
    // public Object deleteGame(@PathVariable Long gameId) {
    //     gameService.deleteGameById(gameId);
    //     return gameService.getAllGames();
    // }



    /**
     * Enpoint to add new games
     * 
     * @param game
     * @return
     */
    @PostMapping("/games")
    public Object addGame(@RequestBody Game game) {
        return gameService.addGame(game);
    }


    /**
     * Endpoint to get game by gameId
     * @param gameId
     * @return
     */
    //@GetMapping("/games/{gameId}")
    //public Game getGameById(@PathVariable Long gameId) {
    //    return gameService.getGameById(gameId);
    //}
    
    

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
  public Object getGamesByStoreId(@PathVariable Long storeId, Model model) {
    model.addAttribute("games",gameService.getGamesByStoreId(storeId));
    return "gamestore/gamestore viewpublishedgames";
  }


@PostMapping("/game")
  public Object publishGames(Game game) {
    // return studentService.addStudent(student, picture);
    Game newGame = gameService.addGame(game);
    return "redirect:/gamestore/ view publishedgames" + newGame.getGameId();
  }



}


 package com.example.Game_Platform.Developer;

 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.PutMapping;
 import org.springframework.web.bind.annotation.RequestBody;
 import org.springframework.web.bind.annotation.RequestParam;

import com.example.Game_Platform.Game.Game;
import com.example.Game_Platform.Game.GameService;
import com.example.Game_Platform.GameStore.GameStoreService;
 

 @Controller
 public class DeveloperController {
     @Autowired
 private DeveloperService developerService;
      @Autowired
     private GameService gameService;
     @Autowired
     private GameStoreService gameStoreService;
 @GetMapping("/Developers")
   public Object getAllDevelopers() {
   return developerService.getAllDevelopers();
   }

@GetMapping("/Developers/login")
  public Object showLogInPage() {
    return "developer login";
  }

@GetMapping("/Developers/signup")
  public Object showDeveloperCreateForm(Model model) {
    model.addAttribute("developer", new Developer());
    return "developerSignup";
  }


@GetMapping("/Developers/developerhome/{developer_id}")
  public Object getDeveloperhome(@PathVariable long developer_id, Model model) {
        model.addAttribute("developer", developerService.getDeveloperById(developer_id));
    return "developerhome";
  }


@GetMapping("/Developers/{id}")
  public Object getDeveloperById(@PathVariable long developer_id) {
   
    return developerService.getDeveloperById(developer_id);
  }

@PostMapping("/Developers/login")
  public Object getDevelopersByUsername(@RequestParam String username) {
    Developer developer= developerService.getDeveloperByUsername(username);
    if ( username != null) {
      return "redirect:/Developer/developerhome/" + developer.getDeveloperID();
    } else {
      return "redirect:/Developers/login";
    }

  }


@PostMapping("/Developers")
  public Object addDeveloper(@RequestBody Developer developer) {
    Developer newDeveloper=developerService.addDeveloper(developer);

     return "redirect:/Developers/developerhome/{developer_id}" +newDeveloper.getDeveloperID();
  }

@PutMapping("/Developers/{id}")
  public Developer updateDeveloper(@PathVariable Long developer_id, @RequestBody Developer developer) {
    developerService.updateDeveloper(developer_id, developer);
    return developerService.getDeveloperById(developer_id);
  }

@DeleteMapping("/Developers/{id}")
  public Object deleteDeveloper(@PathVariable Long developer_id) {
    developerService.deleteDeveloper(developer_id);
    return developerService.getAllDevelopers();
  }
@GetMapping("/Developers/gameStore/{storeId}")
  public Object getDeveloperByStoreId(@PathVariable Long storeId) {
    return developerService.getDeveloperByStoreId(storeId);




}

@GetMapping("/Developers/gamestore/createForm")
  public Object showCreateForm(Model model) {
    Game game = new Game();
    model.addAttribute("game", game);
    model.addAttribute("title", "publish new games");
    return "developer publishgames";
  }

  @GetMapping("/Developers/gamestore/updateForm/{gameId}")
  public Object showUpdateForm(@PathVariable Long gameId, Model model) {
    Game game = gameService.getGameById(gameId);
    model.addAttribute("game", game);
    model.addAttribute("title", "Update game: " + gameId);
    return "developer updategames";
  }
@GetMapping("/Developers/games/{developer_id}")
  public Object getGamesByDeveloperId(@PathVariable Long developer_id, Model model)
{
  model.addAttribute("gameList", gameStoreService.getGameStoreByDeveloperId(developer_id).getGames());
  return "developer viewPublishedGames";


}






}

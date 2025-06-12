
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
 import org.springframework.web.bind.annotation.RestController;

 @Controller
 public class DeveloperController {
     @Autowired
 private DeveloperService developerService;
 @GetMapping("/Developers")
   public Object getAllDevelopers(Model model) {
     model.addAttribute("developerssList", developerService.getAllDevelopers());
     return "developer/developer-list";
   }


@GetMapping("/Developers/{id}")
  public Object getDeveloperById(@PathVariable long developer_id, Model model) {
    
    
    model.addAttribute("developer",developerService.getDeveloperById(developer_id));
    return "developer/developer-details";
  }

@GetMapping("/Developers/username")
  public Object getDevelopersByUsername(@RequestParam String key) {
    if (key != null) {
      return developerService.getDevelopersByUsername(key);
    } else {
      return developerService.getAllDevelopers();
    }

//   }


@PostMapping("/Developers")
  public Object addDeveloper(@RequestBody Developer developer) {
    return developerService.addDeveloper(developer);
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
  public Object getDevelopersByStoreId(@PathVariable Long storeId) {
    return developerService.getDevelopersByStoreId(storeId);




}
}

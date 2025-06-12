package com.example.Game_Platform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;

=======
>>>>>>> fe04742 (Added search by game name functionality and rendered games)

@Controller
public class AppController {

    @GetMapping({"", "/", "/home", "dashboard", "/customers/"})
<<<<<<< HEAD
    public String showDashBoard() {
        return "redirect:/customers";
    }
    
    @GetMapping("/403")
    public String _403() {
        return "403";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }
    
    
=======
    public String showBoard() {
        return "redirect:/customers";
    }
    
>>>>>>> fe04742 (Added search by game name functionality and rendered games)
}

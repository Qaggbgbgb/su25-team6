package com.example.Game_Platform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping({"", "/", "/home", "dashboard", "/customers/"})
    public String showBoard() {
        return "redirect:/customers";
    }
    
}

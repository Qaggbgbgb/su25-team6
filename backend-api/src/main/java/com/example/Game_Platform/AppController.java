package com.example.Game_Platform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AppController {

    @GetMapping({"", "/", "/home", "dashboard", "/customers/"})
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
    
    
}

    //These are commented because they are duplicate methods.
    // public String showBoard() {
    //     return "redirect:/customers";
    // }

    // public String showDashBoard() {
    //     return "redirect:/customers";
    // }
    
    // @GetMapping("/403")
    // public String _403() {
    //     return "403";
    // }

    // @GetMapping("/error")
    // public String error() {
    //     return "error";
    // }
    
    



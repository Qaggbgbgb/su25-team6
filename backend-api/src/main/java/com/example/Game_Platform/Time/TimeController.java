package com.example.Game_Platform.Time;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TimeController {
    
    @Autowired
    private TimeService timeService;


    /**
     * 
     * @param model
     * @return
     */
   @GetMapping("/clock")
   public String showTime(Model model) {
       Time time = timeService.getTime("America/New_York");
       model.addAttribute("hour", time.getHour());
       model.addAttribute("minute", time.getMinute());
       model.addAttribute("seconds", time.getSeconds());
       return "customer-home";
   }
   
    
}

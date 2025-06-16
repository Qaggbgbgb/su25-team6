package com.example.Game_Platform.Customer;

import java.lang.ProcessBuilder.Redirect.Type;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Game_Platform.Game.Game;
import com.example.Game_Platform.Game.GameRepository;
import com.example.Game_Platform.Game.GameService;
import com.example.Game_Platform.GameLibrary.GameLibrary;
import com.example.Game_Platform.GameLibrary.GameLibraryRepository;
import com.example.Game_Platform.GameLibrary.GameLibraryService;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class CustomerController {

    @Autowired
    private GameLibraryService gameLibraryService;
    
    @Autowired
    private CustomerService customerService;

    // /**
    //  * Enpoint to get all customers
    //  * 
    //  * @return
    //  */
    @GetMapping("/customers")
     public Object getAllCustomers( Model model) {
          model.addAttribute("customerList", customerService.getAllCustomers());
         model.addAttribute("title", "All Customers");
          return "customer-home";
     }

    @Autowired
    private GameLibraryRepository gameLibraryRepository;

    // @Autowired
    // private GameLibraryService gameLibraryService;

    @Autowired
    private GameService gameService;

    @Autowired
    private GameRepository gameRepository;
     boolean value = false;
    
    /**
     * Enpoint to get all customers
     * 
     * @return
     */
    @GetMapping("/customers")
    public String getCustomerHome( Model model) {
    model.addAttribute("gamesList", gameService.getAllGames());
    model.addAttribute("title", "All Customers");
    return "customer-home";
}

 
    // /**
    //  * Enpoint to get a customer by ID
    //  * 
    //  * @param id
    //  * @return
    //  */
    // @GetMapping("/customers/{id}")
    // public Customer getCustomerById(@PathVariable Long id) {
    //     return customerService.getCustomerById(id);
    // }
    
    // /**
    //  * Endpoint to add new Customer
    //  * 
    //  * @param customer
    //  * @return
    //  */
   //  @PostMapping("/customers")
   //  public Object addCustomer(@RequestBody Customer customer) {
   //      return customerService.addCustomer(customer);
   //  }


    

    //Enpoint to create customer form
    /**
     * 
     * @param model
     * @return
     */
   
    @GetMapping("/customers/signUp")
    public Object showSignUpForm(Model model) {
        Customer customer = new Customer();
       
        model.addAttribute("customer", customer);
        model.addAttribute("title", "Create New Customer");
        return "customer-create";
    }
    
    // Enpoint for customer to sign up 
    /**
     * @param gameLibrary
     * @param customer
     * @return
     */
    @PostMapping("/customers/signUp")
    public Object addCustomer(@ModelAttribute Customer customer, Model model) {
        GameLibrary gameLibrary = new GameLibrary();

        gameLibrary.setCustomer(customer);
        customer.setGameLibrary(gameLibrary);
        customerService.addCustomer(customer);
        model.addAttribute("Title", "Customer Sign Up");
        model.addAttribute("signUpPhrase", "Please sign up to create your account");

        return "redirect:/customers/Login";
    }
    
    //User Login
    /**
     * 
     * @param model
     * @return
     */
    @GetMapping("/customers/Login")
    public String loginPage() {    
        return "customer-login";
    }

    //Show customer library page
    /**
     * @param customer
     * @param model
     * @return
     */
    @GetMapping("/customers/library")
    public String showLibrary(Model model, Principal principal) {
      value = true;
        String username = principal.getName();

        

    Customer customer = customerRepository.getCustomerByUserName(username)
            .orElseThrow(() -> new RuntimeException("Customer not found"));

    
    model.addAttribute("value", value);
    model.addAttribute("customersGames", 
            customer.getGameLibrary().getGames());
    return "customer-library";
    }
    
    /**
     * @param gameId
     */
    @GetMapping("/customers/add-game/{gameId}")
    public String addGameToLibrary(@PathVariable Long gameId, Principal principal) {
        String username = principal.getName();

        Customer customer = customerRepository.getCustomerByUserName(username).orElse(null);

        GameLibrary gameLibrary = customer.getGameLibrary();

        Game addGame = gameRepository.findById(gameId).orElse(null);
        
        if (gameLibrary.getGames() == null) {
            gameLibrary.setGames(new ArrayList<>());
        } 

        if (!gameLibrary.getGames().contains(addGame)) {
            gameLibrary.getGames().add(addGame);
        }

        gameLibraryRepository.save(gameLibrary);

        return "redirect:/customers";
    }
     
    //Filter games of customer by name
    /**
     * @param name
     * @param model
     * @return
     */
    @GetMapping("/games/name/customer")
    public Object getCustomerGames(@RequestParam String name, Model model, Principal principal) {
        String username = principal.getName();
       
        Customer customer = customerRepository.getCustomerByUserName(username).orElse(null);
        GameLibrary gameLibrary = customer.getGameLibrary();

        List<Game> customerGames = customer.getGameLibrary().getGames();

        for (Game games : customerGames) {
           if (games.getGameName().equals(name)) {
            value = true;
            model.addAttribute("value", value);
            model.addAttribute("customersGames", gameRepository.getGameByGameName(name));
            return "customer-library";
           } else {
            value = false;
            model.addAttribute("value", value);
            model.addAttribute("noGames", "Game not in Library"); 
        }         
        } return "customer-library";          
    }

}

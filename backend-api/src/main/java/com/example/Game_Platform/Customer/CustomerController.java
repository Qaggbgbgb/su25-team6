package com.example.Game_Platform.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Game_Platform.Game.GameService;
import com.example.Game_Platform.GameLibrary.GameLibrary;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    @Autowired
    private GameService gameService;

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
    // @PostMapping("/customers")
    // public Object addCustomer(@RequestBody Customer customer) {
    //     return customerService.addCustomer(customer);
    // }


    

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

    
    




    







}

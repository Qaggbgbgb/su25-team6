package com.example.Game_Platform.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@Controller
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    // /**
    //  * Enpoint to get all customers
    //  * 
    //  * @return
    //  */
    // @GetMapping("/customers")
    // public Object getAllCustomers( Model model) {
    //      model.addAttribute("customerList", customerService.getAllCustomers());
    //      model.addAttribute("title", "All Customers");
    //      return "customer-home";
    // }

    /**
     * Enpoint to get a customer by ID
     * 
     * @param id
     * @return
     */
    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }
    
    /**
     * Endpoint to add new Customer
     * 
     * @param customer
     * @return
     */
    @PostMapping("/customers")
    public Object addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
    
    /**
     * Enpoint to get customer by name
     * 
     * @param name
     * @return
     */
    @GetMapping("/customers/name") 
    public Object getCustomersByName(@RequestParam String name) {
        if (name != null) {
            return customerService.getCustomerByUserName(name);
        } else {
            return customerService.getAllCustomers();
        }
    }

    /**
     * Endpoint to update a customer
     * 
     * @param id
     * @param customer
     * @return
     */
    @PutMapping("/customers/{id}")
    public Object updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        customerService.updateCustomer(id, customer);
        return customerService.getCustomerById(id);
    }

    /**
     * Endpoint to delete customer
     * 
     * @param id
     */
    @DeleteMapping("/customers/{id}")
    public Object deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return customerService.getAllCustomers();
    }

}

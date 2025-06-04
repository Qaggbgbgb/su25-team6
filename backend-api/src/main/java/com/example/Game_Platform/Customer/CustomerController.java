package com.example.Game_Platform.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    // @GetMapping("/customers")
    // public String getAllCustomers() {
    //     return customerService.getAllCustomers();
    // }

}

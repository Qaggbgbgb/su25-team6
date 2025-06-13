package com.example.Game_Platform.Customer;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Game_Platform.Game.Game;
import com.example.Game_Platform.Game.GameRepository;
import com.example.Game_Platform.GameLibrary.GameLibrary;
import com.example.Game_Platform.GameLibrary.GameLibraryRepository;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameLibraryRepository gameLibraryRepository;

   //Endpoint to get all customers
   /**
    * 
    * @return
    */
    public Object getAllCustomers() {
        return customerRepository.findAll();
    }

    //Endpoint to get Customers by ID
    /**
     * 
     * @param customerId
     * @return
     */
    public Customer getCustomerById(@PathVariable long customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    //Get Customer by UserName
    /**
     * 
     * @param userName
     * @return
     */
    public Object getCustomerByUserName(String userName) {
        return customerRepository.getCustomerByUserName(userName);
    }

    //Get Customer by Password
    /**
     * 
     * @param password
     * @return
     */

     public Object getCustomerByPassword(String password) {
        return customerRepository.getCustomerByPassword(password);
     }

     //Add Customer
     /**
      * 
      * @param customer
      * 
      */
        public Customer addCustomer(Customer customer) { 
        return customerRepository.save(customer);
        }

    //Update Customer 
    /**
     * 
     * @param customerId
     * @param customer
     * @return
     */
        public Customer updateCustomer(Long customerId, Customer customer) {
            return customerRepository.save(customer);
        }


     //Delete Customer
     /**
      * 
      * @param customerId
      * @return
      */
        public void deleteCustomer(Long customerId) {
            customerRepository.deleteById(customerId);
        }

    /**
     * @param gameId
     * @param customerId
     */
    //Add Game to Library
    public void addGameToLibrary(Long customerId, Long gameId){
        Customer customer = customerRepository.findById(customerId).orElseThrow();
        Game game = gameRepository.findById(gameId).orElseThrow();

        GameLibrary gameLibrary = customer.getGameLibrary();

        gameLibrary.getGames().add(game);
        gameLibraryRepository.save(gameLibrary);
    }

 

}

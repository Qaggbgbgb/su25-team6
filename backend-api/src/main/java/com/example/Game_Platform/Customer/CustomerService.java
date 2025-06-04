package com.example.Game_Platform.Customer;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;

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
    public Object getCustomerById(@PathVariable long customerId) {
        return customerRepository.findById(customerId).or(null);
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
      * @return
      */
        public Object addCustomer(Customer customer) {
        return customerRepository.save(customer);
        }

    //Update Customer 
    /**
     * 
     * @param customerId
     * @param customer
     * @return
     */
        public Object updateCustomer(Customer customer, Long customerId) {
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

    // //Method to write a Customer ID to a JSON file
    // /**
    //  * @param customer
    //  */

    //  public String writeJson(Customer customer) {
    //     ObjectMapper objectMapper = new ObjectMapper();
    //       try {
    //         objectMapper.writeValue(new File("customers.json"), customer);
    //         return "Customers written to JSON file successfully";
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //         return "Error writing student to JSON file";
    //     }
    //  }

    //    /**
    //  * 
    //  * @return
    //  */
    // public Object readJson() {
    //     ObjectMapper objectMapper = new ObjectMapper();
    //     try {
    //         return objectMapper.readValue(new File("customers.json"), Customer.class);
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //         return null;
    //     }
    // }

}

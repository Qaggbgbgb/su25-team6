

package com.example.Game_Platform.Customer;

import java.util.List;

import org.springframework.stereotype.Repository;
    
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long> {

    
    List<Customer> getCustomerById(Long customerId);
    List<Customer> getCustomerByUserName(String userName);
    List<Customer> getCustomerByPassword(String password);
    List<Customer> getCustomerByGameObject(String gameObject);
}

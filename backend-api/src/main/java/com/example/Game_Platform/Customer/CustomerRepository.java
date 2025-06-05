

package com.example.Game_Platform.Customer;

import java.util.List;

import org.springframework.stereotype.Repository;
    
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long> {

    
    List<Customer> findByCustomerId(Long customerId);
    List<Customer> getCustomerByUserName(String userName);
    List<Customer> getCustomerByPassword(String password);

    @Query(value = "select * from games c where c.gameLibrary_id= ?1", nativeQuery = true)
    List<Customer> getCustomerByGameLibrary(String gameLibrary);
}

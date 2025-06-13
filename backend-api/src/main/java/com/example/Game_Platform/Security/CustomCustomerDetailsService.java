package com.example.Game_Platform.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Game_Platform.Customer.Customer;
import com.example.Game_Platform.Customer.CustomerRepository;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class CustomCustomerDetailsService implements UserDetailsService{
   
    @Autowired
    private CustomerRepository repo;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
       
        Customer customer = repo.getCustomerByUserName(userName).orElseThrow(()
                -> new UsernameNotFoundException(userName + "not found"));
        ArrayList<SimpleGrantedAuthority> authList = new ArrayList<>();
        authList.add(new SimpleGrantedAuthority(customer.getRole()));
        return new org.springframework.security.core.userdetails.User(
               customer.getUserName(), customer.getPassword(), authList);
    }
}

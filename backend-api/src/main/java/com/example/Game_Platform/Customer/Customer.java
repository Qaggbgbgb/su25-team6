package com.example.Game_Platform.Customer;

import java.util.List;

import com.example.Game_Platform.GameLibrary.GameLibrary;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    
    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "customer")
    @JsonIgnoreProperties("customer")
    private List<GameLibrary> gameLibrary;
   

    public Customer() {
    }

    public Customer(Long customerId, String userName, List<GameLibrary> gameLibray, String password) {
        this.customerId = customerId;
        this.userName = userName;
        this.gameLibrary = gameLibray;
        this.password = password;
    }

    public Customer( String userName, List<GameLibrary> gameLibray, String password) {
        this.userName = userName;
        this.gameLibrary = gameLibray;
        this.password = password;
    }


    public Customer(Long customerId, String userName, String password) {
        this.customerId = customerId;
        this.userName = userName;
        this.password = password;
    }

   
    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;   
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public List<GameLibrary> getGameLibrary() {
        return gameLibrary;
    }
    public void setGameLibrary(List<GameLibrary> gameLibrary) {
        this.gameLibrary = gameLibrary;   
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;   
    }
   
}

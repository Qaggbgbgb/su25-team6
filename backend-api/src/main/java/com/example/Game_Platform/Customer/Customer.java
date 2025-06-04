package com.example.Game_Platform.Customer;

import com.example.Game_Platform.GameLibrary.GameLibrary;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String userName;
    private GameLibrary gameLibrary;
    private String password;

    public Customer() {
    }

    public Customer(Long customerId, String userName, GameLibrary gameLibray, String password) {
        this.customerId = customerId;
        this.userName = userName;
        this.gameLibrary = gameLibray;
        this.password = password;
    }

     public Customer( String userName, GameLibrary gameLibray, String password) {
        this.userName = userName;
        this.gameLibrary = gameLibray;
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
    public GameLibrary getGameLibrary() {
        return gameLibrary;
    }
    public void setGameObject(GameLibrary gameLibrary) {
        this.gameLibrary = gameLibrary;   
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;   
    }
    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", userName='" + userName + '\'' +
                ", gameObject=" + gameLibrary +
                ", password='" + password + '\'' +
                '}';            
    }
}

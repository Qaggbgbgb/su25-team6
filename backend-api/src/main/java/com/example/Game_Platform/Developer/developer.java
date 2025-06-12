// package com.example.Game_Platform.Developer;

import com.example.Game_Platform.GameStore.GameStore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Developers")
public class Developer {

// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)

// private Long developer_id;
// @Column(nullable = false, unique=true)

// private String username;
// @Column(nullable = false)
// private String password;

@ManyToOne()
  @JoinColumn(name = "storeId", nullable = false)
  @JsonIgnoreProperties("Developers")
  private GameStore gameStore;


// public Developer(){

// }
// public Developer(Long developer_id, String username, String password)
// {
//     this.developer_id=developer_id;
//     this.username=username;
//     this.password=password;
// }
// public Developer(String username, String password)
// {
//     this.username=username;
//     this.password=password;
// }
// public Long getDeveloperID(){
//     return this.developer_id;
// }

// public void setDeveloperID(Long developer_id)
// {
//     this.developer_id= developer_id;
// }

// public String getUsername(){
//     return this.username;
// }

// public void setUsername(String username)
// {
//     this.username=username;
// }

// public String getPassword(){
//     return this.password;
// }

// public void setPassword(String password){
//     this.password=password;
// }

public GameStore getGameStore(){
    return this.gameStore;
}
public void setGameStore(GameStore gameStore){
    this.gameStore=gameStore;
}

}

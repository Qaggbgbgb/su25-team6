package com.example.Game_Platform.GameLibrary;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.example.Game_Platform.Customer.Customer;
import com.example.Game_Platform.Game.Game;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "game_library")
public class GameLibrary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameLibraryId;
    

    @ManyToMany
    @JoinTable(
    name = "game_library_games",
    joinColumns = @JoinColumn(name = "game_library_id"),
    inverseJoinColumns = @JoinColumn(name = "game_id")
    )


    @JsonIgnoreProperties("libraries")
    private List<Game> games;

  
    private String userName;
    
    // @ManyToOne()
    // @JoinColumn(name = "customer", nullable = false)
    // private Customer customer;


    @OneToOne(optional = true)
    @JoinColumn(name = "customer_id", nullable = true)
    @JsonIgnoreProperties("gameLibrary")
    private Customer customer;

    public GameLibrary() {
    }

    public GameLibrary(Long gameLibraryId, List<Game> games, String userName, Customer customer) {
        this.gameLibraryId = gameLibraryId;
        this.games = games;
        this.userName = userName;
        this.customer = customer;
    }

    public GameLibrary( List<Game> games, String userName) {
        this.games = games;
        this.userName = userName;
    }


    public void setGameLibraryId(Long gameLibraryId) {
        this.gameLibraryId = gameLibraryId;
    }

    public Long getGameLibraryId() {
        return gameLibraryId;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames( List<Game> games) {
        this.games = games;
    }

    public String getUserName() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }




  
   //  @OneToMany(mappedBy = "gameLibrary")
   //  @JsonIgnoreProperties("gameLibrary")
  //   private List<Game> games;

}


  
   
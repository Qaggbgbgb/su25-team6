package com.example.Game_Platform.Game;

import java.util.List;

import com.example.Game_Platform.GameLibrary.GameLibrary;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "games")
public class Game {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameId;
    
    private String gameName;


    @ManyToMany(mappedBy = "games")
    @JsonIgnoreProperties("games")
    private List<GameLibrary> gameLibrary;



    // @ManyToMany(mappedBy = "games")
    // @JsonIgnoreProperties("games")
    // private List<GameLibrary> gameLibrary;


    public Game() {
    }

    public Game(Long gameId, String gameName, List<GameLibrary> gameLibrary ) {
        this.gameId = gameId;
        this.gameName = gameName; 
        this.gameLibrary = gameLibrary;
    }

     public Game( String gameName, List<GameLibrary> gameLibrary) {
        this.gameName = gameName;
        this.gameLibrary = gameLibrary;
    }



    public Game( String gameName) {
        this.gameName = gameName; 
        
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public List<GameLibrary> getGameLibrary () {
        return gameLibrary;
    }

    public void setGameLibrary(List<GameLibrary> gameLibrary) {
        this.gameLibrary = gameLibrary;
    }
              

}


// @ManyToOne()
//     @JoinColumn(name = "gameLibrary_id")
//     @JsonIgnoreProperties("games")
//     private GameLibrary gameLibrary;
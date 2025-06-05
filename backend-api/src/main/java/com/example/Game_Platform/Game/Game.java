package com.example.Game_Platform.Game;

import com.example.Game_Platform.GameLibrary.GameLibrary;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "games")
public class Game {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameId;
    
    private String gameName;

    @ManyToOne()
    @JoinColumn(name = "gameLibrary_id")
    @JsonIgnoreProperties("games")
    private GameLibrary gameLibrary;

    public Game() {
    }

    public Game(Long gameId, String gameName, GameLibrary gameLibrary ) {
        this.gameId = gameId;
        this.gameName = gameName; 
        this.gameLibrary = gameLibrary;
    }

     public Game( String gameName, GameLibrary gameLibrary) {
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

    public GameLibrary getGameLibrary () {
        return gameLibrary;
    }

    public void setGameLibrary(GameLibrary gameLibrary) {
        this.gameLibrary = gameLibrary;
    }
              

}

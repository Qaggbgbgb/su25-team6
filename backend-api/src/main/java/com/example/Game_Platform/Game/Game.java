package com.example.Game_Platform.Game;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "games")
public class Game {
    
    @Id
    private Long gameId;
    private String gameName;
    private String gameGenre;

    public Game() {
    }
    public Game(Long gameId, String gameName, String gameGenre) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameGenre = gameGenre; 
    }

     public Game( String gameName, String gameGenre) {
        this.gameName = gameName;
        this.gameGenre = gameGenre; 
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

    public String getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(String gameGenre) {
        this.gameGenre = gameGenre;
    }
              

}

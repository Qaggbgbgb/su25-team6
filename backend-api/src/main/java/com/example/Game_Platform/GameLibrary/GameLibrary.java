package com.example.Game_Platform.GameLibrary;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.example.Game_Platform.Game.Game;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "game_library")
public class GameLibrary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameLibId;
    private ArrayList<Game> games =  new ArrayList<>();
    private String username;
    
    public GameLibrary() {
    }

    public GameLibrary(Long gameLibId, ArrayList<Game> games, String username) {
        this.gameLibId = gameLibId;
        this.games = games;
        this.username = username;
    }

     public GameLibrary( ArrayList<Game> games, String username) {
        this.games = games;
        this.username = username;
    }
    public Long getGameLibId() {
        return gameLibId;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}

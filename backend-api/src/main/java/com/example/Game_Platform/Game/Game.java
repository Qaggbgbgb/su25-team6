package com.example.Game_Platform.Game;

import java.util.List;

import com.example.Game_Platform.GameLibrary.GameLibrary;
//Commented out becuase GameStore is not ready
// import com.example.Game_Platform.GameStore.GameStore;
// import com.example.Game_Platform.GameStore.GameStore;
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
    private String profilePicturePath;

    
    private String gameName;


    @ManyToMany(mappedBy = "games")
    @JsonIgnoreProperties("games")
    private List<GameLibrary> gameLibrary;

    // @ManyToOne
    // @JoinColumn(name = "storeId", nullable = false)
    // @JsonIgnoreProperties("games")
    // private GameStore gameStore;



    public Game() {
    }

    // GameStore gameStore, Game Store 
     public Game(Long gameId, String gameName, List<GameLibrary> gameLibrary, String profilePicturePath) {
        this.gameId = gameId;
        this.gameName = gameName; 
        this.gameLibrary = gameLibrary;
        this.profilePicturePath = profilePicturePath;
    }

    /*
     * //This method is commented out because it includes
     * GameStore whiched has been commented out Also the other
     * method below is simply a duplicate method.
     */

    // public Game(Long gameId, String gameName, GameStore gameStore, String profilePicturePath) {
    //     this.gameId = gameId;
    //     this.gameName = gameName; 
    //     this.gameStore = gameStore;
    //     this.profilePicturePath = profilePicturePath;
    // }
    // public Game(Long gameId, String gameName, List<GameLibrary> gameLibrary, String profilePicturePath) {
    //     this.gameId = gameId;
    //     this.gameName = gameName; 
    //     this.gameLibrary = gameLibrary;
    //     this.profilePicturePath = profilePicturePath;
    // }

     public Game( String gameName, List<GameLibrary> gameLibrary, String profilePicturePath) {
        this.gameName = gameName;
        this.gameLibrary = gameLibrary;
        this.profilePicturePath = profilePicturePath;
    }

    // public Game( String gameName, GameStore gameStore, String profilePicturePath) {
    //     this.gameName = gameName;
    //     this.gameStore = gameStore;
    //     this.profilePicturePath = profilePicturePath;
    // }

    public Game( String gameName, Long gameId, String profilePicturePath) {
        this.gameName = gameName;
        this.gameId = gameId;
        this.profilePicturePath = profilePicturePath;
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
     
    public String getProfilePicturePath() {
        return profilePicturePath;
    }

    public void setProfilePicturePath(String profilePicturePath) {
        this.profilePicturePath = profilePicturePath;
    }

    // public GameStore getGameStore(){
    //     return this.gameStore;
    // }
    
    // public void setGameStore(GameStore gameStore){
    //     this.gameStore=gameStore;
    // }
   

}



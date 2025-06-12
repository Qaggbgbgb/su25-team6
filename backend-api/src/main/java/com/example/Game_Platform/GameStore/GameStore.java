// package com.example.Game_Platform.GameStore;


    


// import java.util.List;

// import com.example.Game_Platform.Developer.Developer;
// import com.example.Game_Platform.Game.Game;
// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.Table;

@Entity
@Table(name = "gameStore")
public class GameStore {

 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;


@OneToMany(mappedBy = "gameStore")
    
    @JsonIgnoreProperties("gameStore")
    private List<Game> games;
@OneToMany(mappedBy = "gameStore")    
 @JsonIgnoreProperties("gameStore")   
    private List<Developer> developer;

// public GameStore(){

}
public GameStore(List<Game> games,List<Developer> developer)
{
    this.games=games;
    this.developer=developer;
    
}
public GameStore(Long storeId, List<Game> games,List<Developer> developer)
{
    this.games=games;
    this.developer=developer;
    this.storeId=storeId;
}

// public List<Game> getGames(){
//     return this.games;
// }

public List<Developer> getDeveloper(){
    return this.developer;
}

// public void setGames(List<Game> games){
//     this.games=games;
// }

public void setDeveloper(List<Developer> developer){
    this.developer=developer;

// }

public Long getId(){
    return this.storeId;
}

public void setStoreId(Long storeId){
    this.storeId=storeId;
}


// }

package com.example.Game_Platform.GameStore;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Game_Platform.Developer.Developer;

@Repository
public interface GameStoreRepository extends JpaRepository<GameStore, Long> {
    List<GameStore> getGameStoreByDeveloper(List<Developer> developer);


}

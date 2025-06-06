package com.example.Game_Platform.Game;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Game_Platform.GameStore.GameStore;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
    
    List<Game> getGameByGameName(String name);

    @Query(value = "select * from games c where c.game_library_id = ?1", nativeQuery = true)
    List<Game> getGamesByGameLibraryId(Long gameLibraryId);

    @Query(value = "select * from gameStores r where r.storeId= ?1", nativeQuery = true)
    List<Game> getGamesByStoreId(Long storeId);
}

package com.example.Game_Platform.GameStore;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Game_Platform.Developer.Developer;

@Repository
public interface GameStoreRepository extends JpaRepository<GameStore, Long> {
    @Query(value = "select * from games c where c.developer_id = ?1", nativeQuery = true)
    GameStore getGameStoreByDeveloperId(Long developer_id);


}

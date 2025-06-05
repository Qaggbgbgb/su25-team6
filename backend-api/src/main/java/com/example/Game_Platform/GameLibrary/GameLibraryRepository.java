package com.example.Game_Platform.GameLibrary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameLibraryRepository extends JpaRepository<GameLibrary, Long> {
    
    
    List<GameLibrary> findByUserName(String userName);
}

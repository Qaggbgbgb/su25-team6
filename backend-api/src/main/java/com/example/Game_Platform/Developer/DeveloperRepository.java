package com.example.Game_Platform.Developer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long>{


@Query(value = "select * from Developers s where s.name like %?1% ", nativeQuery = true)
    List<Developer> getDevelopersByUsername(String username);


@Query(value = "select * from gameStores r where r.storeId= ?1", nativeQuery = true)
    List<Developer> getDevelopersByStoreId(Long storeId);
}



// package com.example.Game_Platform.Developer;

import java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Game_Platform.Game.Game;

@Service
public class DeveloperService {
    @Autowired
    private DeveloperRepository developerRepository;

public Object getAllDevelopers() {
    return developerRepository.findAll();
  }

public Developer getDeveloperById(@PathVariable long developer_id) {
    return developerRepository.findById(developer_id).orElse(null);
  }

public Object getDevelopersByUsername(String username) {
    return developerRepository.getDevelopersByUsername(username);
  }

public Developer addDeveloper(Developer developer) {
    return developerRepository.save(developer);
  }

public Developer updateDeveloper(Long developer_id,Developer developer) {
    return developerRepository.save(developer);
  }

public void deleteDeveloper(Long developer_id) {
    developerRepository.deleteById(developer_id);
  }

public List<Developer> getDevelopersByStoreId(Long storeId){
        return developerRepository.getDevelopersByStoreId(storeId);
    }

}

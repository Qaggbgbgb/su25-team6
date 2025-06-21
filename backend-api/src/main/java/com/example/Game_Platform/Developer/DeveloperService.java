package com.example.Game_Platform.Developer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;



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

public Developer getDeveloperByUsername(String username) {
    return developerRepository.getDeveloperByUsername(username);
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

public Developer getDeveloperByStoreId(Long storeId){
        return developerRepository.getDeveloperByStoreId(storeId);
    }

}

package com.example.Game_Platform.ChatCommunity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatCommunityRepository extends JpaRepository<ChatCommunity, Long> {
    List<ChatCommunity> getChatCommunityByUserName(String userName);
    
    List<ChatCommunity> getChatCommunitiesByInput(String input);

}

package com.example.Game_Platform.ChatCommunity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ChatCommunityService {
   
    @Autowired
    private ChatCommunityRepository chatRepository;

    /**
     * Get all chats
     * @return
     */
    public Object getAllChats() {
        return chatRepository.findAll();
    }
    

    /**
     * Find chat by Id
     * 
     * @param chatId
     * @return 
     */
    public ChatCommunity getChatById(@PathVariable long chatId) {
        return chatRepository.findById(chatId).orElse(null);
    }

    
    /**
     * Add chat
     * 
     * @param communityChat
     */
    public ChatCommunity addChatCommunity(ChatCommunity chatCommunity) {
        return chatRepository.save(chatCommunity);
    }

    /**
     * Update Chat
     * @param chatId
     * @param communityChat
     */
    public ChatCommunity updateChat(Long chatId, ChatCommunity chatCommunity) {
        return chatRepository.save(chatCommunity);
    }

    /**
     * Delete Chat
     * @param chatId
     */
    public void deleteChatbyId(Long chatId) {
        chatRepository.deleteById(chatId);
    }
    
}

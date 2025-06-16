package com.example.Game_Platform.ChatCommunity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class ChatCommunityController {
    
    @Autowired
    private ChatCommunityService chatCommunityService;

    /**
     * Get all chats
     * @return
     */
    @GetMapping("/chat")
    public Object getAllChats() {
       return chatCommunityService.getAllChats();
    }

    /**
     * Get chat by id
     * @param chatId
     * @return
     */
    @GetMapping("/chat/{chatId}")
    public ChatCommunity getChatById(@PathVariable long chatId){
        return chatCommunityService.getChatById(chatId);
    }
    
    /**
     * Add chat
     * @param chatCommunity
     * @return
     */
    @PostMapping("/chat")
    public Object addChat(@RequestBody ChatCommunity chatCommunity) {
        return chatCommunityService.addChatCommunity(chatCommunity);
    }


    /**
     * Update chatCommunity
     * @param chatId
     * @param chatCommunity
     * 
     */
    @PutMapping("/chat/{chatId}")
    public ChatCommunity updateChat(@PathVariable Long chatId, @RequestBody ChatCommunity chatCommunity) {
        chatCommunityService.updateChat(chatId, chatCommunity);
        return chatCommunityService.getChatById(chatId);
    }

    /**
     * Delete chat
     * @param chatId
     * 
     */
    @DeleteMapping("/chat/{chatId}")
    public void deleteChat(@PathVariable Long chatId) {
        chatCommunityService.deleteChatbyId(chatId);
    }
    

}

package com.example.Game_Platform.ChatCommunity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.Game_Platform.Game.GameService;

import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@Controller
public class ChatCommunityController {
    
    @Autowired
    private GameService gameService;

    @Autowired
    private ChatCommunityService chatCommunityService;

    @Autowired
    private ChatCommunityRepository chatRepo;
    /**
     * Get all chats
     * @return
     */
    @GetMapping("customer/chat")
    public Object getAllChats(Model model) {
        model.addAttribute("chat", chatCommunityService.getChatById(1));
       return "customer-home";
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
    @PostMapping("/chat/update")
    public String updateChat(@ModelAttribute ChatCommunity chatCommunity, Model model) {
        
        Long one = 2L;
        ChatCommunity chat = chatCommunityService.getChatById(one);
       
        String updateChat = chat.getInput() + "\n" + chatCommunity.getInput();
        chat.setInput(updateChat);

        chatCommunityService.updateChat(one, chat);
        model.addAttribute("gamesList", gameService.getAllGames());
        model.addAttribute("allChats", updateChat);
        return "customer-home";
    }

   @GetMapping("/chat")
    public String showChatPage(Model model) {
    Long chatId = 2L;
    ChatCommunity chat = chatCommunityService.getChatById(chatId);

    model.addAttribute("allChats", chat.getInput()); 
    return "customer-home";
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

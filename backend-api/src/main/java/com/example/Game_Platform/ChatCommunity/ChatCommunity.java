package com.example.Game_Platform.ChatCommunity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "chat_community")
public class ChatCommunity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatId;
    private String userName;

    @Column(length = 5000)
    private String input;

    public ChatCommunity() {
    }

    public ChatCommunity(Long chatId, String userName, String input) {
        this.chatId = chatId;
        this.userName = userName;
        this.input = input;
    }

    public ChatCommunity(String userName, String input) {
        this.userName = userName;
        this.input = input;
    }


    public ChatCommunity(String input) {
        this.input = input;
    }

    public Long getChatId() {
        return this.chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getInput() {
        return this.input;
    }

    public void setInput(String input) {
        this.input = input;
    }

}

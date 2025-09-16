package com.chat.app.controller;


import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Controller
public class ChatController {

    private final Set<String> activeUsers = ConcurrentHashMap.newKeySet();

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message){
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        message.setTimestamp(timestamp);
        return message;
    }

    @MessageMapping("/join")
    @SendTo("/topic/users")
    public Set<String> userJoined(ChatMessage message) {
        activeUsers.add(message.getSender());  // Add user to active list
        return activeUsers;  // Send updated list
    }

    @MessageMapping("/leave")
    @SendTo("/topic/users")
    public Set<String> userLeft(ChatMessage message) {
        activeUsers.remove(message.getSender()); // Remove user
        return activeUsers;  // Send updated list
    }

    @GetMapping("chat")
    public String chat(){
        return "chat";
    }
}

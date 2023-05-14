package com.rean.controller;

import com.rean.data.request.ChatUserRequest;
import com.rean.data.response.ChatGptResponse;
import com.rean.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;


    @PostMapping("chat")
    public ChatGptResponse sendMessage(@RequestBody ChatUserRequest userRequest) {
        return chatService.inputText(userRequest);
    }

}

package com.rean.service;


import com.rean.data.request.ChatGptRequest;
import com.rean.data.request.ChatUserRequest;
import com.rean.data.response.ChatGptResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class ChatService {


    private final RestTemplate restTemplate;


    @Value("${chatgpt.api.key}")
    private String chatGptAPIKey;
    @Value("${chatgpt.url}")
    private String chatGptUrl;
    @Value("${chatgpt.model}")
    private String chatGptModel;


    public ChatGptResponse inputText(ChatUserRequest request){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + chatGptAPIKey);

        ChatGptRequest gptRequest = new ChatGptRequest(
                chatGptModel,
                request.message(),
                2048,
                0.1,
                1.0
        );

        HttpEntity<Object> httpEntity = new HttpEntity<>(gptRequest, headers);

       ResponseEntity<ChatGptResponse> responseEntity = restTemplate.exchange(chatGptUrl,
                HttpMethod.POST, httpEntity, ChatGptResponse.class);

       return responseEntity.getBody();
    }

}

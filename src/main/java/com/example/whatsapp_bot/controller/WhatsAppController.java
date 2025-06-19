package com.example.whatsapp_bot.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;

@RestController
public class WhatsAppController {

    private final String phoneNumberId = "your_phone_number_id";
    private final String accessToken = "your_access_token_here";


    @GetMapping("/send-message")
    public String sendMessage() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = "https://graph.facebook.com/v17.0/" + phoneNumberId + "/messages";

            HttpHeaders headers = new HttpHeaders();
            headers.setBearerAuth(accessToken);
            headers.setContentType(MediaType.APPLICATION_JSON);

            JSONObject message = new JSONObject();
            message.put("messaging_product", "whatsapp");
            message.put("to", "919325521032"); // Your number
            message.put("type", "template");

            JSONObject template = new JSONObject();
            template.put("name", "hello_world");

            JSONObject language = new JSONObject();
            language.put("code", "en_US");
            template.put("language", language);

            message.put("template", template);

            HttpEntity<String> request = new HttpEntity<>(message.toString(), headers);
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            return response.getBody();

        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to send message: " + e.getMessage();
        }
    }
}

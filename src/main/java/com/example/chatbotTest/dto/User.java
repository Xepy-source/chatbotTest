package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {
    private String id;
    private String type;
    private Properties properties;
}

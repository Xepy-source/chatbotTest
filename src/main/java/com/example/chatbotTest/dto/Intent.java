package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Intent {
    private String id;
    private String name;
    private Extra extra;
}

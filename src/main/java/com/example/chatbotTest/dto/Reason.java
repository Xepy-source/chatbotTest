package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Reason {
    private int code;
    private String message;
}

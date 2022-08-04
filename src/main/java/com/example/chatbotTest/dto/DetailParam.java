package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DetailParam {
    private String origin;
    private Object value;
    private String groupName;
}

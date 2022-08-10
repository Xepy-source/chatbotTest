package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class DetailParam {
    private String origin;
    private Object value;
    private String groupName;
}

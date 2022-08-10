package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@Getter
@Builder
@ToString
public class ResponseDto {
    private String version;
    private SkillTemplate template;
    private Context context;
    private Map<String, Object> data;
}

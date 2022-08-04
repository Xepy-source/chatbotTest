package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
@Builder
public class ResponseDto {
    private String version;
    private SkillTemplate template;
    private Context context;
    private Map<String, Object> data;
}

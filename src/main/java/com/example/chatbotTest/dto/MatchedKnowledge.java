package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MatchedKnowledge {
    private String[] categories;
    private String question;
    private String answer;
    private String imageUrl;
    private String landingUrl;
}

package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class MatchedKnowledge {
    private String[] categories;
    private String question;
    private String answer;
    private String imageUrl;
    private String landingUrl;
}

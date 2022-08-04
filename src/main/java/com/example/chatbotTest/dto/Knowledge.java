package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Knowledge {
    private String responseType;
    private MatchedKnowledge[] matchedKnowledges;
}

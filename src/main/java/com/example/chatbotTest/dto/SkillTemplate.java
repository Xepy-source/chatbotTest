package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SkillTemplate {
    // 1개 이상 3개 이하
    private Component[] outputs;

    // 10개 이하
    private QuickReply[] quickReplies;
}

package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Map;

@Getter
@Builder
@ToString
public class SkillTemplate {
    private ArrayList<Map<String, Object>> outputs;

    // 1개 이상 3개 이하
//    private Component[] outputs;

    // 10개 이하
    private QuickReply[] quickReplies;
}

package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
@Builder
public class ContextValue {
    // 수정하려는 output 컨텍스트의 이름
    private String name;

    // 수정하려는 ouptut 컨텍스트의 lifeSpan
    private int lifeSpan;

    // output 컨텍스트에 저장하는 추가 데이터
    private Map<String, String> params;
}

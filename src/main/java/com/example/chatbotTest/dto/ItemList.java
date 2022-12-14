package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class ItemList {
    // 아이템 제목 정보입니다.
    private String title;

    // 아이템 설명 정보입니다.
    private String description;
}

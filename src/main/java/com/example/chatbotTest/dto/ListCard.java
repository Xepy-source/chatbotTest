package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString 
public class ListCard {
    // 카드의 상단 항목
    private Object header;
    
    // 카드의 각각 아이템 최대 5개
    private ListItem[] items;
    
    // 최대 2개
    private Button[] buttons;
}

package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class BasicCard {
    // 카드의 제목입니다. 최대 2줄
    private String title;

    // 카드에 대한 상세 설명입니다.  최대 230자
    private String description;

    // 카드의 상단 이미지입니다.
    private Thumbnail thumbnail;

    // 카드의 프로필 정보입니다.
//    private Profile profile;

    // 카드의 소셜 정보입니다.
//    private Social social;
    
    // 카드의 버튼들을 포함합니다. 최대 3개
    private Button[] buttons;
}

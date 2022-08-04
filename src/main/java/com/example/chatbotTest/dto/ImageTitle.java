package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ImageTitle {
    // 이미지타이틀의 제목 정보입니다.
    private String title;

    // 이미지타이틀의 설명 정보입니다.
    private String description;

    // 최적이미지 사이즈 iOS 108 x 108, 안드로이드 98 x 98 (맞지 않는 경우 센터크롭됨)
    // 이미지타이틀의 이미지 URL입니다.
    private String imageUrl;
}

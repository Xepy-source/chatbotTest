package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class ImageProfile {
    // 프로필 이미지 정보입니다.
    private String imageUrl;

    // 1:1 비율에 맞게 입력 필요
    // 실제 이미지 사이즈와 다른 값일 경우 원본 이미지와 다르게 표현될 수 있음
    // 프로필 이미지의 넓이이 정보니다.
    private int width;

    // 프로필 이미지의 높이 정보입니다.
    private int height;

    // 프로필 타이틀 정보입니다.
    private String title;
}

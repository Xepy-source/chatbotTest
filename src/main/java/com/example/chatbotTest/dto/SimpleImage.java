package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SimpleImage {

    // 전달하고자 하는 이미지의 url입니다
    private String imageUrl;

    // url이 유효하지 않은 경우, 전달되는 텍스트입니다
    private String altText;
}

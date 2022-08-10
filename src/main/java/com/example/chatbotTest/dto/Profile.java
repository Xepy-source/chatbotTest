package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Profile {
    // 프로필 이름
    private String nickname;
    
    // 프로필 이미지
    private String imageUrl;
}

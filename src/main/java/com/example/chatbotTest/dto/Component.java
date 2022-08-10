package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Component {
    // 간단 텍스트
    private String simpleText;
    
    // 간단 이미지
    private SimpleImage simpleImage;
    
    // 기본 카드
    private BasicCard basicCard;
    
    // 커머스 카드
    private CommerceCard commerceCard;
    
    // 리스트 카드
    private ListCard listCard;
    
    // 아이템 카드
    private ItemCard itemCard;

    // 기본 카드 케로셀
    private BasicCardCarousel basicCardCarousel;

    // 리스트 카드 케로셀
    private ListCardCarousel listCardCarousel;
}

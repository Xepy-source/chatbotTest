package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class CommerceCard {
    // 제품에 대한 상세 설명입니다.
    private String description;

    // 제품의 가격입니다.
    private int price;

    // 제품의 가격에 대한 통화입니다. 현재 won만 가능
    private String currency;

    // 제품의 가격에 대한 할인할 금액입니다.
    private int discount;

    // 제품의 가격에 대한 할인율입니다.
    private int discountRate;

    // 제품의 가격에 대한 할인가(할인된 가격)입니다.
    private int discountedPrice;

    // 제품에 대한 사진입니다. 현재 1개만 가능
    private Thumbnail[] thumbnails;

    // 제품을 판매하는 프로필 정보입니다.
    private Profile profile;

    // 다양한 액션을 수행할 수 있는 버튼입니다. 1개 이상, 3개 이하
    private Button[] buttons;
}

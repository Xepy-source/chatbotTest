package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class ItemListSummary {
    // 아이템리스트 전체에 대한 제목 정보입니다.
    private String title;

    // 최대 14자 (통화기호/문자, 숫자, 콤마, 소수점, 띄어쓰기 포함)
    // 문자는 통화 문자만 사용 가능
    // 소수점 두자리까지 사용 가능
    // 아이템리스트 전체에 대한 설명 정보입니다.
    private String description;
}

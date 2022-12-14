package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@Getter
@Builder
@ToString
public class Action {
    // 스킬의 고유한 식별자입니다.
    private String id;

    // 설정된 스킬의 이름입니다.
    private String name;

    // 사용자의 발화로부터 추출한 파라미터 정보입니다.
    // 엔티티의 이름을 키로, 추출한 정보를 상세 값으로 가집니다.
    private Map<String, String> params;

    // 사용자의 발화로부터 추출한 엔티티의 상세 정보입니다.
    // params 필드와 유사하지만, params에서 제공하지 않은 추가적인 정보들을 제공합니다.
    private Map<String, DetailParam> detailParams;

    // 사용자의 발화가 추가적인 정보를 제공하는 경우가 있습니다 (예. 바로가기 응답)
    // 그 값들이 clientExtra 필드를 통해서 스킬 서버에 전달됩니다.
    private Map<String, Object> clientExtra;
}

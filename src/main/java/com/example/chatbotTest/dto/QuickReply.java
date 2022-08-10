package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class QuickReply {
    // 사용자에게 노출 될 바로가기 응답의 표시
    private String label;

    // webLink: 웹 브라우저를 열고 webLinkUrl 의 주소로 이동합니다.
    // message: 사용자의 발화로 messageText를 실행합니다. (바로가기 응답의 메세지 연결 기능과 동일)
    // phone: phoneNumber에 있는 번호로 전화를 겁니다.
    // block: blockId를 갖는 블록을 호출합니다. (바로가기 응답의 블록 연결 기능과 동일)
    // messageText가 있다면, 해당 messageText가 사용자의 발화로 나가게 됩니다.
    // messageText가 없다면, button의 label이 사용자의 발화로 나가게 됩니다.
    // share: 말풍선을 다른 유저에게 공유합니다. share action은 특히 케로셀을 공유해야 하는 경우 유용합니다.
    // operator (베타): 상담직원 연결 기능을 제공합니다. (https://i.kakao.com/docs/key-concepts-plugin#%ED%8C%8C%EB%9D%BC%EB%AF%B8%ED%84%B0-%EC%84%A4%EC%A0%95-%ED%94%8C%EB%9F%AC%EA%B7%B8%EC%9D%B8)
    // message or block 사용
    private String action;

    // 사용자 측으로 노출될 발화
    private String messageText;

    // 바로가기 응답이 '블록 연결' 기능일 때, 연결될 블록의 id
    // action이 block 일때 필수값
    private String blockId;

    // 블록을 호출 시 추가적으로 제공하는 정보
    private Object extra;
}

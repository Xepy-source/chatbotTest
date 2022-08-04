package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
@Builder
public class Button {
    // 버튼에 적히는 문구
    private String label;

    // 버튼 클릭시 수행 될 작업
    private String action;

    // 웹 이동 url
    private String webLinkUrl;

    // message : 사용자의 발화로 messageText를 내보냅니다. (바로가기 응답의 메세지 연결 기능과 동일)
    // block : 블록 연결시 사용자의 발화로 노출됩니다.
    private String messageText;

    // phoneNumber에 있는 번호로 전화를 겁니다.
    private String phoneNumber;

    // blockId를 갖는 블록을 호출합니다. (바로가기 응답의 블록 연결 기능과 동일)
    private String blockId;

    // block이나 message action으로 블록 호출시, 스킬 서버에 추가적으로 제공하는 정보
    private Map<String, Object> extra;
}

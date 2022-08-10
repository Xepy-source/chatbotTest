package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@Getter
@Builder
@ToString
public class ListItem {
    // header에 들어가는 경우, listCard의 제목이 됩니다.
    // items에 들어가는 경우, 해당 항목의 제목이 됩니다.
    private String title;

    // header에 들어가는 경우, 아무런 작동을 하지 않습니다.
    // items에 들어가는 경우, 해당 항목의 설명이 됩니다.
    private String description;

    // items에 들어가는 경우, 해당 항목의 우측 안내 사진이 됩니다.
    private String imageUrl;

    // 클릭시 작동하는 링크입니다.
    private Link link;

    // 클릭시 수행될 작업입니다.
    // action 종류: block or message
    private String action;

    // blockId를 갖는 블록을 호출합니다. (바로가기 응답의 블록 연결 기능과 동일)
    // items의 title이 사용자의 발화로 나가게 됩니다.
    private String blockId;

    // 사용자의 발화로 messageText를 내보냅니다. (바로가기 응답의 메세지 연결 기능과 동일)
    private String messageText;

    // block이나 message action으로 블록 호출시, 스킬 서버에 추가적으로 제공하는 정보
    private Map<String, Object> extra;
}

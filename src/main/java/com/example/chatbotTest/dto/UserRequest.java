package com.example.chatbotTest.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UserRequest {
    // 사용자의 시간대를 반환합니다.한국에서 보낸 요청이라면 “Asia/Seoul”를 갖습니다.
    private String timezone;

    // 사용자의 발화에 반응한 블록의 정보입니다.
    // 블록의 id와 name을 포함합니다.
    private Block block;

    // 봇 시스템에 전달된 사용자의 발화입니다.
    private String utterance;

    // 사용자의 언어를 반환합니다.
    // 한국에서 보낸 요청이라면 “kr”를 갖습니다.
    private String lang;

    // 사용자의 정보입니다.
    private User user;
}

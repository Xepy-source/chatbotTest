package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Link {
    // 링크 우선순위
    // pc: pc < web
    // 모바일: mobile < web

    // pc의 웹을 실행하는 link입니다.
    private String pc;

    // mobile의 웹을 실행하는 link입니다.
    private String mobile;

    // 모든 기기에서 웹을 실행하는 link입니다.
    private String web;
}

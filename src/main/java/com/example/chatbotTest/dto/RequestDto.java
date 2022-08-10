package com.example.chatbotTest.dto;

import lombok.Getter;
import lombok.ToString;
@Getter
@ToString
public class RequestDto {
    private Bot bot;
    private Intent intent;
    private Action action;
    private UserRequest userRequest;
//    private Context contexts;
}

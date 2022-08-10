package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Properties {
    private String plusfriendUserKey;
    private String appUserId;
    private boolean isFriend;
}

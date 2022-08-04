package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Properties {
    private String plusfriendUserKey;
    private String appUserId;
    private boolean isFriend;
}

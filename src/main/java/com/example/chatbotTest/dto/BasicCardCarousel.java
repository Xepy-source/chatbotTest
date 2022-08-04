package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BasicCardCarousel {
    private String type;
    private CarouselHeader header;
    private BasicCard[] items;
    private QuickReply[] quickReplies;
}

package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ListCardCarousel {
    private String type;
    private CarouselHeader header;
    private ListCard[] items;
    private QuickReply[] quickReplies;
}

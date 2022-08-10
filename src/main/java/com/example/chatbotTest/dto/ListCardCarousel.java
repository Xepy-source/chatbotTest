package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class ListCardCarousel {
    private String type;
    private CarouselHeader header;
    private ListCard[] items;
    private QuickReply[] quickReplies;
}

package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class CarouselHeader {
    private String title;
    private String description;
    private Thumbnail thumbnail;
}

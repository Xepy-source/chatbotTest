package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CarouselHeader {
    private String title;
    private String description;
    private Thumbnail thumbnail;
}

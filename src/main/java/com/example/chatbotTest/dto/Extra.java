package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Extra {
    private Reason reason;
    private Knowledge knowledge;
}

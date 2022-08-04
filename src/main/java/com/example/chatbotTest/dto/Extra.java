package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Extra {
    private Reason reason;
    private Knowledge knowledge;
}

package com.example.chatbotTest.controller.api;

import com.example.chatbotTest.Process.MessageProcess;
import com.example.chatbotTest.dto.RequestDto;
import com.example.chatbotTest.dto.ResponseDto;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v2")
@RestController
public class ChatBotApiController {

    private final MessageProcess messageProcess = new MessageProcess();

    @PostMapping("/message")
    public ResponseDto message(@RequestBody RequestDto dto) {
        System.out.println("----------------RequestJSON----------------");
        System.out.println(dto.toString());
        return messageProcess.messageProcess(dto);
    }
}

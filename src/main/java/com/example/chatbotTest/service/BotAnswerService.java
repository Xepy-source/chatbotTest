//package com.example.chatbotTest.service;
//
//import com.example.chatbotTest.model.BotAnswer;
//import com.example.chatbotTest.repository.BotAnswerRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@RequiredArgsConstructor
//@Service
//public class BotAnswerService {
//    private final BotAnswerRepository botAnswerRepository;
//
//    public BotAnswer findBotAnswer(String utterance) {
//        return botAnswerRepository.findBotAnswerByUtterance(utterance).orElse(null);
//    }
//}

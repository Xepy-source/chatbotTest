package com.example.chatbotTest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BotAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long answerId;

    @Column(columnDefinition = "TEXT")
    private String utterance;

    // 1 : SimpleText
    // 2 : SimpleImage
    // 3 : BasicCard
    // 4 : CommerceCard
    // 5 : ListCard
    // 6 : ItemCard
    // 7 : BasicCardCarousel
    // 8 : ListCardCarousel
    @Column
    private int classification;
}
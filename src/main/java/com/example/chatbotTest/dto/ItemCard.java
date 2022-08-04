package com.example.chatbotTest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ItemCard {
    // 상단 이미지입니다.
    // 단일형: 이미지 비율 2:1 (800*400), 1:1 (800*800)사용 가능
    // 케로셀형: 이미지 비율 2:1 (800*400)만 사용 가능
    private Thumbnail thumbnail;

    // head와 profile 두 필드를 동시에 노출할 수 없음
    // 케로셀형: 카드별로 head와 profile을 섞어서 사용할 수 없음
    private Head head;
    private ImageProfile profile;

    // 이미지 우측 정렬 고정 (위치 변경 불가)
    // 이미지를 동반하는 제목 및 설명 정보입니다.
    private ImageTitle imageTitle;

    // 좌측 정렬 디폴트
    // 단일형: 최대 10개까지 사용 가능
    // 케로셀형: 최대 5개까지 사용 가능
    private ItemList[] itemList;

    // itemList 및 itemListAlignment 정렬 정보입니다.
    // "left" 혹은 "right"만 입력 가능
    private String itemListAlignment;

    // 아이템 가격 정보입니다.
    // itemListSummary 사용 시 itemListAlignment 우측 정렬을 권장
    private ItemListSummary itemListSummary;

    // title과 description 합쳐서 글자수 제한
    // 단일형: 최대 200자&12줄
    // 케로셀형: 최대 100자&12줄
    // description을 넣는 경우, title이 필수 항목
    private String title;
    private String description;

    // 단일형: 최대 3개까지 사용 가능
    // 케로셀형: 최대 2개까지 사용 가능
    private Button[] buttons;

    // "vertical" (세로배치) 혹은 "horizontal" (가로배치) 만 입력 가능
    // 단일형만 buttonLayout 설정 가능, 케로셀형은 가로배치 고정
    // 단일형에서 별도 지정하지 않는 경우 버튼 개수에 따라 배치모양이 결정됨
    // 2개 이하: 가로배치
    // 3개: 세로 배치
    // "horizontal"이면서 버튼이 3개인 경우, 모든 버튼이 미노출됨
    private String buttonLayout;
}

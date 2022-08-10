package com.example.chatbotTest.Process;

import com.example.chatbotTest.dto.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MessageProcess {

    private final String kakaoApiVersion = "2.0";

    public ResponseDto messageProcess(RequestDto dto) {
        Bot bot = dto.getBot();
        Intent intent = dto.getIntent();
        Action action = dto.getAction();
        UserRequest userRequest = dto.getUserRequest();

        ResponseDto responseDto;
        if (userRequest != null) {
            String utterance = userRequest.getUtterance();
            QuickReply[] quickReplies;
            SkillTemplate skillTemplate;
            Button[] buttons;
            ArrayList<Map<String, Object>> outputs = new ArrayList<>();
            Map<String, Object> outputMap = new HashMap<>();
            switch (utterance) {
                case "테스트":
                    System.out.println("테스트 case");
                    outputMap.put("simpleText", "간단한 텍스트 요소입니다.");
                    outputs.add(outputMap);
                    skillTemplate = SkillTemplate.builder()
                            .outputs(outputs)
                            .build();
                    responseDto = ResponseDto.builder()
                            .version(kakaoApiVersion)
                            .template(skillTemplate)
                            .build();
                    break;
                case "보물상자":
                    System.out.println("보물상자 case");
                    SimpleImage simpleImage = SimpleImage.builder()
                            .imageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMu9biGYhNqEFFQlOqxMhlFcw7OKGfGqNo-g&usqp=CAU")
                            .altText("보물상자 이미지")
                            .build();
                    outputMap.put("simpleImage", simpleImage);
                    outputs.add(outputMap);
                    skillTemplate = SkillTemplate.builder()
                            .outputs(outputs)
                            .build();
                    responseDto = ResponseDto.builder()
                            .version(kakaoApiVersion)
                            .template(skillTemplate)
                            .build();
                    break;
                case "보물상자 카드":
                    System.out.println("보물상자 카드 case");
                    Button button1 = Button.builder()
                            .action("message")
                            .label("열어보기")
                            .messageText("짜잔! 우리가 찾던 보물입니다.")
                            .build();
                    Button button2 = Button.builder()
                            .action("webLink")
                            .label("구경하기")
                            .webLinkUrl("https://e.kakao.com/t/hello-ryan")
                            .build();
                    buttons = new Button[2];
                    buttons[0] = button1;
                    buttons[1] = button2;

                    BasicCard basicCard = BasicCard.builder()
                            .title("보물상자")
                            .description("보물 상자 안에는 뭐가 있을까")
                            .thumbnail(Thumbnail.builder().imageUrl("https://previews.123rf.com/images/takoyaki999/takoyaki9991308/takoyaki999130800113/21719442-%EB%B3%B4%EB%AC%BC-%EC%83%81%EC%9E%90.jpg").build())
                            .buttons(buttons)
                            .build();
                    outputMap.put("basicCard", basicCard);
                    outputs.add(outputMap);
                    skillTemplate = SkillTemplate.builder()
                            .outputs(outputs)
                            .build();
                    responseDto = ResponseDto.builder()
                            .version(kakaoApiVersion)
                            .template(skillTemplate)
                            .build();
                    break;
                case "커머스 카드":
                    System.out.println("커머스 카드 case");
                    Button buyButton = Button.builder()
                            .label("구매하기")
                            .action("webLink")
                            .webLinkUrl("https://store.kakaofriends.com/products/8709")
                            .build();
                    Button callButton = Button.builder()
                            .label("전화하기")
                            .action("phone")
                            .phoneNumber("010-1234-5678")
                            .build();
                    Button shareButton = Button.builder()
                            .label("공유하기")
                            .action("share")
                            .build();
                    buttons = new Button[3];
                    buttons[0] = buyButton;
                    buttons[1] = callButton;
                    buttons[2] = shareButton;

                    Thumbnail thumbnail = Thumbnail.builder()
                            .imageUrl("https://previews.123rf.com/images/takoyaki999/takoyaki9991308/takoyaki999130800113/21719442-%EB%B3%B4%EB%AC%BC-%EC%83%81%EC%9E%90.jpg")
                            .link(Link.builder().web("https://store.kakaofriends.com/products/8709").build())
                            .build();
                    Thumbnail[] thumbnails = new Thumbnail[1];
                    thumbnails[0] = thumbnail;
                    CommerceCard commerceCard = CommerceCard.builder()
                            .description("따끈따끈한 보물상자 팝니다.")
                            .price(10000)
                            .discount(1000)
                            .currency("won")
                            .thumbnails(thumbnails)
                            .profile(Profile.builder().imageUrl("https://img1.kakaocdn.net/thumb/R410x410.q82/?fname=https%3A%2F%2Ft1.kakaocdn.net%2Ffriends%2Fprod%2Fproduct%2F20220712152641588_8809814927020_8809814927020_AW_00.jpg").nickname("보물상자 팝니다").build())
                            .buttons(buttons)
                            .build();

                    outputMap.put("commerceCard", commerceCard);
                    outputs.add(outputMap);
                    skillTemplate = SkillTemplate.builder()
                            .outputs(outputs)
                            .build();
                    responseDto = ResponseDto.builder()
                            .version(kakaoApiVersion)
                            .template(skillTemplate)
                            .build();
                    break;
                case "리스트 카드":
                    System.out.println("리스트 카드 case");
                    Map<String, Object> buttonMap = new HashMap<>();
                    buttonMap.put("key1", "value1");
                    buttonMap.put("key2", "value2");
                    buttons = new Button[1];
                    Button viewButton = Button.builder()
                            .label("구경가기")
                            .action("block")
                            .blockId("62654c249ac8ed78441532de")
                            .extra(buttonMap)
                            .build();
                    buttons[0] = viewButton;
                    ListItem[] items = new ListItem[3];
                    ListItem item1 = ListItem.builder()
                            .title("챗봇 관리자센터")
                            .description("새로운 AI의 내일과 일상의 변화")
                            .imageUrl("http://k.kakaocdn.net/dn/APR96/btqqH7zLanY/kD5mIPX7TdD2NAxgP29cC0/1x1.jpg")
                            .link(Link.builder().web("https://namu.wiki/w/%EB%9D%BC%EC%9D%B4%EC%96%B8(%EC%B9%B4%EC%B9%B4%EC%98%A4%ED%94%84%EB%A0%8C%EC%A6%88)").build())
                            .build();
                    ListItem item2 = ListItem.builder()
                            .title("챗봇 관리자센터")
                            .description("카카오톡 채널 챗봇 만들기")
                            .imageUrl("http://k.kakaocdn.net/dn/N4Epz/btqqHCfF5II/a3kMRckYml1NLPEo7nqTmK/1x1.jpg")
                            .action("block")
                            .blockId("62654c249ac8ed78441532de")
                            .extra(buttonMap)
                            .build();
                    ListItem item3 = ListItem.builder()
                            .title("Kakao i Voice Service")
                            .description("보이스봇 / KVS 제휴 신청하기")
                            .imageUrl("http://k.kakaocdn.net/dn/bE8AKO/btqqFHI6vDQ/mWZGNbLIOlTv3oVF1gzXKK/1x1.jpg")
                            .action("message")
                            .messageText("Kakao i Voice Service")
                            .extra(buttonMap)
                            .build();
                    items[0] = item1;
                    items[1] = item2;
                    items[2] = item3;
                    ListCard listCard = ListCard.builder()
                            .header(ListItem.builder().title("챗봇 관리자센터를 소개합니다.").build())
                            .items(items)
                            .buttons(buttons)
                            .build();

                    outputMap.put("listCard", listCard);
                    outputs.add(outputMap);
                    skillTemplate = SkillTemplate.builder()
                            .outputs(outputs)
                            .build();
                    responseDto = ResponseDto.builder()
                            .version(kakaoApiVersion)
                            .template(skillTemplate)
                            .build();
                    break;
                case "비행기 표":
                    System.out.println("비행기 표 case");
                    ItemList[] itemLists = new ItemList[5];
                    itemLists[0] = ItemList.builder().title("Flight").description("KE0605").build();
                    itemLists[1] = ItemList.builder().title("Boards").description("8:50 AM").build();
                    itemLists[2] = ItemList.builder().title("Departs").description("9:50 AM").build();
                    itemLists[3] = ItemList.builder().title("Terminal").description("1").build();
                    itemLists[4] = ItemList.builder().title("Gate").description("C24").build();
                    buttons = new Button[1];
                    buttons[0] = Button.builder().label("View Boarding Pass").action("webLink").webLinkUrl("https://namu.wiki/w/%EB%A3%A8%EB%8B%A4").build();
                    ItemCard itemCard = ItemCard.builder()
                            .imageTitle(ImageTitle.builder().title("GWEILO").description("Boarding Number").build())
                            .title("")
                            .description("")
                            .thumbnail(Thumbnail.builder().imageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgac23YklNCCdw2gm3pveHXo8-nyBr8DsdsA&usqp=CAU")
                                    .width(800).height(800).build())
                            .profile(ImageProfile.builder().title("AA Airline").imageUrl("https://t1.kakaocdn.net/openbuilder/docs_image/aaairline.jpg").build())
                            .itemList(itemLists)
                            .itemListAlignment("right")
                            .itemListSummary(ItemListSummary.builder().title("Total").description("$4,032.54").build())
                            .buttons(buttons)
                            .buttonLayout("vertical")
                            .build();

                    outputMap.put("itemCard", itemCard);
                    outputs.add(outputMap);
                    skillTemplate = SkillTemplate.builder()
                            .outputs(outputs)
                            .build();
                    responseDto = ResponseDto.builder()
                            .version(kakaoApiVersion)
                            .template(skillTemplate)
                            .build();
                    break;
                case "커피 메뉴":
                    System.out.println("커피 메뉴 case");
                    Button[] buttons1 = new Button[1];
                    buttons1[0] = Button.builder().action("message").label("한 개 담기").messageText("장바구니에 담았습니다.").build();
                    BasicCard[] basicCarouselItems = new BasicCard[3];
                    basicCarouselItems[0] = BasicCard.builder()
                            .title("아메리카노")
                            .description("1,800원")
                            .thumbnail(Thumbnail.builder().imageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzrt9ZhO7zJKW7Ynk42YGKjdGuwFa6omeMJA&usqp=CAU").build())
                            .buttons(buttons1)
                            .build();
                    basicCarouselItems[1] = BasicCard.builder()
                            .title("카페라떼")
                            .description("2,000원")
                            .thumbnail(Thumbnail.builder().imageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTn3UEEVr1nuDi6YrKfHCFeYcmJBDotLHj0dw&usqp=CAU").build())
                            .buttons(buttons1)
                            .build();
                    basicCarouselItems[2] = BasicCard.builder()
                            .title("카페모카")
                            .description("2,500원")
                            .thumbnail(Thumbnail.builder().imageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRDdtG9Y24afUcMu_WrGiWBcwcGDwLkF1THA&usqp=CAU").build())
                            .buttons(buttons1)
                            .build();

                    BasicCardCarousel basicCardCarousel = BasicCardCarousel.builder()
                            .type("listCard")
                            .header(CarouselHeader.builder().title("케로셀 헤더").thumbnail(Thumbnail.builder().imageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4BJ9LU4Ikr_EvZLmijfcjzQKMRCJ2bO3A8SVKNuQ78zu2KOqM").build()).build())
                            .items(basicCarouselItems)
                            .build();

                    outputMap.put("basicCardCarousel", basicCardCarousel);
                    outputs.add(outputMap);
                    skillTemplate = SkillTemplate.builder()
                            .outputs(outputs)
                            .build();
                    responseDto = ResponseDto.builder()
                            .version(kakaoApiVersion)
                            .template(skillTemplate)
                            .build();
                    break;
                case "카페 전체메뉴":
                    System.out.println("카페 전체메뉴 case");
                    ListCard[] listCarouselItems = new ListCard[2];

                    ListItem[] carouselInnerItems1 = new ListItem[4];
                    carouselInnerItems1[0] = ListItem.builder().title("햄치즈").description("4,500원").imageUrl("https://t1.kakaocdn.net/openbuilder/docs_image/02_img_01.jpg").build();
                    carouselInnerItems1[1] = ListItem.builder().title("베이컨 아보카도").description("5,500원").imageUrl("https://t1.kakaocdn.net/openbuilder/docs_image/02_img_02.jpg").build();
                    carouselInnerItems1[2] = ListItem.builder().title("에그 포테이토").description("5,300원").imageUrl("https://t1.kakaocdn.net/openbuilder/docs_image/02_img_03.jpg").build();
                    carouselInnerItems1[3] = ListItem.builder().title("갈릭 베이컨 토마토").description("5,800원").imageUrl("https://t1.kakaocdn.net/openbuilder/docs_image/02_img_04.jpg").build();

                    ListItem[] carouselInnerItems2 = new ListItem[4];
                    carouselInnerItems2[0] = ListItem.builder().title("아메리카노").description("1,800원").imageUrl("https://t1.kakaocdn.net/openbuilder/docs_image/02_img_05.jpg").build();
                    carouselInnerItems2[1] = ListItem.builder().title("카페라떼").description("2,000원").imageUrl("https://t1.kakaocdn.net/openbuilder/docs_image/02_img_06.jpg").build();
                    carouselInnerItems2[2] = ListItem.builder().title("카페모카").description("2,500원").imageUrl("https://t1.kakaocdn.net/openbuilder/docs_image/02_img_07.jpg").build();
                    carouselInnerItems2[3] = ListItem.builder().title("돌체라떼").description("2,500원").imageUrl("https://t1.kakaocdn.net/openbuilder/docs_image/02_img_08.jpg").build();

                    Button[] carouselInnerButton1 = new Button[1];
                    carouselInnerButton1[0] = Button.builder().label("더보기").action("message").messageText("샌드위치 더 보기").build();

                    Button[] carouselInnerButton2 = new Button[1];
                    carouselInnerButton2[0] = Button.builder().label("더보기").action("message").messageText("커피 더 보기").build();

                    quickReplies = new QuickReply[3];
                    quickReplies[0] = QuickReply.builder().messageText("인기 메뉴").action("message").label("인기 메뉴").build();
                    quickReplies[1] = QuickReply.builder().messageText("최근 주문").action("message").label("최근 주문").build();
                    quickReplies[2] = QuickReply.builder().messageText("장바구니").action("message").label("장바구니").build();

                    listCarouselItems[0] = ListCard.builder()
                            .header(ListItem.builder().title("샌드위치").build())
                            .items(carouselInnerItems1)
                            .buttons(carouselInnerButton1)
                            .build();
                    listCarouselItems[1] = ListCard.builder()
                            .header(ListItem.builder().title("커피").build())
                            .items(carouselInnerItems2)
                            .buttons(carouselInnerButton2)
                            .build();
                    ListCardCarousel listCardCarousel = ListCardCarousel.builder()
                            .type("listCard")
                            .header(CarouselHeader.builder().title("케로셀 헤더").thumbnail(Thumbnail.builder().imageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4BJ9LU4Ikr_EvZLmijfcjzQKMRCJ2bO3A8SVKNuQ78zu2KOqM").build()).build())
                            .items(listCarouselItems)
                            .quickReplies(quickReplies)
                            .build();

                    outputMap.put("listCardCarousel", listCardCarousel);
                    outputs.add(outputMap);
                    skillTemplate = SkillTemplate.builder()
                            .outputs(outputs)
                            .build();
                    responseDto = ResponseDto.builder()
                            .version(kakaoApiVersion)
                            .template(skillTemplate)
                            .build();
                    break;
                default:
                    System.out.println("default case");
                    outputMap.put("simpleText", "이해 할 수 없습니다. \n다시 말씀해 주세요.");
                    outputs.add(outputMap);
                    skillTemplate = SkillTemplate.builder()
                            .outputs(outputs)
                            .build();
                    responseDto = ResponseDto.builder()
                            .version(kakaoApiVersion)
                            .template(skillTemplate)
                            .build();
                    break;
            }

            System.out.println("----------------ResponseJSON----------------");
            System.out.println(responseDto.toString());
        } else {
            responseDto = null;
        }

        return responseDto;
    }
}

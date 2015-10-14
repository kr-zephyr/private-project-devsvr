package com.sz21c.flightlogger.settings.model;

public class AircraftViewModel {
    private String  name;   //항공기 이름
    private String  developer;  //항공기 제조사
    private String  productUrl; //항공기 홈페이지 URL
    private String  commercialFlag; //유료/무료
    private String  purchaseCurrency;   //가격-화폐 단위
    private Integer purchasePrice;  //가격-값
    private String  purchaseDateTime;   //가격-구매일
    private String  softwareType;   //소프트웨어 유형
    private String  type;   //항공기 유형
    private Integer maxTakeoffDistance; //이륙 거리
    private Integer maxLandingDistance; //착륙 거리
    private Integer maxRange;   //순항 거리
    private Integer maxSpeed;   //순항 속도(knot)
}

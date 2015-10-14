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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getCommercialFlag() {
        return commercialFlag;
    }

    public void setCommercialFlag(String commercialFlag) {
        this.commercialFlag = commercialFlag;
    }

    public String getPurchaseCurrency() {
        return purchaseCurrency;
    }

    public void setPurchaseCurrency(String purchaseCurrency) {
        this.purchaseCurrency = purchaseCurrency;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDateTime() {
        return purchaseDateTime;
    }

    public void setPurchaseDateTime(String purchaseDateTime) {
        this.purchaseDateTime = purchaseDateTime;
    }

    public String getSoftwareType() {
        return softwareType;
    }

    public void setSoftwareType(String softwareType) {
        this.softwareType = softwareType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMaxTakeoffDistance() {
        return maxTakeoffDistance;
    }

    public void setMaxTakeoffDistance(Integer maxTakeoffDistance) {
        this.maxTakeoffDistance = maxTakeoffDistance;
    }

    public Integer getMaxLandingDistance() {
        return maxLandingDistance;
    }

    public void setMaxLandingDistance(Integer maxLandingDistance) {
        this.maxLandingDistance = maxLandingDistance;
    }

    public Integer getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(Integer maxRange) {
        this.maxRange = maxRange;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

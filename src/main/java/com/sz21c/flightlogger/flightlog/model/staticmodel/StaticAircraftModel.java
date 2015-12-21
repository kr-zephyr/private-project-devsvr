package com.sz21c.flightlogger.flightlog.model.staticmodel;

public enum StaticAircraftModel {

    PMDG_772("B777-200", true, "PMDG", "http://www.precisionmanuals.com/pages/product/FSX/777LRF.html", "PMDG", "http://www.precisionmanuals.com/pages/product/FSX/777LRF.html")
    , PMDG_773("B777-300", true, "PMDG", "http://www.precisionmanuals.com/pages/product/FSX/777LRF.html", "PMDG", "http://www.precisionmanuals.com/pages/product/FSX/777LRF.html")
    ;

    private String name;
    private boolean payware;
    private String developerName;
    private String productUrl;
    private String storeName;
    private String storeUrl;

    StaticAircraftModel(
            String name
            , boolean payware
            , String developerName
            , String productUrl
            , String storeName
            , String storeUrl
    ) {
        this.name = name;
        this.payware = payware;
        this.developerName = developerName;
        this.productUrl = productUrl;
        this.storeName = storeName;
        this.storeUrl = storeUrl;
    }

    public String getName() {
        return name;
    }

    public boolean isPayware() {
        return payware;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getStoreUrl() {
        return storeUrl;
    }
}

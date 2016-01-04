package com.sz21c.flightlogger.flightlog.model.staticmodel;

public enum StaticAircraftModel {

    PMDG_772("B777-200", true, "PMDG", "http://www.precisionmanuals.com/pages/product/FSX/777LRF.html", "PMDG", "http://www.precisionmanuals.com/pages/product/FSX/777LRF.html")
    , PMDG_773("B777-300", true, "PMDG", "http://www.precisionmanuals.com/pages/product/FSX/773ER.html", "PMDG", "http://www.precisionmanuals.com/pages/product/FSX/773ER.html")
    , REALAIR_LEGACY("LANCAIR LEGACY", true, "RealAir", "http://www.realairsimulations.com/legacy/info.php?page=legacy_overview", "RealAir", "http://www.realairsimulations.com/legacy/info.php?page=legacy_overview")
    , CARENADO_PC12("Pilatus PC12", true, "Carenado", "http://www.carenado.com/CarSite/Portal/index.php", "FSPilotShop", "http://www.fspilotshop.com/carenado-pc12-series-for-fsx-p3d-p-5203.html")
    , A2A_COMANCHE250("Comanche 250", true, "A2A Simulations", "https://a2asimulations.com/store/index.php?main_page=product_info&cPath=9&products_id=77&zenid=2fcbbf3bebbf6fbd78e906120acdaf8c", "Simmarket", "http://secure.simmarket.com/a2a-simulations-comanche-250-fsx-p3d-academic-bundle.phtml")
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

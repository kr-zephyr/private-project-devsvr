package com.sz21c.flightlogger.flightlog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AircraftModel {
    private Integer id;
    private String name;
    private boolean payware;
    private String developerName;
    private String productUrl;
    private String storeName;
    private String storeUrl;

    public AircraftModel(
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
}

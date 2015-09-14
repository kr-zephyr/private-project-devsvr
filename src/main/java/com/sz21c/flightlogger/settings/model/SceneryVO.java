package com.sz21c.flightlogger.settings.model;

/**
 * Created by zephyr on 15. 9. 8..
 */
public class SceneryVO {
    private Integer id;
    private Integer purchaseId;
    private boolean commercialFlag;
    private String  name;
    private String  type;
    private String  icaoCode;
    private String  locationContinent;
    private String  locationCountry;
    private String  locationCity;
    private String  locationCoordinatesN;
    private String  locationCoordinatesE;
    private Long    rowCreateTime;
    private Long    rowModifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public boolean isCommercialFlag() {
        return commercialFlag;
    }

    public void setCommercialFlag(boolean commercialFlag) {
        this.commercialFlag = commercialFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    public String getLocationContinent() {
        return locationContinent;
    }

    public void setLocationContinent(String locationContinent) {
        this.locationContinent = locationContinent;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getLocationCoordinatesN() {
        return locationCoordinatesN;
    }

    public void setLocationCoordinatesN(String locationCoordinatesN) {
        this.locationCoordinatesN = locationCoordinatesN;
    }

    public String getLocationCoordinatesE() {
        return locationCoordinatesE;
    }

    public void setLocationCoordinatesE(String locationCoordinatesE) {
        this.locationCoordinatesE = locationCoordinatesE;
    }

    public Long getRowCreateTime() {
        return rowCreateTime;
    }

    public void setRowCreateTime(Long rowCreateTime) {
        this.rowCreateTime = rowCreateTime;
    }

    public Long getRowModifyTime() {
        return rowModifyTime;
    }

    public void setRowModifyTime(Long rowModifyTime) {
        this.rowModifyTime = rowModifyTime;
    }
}

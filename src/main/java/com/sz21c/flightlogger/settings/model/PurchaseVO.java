package com.sz21c.flightlogger.settings.model;

import java.util.Currency;

/**
 * Created by zephyr on 15. 9. 8..
 */
public class PurchaseVO {
    private Integer id;
    private Integer storeId;
    private String  type;
    private String  productUrl;
    private Float   purchasePrice;
    private Currency    purchaseCurrency;
    private Long    purchaseDateTime;
    private Long    rowCreateTime;
    private Long    rowModifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Currency getPurchaseCurrency() {
        return purchaseCurrency;
    }

    public void setPurchaseCurrency(Currency purchaseCurrency) {
        this.purchaseCurrency = purchaseCurrency;
    }

    public Long getPurchaseDateTime() {
        return purchaseDateTime;
    }

    public void setPurchaseDateTime(Long purchaseDateTime) {
        this.purchaseDateTime = purchaseDateTime;
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

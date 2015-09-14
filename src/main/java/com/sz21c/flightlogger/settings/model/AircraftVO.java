package com.sz21c.flightlogger.settings.model;

/**
 * Created by zephyr on 15. 9. 8..
 */
public class AircraftVO {
    private Integer id;
    private Integer purchaseId;
    private boolean commecialFlag;
    private String  name;
    private String  type;
    private String  developer;
    private Integer maxRange;
    private Integer maxSpeed;
    private Integer maxTakeoffDistance;
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

    public boolean isCommecialFlag() {
        return commecialFlag;
    }

    public void setCommecialFlag(boolean commecialFlag) {
        this.commecialFlag = commecialFlag;
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

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
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

    public Integer getMaxTakeoffDistance() {
        return maxTakeoffDistance;
    }

    public void setMaxTakeoffDistance(Integer maxTakeoffDistance) {
        this.maxTakeoffDistance = maxTakeoffDistance;
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

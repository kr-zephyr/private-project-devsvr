package com.sz21c.flightlogger.settings.model;

/**
 * Created by zephyr on 15. 9. 8..
 */
public class StoreVO {
    private Integer id;
    private String  name;
    private Integer registeredAppCount;
    private Long    rowCreateTime;
    private Long    rowModifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getRegisteredAppCount() {
        return registeredAppCount;
    }

    public void setRegisteredAppCount(Integer registeredAppCount) {
        this.registeredAppCount = registeredAppCount;
    }
}

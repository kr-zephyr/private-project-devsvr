package com.sz21c.flightlogger.settings.model;

/**
 * Created by zephyr on 15. 9. 8..
 */
public class StoreVO {
    private Integer id;
    private String  name;
    private String  siteUrl;
    private Long    rowCreateTime;
    private Long    rowModifyTime;

    @Override
    public String toString() {
        return "StoreVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", siteUrl='" + siteUrl + '\'' +
                ", rowCreateTime=" + rowCreateTime +
                ", rowModifyTime=" + rowModifyTime +
                '}';
    }

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

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }
}

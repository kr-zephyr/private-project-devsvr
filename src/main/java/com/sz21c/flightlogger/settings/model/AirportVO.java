package com.sz21c.flightlogger.settings.model;

/**
 * Created by zephyr on 15. 9. 8..
 */
public class AirportVO {
    private Integer id;
    private Integer sceneryId;
    private String  runwayNo;
    private String  runwayBackCourse;
    private Integer runwayDistance;
    private boolean haveIls;
    private boolean haveLocalizer;
    private Long    rowCreateTime;
    private Long    rowModifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSceneryId() {
        return sceneryId;
    }

    public void setSceneryId(Integer sceneryId) {
        this.sceneryId = sceneryId;
    }

    public String getRunwayNo() {
        return runwayNo;
    }

    public void setRunwayNo(String runwayNo) {
        this.runwayNo = runwayNo;
    }

    public String getRunwayBackCourse() {
        return runwayBackCourse;
    }

    public void setRunwayBackCourse(String runwayBackCourse) {
        this.runwayBackCourse = runwayBackCourse;
    }

    public Integer getRunwayDistance() {
        return runwayDistance;
    }

    public void setRunwayDistance(Integer runwayDistance) {
        this.runwayDistance = runwayDistance;
    }

    public boolean isHaveIls() {
        return haveIls;
    }

    public void setHaveIls(boolean haveIls) {
        this.haveIls = haveIls;
    }

    public boolean isHaveLocalizer() {
        return haveLocalizer;
    }

    public void setHaveLocalizer(boolean haveLocalizer) {
        this.haveLocalizer = haveLocalizer;
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

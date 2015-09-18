package com.sz21c.flightlogger.settings.model;

import com.sz21c.common.util.TimeUtil;

import java.util.Calendar;

public class StoreViewModel {
    private StoreVO storeVO;

    public StoreVO getStoreVO() {
        return storeVO;
    }

    public void setStoreVO(StoreVO storeVO) {
        this.storeVO = storeVO;
    }

    public String getDateString() {
        return TimeUtil.getDateStringFromMilliTime(this.storeVO.getRowCreateTime());
    }
}

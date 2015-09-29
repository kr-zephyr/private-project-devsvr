package com.sz21c.flightlogger.settings.model;

import com.sz21c.common.util.TimeUtil;

public class StoreViewModel {
    private StoreVO store;
    private String addedDateString;
    private String modifiedDateString;
    private Integer registeredAppCount;

    public StoreViewModel(StoreVO storeVO) {
        if(storeVO != null) {
            this.store = storeVO;
            this.addedDateString = TimeUtil.getDateStringFromMilliTime(this.store.getRowCreateTime());
            this.modifiedDateString = TimeUtil.getDateStringFromMilliTime(this.store.getRowModifyTime());
        }
    }

    public StoreVO getStore() {
        return store;
    }

    public String getAddedDateString() {
        return addedDateString;
    }

    public String getModifiedDateString() {
        return modifiedDateString;
    }

    public Integer getRegisteredAppCount() {
        return registeredAppCount;
    }

    public void setRegisteredAppCount(Integer registeredAppCount) {
        this.registeredAppCount = registeredAppCount;
    }
}

package com.sz21c.flightlogger.settings.model;

import com.sz21c.common.util.TimeUtil;

public class StoreViewModel {
    private StoreVO store;
    private String dateString;

    public StoreViewModel(StoreVO storeVO) {
        if(storeVO != null) {
            this.store = storeVO;
            this.dateString = TimeUtil.getDateStringFromMilliTime(this.store.getRowCreateTime());
        }
    }

    public StoreVO getStore() {
        return store;
    }

    public String getDateString() {
        return dateString;
    }
}

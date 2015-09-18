package com.sz21c.flightlogger.settings.service;

import com.sz21c.common.util.TimeUtil;
import com.sz21c.flightlogger.settings.dao.StoreDao;
import com.sz21c.flightlogger.settings.model.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreDao storeDao;

    public List<StoreVO> getStoreList() throws Exception {
        return storeDao.selectMstStore(null);
    }

    public StoreVO getStoreById(Integer id) throws Exception {
        return storeDao.selectMstStoreById(id);
    }

    public void addStore(StoreVO storeVO) throws Exception {
        storeVO.setRowCreateTime(TimeUtil.getCurrentMilliTime());
        storeVO.setRowModifyTime(TimeUtil.getCurrentMilliTime());

        storeDao.insertMstStore(storeVO);

        if(storeVO.getId() == null) {
            throw new Exception("Not complete add store.");
        }
    }

    public void modifyStore(StoreVO storeVO) throws Exception {
        storeVO.setRowModifyTime(TimeUtil.getCurrentMilliTime());

        storeDao.updateMstStoreById(storeVO);
    }

    public void removeStore(Integer id) throws Exception {
        storeDao.deleteMstStoreById(id);
    }
}

package com.sz21c.flightlogger.settings.dao;

import com.sz21c.flightlogger.settings.model.StoreVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value="StoreDao")
public interface StoreDao {
    List<StoreVO> selectMstStore(StoreVO storeVO) throws Exception;

    StoreVO selectMstStoreById(Integer id) throws Exception;

    void insertMstStore(StoreVO storeVO) throws Exception;

    StoreVO updateMstStoreById(StoreVO storeVO) throws Exception;

    Integer deleteMstStoreById(Integer id) throws Exception;
}

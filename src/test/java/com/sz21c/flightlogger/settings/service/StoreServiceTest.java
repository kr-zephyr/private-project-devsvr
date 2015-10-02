package com.sz21c.flightlogger.settings.service;

import com.sz21c.common.TestCommonSetting;
import com.sz21c.flightlogger.settings.model.StoreVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@TestCommonSetting
public class StoreServiceTest {

    private Logger logger = LoggerFactory.getLogger(StoreServiceTest.class);

    private final String STORE_NAME = "test-store";
    private final String STORE_SITE_URL = "http://www.test-store.com";

    @Autowired
    StoreService storeService;

    @Test
    public void test_001_AddStore() throws Exception {
        StoreVO storeVO = new StoreVO();
        commonAddStore(storeVO);

        assertNotNull(storeVO.getId());
        assertNotEquals(storeVO.getId(), new Integer(0));

        logger.info("created id :: " + storeVO.getId());
    }

    private void commonAddStore(StoreVO storeVO) throws Exception {
        storeVO.setName(STORE_NAME);
        storeVO.setSiteUrl(STORE_SITE_URL);
        storeVO.setRowCreateTime(System.currentTimeMillis());
        storeVO.setRowModifyTime(System.currentTimeMillis());

        storeService.addStore(storeVO);
    }

    @Test
    public void test_002_GetStores() throws Exception {
        StoreVO storeVO = new StoreVO();
        commonAddStore(storeVO);

        List<StoreVO> storeList = storeService.getStoreList();

        assertNotNull(storeList);
        assertEquals(storeList.get(0).getId(), storeVO.getId());

        logger.info("store list size is " + storeList.size());
        logger.info("last created store is " + storeList.get(0).getName());
        logger.info("id of last created store is " + storeList.get(0).getId());
    }

    @Test
    public void test_003_ModifyStores() throws Exception {
        StoreVO storeVO = new StoreVO();
        commonAddStore(storeVO);

        StoreVO modifyingStoreVo = new StoreVO();
        modifyingStoreVo.setId(storeVO.getId());
        modifyingStoreVo.setName("modified-store");
        modifyingStoreVo.setSiteUrl("http://www.modified-store.com");
        storeService.modifyStore(modifyingStoreVo);

        StoreVO modifiedStoreVO = storeService.getStoreById(storeVO.getId());

        assertNotNull(modifiedStoreVO);
        assertEquals(modifyingStoreVo.getName(), modifiedStoreVO.getName());
        assertEquals(modifyingStoreVo.getSiteUrl(), modifiedStoreVO.getSiteUrl());
        assertEquals(storeVO.getRowCreateTime(), modifiedStoreVO.getRowCreateTime());
        assertNotEquals(storeVO.getRowModifyTime(), modifiedStoreVO.getRowModifyTime());
    }

    @Test
    public void test_004_DeleteStores() throws Exception {
        int orgListCount = storeService.getStoreList().size();

        StoreVO storeVO = new StoreVO();
        commonAddStore(storeVO);

        int listCountAfterAddedStore = storeService.getStoreList().size();

        assertNotEquals(orgListCount, listCountAfterAddedStore);

        storeService.removeStore(storeVO.getId());

        int listCountAfterRemovedStore = storeService.getStoreList().size();
        assertNotEquals(listCountAfterAddedStore, listCountAfterRemovedStore);
        assertEquals(orgListCount, listCountAfterRemovedStore);
    }
}

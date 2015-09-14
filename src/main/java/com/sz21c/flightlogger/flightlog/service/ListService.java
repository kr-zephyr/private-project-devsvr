package com.sz21c.flightlogger.flightlog.service;

import com.sz21c.flightlogger.flightlog.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zephyr on 15. 8. 28..
 */
@Service
public class ListService {

    @Autowired
    private TestDao testDao;

    public String getTestDaoString() throws Exception {
        return testDao.testSql();
    }
}

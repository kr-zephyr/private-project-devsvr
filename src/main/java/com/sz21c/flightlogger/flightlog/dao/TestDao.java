package com.sz21c.flightlogger.flightlog.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by zephyr on 15. 8. 28..
 */
@Repository(value="testDao")
public interface TestDao {
    String testSql() throws Exception;
}

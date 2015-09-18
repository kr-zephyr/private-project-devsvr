package com.sz21c.common;

import com.sz21c.common.config.SpringRootConfig;
import com.sz21c.common.util.TimeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringRootConfig.class})
public class TimeTest {

    Logger logger = LoggerFactory.getLogger(TimeTest.class);

    @Test
    public void testConvertMillisecondToDate() throws Exception {
        Long millisecond = TimeUtil.getCurrentMilliTime();
        logger.info("current Time :: " + TimeUtil.getDateStringFromMilliTime(millisecond));
    }
}

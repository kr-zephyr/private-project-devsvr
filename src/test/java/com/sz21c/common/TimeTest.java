package com.sz21c.common;

import com.sz21c.common.config.SpringRootConfig;
import com.sz21c.common.util.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringRootConfig.class})
public class TimeTest {

    @Test
    public void testConvertMillisecondToDate() throws Exception {
        Long millisecond = TimeUtil.getCurrentMilliTime();
        log.info("current Time :: " + TimeUtil.getDateStringFromMilliTime(millisecond));
    }
}

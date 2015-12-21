package com.sz21c.flightlogger.flightlog;

import com.sz21c.flightlogger.flightlog.model.staticmodel.StaticAircraftModel;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class AircraftModelTest {

    @Test
    public void testStaticModel() throws Exception {
        log.debug("772 :: " + StaticAircraftModel.PMDG_772.getName());
        log.debug("772 :: " + StaticAircraftModel.PMDG_772.getDeveloperName());
        log.debug("772 :: " + StaticAircraftModel.PMDG_772.getProductUrl());

        log.debug("773 :: " + StaticAircraftModel.PMDG_773.getName());
        log.debug("773 :: " + StaticAircraftModel.PMDG_773.getDeveloperName());
        log.debug("773 :: " + StaticAircraftModel.PMDG_773.getProductUrl());
    }
}

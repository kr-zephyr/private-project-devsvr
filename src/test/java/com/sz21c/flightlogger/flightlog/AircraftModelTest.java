package com.sz21c.flightlogger.flightlog;

import com.sz21c.flightlogger.flightlog.model.staticmodel.StaticAircraftModel;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

@Slf4j
public class AircraftModelTest {

    @Test
    public void testStaticModel() throws Exception {
        assertEquals("B777-200", StaticAircraftModel.PMDG_772.getName());
        assertEquals("PMDG", StaticAircraftModel.PMDG_772.getDeveloperName());
        assertEquals("http://www.precisionmanuals.com/pages/product/FSX/777LRF.html", StaticAircraftModel.PMDG_772.getProductUrl());

        assertEquals("B777-300", StaticAircraftModel.PMDG_773.getName());
        assertEquals("PMDG", StaticAircraftModel.PMDG_773.getDeveloperName());
        assertEquals("http://www.precisionmanuals.com/pages/product/FSX/773ER.html", StaticAircraftModel.PMDG_773.getProductUrl());
    }
}

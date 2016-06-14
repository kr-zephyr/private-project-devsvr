package com.sz21c.common;

import com.sz21c.flightlogger.flightlog.model.AircraftModel;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Slf4j
public class CodeSnipetTest {

    @Test
    public void testStream() {
        List<AircraftModel> aircraftModelList = new ArrayList<>();

        AircraftModel aircraftModel = new AircraftModel();
        aircraftModel.setId(1);
        aircraftModelList.add(aircraftModel);

        aircraftModel = new AircraftModel();
        aircraftModel.setId(1);
        aircraftModelList.add(aircraftModel);

        Integer sum = aircraftModelList.stream().mapToInt(x -> x.getId()).sum();
        log.debug("sum is " + sum);

        assertNotNull(sum);
        assertEquals(new Integer(2), sum);
    }
}

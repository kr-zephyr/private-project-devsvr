package com.sz21c.flightlogger.flightlog.controller;

import com.sz21c.flightlogger.common.controller.FlightLoggerBaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class AddController extends FlightLoggerBaseController {

    @RequestMapping(value = "/logger/add", method = {RequestMethod.GET})
    public ModelAndView getAddPage() throws Exception {
        return new ModelAndView("/flightlogger/log-add");
    }

    @RequestMapping(value = "/logger/add", method = {RequestMethod.POST})
    public ModelAndView putAddLog() throws Exception {
        log.debug("controller for putAddLog");
        return new ModelAndView("/flightlogger/log-list");
    }
}

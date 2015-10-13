package com.sz21c.flightlogger.settings.controller;

import com.sz21c.flightlogger.common.controller.FlightLoggerBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManageAircraftController extends FlightLoggerBaseController {

    @RequestMapping(value = "/manage/aircraft", method = {RequestMethod.GET})
    public ModelAndView getList() throws Exception {
        return new ModelAndView("/flightlogger/manage-aircraft-list");
    }

    @RequestMapping(value = "/manage/aircraft/{idx}", method = {RequestMethod.GET})
    public ModelAndView getAircraftView() throws Exception {
        return new ModelAndView("/flightlogger/manage-aircraft-view");
    }
}

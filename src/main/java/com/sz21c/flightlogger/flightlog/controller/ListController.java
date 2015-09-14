package com.sz21c.flightlogger.flightlog.controller;

import com.sz21c.flightlogger.flightlog.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zephyr on 15. 8. 18..
 */
@Controller
public class ListController extends FlightLoggerBaseController {

    @Autowired
    private ListService listService;

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public ModelAndView getRoot() throws Exception {
        return new ModelAndView("/flightlogger/log-list");
    }

    @RequestMapping(value = "/logger", method = {RequestMethod.GET})
    public ModelAndView getList() {
        return new ModelAndView("/flightlogger/log-list");
    }
}

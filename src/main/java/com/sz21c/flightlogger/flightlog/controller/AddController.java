package com.sz21c.flightlogger.flightlog.controller;

import com.sz21c.flightlogger.common.controller.FlightLoggerBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zephyr on 15. 8. 19..
 */
@Controller
public class AddController extends FlightLoggerBaseController {

    @RequestMapping(value = "/logger/add", method = {RequestMethod.GET})
    public ModelAndView getAddPage() throws Exception {
        return new ModelAndView("/flightlogger/log-add");
    }
}

package com.sz21c.flightlogger.flightlog.controller;

import com.sz21c.flightlogger.common.controller.FlightLoggerBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zephyr on 15. 8. 19..
 */
@Controller
public class DetailController extends FlightLoggerBaseController {

    @RequestMapping(value = "/logger/{resourceId}")
    public ModelAndView getDetailPage(@PathVariable Integer resourceId) throws Exception {
        return new ModelAndView("/flightlogger/log-detail");
    }
}

package com.sz21c.flightlogger.settings.controller;

import com.sz21c.flightlogger.common.controller.FlightLoggerBaseController;
import com.sz21c.flightlogger.settings.model.AircraftVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManageAircraftController extends FlightLoggerBaseController {

    static final Logger logger = LoggerFactory.getLogger(ManageAircraftController.class);

    @RequestMapping(value = "/manage/aircraft", method = {RequestMethod.GET})
    public ModelAndView getList() throws Exception {
        return new ModelAndView("/flightlogger/manage-aircraft-list");
    }

    @RequestMapping(value = "/manage/aircraft/{idx}", method = {RequestMethod.GET})
    public ModelAndView getAircraftView(@PathVariable Integer idx) throws Exception {
        return new ModelAndView("/flightlogger/manage-aircraft-view");
    }

    @RequestMapping(value = "/manage/aircraft/add", method = {RequestMethod.GET})
    public ModelAndView getAddView() throws Exception {
        return new ModelAndView("/flightlogger/manage-aircraft-add");
    }

    @RequestMapping(value = "/manage/aircraft/add", method = {RequestMethod.POST})
    public ModelAndView addAircraft(@ModelAttribute AircraftVO aircraftVO, Model model) throws Exception {
        logger.debug(aircraftVO.toString());
        return new ModelAndView("/flightlogger/manage-aircraft-list");
    }

    @RequestMapping(value = "/manage/aircraft/modify", method = {RequestMethod.GET})
    public ModelAndView getModifyAircraftView() throws Exception {
        return new ModelAndView("/flightlogger/manage-aircraft-modify");
    }

    @RequestMapping(value = "/manage/aircraft/modify/{idx}", method = {RequestMethod.POST})
    public ModelAndView modifyAircraft(@PathVariable Integer idx) throws Exception {
        return new ModelAndView("/flightlogger/manage-aircraft-view");
    }

    @RequestMapping(value = "/manage/aircraft/remove/{idx}", method = {RequestMethod.POST})
    public ModelAndView removeAircraft(@PathVariable Integer idx) throws Exception {
        return new ModelAndView("/flightlogger/manage-aircraft-list");
    }
}

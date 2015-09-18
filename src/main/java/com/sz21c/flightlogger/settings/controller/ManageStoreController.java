package com.sz21c.flightlogger.settings.controller;

import com.sz21c.flightlogger.common.controller.FlightLoggerBaseController;
import com.sz21c.flightlogger.settings.model.StoreVO;
import com.sz21c.flightlogger.settings.model.StoreViewModel;
import com.sz21c.flightlogger.settings.service.StoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ManageStoreController extends FlightLoggerBaseController {

    static final Logger logger = LoggerFactory.getLogger(ManageStoreController.class);

    @Autowired
    StoreService storeService;

    @RequestMapping(value = "/manage/store", method = RequestMethod.GET)
    public ModelAndView getStore(Model model) throws Exception {
        model.addAttribute("storeList", getStoreList());

        return new ModelAndView("/flightlogger/manage-store-list");
    }

    @RequestMapping(value = "/manage/store/add", method = RequestMethod.GET)
    public ModelAndView addStore() throws Exception {
        return new ModelAndView("/flightlogger/manage-store-add");
    }

    @RequestMapping(value = "/manage/store", method = RequestMethod.POST)
    public ModelAndView addStore(@ModelAttribute StoreVO storeVO, Model model) throws Exception {
        storeService.addStore(storeVO);

        model.addAttribute("storeList", getStoreList());

        return new ModelAndView("/flightlogger/manage-store-list");
    }

    private List<StoreViewModel> getStoreList() throws Exception {
        List<StoreVO> storeVOList = storeService.getStoreList();

        StoreViewModel storeViewModel;
        List<StoreViewModel> storeViewModelList = new ArrayList<>();

        for(StoreVO storeVO: storeVOList) {
            storeViewModel = new StoreViewModel(storeVO);
            storeViewModelList.add(storeViewModel);
        }

        return storeViewModelList;
    }
}

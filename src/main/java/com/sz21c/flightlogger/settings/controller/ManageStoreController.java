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
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ManageStoreController extends FlightLoggerBaseController {

    static final Logger logger = LoggerFactory.getLogger(ManageStoreController.class);

    @Autowired
    StoreService storeService;

    @RequestMapping(value = "/manage/store", method = RequestMethod.GET)
    public ModelAndView getStores(Model model) throws Exception {
        model.addAttribute("storeList", getStoreList());

        return new ModelAndView("/flightlogger/manage-store-list");
    }

    @RequestMapping(value = "/manage/store/{storeId}", method = RequestMethod.GET)
    public ModelAndView getStore(@PathVariable Integer storeId, Model model) throws Exception {
        StoreViewModel storeViewModel = new StoreViewModel(storeService.getStoreById(storeId));

        model.addAttribute("storeInfo", storeViewModel);

        return new ModelAndView("/flightlogger/manage-store-view");
    }

    @RequestMapping(value = "/manage/store/{storeId}/modify", method = RequestMethod.GET)
    public ModelAndView getModifyStore(@PathVariable Integer storeId, Model model) throws Exception {
        StoreViewModel storeViewModel = new StoreViewModel(storeService.getStoreById(storeId));

        model.addAttribute("storeInfo", storeViewModel);

        return new ModelAndView("/flightlogger/manage-store-modify");
    }


    @RequestMapping(value = "/manage/store/{storeId}/modify", method = RequestMethod.POST)
    public String modifyStore(@PathVariable Integer storeId, @ModelAttribute StoreVO storeVo, Model model) throws Exception {
        //TODO Mehtod PUT으로 변경해야 함
        //TODO Store 수정 구현
        storeVo.setId(storeId);
        storeService.modifyStore(storeVo);

        StoreViewModel storeViewModel = new StoreViewModel(storeService.getStoreById(storeId));

        model.addAttribute("storeInfo", storeViewModel);

        return "redirect:/flightlogger/manage/store/" + storeId;
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

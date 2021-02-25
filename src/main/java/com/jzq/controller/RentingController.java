package com.jzq.controller;

import com.jzq.bean.HousingEstateInfo;
import com.jzq.service.RentingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jianzhiqiang
 * @date 2021/2/25 22:17
 */
@Controller
public class RentingController {
    @Autowired
    private RentingService rentingService;

    @ResponseBody
    @PostMapping("/hello")
    public String setHouseInfo(@RequestBody HousingEstateInfo housingEstateInfo) {
        int i = rentingService.setHouseInfo(housingEstateInfo);
        return "成功或失败" + i;
    }
}

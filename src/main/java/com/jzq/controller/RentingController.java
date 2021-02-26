package com.jzq.controller;

import com.jzq.bean.HousingEstateInfo;
import com.jzq.bean.PageInfo;
import com.jzq.service.RentingService;
import com.jzq.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jianzhiqiang
 * @date 2021/2/25 22:17
 */
@RestController
public class RentingController {
    @Autowired
    private RentingService rentingService;

    @PostMapping("/setHouseInfo")
    public String setHouseInfo(@RequestBody HousingEstateInfo housingEstateInfo) {
        int i = rentingService.setHouseInfo(housingEstateInfo);
        return "成功或失败" + i;
    }

    @PostMapping("/queryHouseInfo")
    public Result queryHouseInfo(@RequestBody PageInfo pageInfo) {
        return rentingService.selectHouseInfoOrderByScore(pageInfo);
    }
}

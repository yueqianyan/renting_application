package com.jzq.service.impl;

import com.jzq.bean.HousingEstateInfo;
import com.jzq.dao.RentingMapper;
import com.jzq.service.RentingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jianzhiqiang
 * @date 2021/2/25 23:08
 */
@Service
public class RentingServiceImpl implements RentingService {
    @Autowired
    private RentingMapper rentingMapper;

    public int setHouseInfo(HousingEstateInfo housingEstateInfo) {
        rentingMapper.insertHouseInfo(housingEstateInfo);
        return 1;
    }
}

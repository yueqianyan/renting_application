package com.jzq.service;

import com.jzq.bean.HousingEstateInfo;
import com.jzq.dao.RentingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jianzhiqiang
 * @date 2021/2/25 23:08
 */
public interface RentingService {
    int setHouseInfo(HousingEstateInfo housingEstateInfo);
    List<HousingEstateInfo> selectHouseInfoOrderByScore();
}

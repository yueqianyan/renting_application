package com.jzq.service.impl;

import com.jzq.bean.HousingEstateInfo;
import com.jzq.dao.RentingMapper;
import com.jzq.factory.GradeFactory;
import com.jzq.service.RentingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jianzhiqiang
 * @date 2021/2/25 23:08
 */
@Service
public class RentingServiceImpl implements RentingService {
    @Resource
    private RentingMapper rentingMapper;

    public int setHouseInfo(HousingEstateInfo housingEstateInfo) {
        new GradeFactory().gradeHousing(housingEstateInfo);
        rentingMapper.insertHouseInfo(housingEstateInfo);
        return 1;
    }

    public List<HousingEstateInfo> selectHouseInfoOrderByScore() {
        List<HousingEstateInfo> housingEstateInfos = rentingMapper.selectHouseInfoOrderByScore();
        return housingEstateInfos;
    }
}

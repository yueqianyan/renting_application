package com.jzq.service.impl;

import com.jzq.bean.HousingEstateInfo;
import com.jzq.bean.PageInfo;
import com.jzq.dao.RentingMapper;
import com.jzq.factory.GradeFactory;
import com.jzq.service.RentingService;
import com.jzq.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Result selectHouseInfoOrderByScore(PageInfo pageInfo) {
        Map<String, Object> resultData = new HashMap<String, Object>();
        if(pageInfo != null) {
            pageInfo.setCurrent((pageInfo.getCurrent() - 1) * pageInfo.getSize());
        }
        List<HousingEstateInfo> housingEstateInfos = rentingMapper.selectHouseInfoOrderByScore(pageInfo);
        resultData.put("list", housingEstateInfos);
        if(pageInfo != null) {
            pageInfo.setCurrent(0);
            pageInfo.setSize(0);
            List<HousingEstateInfo> housingEstateTotalInfos = rentingMapper.selectHouseInfoOrderByScore(pageInfo);
            resultData.put("total", housingEstateTotalInfos.size());
        }
        return new Result(200, resultData);
    }
}

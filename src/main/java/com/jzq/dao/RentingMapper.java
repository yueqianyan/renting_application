package com.jzq.dao;

import com.jzq.bean.HousingEstateInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author jianzhiqiang
 * @date 2021/2/25 22:15
 */
@Mapper
public interface RentingMapper {
    void insertHouseInfo(HousingEstateInfo housingEstateInfo);

    List<HousingEstateInfo> selectHouseInfoOrderByScore();
}

package com.jzq.factory;

import com.jzq.bean.HousingEstateInfo;

/**
 * @author jianzhiqiang
 * @date 2021/2/26 10:06
 */
public class GradeFactory {
    public void gradeHousing(HousingEstateInfo housingEstateInfo) {
        int company = housingEstateInfo.getCompany();
        float subway = housingEstateInfo.getSubway();
        int temporaryScore = 0;

        // 距离地铁远近
        if(subway <= 1) {
            temporaryScore += 3;
        } else if(subway > 1 && subway <= 1.8) {
            temporaryScore += 2;
        } else if(subway > 1.8 && subway <= 3) {
            temporaryScore += 1;
        }

        // 到公司打车费
        if(company <= 15) {
            temporaryScore += 3;
        } else if(company <= 18) {
            temporaryScore += 2;
        } else if(company <= 20) {
            temporaryScore += 1;
        }
        housingEstateInfo.setScore(temporaryScore);
    }
}

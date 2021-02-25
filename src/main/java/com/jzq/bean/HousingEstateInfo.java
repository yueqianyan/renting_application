package com.jzq.bean;

import lombok.Data;

/**
 * @author jianzhiqiang
 * @date 2021/2/25 23:00
 */
@Data
public class HousingEstateInfo {
    private String housingEstate;
    private int price;
    private double size;
    private double face;
    private double bedroom;
    private double subway;
    private double company;
    private int score;
}

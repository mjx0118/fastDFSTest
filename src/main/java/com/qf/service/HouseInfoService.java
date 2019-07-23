package com.qf.service;

import com.qf.bean.HouseInfo;

import java.util.List;

public interface HouseInfoService {

    public  boolean saveHouseInfo(HouseInfo houseInfo);

    public List<HouseInfo> findAll();
}

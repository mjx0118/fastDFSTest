package com.qf.mapper;

import com.qf.bean.HouseInfo;

import java.util.List;


public interface HouseInfoMapper {

    public  int saveHouseInfo(HouseInfo houseInfo);

    public List<HouseInfo> findAll();

}

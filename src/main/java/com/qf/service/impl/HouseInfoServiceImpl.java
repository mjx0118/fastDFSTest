package com.qf.service.impl;

import com.qf.bean.HouseInfo;
import com.qf.mapper.HouseInfoMapper;
import com.qf.service.HouseInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class HouseInfoServiceImpl implements HouseInfoService {
   @Resource
   private HouseInfoMapper houseInfoMapper;


    @Override
    public boolean saveHouseInfo(HouseInfo houseInfo) {
        return houseInfoMapper.saveHouseInfo(houseInfo)>0;
    }

    @Override
    public List<HouseInfo> findAll() {
        return houseInfoMapper.findAll();
    }
}

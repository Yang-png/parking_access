package com.demo.parking_access.service.Impl;

import com.demo.parking_access.entity.CarLog;
import com.demo.parking_access.handEntity.HandCar;
import com.demo.parking_access.controller.ParkHandover;
import com.demo.parking_access.mapper.ParkHandoverMapper;
import com.demo.parking_access.service.ParkHandoverService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkHandoverServiceImpl implements ParkHandoverService {

    @Autowired
    private ParkHandoverMapper parkHandoverMapper;

    @Override
    public int addCarLogOver(HandCar carLog) {
        return parkHandoverMapper.addCarLogOver(carLog);
    }


}

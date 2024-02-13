package com.ohgiraffers.car.model.dao;

import com.common.SearchCondition;
import com.ohgiraffers.car.model.dto.CarDTO;

import java.util.List;
import java.util.Map;

public interface CarDAO {



    List<CarDTO> selectAllcarList();

    List<CarDTO> selectCarByCondition(SearchCondition searchCondition);

    int insertCar(CarDTO car);

    int updateCar(CarDTO car);

    int deleteCar(Map<String, String> parameter);
}

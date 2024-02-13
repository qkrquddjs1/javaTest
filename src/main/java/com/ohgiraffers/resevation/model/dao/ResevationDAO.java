package com.ohgiraffers.resevation.model.dao;

import com.ohgiraffers.resevation.model.dto.ReservationDTO;

import java.util.List;
import java.util.Map;

public interface ResevationDAO {
    List<ReservationDTO> selectAllResevationList();

    int deleteCar(Map<String, String> parameter);
}

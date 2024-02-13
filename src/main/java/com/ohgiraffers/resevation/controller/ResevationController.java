package com.ohgiraffers.resevation.controller;

import com.ohgiraffers.resevation.model.dto.ReservationDTO;
import com.ohgiraffers.resevation.model.service.ReservationService;
import com.ohgiraffers.resevation.view.ReservationPrint;

import java.util.List;
import java.util.Map;

public class ResevationController {

    private static ReservationPrint reservationPrint;
    private static ReservationService reservationService;
    public ResevationController(){
        reservationPrint = new ReservationPrint();
        reservationService = new ReservationService();

    }
    public static void selectAllResevationList() {

        // 예약 확인

        List<ReservationDTO> allResevationList =ReservationService.selectAllResevationList();

        if (allResevationList != null && !allResevationList.isEmpty()){
            reservationPrint.printAllResevationList(allResevationList);
        } else {
            System.out.println("조회에 실패했습니다.");
        }
    }


    public static void deleteResevation(Map<String, String> parameter) {

        if (reservationService.deleteMember(parameter)) {
            System.out.println("예약 취소 했습니다.");
        } else {
            System.out.println("예약 취소 실패 했습니다. ");
        }
    }
}

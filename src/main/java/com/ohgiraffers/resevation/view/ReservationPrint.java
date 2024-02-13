package com.ohgiraffers.resevation.view;

import com.ohgiraffers.resevation.model.dto.ReservationDTO;

import java.util.List;

public class ReservationPrint {

    public void printAllResevationList(List<ReservationDTO> allResevationList) {

        System.out.println("=========================");
        System.out.println("======예약 전체 조회 =======");
        System.out.println("=========================");

        for (ReservationDTO reservation : allResevationList){
            System.out.println(reservation);
        }
        System.out.println("================================");
    }
}

package com.ohgiraffers.car.view;

import com.common.SearchCondition;
import com.ohgiraffers.car.model.dto.CarDTO;

import java.util.List;

public class CarPrint {
    public void printAllCarList(List<CarDTO> allCarList) {

        System.out.println("=================================");
        System.out.println("======= 전체 자량 조회 목록 ========");
        System.out.println("=================================");

        for(CarDTO car : allCarList) {
            System.out.println(car);
        }
        System.out.println("================================");
    }



    public void printCarList(List<CarDTO> carList, SearchCondition searchCondition) {

        String searchOption = "";

        switch (searchCondition.getOption()) {
            case "carCompany" : searchOption = "현대자동차 검색 결과"; break;
        }

        System.out.println("========" + searchOption + "목록==========");
        for(CarDTO car : carList) {
            System.out.println(car);
        }
        System.out.println("==================================");
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectAllCarList" : errorMessage = "조회 결과가 없습니다."; break;
            case "selectCarList" : errorMessage = "조회 결과가 없습니다."; break;
            case "modifyCar" : errorMessage = "자동차 정보 수정이 실패했습니다."; break;
            case "deleteCar" : errorMessage = "자동차 삭제를 실패했습니다."; break;
        }

        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";

        switch (successCode) {
            case "newCar" : successMessage = "신규 자동차 등록이 완료 되었습니다.";
            case "modifyCar" : successMessage = "자동차 정보 수정하였습니다.  ";
            case "deleteCar" : successMessage = "자동차 삭제 했습니다. ";
        }

        System.out.println(successMessage);
        System.out.println("=======================================");
    }
}

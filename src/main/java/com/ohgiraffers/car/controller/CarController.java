package com.ohgiraffers.car.controller;

import com.common.SearchCondition;
import com.ohgiraffers.car.model.dto.CarDTO;
import com.ohgiraffers.car.model.service.CarService;
import com.ohgiraffers.car.view.CarPrint;

import java.util.List;
import java.util.Map;

public class CarController {

    private static CarPrint carPrint;
    private static CarService carService;

    public CarController(){
        carPrint = new CarPrint();
        carService = new CarService();

    }
    public static void selectAllCarList() {

                // 차량 전체 조회
        List<CarDTO> allCarList = CarService.selectAppCarList();

        if(allCarList != null && !allCarList.isEmpty()) {
            carPrint.printAllCarList(allCarList);
        } else {
            carPrint.printErrorMessage("selectAllCarList");
        }
    }

    public void selectCarByCondition(SearchCondition searchCondition) {

          // 차량 조건 조회

        List<CarDTO> carList = carService.selectCarByCondition(searchCondition);

        if(carList != null && !carList.isEmpty()) {
            carPrint.printCarList(carList, searchCondition);
        } else {
            carPrint.printErrorMessage("selectCarList");
        }
    }

    public void newCar(CarDTO car) {

        // 새로운 차량 등록

        CarDTO newcar = new CarDTO();
        newcar.setCarCompany(car.getCarCompany());
        newcar.setCarName(car.getCarName());
        newcar.setCarNumber(car.getCarNumber());

        if (carService.newCar(car)) {
            carPrint.printSuccessMessage("newCar");
        } else {
            carPrint.printErrorMessage("newCar");
        }


    }

    public void modifyCar(CarDTO car) {

        // 차량 정보 수정

        car.setCarNumber(car.getCarNumber());

        if(carService.modifyCar(car)) {
            carPrint.printSuccessMessage("modifyCar");
        } else {
            carPrint.printErrorMessage("modifyCar");
        }
    }

    public void deleteCar(Map<String, String> parameter) {

        // 차량 삭제

        if (carService.deleteCar(parameter)) {
            carPrint.printSuccessMessage("deleteCar");
        } else {
            carPrint.printErrorMessage("deleteCar");
        }
    }
}

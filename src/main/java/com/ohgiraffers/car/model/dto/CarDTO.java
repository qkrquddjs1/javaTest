package com.ohgiraffers.car.model.dto;

public class CarDTO {
    private int carCode;
    private String carCompany;
    private String carName;
    private String carNumber;

    public CarDTO() {
    }

    public CarDTO(int carCode, String carCompany, String carName, String carNumber) {
        this.carCode = carCode;
        this.carCompany = carCompany;
        this.carName = carName;
        this.carNumber = carNumber;
    }

    public int getCarCode() {
        return carCode;
    }

    public void setCarCode(int carCode) {
        this.carCode = carCode;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "carCode=" + carCode +
                ", carCompany='" + carCompany + '\'' +
                ", carName='" + carName + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}

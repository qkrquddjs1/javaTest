package com.ohgiraffers.resevation.model.dto;

public class ReservationDTO {
    private int memberCode;
    private int carCode;
    private String memberName;
    private String carName;

    public ReservationDTO() {
    }

    public ReservationDTO(int memberCode, int carCode, String memberName, String carName) {
        this.memberCode = memberCode;
        this.carCode = carCode;
        this.memberName = memberName;
        this.carName = carName;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public int getCarCode() {
        return carCode;
    }

    public void setCarCode(int carCode) {
        this.carCode = carCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "ReservationDTO{" +
                "memberCode=" + memberCode +
                ", carCode=" + carCode +
                ", memberName='" + memberName + '\'' +
                ", carName='" + carName + '\'' +
                '}';
    }
}

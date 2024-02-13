package com.ohgiraffers.member.model.dto;

public class MemberDTO {
    private int memberCode;
    private String memberName;
    private int memberAge;
    private String memberGender;
    private String memberCitizen;
    private String memberAd;

    public MemberDTO() {
    }

    public MemberDTO(int memberCode, String memberName, int memberAge, String memberGender, String memberCitizen, String memberAd) {
        this.memberCode = memberCode;
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.memberGender = memberGender;
        this.memberCitizen = memberCitizen;
        this.memberAd = memberAd;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    public String getMemberCitizen() {
        return memberCitizen;
    }

    public void setMemberCitizen(String memberCitizen) {
        this.memberCitizen = memberCitizen;
    }

    public String getMemberAd() {
        return memberAd;
    }

    public void setMemberAd(String memberAd) {
        this.memberAd = memberAd;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberCode=" + memberCode +
                ", memberName='" + memberName + '\'' +
                ", memberAge=" + memberAge +
                ", memberGender='" + memberGender + '\'' +
                ", memberCitizen='" + memberCitizen + '\'' +
                ", memberAd='" + memberAd + '\'' +
                '}';
    }
}

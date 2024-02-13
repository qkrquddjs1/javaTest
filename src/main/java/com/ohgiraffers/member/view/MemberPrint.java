package com.ohgiraffers.member.view;

import com.common.SearchCondition;
import com.ohgiraffers.member.model.dto.MemberDTO;

import java.util.List;

public class MemberPrint {
    public void printMemberList(List<MemberDTO> memberList, SearchCondition searchCondition) {

        String searchOption = "";
        switch (searchCondition.getOption()) {
            case "memberName" : searchOption = "이름으로 검색결과"; break;
        }

        System.out.println("=======" + searchOption +  "조회목록 =======");
        for (MemberDTO member : memberList) {
            System.out.println(member);
        }
        System.out.println("===============================");
    }

    public void printSuccessMessage(String successCode) {
        // 성공메시지

        String successMessage = "";

        switch (successCode) {
            case "selectMember" : successMessage = "신규 고객을 등록하였습니다. "; break;
            case "modifyMember" : successMessage = "고객 정보를 변경했습니다 "; break;
            case "deleteMember" : successMessage = "고객 정보를 삭제했습니다." ; break;
        }
        System.out.println(successMessage);
        System.out.println("==================================");
    }

    public void printErrorMessage(String errorCode) {

        // 실패메시지 출력메소드
        String errorMessage = "";

        switch (errorCode) {
            case "selectMember" : errorMessage = "고객 등록을 실패했습니다."; break;
            case "modifyMember" : errorMessage = "고객 정보변경을 실패햇습니다."; break;
            case "deleteMember" : errorMessage = "고객 정보 삭제를 실패 했습니다."; break;
        }

        System.out.println(errorMessage);
        System.out.println("=============================");

    }
}

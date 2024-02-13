package com.ohgiraffers.member.controller;

import com.common.SearchCondition;
import com.ohgiraffers.member.model.dto.MemberDTO;
import com.ohgiraffers.member.model.service.MemberService;
import com.ohgiraffers.member.view.MemberPrint;

import java.util.List;
import java.util.Map;

public class MemberController {

    private static MemberPrint memberPrint;
    private static MemberService memberService;
    public MemberController() {
        memberPrint = new MemberPrint();
        memberService = new MemberService();
    }
    public static void selectMemberCheck(SearchCondition searchCondition) {

        List<MemberDTO> memberList = memberService.selectMemberCheck(searchCondition);

        if (memberList != null && !memberList.isEmpty()) {
            memberPrint.printMemberList(memberList, searchCondition);
        } else {
            System.out.println("조회에 실패 했습니다.");
        }
    }

    public static void selectNewMember(MemberDTO member) {
        member.setMemberName(member.getMemberName());
        member.setMemberAge(member.getMemberAge());
        member.setMemberGender(member.getMemberGender());
        member.setMemberCitizen(member.getMemberCitizen());
        member.setMemberAd(member.getMemberAd());

        if(memberService.selectNewMember(member)) {
            memberPrint.printSuccessMessage("selectMember");
        } else {
            memberPrint.printErrorMessage("selectMember");
        }
    }



//    public static void modifyMember(MemberDTO member) {
//        // 고객 정보 수정
//
//        member.setMemberName(member.getMemberName());
//
//        if (memberService.modifyMember(member)){
//            memberPrint.printSuccessMessage("modifyMember");
//        } else {
//            memberPrint.printErrorMessage("modifyMember");
//        }


public static void deleteMember(Map<String, String> parameter) {

        if (memberService.deleteMember(parameter)) {
            memberPrint.printSuccessMessage("deleteMember");
        } else {
            memberPrint.printErrorMessage("deleteMember");
        }
  }
}




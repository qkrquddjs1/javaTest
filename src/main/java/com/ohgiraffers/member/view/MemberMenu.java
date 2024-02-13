package com.ohgiraffers.member.view;

import com.common.SearchCondition;
import com.ohgiraffers.member.controller.MemberController;
import com.ohgiraffers.member.model.dto.MemberDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberMenu {
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        MemberController memberController = new MemberController();

        do {
            System.out.println("===== 고객 관리 시스템 =====");
            System.out.println("고객 등록 및 삭제 관리 시스템");
            System.out.println("=========================");
            System.out.println("1. 고객 조회 ");
            System.out.println("2. 고객 등록 ");
            System.out.println("3. 고객 삭제");
            System.out.println("9. 이전 메뉴로 이동");
            System.out.println("=========================");
            System.out.print("원하시는 서비스의 번호를 입력 해주세요 : ");
            int menu = sc.nextInt();

            switch (menu){
                case 1 : MemberController.selectMemberCheck(inputCheck()); break;
                case 2 : MemberController.selectNewMember(inputNewMeber()); break;
                case 3 : MemberController.deleteMember(inputMemberCode()); break;
                case 9 :
                    System.out.println("=====상위메뉴로 돌아갑니다. =======");return;
                default: System.out.println("잘못된 번호 입니다.  다시입력해주세요 ");break;

            }

        } while (true);
    }




    private static SearchCondition inputCheck() {
        // 이름으로 조회

        Scanner sc = new Scanner(System.in);
        String searchOption = "";
        String searchValue = "";

        // 이름으로만 조회해도 상관없을거같아 이름으로 조회만 생성
        System.out.println("============================");
        System.out.println("== 조회하고 싶은 조건 선택하세요.");
        System.out.println(" 1. 이름으로 고객 조회");
        System.out.println(" 9. 이전 서비스로 이동");

        int selectMember = sc.nextInt();

        switch (selectMember) {
            case 1 :
                sc.nextLine();
                searchOption = "memberName";
                System.out.print("고객 이름을 입력해주세요 :");
                searchValue = sc.nextLine();
                break;
            case 9 : System.out.println("상위 메뉴로 이동합니다");
            default : System.out.println("잘못된 번호 입니다 다시입력해주세요");
        }
        SearchCondition searchCondition = new SearchCondition();
        searchCondition.setOption(searchOption);
        searchCondition.setValue(searchValue);

        return searchCondition;
    }
    private static MemberDTO inputNewMeber() {
        // 고객 등록

        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("등록할 새로운 고객 정보를 입력하세요.");
        System.out.println("===============================");
        MemberDTO memberDTO = new MemberDTO();
        getMemberInfo(memberDTO);
        System.out.println("===============================");

        return memberDTO;

    }

    private static MemberDTO getMemberInfo(MemberDTO memberDTO) {

        // 고객 등록 설정

        Scanner sc = new Scanner(System.in);
        System.out.print("고객 이름을 입력해주세요 :");
        String memberName = sc.nextLine();
        System.out.print("고객 나이를 입력해주세요 :");
        int memberAge = sc.nextInt();
        sc.nextLine();
        System.out.print("고객 성별을 입력해주세요 :");
        String memberGender = sc.nextLine();
        System.out.print("고객 주민번호를 입력해주세요 : ");
        String memberCitzen = sc.nextLine();
        System.out.print("고객 주소를 입력해주세요 :");
        String memberAd = sc.nextLine();

        memberDTO.setMemberName(memberName);
        memberDTO.setMemberAge(memberAge);
        memberDTO.setMemberGender(memberGender);
        memberDTO.setMemberCitizen(memberCitzen);
        memberDTO.setMemberAd(memberAd);

        return memberDTO;
    }

//    private static MemberDTO inputModifyMeber() {
//
//        // 고객 정보를 수정 하는 문구
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("===============");
//        System.out.println("수정할 고객 정보를 입력해주세요.");
//        System.out.println("수정을 원하지 않는 정보는 SKIP을 입력해주세요.");
//        System.out.println("수정 대상 고객 코드를 입력해주세요.");
//        int memberCode = sc.nextInt();
//        sc.nextLine();
//
//        MemberDTO memberDTO = new MemberDTO();
//        memberDTO.setMemberCode(memberCode);
//        getMemberInfo(memberDTO);
//
//        System.out.println("==================");
//        return memberDTO;
//
//    }

    private static Map<String, String> inputMemberCode() {

        // 고객 삭제

        Scanner sc = new Scanner(System.in);

        System.out.println("========================");
        System.out.print("삭제할 고객 코드를 입력하세요 :");
        String memberCode = sc.nextLine();
        System.out.println("=======================");

        Map<String, String> parameter = new HashMap<>();
        parameter.put("memberCode", memberCode);

        return parameter;






    }
}

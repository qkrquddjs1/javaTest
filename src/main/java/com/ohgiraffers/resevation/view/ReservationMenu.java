package com.ohgiraffers.resevation.view;

import com.ohgiraffers.resevation.controller.ResevationController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReservationMenu {
    public void displayMenu() {
        // 메뉴

        Scanner sc = new Scanner(System.in);
        ResevationController reservationController = new ResevationController();


        do {

            System.out.println("=========================");
            System.out.println("==== 예약 관리 서비스 =====");
            System.out.println("========================");
            System.out.println("1. 고객 차량 예약 확인");
//            System.out.println("2. 예약 취소");
            System.out.println("9. 이전 메뉴로 돌아가기.");
            System.out.println("========================");
            System.out.print("원하시는 메뉴의 번호를 입력해주세요 : ");
            int selectMenu = sc.nextInt();

            switch (selectMenu){
                case 1 : ResevationController.selectAllResevationList();break;
//              case 2 : ResevationController.deleteResevation(inputCode()); break;
                case 9 : System.out.println("상위 메뉴로 돌아갑니다."); return;
                default: System.out.println("잘못된 번호를 입력 했습니다. 다시입력해주세요."); break;
            }

        } while (true);



    }

//    private static Map<String, String> inputCode() {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("========================");
//        System.out.print("삭제할  코드를 입력하세요 :");
//        String code = sc.nextLine();
//        System.out.println("=======================");
//
//        Map<String, String> parameter = new HashMap<>();
//        parameter.put("memberCode", code);
//
//        return parameter;
//    }
}

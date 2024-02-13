package com.ohgiraffers.car;

import com.ohgiraffers.car.view.CarMenu;
import com.ohgiraffers.member.view.MemberMenu;
import com.ohgiraffers.resevation.view.ReservationMenu;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
                // 렌트카 관리자 서비스창

        do {
            System.out.println("=====================================");
            System.out.println("====== ▶렌트카 관리 및 예약 서비스◀ =====");
            System.out.println("=====================================");
            System.out.println("1. 렌트카 관리 하러 가기 ");
            System.out.println("2. 렌트카 고객 관리   ");
            System.out.println("3. 예약 관리 ");
            System.out.println("9. 렌트카 예약 서비스 종료. ");
            System.out.println("=====================================");
            System.out.print("원하시는 서비스를 입력하세요 : ");

            Scanner sc = new Scanner(System.in);
            int Menu = sc.nextInt();

            switch (Menu) {
                case 1 : new CarMenu().displayMenu(); break;
                case 2 : new MemberMenu().displayMenu(); break;
                case 3 : new ReservationMenu().displayMenu(); break;
                case 9 : System.out.println("프로그램을 종료하겠습니다."); return;
                default : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");break;
            }

        } while (true);


    }
}

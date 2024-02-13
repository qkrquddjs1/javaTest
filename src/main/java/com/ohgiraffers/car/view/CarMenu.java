package com.ohgiraffers.car.view;

import com.common.SearchCondition;
import com.ohgiraffers.car.controller.CarController;
import com.ohgiraffers.car.model.dto.CarDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarMenu {
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        CarController carController = new CarController();



        do {

            System.out.println("=================================");
            System.out.println("======== 렌트카 관리 서비스 ========");
            System.out.println("=================================");
            System.out.println("1. 전체 렌트카 정보 조회");
            System.out.println("2. 자동차회사별 렌트카 정보 조회");
            System.out.println("3. 신규 렌트카 자동차 정보 등록 ");
            System.out.println("4. 렌트카 자동차 등록정보 바꾸기");
            System.out.println("5. 렌트카 차량 등록취소 ");
            System.out.println("9. 이전 서비스로 돌아가기 ");
            System.out.println("================================");
            System.out.print("원하시는 서비스 메뉴의 번호를 입력해주세요 :");
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1 : carController.selectAllCarList(); break;
                case 2 : carController.selectCarByCondition(inputSearchCondition()); break;
                case 3 : carController.newCar(inputNewCar()); break;
                case 4 : carController.modifyCar(inputModifyCar()); break;
                case 5 : carController.deleteCar(inputCarCode()); break;
                case 9 : System.out.println("=======상위 메뉴로 이동합니다=======");return;
                default : System.out.println("잘못된 번호를 입력하셨습니다.");break;

            }


        } while (true);

    }




    private SearchCondition inputSearchCondition() {

        // 조건으로 조회하는 문구

        Scanner sc = new Scanner(System.in);
        String searchOption = "";
        String searchValue = "";

        System.out.println("=====================================");
        System.out.println("==== 조회 하고싶은 회사별로 선택하세요 ====");
        System.out.println("======================================");
        System.out.println("1. 현대자동차 ");
        System.out.println("2. 기아자동차 ");
        System.out.println("3. 쌍용자동차 ");
        System.out.println("4. 쉐보레자동차 ");
        System.out.println("=====================================");
        System.out.print("원하는 자동차 회사를 선택하세요 :");
        int selectMenu = sc.nextInt();


        switch (selectMenu) {
            case 1 :
                sc.nextLine();
                searchOption = "carCompany";
                System.out.println("현대자동차를 입력해주세요");
                searchValue = sc.nextLine();
                break;
            case 2 :
                sc.nextLine();
                searchOption = "carCompany";
                System.out.println("기아자동차를 입력해주세요");
                searchValue = sc.nextLine();
                break;
            case 3 :
                sc.nextLine();
                searchOption = "carCompany";
                System.out.println("쌍용자동차를 입력해주세요");
                searchValue = sc.nextLine();
                break;
            case 4 :
                sc.nextLine();
                searchOption = "carCompany";
                System.out.println("쉐보레자동차를 입력해주세요");
                searchValue = sc.nextLine();
                break;
            case 9 :
                System.out.println("========= 상위 메뉴로 이동합니다. =========="); return null;
            default : System.out.println("잘못된 번호입니다 . 다시입력해주세요 !"); break;
        }


        SearchCondition searchCondition = new SearchCondition();
        searchCondition.setOption(searchOption);
        searchCondition.setValue(searchValue);


        return searchCondition;
    }
    private static CarDTO inputNewCar() {

        // 새로운 자동차를 등록, 실행 문구

        Scanner sc = new Scanner(System.in);

        System.out.println(" ============================");
        System.out.println(" 새로운 자동차 정보를 등록해주세요");
        System.out.println(" ============================");
        CarDTO carDTO = new CarDTO();
        getCarInfo(carDTO);
        System.out.println("==============================");

        return carDTO;
    }

    private static CarDTO getCarInfo(CarDTO carDTO) {

        // 새로운 자동차를 등록하는 문구

        Scanner sc = new Scanner(System.in);

        System.out.print("자동차 회사를 입력해주세요 :");
        String carCompany = sc.nextLine();
        System.out.print("자동차 이름을 입력해주세요 :");
        String carName = sc.nextLine();
        System.out.print("자동차 번호을 입력해주세요 :");
        String carNumber = sc.nextLine();

        carDTO.setCarCompany(carCompany);
        carDTO.setCarName(carName);
        carDTO.setCarNumber(carNumber);

        return carDTO;

    }
    private CarDTO inputModifyCar() {

        // 자동차 정보를 수정하는 문구

        Scanner sc = new Scanner(System.in);

        System.out.println("===== 렌트카 정보 수정 =====");
        System.out.println("수정할 렌트카 정보를 입력하세요.");
        System.out.println("수정을 원하지 않는 정보는 SKIP을 입력하세요.");
        System.out.println("===========================");
        System.out.print("수정 대상 렌트카 코드를 입력해 주세요 : ");
        int carCode = sc.nextInt();
        sc.nextLine();

        CarDTO carDTO = new CarDTO();
        carDTO.setCarCode(carCode);

        getCarInfo(carDTO);

        // 렌트카는 회사명이랑 차량이름은 바뀌지않으니 차량번호만 바꿔준다.




        System.out.println("==============================");

        return carDTO;
    }
    private static Map<String, String> inputCarCode() {

        // 차량 삭제

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.print("삭제할 자동차 코드를 입력 해주세요 :");
        String carCode = sc.nextLine();
        System.out.println("==============================");

        Map<String, String> parameter = new HashMap<>();
        parameter.put("carCode", carCode);

        return parameter;

    }

}

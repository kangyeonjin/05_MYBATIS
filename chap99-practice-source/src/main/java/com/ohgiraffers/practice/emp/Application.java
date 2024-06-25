package com.ohgiraffers.practice.emp;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestService = new ElementTestService();

        do {
            System.out.println("================ employee 테스트 메뉴 ================");

            // 1명이 사원과 부서명을 볼 수 있도록 출력(1:1)
            // EmployeeAndDDeptDTO
            System.out.println("1. join되는지 association 확인 테스트");
            System.out.println("2. 사원과 부서명 검색");

            // 각부서에 있는 직원 정보를 출력(1:M)
            // DeptAndEmployeeDTO
            System.out.println("3. 각부서에 있는 직원정보 확인");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: elementTestService.search1(); break;
                case 2: elementTestService.search2(); break;
                case 3: elementTestService.imformation(); break;
                case 4 :
                    break;
            }

        } while(true);
    }



}

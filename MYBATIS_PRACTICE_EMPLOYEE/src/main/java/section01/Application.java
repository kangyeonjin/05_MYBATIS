package section01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();

        do {
            System.out.println("============= 오지라퍼 직원 관리 시스템 =============");
            System.out.println("1. 직원 전체 조회하기");
            System.out.println("2. 직원 코드로 메뉴 조회하기");
            System.out.println("3. 신규 직원 등록하기");
            System.out.println("4. 직원 수정하기");
            System.out.println("5. 직원 삭제하기");
            System.out.print("직원 관리 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: controller.allEmployee(); break;
                case 2: controller.employeeByCode(inputEmployeeCode()); break;
                case 3: controller.registemployee(inputEmployee()); break;
//                case 4: controller.modifyEmployee(inputModifyEmployee()); break;
//                case 5: controller.deleteEmployee(inputEmployeeCode()); break;
                default:
                    System.out.println("직원을 잘못 선택하셨습니다.");
                    break;
            }
        } while (true);
    }

    // 직원코드를 입력받는 메서드
    private static Map<String, String> inputEmployeeCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원 코드를 입력하세요 : ");
        String empId = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();  //행정보 입력
        parameter.put("empId", empId);
        return parameter;
    }

    // 직원 정보를 입력받는 메서드
    private static Map<String, String> inputEmployee() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원 아이디를 입력하세요 : ");
        String empid = sc.nextLine();
        System.out.print("직원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("주민번호를 입력하세요 : ");
        String empno = sc.nextLine();
        System.out.print("이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("부서코드를 입력하세요 : ");
        String deptcode = sc.nextLine();
        System.out.print("직급코드를 입력하세요 : ");
        String jobcode = sc.nextLine();
        System.out.print("급여등급을 입력하세요 : ");
        String sallevel = sc.nextLine();
        System.out.print("급여를 입력하세요 : ");
        String salary = sc.nextLine();
        System.out.print("보너스를 입력하세요 : ");
        String bonus = sc.nextLine();
        System.out.print("관리자사번을 입력하세요 : ");
        String managerid = sc.nextLine();
        System.out.print("입사일 입력하세요 : ");
        String hiredate = sc.nextLine();
        System.out.print("퇴사일 입력하세요 : ");
        String entdate = sc.nextLine();
        System.out.print("퇴직여부를 입력하세요 : ");
        String entyn = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empid", empid);
        parameter.put("name", name);
        parameter.put("empno", empno);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("deptcode", deptcode);
        parameter.put("jobcode", jobcode);
        parameter.put("sallevel", sallevel);
        parameter.put("salary", salary);
        parameter.put("bonus", bonus);
        parameter.put("managerid", managerid);
        parameter.put("hiredate", hiredate);
        parameter.put("entdate", entdate);
        parameter.put("entyn", entyn);

        return parameter;

    }


    // 수정할 직원 정보를 입력하는 메서드
//    private static Map<String, String> inputModifyEmployee() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("수정할 직원 코드를 입력하세요 : ");
//        String code = sc.nextLine();
//        System.out.print("수정할 직원 이름을 입력하세요 : ");
//        String name = sc.nextLine();
//        System.out.print("수정할  주민번호를 입력하세요 : ");
//        String price = sc.nextLine();
//        System.out.print("수정할 이메일 코드를 입력하세요 : ");
//        String categoryCode = sc.nextLine();
//
//        Map<String, String> parameter = new HashMap<>();
//        parameter.put("code", code);
//        parameter.put("name", name);
//        parameter.put("price", price);
//        parameter.put("categoryCode", categoryCode);
//
//        return parameter;
//
//    }


}


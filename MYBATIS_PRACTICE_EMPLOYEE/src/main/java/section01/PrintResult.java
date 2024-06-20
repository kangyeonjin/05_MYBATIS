package section01;

import java.util.List;

public class PrintResult {

    public void printEmployList(List<EmployeeDTO> employList) {

        for(EmployeeDTO employ : employList) {
            System.out.println(employ);
        }
    }
    public void printEmployee(EmployeeDTO employ) {
        System.out.println(employ);
    }


    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "신규 메뉴 등록을 성공했습니다."; break;
            case "update" : successMessage = "메뉴 수정을 성공했습니다."; break;
            case "delete" : successMessage = "메뉴 삭제를 성공했습니다."; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "메뉴 목록 조회를 실패했습니다."; break;
            case "selectOne" : errorMessage = "메뉴 조회를 실패했습니다."; break;
            case "insert" : errorMessage = "신규 메뉴 등록을 실패했습니다."; break;
            case "update" : errorMessage = "메뉴 수정을 실패했습니다."; break;
            case "delete" : errorMessage = "메뉴 삭제를 실패했습니다."; break;
        }

        System.out.println(errorMessage);
    }


}

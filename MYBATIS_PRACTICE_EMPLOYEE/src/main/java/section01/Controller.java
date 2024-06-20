package section01;

import java.util.Map;
import section01.Service;
import section01.PrintResult;
import java.util.List;

public class Controller {

    private final PrintResult printResult;
    private final Service service;

    public Controller(){
        printResult = new PrintResult();
        service = new Service();
    }

  //전체 조회
    public void Allemployee(){

        List<EmployeeDTO> employeeList = service.Allemployee();

        if(employeeList != null){
            printResult.printEmployList(employeeList);
        }else{
            printResult.printErrorMessage("selectList");
        }
    }

    // 코드 조회
//    public void employeeByCode(Map<String, String> parameter) {
//
//        int empId = Integer.parseInt(parameter.get("empId"));
//
//        EmployeeDTO employ = Service.employByCode(empId);
//
//        if(employ != null) {
//            printResult.printEmployee(employ);
//        } else {
//            printResult.printErrorMessage("selectOne");
//        }
//    }

//    public void registemployee(){
//
//
//    }
//
//
//    public void modifyEmployee(){
//
//
//    }
//
//
//    public void deleteEmployee(){
//
//
//
//    }





}
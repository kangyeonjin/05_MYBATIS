package section01;

import java.util.List;

public interface Mapper {

    List<EmployeeDTO> allEmployee();

    EmployeeDTO employByCode(int empId);

    int insertEmployee(EmployeeDTO empNo);

//    int modifyMenu(EmployeeDTO employee);

//    int deleteMenu(int empId);


}

package section01;

import java.util.List;

public interface Mapper {

    List<EmployeeDTO> allEmployee();

    EmployeeDTO employByCode(int empId);

//    int insertMenu(MenuDTO menu);
//
//    int modifyMenu(MenuDTO menu);
//
//    int deleteMenu(int code);


}

package com.ohgiraffers.practice.emp;

import com.ohgiraffers.common.DepartmentAndEmployeeDTO;
import com.ohgiraffers.common.EmployAndDepartmentDTO;

import java.util.List;

public interface ElementTestMapper {

    List<EmployAndDepartmentDTO> Association();

    List<DepartmentAndEmployeeDTO> Collection();

}

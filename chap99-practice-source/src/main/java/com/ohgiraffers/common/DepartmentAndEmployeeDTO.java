package com.ohgiraffers.common;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DepartmentAndEmployeeDTO {

    private String dept_id;
    private String dept_title;
    private String location_id;

    List<EmployeeDTO> departmentList;

}

package com.ohgiraffers.common;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class EmployAndDepartmentDTO {

    private int emp_id;
    private String emp_name;
    private String emp_no;
    private String email;
    private String phone;
    private DepartmentDTO dept_code;
    private String job_code;
    private String sal_level;
    private String salary;
    private double bonus;
    private int manager_id;
    private Date hire_date;
    private Date ent_date;
    private boolean ent_yn;


}

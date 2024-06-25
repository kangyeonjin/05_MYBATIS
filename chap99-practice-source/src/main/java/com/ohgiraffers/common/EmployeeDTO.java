package com.ohgiraffers.common;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EmployeeDTO {

    private int emp_id;
    private String emp_name;
    private String emp_no;
    private String email;
    private String phone;
    private String dept_code;
    private String job_code;
    private String sal_level;
    private String salary;
    private double bonus;
    private int manager_id;
    private Date hire_date;
    private Date ent_date;
    private boolean ent_yn;


}

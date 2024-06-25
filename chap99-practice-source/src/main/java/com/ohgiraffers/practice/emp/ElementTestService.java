package com.ohgiraffers.practice.emp;

import com.ohgiraffers.common.DepartmentAndEmployeeDTO;
import com.ohgiraffers.common.EmployAndDepartmentDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {

    private ElementTestMapper mapper;

    public void search1() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<EmployAndDepartmentDTO> employlist = mapper.Association();

        for (EmployAndDepartmentDTO employee : employlist) {
            System.out.println(employee);
        }

        sqlSession.close();

    }

    public void search2() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<EmployAndDepartmentDTO> employlist = mapper.Association();

        for (EmployAndDepartmentDTO employee : employlist) {
            System.out.println(employee.getEmp_name());
        }

        sqlSession.close();

    }

    public void imformation() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<DepartmentAndEmployeeDTO> employlist = mapper.Collection();

        for (DepartmentAndEmployeeDTO department : employlist) {
            System.out.println(department.getDept_title());
        }

        sqlSession.close();

    }

}


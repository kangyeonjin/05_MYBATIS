package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class MenuDAO {
    public List<MenuDTO> selectAllMenu(SqlSession sqlSession) {

        return sqlSession.selectList("MenuMapper.selectAllMenu");

    }

    /*DAO란(data access object)
    * db의 데이터에 접근하기 위한 객체를 의미한다
    * db에 접근하는 로직을 분리하기 위해 사용함
    *
    * */





}

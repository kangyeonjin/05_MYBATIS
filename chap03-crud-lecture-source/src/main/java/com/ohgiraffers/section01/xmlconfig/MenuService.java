package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

import static com.ohgiraffers.section01.xmlconfig.Template.getSqlSession;

public class MenuService {

    /*service란
    *
    * 비즈니스 로직을 수행하는 클래스라고도함
    * 주로 dao가 db에서 받아온데이터를 전달받아 가공해 controller로 return해준다
    *
    * mybatis에서 service의 역할
    * 1. sqlsession생성
    * 2.dao(데이터베이스 접근객체)의 메소드 호출
    * 3. 트랜젝션(commit, rollblack)제어*/

    private final MenuDAO menuDAO;

    //생성자 주입
    public MenuService(){
        menuDAO = new MenuDAO();
    }

    public List<MenuDTO> selectAllMenu(){

        //세션 열어주기
        SqlSession sqlSession = getSqlSession();

        //menuDAO를 이용해 데이터베이스에서 menuList가져오기
        List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSession);

        //세션 닫아주기
        sqlSession.close();
        return menuList;


        return null;
    }

}

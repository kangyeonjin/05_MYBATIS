package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.annotations.Select;

public interface Mapper {

//    @Select("/*쿼리문 작성위치*/")
//    @UPDATE()
//    @DELETE()
//

    @Select("select curdate()")
    java.util.Date selectSysdate();  //반환타입 메소드명


}

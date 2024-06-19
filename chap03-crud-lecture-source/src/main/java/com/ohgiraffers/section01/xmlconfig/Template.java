package com.ohgiraffers.section01.xmlconfig;

import java.io.InputStream;
import java.sql.ResultSet;

public class Template {

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {

        if(sqlSessionFactory == null) {

            String resource = "com/ohgiraffers/section01/xmlconfig/mybatis-config.xml";
        }

        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


    }
}
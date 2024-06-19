package com.ohgiraffers.section02.xmlconfig;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        //mybatis설정파일 경로를 설정
        String resource = "mybatis-config.xml";

        try {

            //mabtie설정파일 읽어오기
            InputStream inputStream = Resources.getResourceAsStream(resource);

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(false);

            java.util.Date date = sqlSession.selectOne("mapper.selectSysdate");
            System.out.println(date);
            sqlSession.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

package com.ohgiraffers.section01.javaconfig;

import com.mysql.cj.exceptions.PasswordExpiredException;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.util.Date;

public class Application {

    /*
    * MyBatis Mapper 사용방식 두가지
    * 1. 자바인터페이스 파일을 사용하는 방법
    *  > 추상메소드에 어노테이션으로 쿼리를 입력하고,getMapper로 쿼리를 불러와 실행
    * > sql구문을 메소드처럼 호출해서 사용하는 장점
    * > 간결해서 가독성이 좋다
    * > 쿼리문 작성이 힘들다
    *  2. xml파일을 사용하는 방법
    *  > xml에 직접 sql문을 정의하여 가져와서 사용
    *  > 직접 sql구문을 작성하기 때문에 복잡한 쿼리 작성할떄 용이하다
    *  > 태그들을 통해 넓은 방법으로 쓸수있음
    *  > sql문과 자바코드가 분리되어 있음
    * */

    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/menudb";
    private static String USER = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";

    public static void main(String[] args) {

        Environment environment = new Environment(
                "dev",   //환경정보이름(개발, 테스트, 운영 등 환경을 구분하기 위해 사용함)

                new JdbcTransactionFactory(),  //트랜젝션 매니저 결정(JDBC or MANAGERD),자동커밋, 트랜젝션관리를 위한 팩토리객체
                //데이터베이스 연결에 대해 JDBC를 이용하여 트랜젝션을 시작하고 커밋 또는 롤백함

                new PooledDataSource(DRIVER, URL, USER, PASSWORD)); //Connection Pool사용유무(Pooled or UnPooled)
            //database연결 pool을 생성하는것

        Configuration configuration = new Configuration(environment); //자바를 데이터베이스와 매핑함

        //mapper :  mybatis에서 sql 쿼리정의한거
        configuration.addMapper(Mapper.class); //mybaties설정객체에 데이터베이스 매핑한걸

        //데이터베이스와 세션을 관리하고 sql쿼리를 실행하는 역할
        //
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        //데이터베이스와 세션을 나타내는 객체
        //자동 커밋 옵션을 false로 설정하고, 수동으로 트랜잭션을 관리하도록 합니다
        SqlSession sqlSession = sqlSessionFactory.openSession(false);

        //두개이상 데이터 구조간의 변환관계를 정의함
        Mapper mapper = sqlSession.getMapper(Mapper.class);

        java.util.Date date = mapper.selectSysdate();

        System.out.println(date);

        sqlSession.close();

    }


}

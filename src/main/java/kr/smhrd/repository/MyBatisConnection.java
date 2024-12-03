package kr.smhrd.repository;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

// SqlSessionFactoryBuilder : MyBatis API 다운로드
public class MyBatisConnection {
    private static SqlSessionFactory sqlSessionFactory;
    // 초기화 블럭(프로그램 실행시 한번만 실행)
    static {
       try{
           String resource = "mybatis-config/config.xml";
           InputStream inputStream = Resources.getResourceAsStream(resource);
           sqlSessionFactory =
                   new SqlSessionFactoryBuilder().build(inputStream);
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
    public static SqlSession openSession(){
        return sqlSessionFactory.openSession(); // SqlSession을 꺼내오는 부분
    }
}

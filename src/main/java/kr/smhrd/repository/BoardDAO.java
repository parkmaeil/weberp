package kr.smhrd.repository;

import kr.smhrd.entity.Board;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/*
   Connection = DriverManager

 */
public class BoardDAO {
    // 전체리스트 가져오기
    public List<Board> findAll(){
        // SqlSessionFactory(SQL쿼리가 어디에 있는지 알고 있다.)-->SqlSession
        SqlSession session=MyBatisConnection.openSession();
        List<Board> list=null;
        try{
            list=session.selectList("findAll");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close(); // 세션 반납
        }
        return list;
    }
}
package kr.smhrd.repository;

import kr.smhrd.entity.Board;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
    // 게시물 데이터를 저장하는 동작
    public int save(Board board){
        SqlSession session=MyBatisConnection.openSession();
        int cnt=-1; // 실패
        try {
            cnt=session.insert("save" , board);
            session.commit(); // 완료
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return cnt; // if(cnt>0), X
    }
    // 특정 번호에 해당하는 게시물 정보를 가져오기(1개)
    public Board findById(int num){
        SqlSession session=MyBatisConnection.openSession();
        Board board=null;
        try{
            board=session.selectOne("findById", num);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
        return board;
    }

    // 게시물 번호에 해당하는 게시물 삭제
    public void deleteById(int num){
        SqlSession session=MyBatisConnection.openSession();
        try{
            session.delete("deleteById", num);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    // 수정하기
    public void update(Board board) {
        SqlSession session=MyBatisConnection.openSession();
        try{
           session.update("update", board);
           session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    //                          title, content
    public void update(int num, Board board) {
        SqlSession session=MyBatisConnection.openSession();
        try{
            //board.setNum(num); // ?
            Map<String, Object> map=new HashMap<>();
            //       key   value
            map.put("num", num);
            map.put("board", board); // board.title, board.content

            session.update("update", map);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}

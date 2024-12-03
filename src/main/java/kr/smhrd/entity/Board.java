package kr.smhrd.entity;

import java.util.Date;

// 게시판(Object)-->번호, 제목, 내용, 작성자, 작성일, 조회수, 페이지, ISBN,,,,,,,,,,,,
public class Board {
  private int num;
  private String title;
  private String content;
  private String writer;
  private int count;
  private Date indate; // "2024-12-03"

  public Board() {
  }
    public Board(int num, String title, String content, String writer, int count, Date indate) {
        this.num = num;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.count = count;
        this.indate = indate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    // toString()


    @Override
    public String toString() {
        return "Board{" +
                "num=" + num +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", count=" + count +
                ", indate=" + indate +
                '}';
    }
}

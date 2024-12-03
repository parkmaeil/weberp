SELECT * FROM web.board;

create table board(
  num int auto_increment, -- 번호(자동증가)
  title varchar(50) not null, -- 제목
  content varchar(2000) not null, -- 내용
  writer varchar(50) not null, -- 작성자
  count int not null default 0, -- 조회수
  indate datetime default now(), -- 작성일
  primary key(num)
);

drop table board;

-- insert SQL
insert into board(title, content, writer)
values('자바 스프링','자바 스프링','관리자');

insert into board(title, content, writer)
values('오라클을 배우자','오라클을 배우자','홍길동');

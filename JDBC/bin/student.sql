select * from student;
select * from "DRUG_SELL";

select s.student_no, s.student_name, m.major_name, s.score 
from student s, major m 
where s.major_no = m.major_no and major_name like '%공학%';

--서브쿼리 사용한 버전
select * from
(select s.student_no, s.student_name, m.major_name, s.score 
from student s, major m 
where s.major_no = m.major_no)
where major_name like '%공학%';

--학생이름 일부
select s.student_no, s.student_name, m.major_name, s.score 
from student s, major m 
where s.major_no = m.major_no and student_name like '%김%';

select s.student_no, s.student_name, m.major_name, s.score 
from student s, major m 
where s.major_no = m.major_no and student_no like ?; 

select s.student_no, s.student_name, m.major_name, s.score 
from student s, major m 
where s.major_no = m.major_no;

update student set student_name = ?, major_no = ?, score = ? where student_no = ?;

select * from student s order by major_no ASC; --major_no 오름차순으로 정렬
select * from student s order by major_no DESC; --major_no 내름차순으로 정렬

--평점이 높은 순서대로 조회 - 학번 이름 학과명 평점
select s.student_no, s.student_name, m.major_name, s.score 
from student s, major m 
where s.major_no = m.major_no
order by s.score DESC;

--학과별 평점의 평균 --> 평균이 높은 순서대로 조회
select s.major_no, avg(s.score)
from student s
group by s.major_no
order by avg(s.score) DESC;

--학생정보 전체 조회시 rownum을 이용해서 조회, 평점이 높은 순서대로 조회 -rownum : 행번호 찍음
--서브쿼리를 쓰지않으면 rownum이 엉망이 된다. 서브쿼리를 안에 넣음으로써 제대로 정렬되게 한다. 
select rownum, s.* 
from (select * from student s order by s.score DESC) s;

--RANK 함수(오라클에서만 지원된다)
--평점을 기준으로 순위를 매겨서 조회
select RANK() over(order by s.score DESC), s.* from student s;

--평점을 기준으로 탑3 학생들을 조회
select * from (select RANK() over(order by s.score DESC) as rank_no, s.* from student s)
where rank_no <= 3;

select * from (select RANK() over(order by s.score DESC) as rank_no, 
s.student_no, s.student_name, m.major_name, s.score 
from student s,  major m where s.major_no = m.major_no)
where rank_no <= 3;










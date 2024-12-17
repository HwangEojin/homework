-- 테이블 생성 (DDL)

CREATE TABLE tbl_member(
	MEMBER_ID NUMBER,
	MEMBER_NAME VARCHAR2(100),
	MEMBER_AGE NUMBER(3)
	
);

SELECT * FROM tbl_member;

--데이터 추가 INSERT

INSERT INTO tbl_member values(1,'엘렐레',20);
INSERT INTO tbl_member values(2,'코딩해요',20);
INSERT INTO tbl_member values(3,'안아줘요',5);
INSERT INTO tbl_member(member_id ,member_name) values(4,'배고파요');

--데이터 수정 UPDATE

update  tbl_member 
SET member_age =5;


update  tbl_member 
SET member_age  = 40
WHERE member_name ='엘렐레';

update  tbl_member 
SET member_age  = 10
WHERE member_id ='3';

--데이터 삭제 DELETE
delete 
FROM tbl_member
WHERE member_id= 2 AND MEMBER_name ='신짱구';

SELECT * FROM tbl_member;


----------------------------------------------------------------
--학생 테이블 생성

CREATE TABLE tbl_student(
	Student_number NUMBER,
	student_name varchar2(1000),
	student_math NUMBER,
	student_eng NUMBER,
	student_kor NUMBER,
	student_grade varchar2(100)
);

SELECT * FROM tbl_student;

INSERT
	INTO
	tbl_student(student_number ,
	student_name,
	student_math,
	student_eng,
	student_kor)
VALUES(1,
'김철수',
90,
90,
90);

INSERT
	INTO
	tbl_student(student_number ,
	student_name,
	student_math,
	student_eng,
	student_kor)
VALUES(2,
'홍길동',
70,
25,
55);

INSERT
	INTO
	tbl_student(student_number ,
	student_name,
	student_math,
	student_eng,
	student_kor)
VALUES(3,
'사랑해요',
89,
91,
77);

INSERT
	INTO
	tbl_student(student_number ,
	student_name,
	student_math,
	student_eng,
	student_kor)
VALUES(4,
'배고파요',
48,
100,
100);

INSERT
	INTO
	tbl_student(student_number ,
	student_name,
	student_math,
	student_eng,
	student_kor)
VALUES(5,
'고마워요',
50,
10,
NULL);


-- 전체 학생의 이름과 평균점수 조회하기 (별칭도 추가)

SELECT * FROM tbl_student ;

SELECT
	student_name 이름 ,
	student_math 수학점수,
	student_eng  영어점수,
	student_kor 한국어점수 ,
	(student_math + student_eng + student_kor) / 3 평균점수
FROM
	tbl_student;


SELECT * FROM tbl_student;

-- nvl(컬럼명, 기본값) : NULL 값을 특정 값으로 변경
SELECT
	student_name 이름,
	nvl(student_kor, 0) 국어점수_기본값,
	nvl(student_grade,'미정') AS 학점 
FROM tbl_student;

--nvl2(컬럼명, 값1, 값2) : Null 여부에 따라 NULL이 아니면 값1, NULL이면 값2
--하나의 컬럼에는 하나의 타입의 값만 들어갈 수 있다. 따라서 NULL인 값과 NULL이 아닌 값이 모두 문자이므로 가능하다.

SELECT student_name 이름, nvl2(student_kor,'점수있음','점수없음') 
FROM tbl_student;

--NULLIF(컬럼명, 값1) : 특정값과 같으면 NULL로 변경
--값이 다르면 기본 값 출력
select  student_name 이름, NULLIF(student_kor,100)
FROM tbl_student;


--NULLIF(값1,값2) : 두 칼럼 값이 같으면 NULL로 변경 , 값이 다르면 기본값 출력

select  student_name 이름 , nullif (Student_math, student_eng)
FROM tbl_student;

--Coalesce(값1,값2,값3) : null이 아닌 첫번째 값을 반환
SELECT student_name 이름, COALESCE (student_kor, student_eng, student_math,0) AS 첫번쨰점수
FROM tbl_student;


SELECT * FROM tbl_student;


-- 수정 UPDATE

UPDATE tbl_student 
SET student_kor = nvl(student_kor, 0);


SELECT
	student_name 이름 ,
	student_math 수학점수,
	student_eng  영어점수,
	student_kor 한국어점수 ,
	(student_math + student_eng + student_kor) / 3 평균점수
FROM
	tbl_student;


--학생의 평균점수를 구하고 학점 수정하기
--A : 90점이상
--B : 80점 이상 90점 미만
--C : 50점 이상 80점 미만
--F : 50점 미만

--Round(값, 자리수) : Round 함수는 소수점을 반올림하여 특정 소수점 까지만 표현할 수 있다.
--Round()

UPDATE
	tbl_student
SET
	student_grade = 'A'
WHERE
	Round((student_math + student_eng + student_kor) / 3) >= 90;


UPDATE
	tbl_student
SET
	student_grade = 'B'
WHERE
	Round((student_math + student_eng + student_kor) / 3) >= 80
	AND Round((student_math + student_eng + student_kor) / 3) < 90;


UPDATE
	tbl_student
SET
	student_grade = 'C'
WHERE
	Round((student_math + student_eng + student_kor) / 3) >= 50
	AND Round((student_math + student_eng + student_kor) / 3) < 80;


UPDATE
	tbl_student
SET
	student_grade = 'F'
WHERE
	Round((student_math + student_eng + student_kor) / 3) < 50;

SELECT
	*
FROM
	tbl_student ;


-- Q1. 학생의 수학, 영어, 국어 점수 중 한 과목이라도 50점미만이 아니고
-- 학점이 B이상인 학생만 학생번호, 이름, 학점으로 별칭 붙여서 출력하기

-- Q2. 학생의 수학, 영어, 국어 점수 중 한 과목이라도 30점 미만이면 테이블에서 삭제하기

SELECT
	student_number 학번,
	student_name 이름,
	student_grade 학점
FROM
	tbl_student
WHERE
	student_math >= 50
	AND student_eng >= 50
	AND student_kor >= 50
	AND student_grade like 'B'
	or student_grade like 'A'
;

DELETE
FROM
	tbl_student
WHERE
	student_math < 30
	OR student_eng < 30
	OR student_kor < 30

SELECT
	*
FROM
	tbl_student;







-- 내부 조인

--도서 테이블고 ㅏ도서 가격테이블 생성

CREATE TABLE tbl_books(
	book_id NUMBER,
	book_title varchar2(1000),
	book_author varchar2(100),
	CONSTRAINT book_pk PRIMARY KEY(book_id)
)

CREATE TABLE tbl_bookprice(
	bp_id NUMBER,
	bp_price NUMBER,
	CONSTRAINT bp_pk PRIMARY KEY(bp_id)
);

CREATE TABLE tbl_member(
	mem_id NUMBER,
	mem_name varchar2(100),
	mem_phone varchar2(100),
	mem_email varchar2(200),
	constraints memeber_pk PRIMARY KEY(mem_id)
	);

CREATE TABLE tbl_rental(
ren_id NUMBER,mem_id NUMBER,book_id NUMBER,ren_rentaldate DATE,ren_returndate DATE,
CONSTRAINT pk_rental PRIMARY KEY(ren_id),
CONSTRAINT fk_rental FOREIGN KEY(mem_id) REFERENCES tbl_member(mem_id),
CONSTRAINT fk_rental_book FOREIGN KEY(book_id) REFERENCES tbl_books(book_id)
);

DROP TABLE tbl_books;
DROP TABLE tbl_bookprice;
DROP TABLE tbl_member;


--값 추가

INSERT INTO TBL_BOOKS tb
values(1,'위대한 개츠비', 'F.스콧 피츠제럴드');
--values(2,'해리포터와 마법사의 돌', 'J.K. 롤링');
--values(3,'1984', '조지오웰');
--values(4,'오만과 편견', '제인오스틴');
--values(5,'데미안', '헤르만 헤세');
--values(6,'모모', '미하일 엔더');

SELECT * FROM TBL_MEMBER;

INSERT INTO tbl_bookprice
VALUES (1,15000);
--VALUES (2,17000);
--VALUES (3,19000);
--VALUES (4,21000);
--VALUES (5,23000);
--VALUES (6,15000);

INSERT INTO TBL_RENTAL
--VALUES(1, 1, 3, TO_DATE('2023-12-11', 'YYYY-MM-DD'), TO_DATE('2023-12-18', 'YYYY-MM-DD'));
--VALUES(2, 2, 1, TO_DATE('2023-12-11', 'YYYY-MM-DD'), TO_DATE('2023-12-18', 'YYYY-MM-DD'));
--VALUES(3, 3, 2, TO_DATE('2023-12-13', 'YYYY-MM-DD'), TO_DATE('2023-12-20', 'YYYY-MM-DD'));
--VALUES(4, 4, 4, TO_DATE('2023-12-20', 'YYYY-MM-DD'), TO_DATE('2023-12-27', 'YYYY-MM-DD'));
--VALUES(5, 5, 5, TO_DATE('2023-12-22', 'YYYY-MM-DD'), TO_DATE('2023-12-29', 'YYYY-MM-DD'));




INSERT INTO TBL_MEMBER
--VALUES(1, '짱구', '123-456-7890', 'aaa@koreait.com');
--values(2, '유리', '987-654-3210', 'bbb@koreait.com');
--values(3, '철수', '555-123-4567', 'ccc@koreait.com');
--values(4, '훈이', '777-888-9999', 'ddd@koreait.com');
--values(5, '맹구', '555-777-3333', 'eee@koreait.com');

--관계가 없는 2개의 테이블 내부 조인

SELECT A.book_id, book_title,book_author,B.bp_id
FROM tbl_books A INNER JOIN tbl_bookprice B
ON A.book_id = B.bp_id; 






-- 등가조인 : 두 개 이상의 테이블을 조인할 때, 특정 컬럼들의 값이 서로 같은 행만 결과로 반환

-- 대여정보와 책의 저자를 가져오는 등가조인
-- 1) 행의 개수를 먼저 파악하여 선행 테이블, 후행 테이블 설정
SELECT COUNT(*)
FROM TBL_BOOKS;

SELECT COUNT(*)
FROM TBL_RENTAL;

-- 2) JOIN 사용하여 두개의 테이블 조회
SELECT TR.REN_RENTALDATE, TR.REN_RETURNDATE, TB.BOOK_AUTHOR
FROM TBL_RENTAL tr INNER JOIN TBL_BOOKS tb
-- 3) 두개의 테이블에서 일치하는 컬럼을 확인 후 ON절에 추가
ON TR.BOOK_ID = TB.BOOK_ID;


-- 대여한 책이름과 반납날짜 가져오는 등가조인
SELECT TB.BOOK_TITLE, TR.REN_RETURNDATE
FROM TBL_BOOKS tb JOIN TBL_RENTAL tr 
ON TB.BOOK_ID = TR.BOOK_ID;


SELECT TB.*, TR.*
FROM TBL_BOOKS tb JOIN TBL_RENTAL tr 
ON TB.BOOK_ID = TR.BOOK_ID;

-- 회원의 이름과 대여한 책의 제목을 가져오는 등가조인

SELECT TB.BOOK_TITLE, TM.MEM_NAME
FROM TBL_BOOKS TB INNER JOIN TBL_MEMBER tm
ON TB.BOOK_ID = TM.MEM_ID;


SELECT TB.BOOK_ID, TB.BOOK_TITLE, TM.MEM_ID, TM.MEM_NAME
FROM TBL_RENTAL TR 
JOIN TBL_MEMBER TM ON TR.MEM_ID = TM.MEM_ID
JOIN TBL_BOOKS tb ON TR.BOOK_ID = TB.BOOK_ID;  

-- 비등가조인 : 두 테이블간의 조건이 같음이 아닌 범위 조건 등을 사용하는 방식

-- 책 대여일-반납일 사이에 특정 날짜가 포함되어있는지 조회
SELECT TM.MEM_NAME, TB.BOOK_TITLE, TR.REN_RENTALDATE, TR.REN_RETURNDATE
FROM TBL_RENTAL tr 
JOIN TBL_BOOKS TB ON TR.BOOK_ID = TB.BOOK_ID
JOIN TBL_MEMBER TM ON TR.MEM_ID = TM.MEM_ID
WHERE TO_DATE('2023-12-25', 'YYYY-MM-DD') BETWEEN TR.REN_RENTALDATE AND TR.REN_RETURNDATE;

-- 대여기간에 따라 책의 대여 상태
-- 7일 이하 단기대여, 7일 이상 장기 대여
SELECT TB.BOOK_TITLE, TM.MEM_NAME, TR.REN_RENTALDATE, TR.REN_RETURNDATE,
   CASE 
      WHEN REN_RETURNDATE - REN_RENTALDATE <= 7 THEN '단기대여'
      ELSE '장기대여'
--      WHEN REN_RETURNDATE < SYSDATE THEN '반납완료'
--      ELSE '대여중'
   END AS RENTAL_TYPE
FROM TBL_RENTAL tr 
JOIN TBL_BOOKS tb ON TR.BOOK_ID = TB.BOOK_ID
JOIN TBL_MEMBER tm ON TR.MEM_ID = TM.MEM_ID;
   

--sql 실행순서
-- from > on > join > where > group by > having > select > order by
--
-- from : 테이블이나 뷰의 데이터 가져오기
-- on : join절의 조건 평가
-- join : 지정된 조건에 따라 두 개 이상의 테이블을 조인
-- where : 조인 결과에서 조건에 맞는 행을 필터링
-- group by : 데이터 그룹화 (집계함수와 주로 사용)
-- having : group by로 그룹화된 데이터에 대해 조건 적용
-- select : 조회할 컬럼을 선택 (집계함수, 별칭)
-- order by : 최종 결과를 정렬 (asc,desc)
--   


-- 외부 조인

CREATE TABLE TBL_BOOKPRICE(
   BP_ID NUMBER,
   BP_PRICE NUMBER,
   CONSTRAINT BP_PK PRIMARY KEY(BP_ID)
);


INSERT
	INTO
	TBL_BOOKPRICE
	--VALUES(1, 15000);
	--VALUES(2, 18000);
	--VALUES(3, 14000);
	--VALUES(4, 17000);

	SELECT * FROM TBL_BOOKS tb ;
	SELECT * FROM TBL_BOOKPRICE tp ;
	
	-- 1 ) 왼쪽 외부 조인(left outer join)
	-- books 테이블 기준 왼쪽 외부조인을 수행하고 bookprice 테이블의 데이터를 포함 (왼쪽테이블의 데이터가 없어도 결과에 포함됨)
	SELECT tb.book_id, tb.book_title, tb.book_author, tp.bp_id, tp.bp_price
	FROM tbl_books tb
	LEFT OUTER JOIN TBL_BOOKPRICE TP
	ON tb.BOOK_ID  = tp.BP_ID ;



--  2 ) 오른쪽 외부 조인(left outer join)
	-- bookprice 테이블 기준 오른쪽 외부조인을 수행하고 book 테이블의 데이터를 포함 
	SELECT tb.book_id, tb.book_title, tb.book_author, tp.bp_id, tp.bp_price
	FROM tbl_books tb
	right OUTER JOIN TBL_BOOKPRICE TP
	ON tb.BOOK_ID  = tp.BP_ID ;

	INSERT INTO tbl_books tb
	values(10,'dbms', 'db');


	INSERT INTO TBL_BOOKPRICE
--	VALUES (5,20000);
--	VALUES (6,22000);
--	VALUES (7,24000);
	
-- 	완전 외부조인(Full outer join) : 왼쪽 테이블과 오른쪽 테이블의 데이터를 모두 포함
-- 	어느 한쪽에만 데이터가 있는 경우에도 결과에 포함
	
	SELECT tb.book_id, tb.book_title, tb.book_author, tp.bp_id, tp.bp_price
	FROM TBL_BOOKS tb 
	FULL OUTER JOIN TBL_BOOKPRICE TP
	ON tb.BOOK_ID = tp.BP_ID ;
		
	SELECT * FROM emp;
	SELECT * FROM dept;
	
	-- 오류 발생 : 열의 수가 다르면 union을 사용할 수 없다
	SELECT * FROM emp
	UNION
	SELECT * FROM dept;
	
	-- 오류 발생 : 열의 타입이 다르면 union을 사용할 수 없다.
	SELECT empno, deptno, job FROM emp
	UNION
	SELECT * FROM dept;


	-- 열의 수와 타입이 일치한다면 union이 가능하다. 
	SELECT sal, ename,job FROM EMP
	UNION
	SELECT * FROM dept;
	
	-- 위쪽 쿼리에 별칭을 주면 테이블의 열 이름으로 사용된다.
	SELECT deptno 숫자, dname 문자, loc 문자 FROM DEPT d 
	UNION
	SELECT sal, ename,job FROM emp;


	-- union 되기 이전 컬럼명이나 소속을 이용해도 정렬되지 않는다.
	-- 별칭을 붙여서 정렬
	SELECT empno 번호, ename 이름, job 직장
	FROM EMP
	UNION
	SELECT * FROM DEPT
	ORDER BY 번호;
	
	-- 교집합
	SELECT * FROM player p ;
	
	SELECT player_name 이름, team_id 팀, height 키, weight 몸무게
	FROM player p
	WHERE height BETWEEN 177 AND 185
	INTERSECT
	SELECT player_name 이름, team_id 팀, height 키, weight 몸무게
	FROM player p2
	WHERE weight BETWEEN 76 AND 78;

	-- 차집합
	SELECT * FROM player p ;
	
	SELECT player_name 이름, team_id 팀, height 키, weight 몸무게
	FROM player p
	WHERE height BETWEEN 177 AND 185
	MINUS 
	SELECT player_name 이름, team_id 팀, height 키, weight 몸무게
	FROM player p2
	WHERE weight BETWEEN 76 AND 78;


	--형 변환 함수
	--to_char
	
	SELECT TO_char(sysdate, 'YYYY/mm/dd') FROM dual;
	SELECT TO_char(sysdate, 'YYYY"년"mm"월"dd"일') FROM dual;
	SELECT to_char(sysdate, 'YYYY/MM/DD-HH')FROM dual;

	-- to_number()
	SELECT '1234', to_number('1234') FROM dual;
	SELECT '123' + '123' FROM dual;

	--to date()
	SELECT to_date('2300-12-25', 'yyyy-mm-dd') FROM dual;

	
	--view
	-- 회원정보와 대여정보를 조합
	
	CREATE VIEW memrental AS
	SELECT m.mem_id, m.mem_name, r.rem_id, r.book_id, r.ren_rentaldate, r.ren_returndate
	FROM tbl_member tm
	JOIN tbl_rental tr 
	ON m.mem_id = r.mem_id;


	SELECT * FROM memrental;

	-- player 테이블에서 나이 컬럼을 추가한 뷰 만들기
	SELECT * FROM player p;
	
	SELECT player_name, birth_date, sysdate - birth_date
	FROM player p;
	
	CREATE VIEW view_player AS
	SELECT player_name, TO_char(trunc(birth_date),'YYYY-mm-dd') 생일, round((sysdate - birth_date)/365,0) AS 나이
	FROM player p;
	--TRUNC 함수 : TRUNC(data [, format]) : 날짜 값에서 시간 정보(mm:mi:ss)를 제거하고 날짜만 반환됨
	
	DROP VIEW VIEW_player;
	
	CREATE VIEW VIEW_player as
	SELECT p.*, ROUND((SYSDATE-birth_date)/365,0) AS age
	FROM player p


	SELECT age FROM view_player;
	
	-- employees 테이블에서 사원이름과 그 매니저 이름이 있는 view 만들기

	SELECT * FROM employees;

	--SELF JOIN
	CREATE VIEW view_employees AS
	SELECT e1.employee_id, e1.FIRST_NAME || ' ' || e1.LAST_NAME 사원이름, 
   	e2.MANAGER_ID, e2.FIRST_NAME || ' ' || e2.LAST_NAME 매니저이름,
   	e1.job_id, e1.department_id
	FROM EMPLOYEES e1 JOIN EMPLOYEES e2
	ON E1.MANAGER_ID = E2.EMPLOYEE_ID;

	select employee_id, e.FIRST_NAME || ' ' || e.LAST_NAME 사원이름 FROM EMPLOYEES e;
	select MANAGER_id, e.FIRST_NAME || ' ' || e.LAST_NAME 사원이름 FROM EMPLOYEES e;

	select employee_id, e.FIRST_NAME || ' ' || e.LAST_NAME 사원이름,
   	MANAGER_id, e.FIRST_NAME || ' ' || e.LAST_NAME 매니저이름 FROM EMPLOYEES e;

	-- 셀프조인 : employees 테이블내에서 직원과 해당 직원의 매니저를 같은 테이블 매칭
	SELECT e1.employee_id 사원테이블, e2.EMPLOYEE_ID 매니저테이블, e1.employee_id, e1.FIRST_NAME || ' ' || e1.LAST_NAME 사원이름,
   	e2.MANAGER_ID, e2.FIRST_name || ' ' || e2.last_name 매니저이름
	FROM employees e1 JOIN employees e2
	ON e1.MANAGER_ID = e2.employee_id;
	-- e1 : 사원, e2 : 매니저
	-- on e1.MANAGER_ID = e2.employee_id
	-- e1 사원의 manager_id가 e2 매니저 employee_id 일치할 때 

	SELECT * FROM view_employees ve;

	
	--view_employees의 department_id를 이용해서 department_name이 나오는지 확인
	SELECT ve.EMPLOYEE_ID, ve.사원이름, d.department_name 
	FROM view_employees ve
	JOIN DEPARTMENTS d 
	ON ve.DEPARTMENT_ID = d.DEPARTMENT_ID 
	;

	-- pk 설정된 것 확인 쿼리문
	SELECT cols.table_name, cols.column_name, cons.CONSTRAINT_name
	FROM all_constraints cons
	JOIN all_cons_columns cols
	ON cons.constraint_name = cols.constraint_name
	WHERE cons.constraint_type ='P'
	AND cols.table_name = 'EMPLOYEES';
	SELECT * FROM all_cons_columns cols;
	

	--fk 설정된 것 확인 쿼리문 
	SELECT cols.table_name, cols.column_name, cons.constraint_name
	FROM all_constraints cons
	JOIN all_cons_columns cols
	ON cons.constraint_name = cols.constraint_name
	WHERE cons.constraint_type = 'R'
	AND cols.table_name = 'EMPLOYEES';
	



	SELECT * FROM user_tab_privs_recd;


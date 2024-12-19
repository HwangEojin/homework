-- 집계함수 : 결과 행은 1개
-- 주의사항 : NULL은 포함시키지 않는다.


SELECT * FROM employees;


-- count()

--1) 전체 직원 수 확인

SELECT count(*)
FROM employees;

--2) 특정 부서 110번의 직원 수 확인

SELECT DISTINCT department_id
FROM EMPLOYEES;

SELECT count(*) AS "110번의 직원수"
FROM EMPLOYEES
WHERE DEPARTMENT_ID =110;

-- sum()

--모든 직원의 급여 총합 계산

SELECT sum(salary)
FROM employees;

--부서별 급여 총합 계산
SELECT DISTINCT department_id , SALARY 
FROM employees;

SELECT department_id, sum(salary)
FROM employees
GROUP BY department_id;

--avg()
SELECT avg(salary)
FROM employees;

--부서별 평균 급여

SELECT department_id,avg(salary)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID ;


--max(),min()

SELECT max(salary),min(salary)
FROM EMPLOYEES;

--부서별 최고급여, 최저급여, 평균급여, 총합 조회하기
SELECT DEPARTMENT_ID ,max(salary), min(salary), avg(SALARY),min(SALARY)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID;


SELECT *
FROM employees;

SELECT count(NVL(COMMISSION_PCT,0)),  count(COMMISSION_PCT)
FROM employees;




--group by, having

-- 평균 급여가 5000 이상인 부서 조회

SELECT department_id,avg(salary)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID 
HAVING avg(salary) > 5000;


-- 부서별 급여 총합이 50000 보다 작은 부서들만 내림차순으로 정렬


SELECT DEPARTMENT_ID 부서,sum(salary) AS "부서별 급여 총합"
GROUP BY department_id
HAVING sum(SALARY) < 50000
ORDER BY "부서별 급여 총합" desc;

-- group by : ~별
-- group by 컬럼명 having 조건식
-- where 절은 집계함수 불가, having 집계함수 가능




CREATE TABLE tbl_stu( 
   stu_id NUMBER PRIMARY KEY,
   stu_name varchar2(100) NOT NULL,
   stu_phone varchar2(100),
   stu_age NUMBER,
   stu_dept varchar2(100) 
);

SELECT * FROM tbl_stu;

INSERT INTO tbl_stu
--VALUES (1, '조승우', '010-8901-8888', 30, '교육학과');
--VALUES (2, '이동욱', '010-9012-9999', 30, '컴퓨터 공학과');
--VALUES (3, '김소현', '010-9876-1234', 20, '방송연예과');
--VALUES (4, '김남길', '010-5050-1222', 26, '컴퓨터 공학과');
--VALUES (5, '강하늘', '010-5111-5151', 22, '방송연예과');
--VALUES (6, '공유', '010-5050-5151', 30, '컴퓨터 공학과');
--VALUES (7, '이종혁', '010-1213-2222', 34, '방송연예과');
--VALUES (8, '박은빈', '010-1213-2222', 20, '방송연예과');

SELECT * FROM tbl_stu;

--1) 학과 종류 검색
	
	SELECT distinct stu_dept 
	FROM tbl_stu;


--2) 각 학과별 학생수 조회
	SELECT stu_dept, count(*)
	FROM tbl_stu
	GROUP BY stu_dept;

--3) 각 학과별 평균나이 조회
	SELECT stu_dept, round(avg(stu_age),2)
	FROM tbl_stu
	GROUP BY stu_dept;
	

--4) 학과별로 30세 이상인 학생수 조회
	SELECT stu_dept,stu_name,stu_age,stu_phone
	FROM tbl_stu
	WHERE stu_age >=30
--	GROUP BY stu_dept;

	--윈도우 함수 over()
	
	SELECT stu_dept, stu_name , stu_age, stu_phone, count(*) OVER (PARTITION BY stu_dept)
	FROM tbl_stu
	WHERE stu_age >=30;
	
	--서브 쿼리 : 학과별 학생 정보를 출력하면서 그룹화된 정보 유지
	SELECT T.stu_dept, T.stu_name, T.stu_age, T.stu_phone , s.학생수
	FROM tbl_stu T
	JOIN(
		SELECT stu_dept, count(*) 학생수
		FROM TBL_STU
		WHERE stu_age >= 30
		GROUP BY stu_dept
	) S ON T.stu_dept = s.stu_dept
	WHERE t.stu_age >=30
	ORDER BY t.stu_dept;



--5) 학생 이름이 김으로 시작하거나 이로 시작하는 학생들의 학과별 수 조회

	SELECT stu_dept, count(*)
	FROM tbl_stu
	WHERE stu_name LIKE '김%' OR stu_name LIKE '이%'
	GROUP BY stu_dept


--6) 컴퓨터 공학과의 학생 중 25살 이상인 학생 수 조회
	
	SELECT stu_dept, count(*)
	FROM tbl_stu
	WHERE stu_age > 25 
	GROUP BY stu_dept
	HAVING stu_dept ='컴퓨터 공학과'




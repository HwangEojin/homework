--SELECT	: 테이블에서 데이터를 조회할 때 사용하는 명령어
--hr 계정 내에 존재하는 employee 테이블
--107행, 11개의 컬럼으로 이루어져 있다.
--107명의 직원 데이터를 저장해 놓은 연습용 테이블

--SElECT 칼럼명 FROM 테이블명

SELECT  first_name FROM HR.EMPLOYEES;
SELECT  first_name ,LAST_NAME FROM EMPLOYEES;
--HR 계정을 작성하는 이유는 여러 계정에 같은 이름의 테이블이 이름이 존재할 수 있기 때문이다.
-- 지금 로그인한 계정의 테이블의 우선순위가 높기 때문에 일반적으로 계정명을 생략이 가능하다.

--사원의 이름(first_name) 성 (last_name),급여를 조회하기
SELECT  first_name,LAST_name,salary  FROM EMPLOYEES ;

--정렬해서 조회하기
--ORDER BY절
--사원의 이름, 성 , 급여를 급여 낮은 순으로 정렬

SELECT FIRST_NAME, LAST_NAME, SALARY 	--2) first_name, last_name, salary 칼럼을 조회
FROM EMPLOYEES							--1) EMPLOYEES 테이블
ORDER BY SALARY ASC;					--3) salary를 오름차순으로 정렬
--ASC : 오름차순 (ascending) 
--DESC : 오름차순 (descending) 

SELECT first_name, last_name, salary
FROM EMPLOYEES
ORDER BY SALARY  DESC ;

SELECT * FROM EMPLOYEES;

--문자의 정렬(first_name)
SELECT first_name
FROM EMPLOYEES
ORDER BY FIRST_NAME ASC ;
--order by 절에서 오름차순 ASC 나 내림차순 DESC를 생략하면 오름차순으로 정렬된다.

SELECT * from  EMPLOYEES;

SELECT salary
FROM EMPLOYEES
ORDER BY SALARY ;

--날짜의 정렬(hire_date)

SELECT  hire_date
FROM EMPLOYEES
ORDER BY HIRE_DATE ASC;

-- ORDER BY절의 컬럼명은 조회하는 컬럼명과 반드시 일치하지 않아도 가능하다(해당 테이블에 있는 컬럼이라면)
-- 2개의 정렬기준도 가능하다
-- 첫번째 작성한 컬럼의 값을 기준을 잡아 정렬하고 해당 컬럼의 값이 동일하다면 2차적으로 그다음 컬럼값을 기준으로 정렬한다
SELECT first_name, SALARY
FROM employees 
ORDER BY first_name, salary;

-- 사원 테이블에서 직급(JOB_ID)을 조회하기
SELECT JOB_ID
FROM employees;

-- 직급의 종류를 확인하기 위해 중복 행을 제거
-- DISTINCT : 해당 컬럼에서 중복되는 값을 제외시킨다
SELECT DISTINCT job_id
FROM employees;

-- 컬럼을 여러개 넣으면 DISTINCT는 어떻게 작동할까?
-- 여러 컬럼을 동시에 작성할 경우 두개의 컬럼이 모두 중복되는 경우에만 중복처리한다(중복을 제거한다)
SELECT DISTINCT job_id, hire_date
FROM employees;


-- 별칭 붙여 조회하기
SELECT  FIRST_name  AS "이름", last_name AS "성" SALARY AS "봉급" FROM EMPLOYEES;



--사원의 이름 (first_name ) 성(last_name),봉급을 조회하는데 봉급 내림차수능로 별칭사용하여 조회하기

SELECT 
first_name AS "이름",
last_name AS "성",
salary AS "봉급"
FROM EMPLOYEES
ORDER BY salary DESC;

-- 쿼리문 실행순서 from -> select -> orderby



--집합

--결과 6개 행
SELECT * FROM emp e
WHERE DEPTNO  = 30;

--결과 3개 행
SELECT * FROM emp e
WHERE DEPTNO  = 10;

--emp 테이블에서 deptno가 30 또는 10인 데이터를 조회
-- 두 테이블을 union(합집합)으로 연결한다.
SELECT * 
FROM emp
WHERE deptno = 30
UNION all
SELECT * 
FROM emp
WHERE DEPTNO  = 10;

-- emp 테이블에서 sal 1000 이상 2000이하 1500이상 3000 이하의 결과를 같이 조회
SELECT * FROM emp e
WHERE sal BETWEEN 1000 AND 2000
UNION all
SELECT * FROM emp e2
WHERE sal BETWEEN 1500 AND 3000;


SELECT * FROM tbl_books tb;
INSERT INTO tbl_books
values(11,'commit','TCL');

INSERT INTO TBL_BOOKS
values(12,'roolback','TCL');

SELECT * FROM TBL_RENTAL tr;

DELETE FROM TBL_RENTAL tr;

TRUNCATE TABLE TBL_RENTAL ;


WHERE ren_id =4;

SELECT * FROM employees;
SELECT first_name, salary,
	CASE 
		WHEN salary >= 50000 THEN '높음'
		WHEN salary >= 30000 THEN '중간'
		ELSE '낮음'
	END 급여
	FROM EMPLOYEES e ;
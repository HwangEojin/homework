/* PLAYER 테이블에서 WEIGHT가 70이상이고 80이하인 선수 검색 */
/* PLAYER 테이블에서 TEAM_ID가 'K03'이고 HEIGHT가 180 미만인 선수 검색 */
/* PLAYER 테이블에서 TEAM_ID가 'K06'이고 NICKNAME이 '제리'인 선수 검색 */
/* PLAYER 테이블에서 HEIGHT가 170이상이고 WEIGHT가 80이상인 선수 이름 검색 */
/* STADIUM 테이블에서 SEAT_COUNT가 30000초과이고 41000이하인 경기장 검색 */
/* PLAYER 테이블에서 TEAM_ID가 'K02'이거나 'K07'이고 포지션은 'MF'인 선수 검색 */
/* PLAYER 테이블에서 POSITION이 NULL인 선수 검색 */
/* PLAYER 테이블에서 NICKNAME이 NULL인 선수를 '없음'으로 변경하여 조회하기 */
/* PLAYER 테이블에서 NATION이 등록되어 있으면 '등록', 아니면 '미등록'으로 검색 */
/* PLAYER 테이블에서 POSITION이 NULL인 선수를 '미정'으로*/


/* PLAYER 테이블에서 포지션 종류 검색 */
/* PLAYER 테이블에서 몸무게가 80이상인 선수들의 평균 키가 180초과인 포지션 검색 */
/* EMPLOYEES 테이블에서 JOB_ID별 평균 SALARY가 10000미만인 JOB_ID 검색 JOB_ID는 알파벳 순으로 정렬(오름차순) */
/* PLAYER_ID가 2007로 시작하는 선수들 중 POSITION별 평균 키를 조회 */
/* 선수들 중 포지션이 DF 선수들의 평균 키를 TEAM_ID 별로 조회하고 평균 키 오름차순으로 정렬하기 */
/* 포지션이 MF인 선수들의 입단연도 별 평균 몸무게, 평균 키를 구한다.
 * 칼럼명은 입단연도, 평균 몸무게, 평균 키 로 표시한다.
 * 입단연도를 오름차순으로 정렬한다.
 * 단, 평균 몸무게는 70 이상 그리고 평균 키는 160 이상인 입단연도만 조회 */
/* PLAYER 테이블에서 TEAM_ID가 'K01'인 선수 중 POSITION이
 * 'GK'인 선수를 조회하기 SUB쿼리 사용하기 */
/* PLAYER 테이블에서 평균 몸무게보다 더 많이 나가는 선수들 검색 (조건에 서브쿼리 사용) */
/* PLAYER 테이블에서 정남일 선수가 소속된 팀의 선수들 조회*/
/* PLAYER 테이블에서 평균 키보다 작은 선수 조회*/
/*SCHEDULE 테이블에서 경기 일정이 
 * 20120501 ~ 20120502 사이에 있는 경기장 전체 정보 조회*/


/*
 * EMPLOYEE 테이블
 * 핸드폰번호가 515로 시작하는 사원들의
 * JOB_ID별 SALARY 평균을 구한다.
 * 조회 컬럼은 부서, 평균 급여 로 표시한다.
 * 평균 급여가 높은 순으로 정렬한다.
 */
/* COMMISSION_PCT 별 평균 급여를 조회한다.
 * COMMISSION_PCT 를 오름차순으로 정렬하며 
 * HAVING절을 사용하여 NULL은 제외한다.*/


-- 1
SELECT * 
FROM player
WHERE weight BETWEEN  70 AND 80;

--2
SELECT *
FROM player
WHERE HEIGHT < 180 AND TEAM_ID ='K03';

--3
SELECT *
FROM player
WHERE NICKNAME = '제리' AND TEAM_ID ='K06';

--4
SELECT *
FROM player
WHERE HEIGHT >= 170 AND WEIGHT >= 80;

--5
SELECT * 
FROM STADIUM
WHERE SEAT_COUNT  > 30000 AND SEAT_COUNT <= 41000;

--6
SELECT *
FROM player
WHERE (TEAM_ID ='K02' OR  TEAM_ID ='K07') AND POSITION ='MF';

--7
SELECT *
FROM player
WHERE POSITION IS NULL;

--8
SELECT  PLAYER_NAME , NVL(NICKNAME,'없음') AS "닉네임"
FROM player
WHERE NICKNAME IS null;

--9
SELECT  PLAYER_NAME , NVL2(nation, '등록','미등록') AS "국적"
FROM player;

--10
SELECT player_name, NVL(POSITION, '미정') AS "포지션"
FROM player;


--1
SELECT DISTINCT POSITION
FROM player;

--2

SELECT POSITION,avg(height) "평균키"
FROM PLAYER
WHERE weight >= 80
GROUP BY POSITION
HAVING AVG(height) >180;

--3

SELECT JOB_ID 
FROM employees
GROUP BY JOB_ID 
HAVING AVG(SALARY) < 10000 
ORDER BY job_id;

--4
SELECT position, AVG(height) 
FROM (SELECT POSITION, height FROM player WHERE player_Id LIKE '2007%')
GROUP BY POSITION;

--5
SELECT team_Id, AVG(height)
FROM (SELECT POSITION, height ,team_id FROM player WHERE POSITION ='DF')
GROUP BY team_id
ORDER BY avg(height);

--6

SELECT join_yyyy , player_name
FROM (
	SELECT position,weight, height,join_YYYY,player_name
		FROM player 
		WHERE POSITION ='MF'
	)
GROUP BY JOIN_YYYY
HAVING AVG(weight) >= 70 AND avg(height) >= 160
ORDER BY JOIN_YYYY; 

--7
SELECT player_name, POSITION, team_id
FROM (SELECT * FROM player WHERE team_Id = 'K01')
WHERE POSITION = 'GK'
;


--8
SELECT player_name
FROM player
WHERE  weight > (SELECT AVG(weight) FROM player)

--9
SELECT * 
FROM player
WHERE team_id = (SELECT team_id FROM player WHERE player_name ='정남일')
;

--10
SELECT player_name 
FROM player
WHERE height >(SELECT AVG(height) FROM player);

--11
SELECT * 
FROM STADIUM 
WHERE STADIUM_ID in(SELECT STADIUM_ID FROM SCHEDULE WHERE sche_date ='20120501' OR sche_date ='20120502' )

--12

	SELECT department_id, 
		(SELECT 
			AVG(SALARY)
			FROM EMPLOYEES e2 
			WHERE PHONE_NUMBER LIKE '515%' AND e2.job_id = e.job_id 
		) AS "평균 급여"
	FROM employees e
	GROUP BY DEPARTMENT_ID , JOB_ID
	ORDER BY "평균 급여" DESC;
;

--13
SELECT COMMISSION_PCT , AVG(SALARY) 
FROM employees
GROUP BY COMMISSION_PCT 
HAVING COMMISSION_PCT  IS NOT null
ORDER BY COMMISSION_PCT ;
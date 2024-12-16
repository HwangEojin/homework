--sql 주석 (ctrl + /)
--주석처리된 sql 문은 실행되지 않는다.
--한줄 주석 --: 해당 라인 줄을 주석 처리

/*
 * 범위 주석 (ctrl + shift + /) 
 * 범위 안에 있는 라인을 주석 처리
 */

--select를 사용하여 employees 테이블의 모든 컬럼 조회하기
SELECT * FROM EMPLOYEES;

--select를 사용하여 employees 테이블의 first_name 컬럼만 선택하여 조회하기
SELECT first_name FROM EMPLOYEES;


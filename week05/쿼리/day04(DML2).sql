--FK 관계 맺은 테이블 수정 / 삭제

CREATE TABLE tbl_phone(
	phone_number varchar2(1000),
	phone_color varchar2(100),
	phone_size number,
	phone_price number,
	phone_sale number,
	phone_production_date date,
	CONSTRAINT pk_phone PRIMARY KEY(phone_number)
	);


CREATE TABLE tbl_case(
	case_number varchar2(100),
	case_color varchar2(100),
	case_price NUMBER,
	phone_number varchar2(1000),
	CONSTRAINT pk_case PRIMARY KEY(case_number),
	CONSTRAINT fk_case FOREIGN KEY(phone_number) REFERENCES tbl_phone(phone_number)
);

SELECT * FROM tbl_phone;
SELECT * FROM tbl_case;


-- 관계를 맺은 테이블의 DML
-- 자식테이블은 부모 테이블의 값을 참조하기 때문에 항상 부모테이블의 DATA가 먼저 들어간다
-- phone 테이블이 부모이므로 phone에 먼저 데이터를 넣어야한다.

	INSERT INTO TBL_PHONE
	values('a1','white',1,100,0,'2024-12-01')

--DATE 타입의 컬럼에 문자타입의 값을 YYYY-MM-DD 형태로 넣으면 자동으로 DATE 타입으로 변환되어 들어간다
	
	INSERT INTO TBL_PHONE
	values('a2','black',1,120,10,sysdate-10);
	
	INSERT INTO TBL_PHONE
	values('a3','black',1,130,20,to_date('2024-05-05'))
	-- to_date()함수를 이용하여 문자열을 직접 DATE 타입으로 바꿀 수 있다.

	INSERT INTO TBL_CASE
--	values('A','White',5,'A1'); --phone 테이블에는 A1 값이 없기 때문에 (데이터 값은 대소문자 구분) 오류발생
	values('A','White',5,'a1'); 

-- 부모테이블의 값을 수정하기
UPDATE TBL_PHONE 
SET PHONE_COLOR = 'blue'
WHERE PHONE_NUMBER = 'a1';

--부모테이블의 PK값 수정
-- 자식테이블에서 참조하고 있는 값이 아니면 수정 가능하지만 참조하고 있는 값인 경우 수정이 불가능하다(오류발생)
UPDATE TBL_PHONE
SET PHONE_NUMBER = 'a03'
WHERE PHONE_NUMBER ='a3';

-- 부모의 값을 변경할 때 자식에서 참조중인 값을 변경하려고 하면 오류가 발생하므로
-- 자식 테이블을 먼저 수정하여 해당 값을 참조하지 않도록 수정해야한다
-- 1) 자식테이블에서 참조중인 값을 다른 값으로 변경한다
-- 2) 자식테이블에서 참조중인 값을 NULL로 변경한다(정말 급한게 아니라면 비추천)
UPDATE TBL_CASE 
SET PHONE_NUMBER = NULL
WHERE CASE_NUMBER = 'B';

UPDATE TBL_PHONE 
SET PHONE_NUMBER = 'a02'
WHERE PHONE_NUMBER = 'a2';

UPDATE TBL_CASE 
SET PHONE_NUMBER = 'a02'
WHERE CASE_NUMBER = 'B';

SELECT * FROM TBL_PHONE;
SELECT * FROM TBL_CASE;


--부모 테이블에서 데이터 삭제하기
--자식 테이블에서 참조중인 값을 미리 처리해야한다.
DELETE  FROM tbl_phone
WHERE phone_number = 'a02'; --자식테이블에서 참조중인 값이라 삭제 불가능

--1) 자식 테이블의 값을 먼저 삭제후 부모 테이블의 값을 삭제한다. (참조중인 행 자체를 삭제)
DELETE FROM TBL_CASE
WHERE phone_number = 'a02';

DELETE from tbl_phone
WHERE phone_number = 'a02'

--2) 자식 테이블에서 참조중인 값을 수정 후 부모 테이블의 값을 삭제한다.
UPDATE TBL_CASE
SET PHONE_NUMBER  = NULL 
wherer case_number = 'A';

DELETE FROM TBL_PHONE
WHERE phone_number = 'a01';






--2) 자식 테이블에서 참조중인 값을 수정 후 부모 테이블의 값을 삭제한다.
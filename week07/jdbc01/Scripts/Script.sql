CREATE SEQUENCE seq_user;

--사용자 정보를 저장하는 유저 테이블 tbl_user;
--사용자 번호 
--ID
--password
--이름
--나이
--성별
--생일

CREATE TABLE tbl_user(
	user_number NUMBER,
	user_id varchar2(100),
	user_pw varchar2(100),
	user_name varchar2(100),
	user_age NUMBER,
	user_gender char(1) DEFAULT 'M',
	user_birth DATE,
	CONSTRAINT pk_user PRIMARY KEY(user_number)
);

SELECT * FROM tbl_user;

INSERT INTO tbl_user
--values(seq_user.nextVal, 'aaa','1234','ggd',22,'M','20001010');
values(seq_user.nextVal, 'bbb','1234','hoj',22,'M','20001010');
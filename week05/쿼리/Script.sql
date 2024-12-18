--과제
--1. 학생 정보와 성적을 관리하기 위해 다음과 같은 정보를 저장해야한다
--- 학생번호, 이름, 나이, 전화번호, 주소
--- 과목명, 강사명, 수업일자, 수업시간, 학생성적, 수업번호, 과목번호

	CREATE TABLE tbl_stu (
		stu_number Number,
		stu_name varchar2(100) NOT NULL ,
		stu_age Number NOT NULL,
		stu_phoneNumber VARCHAR2(100),
		stu_address varchar2(1000),
		CONSTRAINT pk_stu PRIMARY key(stu_number),
		CONSTRAINT unique_phoneNumber UNIQUE(stu_phoneNumber)
		
	);
	

	CREATE TABLE tbl_grade (
		grade_grade char(1) DEFAULT 'F' CONSTRAINT tbl_grade_check CHECK (grade_grade ='A' OR grade_grade ='B' OR grade_grade ='C' OR grade_grade ='F' ),
		stu_number NUMBER,
		subj_number NUMBER,
		CONSTRAINT fk_stu FOREIGN KEY(stu_number) REFERENCES tbl_stu(stu_number),
		CONSTRAINT fk_subj FOREIGN KEY(subj_number) REFERENCES tbl_subj(subj_number),
		CONSTRAINT pk_grade PRIMARY KEY (stu_number, subj_number)
	);
	
	CREATE TABLE tbl_subj (
		subj_number Number,
		subj_name varchar2(100) NOT NULL ,
		subj_teacherName varchar2(100) NOT NULL,
		subj_classTime VARCHAR2(100) DEFAULT '09:00' CONSTRAINT subj_classTime_check CHECK (subj_classTime = '09:00' OR subj_classTime = '19:00' ),
		subj_classStart date,
		CONSTRAINT pk_subj PRIMARY key(subj_number)		
	);

	INSERT INTO TBL_STU 
	values(
		'1001' , '죠나단' , 17, '01011111111', '런던'
	);

	INSERT INTO TBL_STU 
	values(
		'1002' , '죠셉' , 18, '01022222222', '뉴욕'
	);
	
	INSERT INTO TBL_STU 
	values(
		'1003' , '쿠죠' , 19, '01033333333', '파리'
	);
	
	INSERT INTO TBL_STU 
	values(
		'1004' , '죠스케' , 17, '01044444444', '도쿄'
	);
	
	INSERT INTO TBL_STU 
	values(
		'1005' , '죠르노' , 17, '01055555555', '로마'
	)
	;
	
	
	INSERT INTO TBL_subj 
	values(
		'1' , '영어' , 'Erina', '09:00', '2024-12-01'
	);
	
	INSERT INTO TBL_subj 
	values(
		'2' , '국어' , 'Heyya', '19:00', '2024-12-02'
	);
	
	INSERT INTO TBL_subj 
	values(
		'3' , '과학' , 'DIEGO', '09:00', '2024-12-03'
	);
	
	INSERT INTO TBL_subj 
	values(
		'4' , '사회' , 'DIO', '19:00', '2024-12-04'
	);

	INSERT INTO TBL_subj 
	values(
		'5','역사' ,'DIAVOLO','09:00','2024-12-05'
	);

	INSERT INTO TBL_grade 
	values(
		'A',1001 ,1
	);
	INSERT INTO TBL_grade 
	values(
		'B',1002 ,1
	);
INSERT INTO TBL_grade 
	values(
		'C',1003 ,2
	);
INSERT INTO TBL_grade 
	values(
		'A',1001 ,2
	);
INSERT INTO TBL_grade 
	values(
		'A',1001 ,4
	);

	SELECT * FROM tbl_stu;
	SELECT * FROM tbl_subj;
	SELECT * FROM tbl_grade;

--
--2. 동물병원의 요구사항은 다음과 같다
--- 동물병원의 반려동물, 보호자의 정보를 저장하고 관리한다
--- 보호자는 번호, 이름, 주소, 핸드폰 번호, 이메일주소를 가진다
--- 반려동물은 번호, 이름, 성별, 나이, 종, 품종, 보호자 번호를 가진다
--- 모든 보호자는 중복이 없는 번호를 가진다
--- 보호자의 이름, 주소, 핸드폰 번호는 필수 정보이다
--- 모든 동물은 중복이 없는 번호를 가진다
--- 동물의 이름, 성별, 나이, 종, 보호자 번호는 필수 정보이다
--- 동물의 보호자 번호는 실제 존재하는 보호자 번호여야 한다

	
	CREATE TABLE tbl_master (
		master_number Number,
		master_name  varchar2(100) NOT NULL ,
		master_address  varchar2(100) NOT NULL,
		master_phoneNumber  VARCHAR2(100)  NOT NULL,
		master_email varchar2(1000),
		CONSTRAINT pk_master PRIMARY key(master_number),
		CONSTRAINT unique_ph UNIQUE(master_phoneNumber)
	);

	CREATE TABLE tbl_pet (
		pet_number Number,
		pet_name VARCHAR2(100) NOT NULL ,
		pet_age NUMBER NOT NULL,
	);

CREATE TABLE tbl_species (
		species_ spiecies VARCHAR2(1000)  NOT NULL,
		species_type VARCHAR2(1000) NOT NULL
		master_number Number,
		species_gender CHAR(1),
		CONSTRAINT fk_species FOREIGN KEY (master_number) REFERENCES tbl_master(master_number)
	);


--3. 아래와 같은 테이블이 있을 때 3차 정규화까지 각 단계별로 테이블을 만들고 값을 삽입 후 조회 쿼리문 결과를 확인하세요.

--- 기본 테이블명은 아래와 같고 테이블 추가하면서 값 넣을 땐 테이블명 달라져도 됨
--
--
---- 직원 테이블 생성 (1차 정규화를 적용하지 않은 형태로 유지)
--CREATE TABLE Employees (
--    EmployeeID NUMBER PRIMARY KEY,
--    Name VARCHAR2(50),
--    BirthDate DATE,
--    DepartmentInfo VARCHAR2(255),
--    Salary NUMBER
--);
--
---- 데이터 삽입
--INSERT INTO Employees (EmployeeID, Name, BirthDate, DepartmentInfo, Salary)
--VALUES (1, '스티븐', TO_DATE('2010-12-31', 'YYYY-MM-DD'), '영업부, 서울시.. 01234', 300);
--
--INSERT INTO Employees (EmployeeID, Name, BirthDate, DepartmentInfo, Salary)
--VALUES (2, '마리', TO_DATE('2011-10-01', 'YYYY-MM-DD'), '영업부, 서울시.. 01234', 250);
--
--INSERT INTO Employees (EmployeeID, Name, BirthDate, DepartmentInfo, Salary)
--VALUES (3, '찰스', TO_DATE('2003-05-01', 'YYYY-MM-DD'), '사업부, 경기도...02345', 200);
--
--INSERT INTO Employees (EmployeeID, Name, BirthDate, DepartmentInfo, Salary)
--VALUES (4, '마리아', TO_DATE('1995-08-15', 'YYYY-MM-DD'), '인사부, 서울시.. 01234', 280);
--
--INSERT INTO Employees (EmployeeID, Name, BirthDate, DepartmentInfo, Salary)
--VALUES (5, '제임스', TO_DATE('1988-03-22', 'YYYY-MM-DD'), '영업부, 서울시.. 01234', 320);
--
--INSERT INTO Employees (EmployeeID, Name, BirthDate, DepartmentInfo, Salary)
--VALUES (6, '안나', TO_DATE('2000-12-10', 'YYYY-MM-DD'), '영업부, 서울시.. 01234', 270);
--
----
----모델링, 정규화, 구현까지 진행 후 각 테이블에 5개씩 값 넣어서 조회까지 할 것!
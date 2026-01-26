# 샵# 은 주석이다
# 현재 쿼리 실행 : Ctrl + Enter
# 폰트 크기 변경 : Ctrl + '+' or '-'
select * from EMP;

# 데이터 삽입, 삭제, 수정 쿼리
# 연습용 테이블 생성
# 문자열 : VARCHAR(숫자) (최대 숫자만큼 문자 가능)
CREATE TABLE STUDENT (
	STU_NUM INT PRIMARY KEY 
	# PRIMARY KEY : 중복데이터, NULL 못 들어간다는 뜻
	, STU_NAME VARCHAR(30)
	, KOR_SCORE INT
	, ENG_SCORE INT
);

SELECT * FROM STUDENT;

# 데이터 조회 : SELECT
# 데이터 삽입 : INSERT
# INSERT INTO 테이블명 (컬럼명) VALUES (저장할 데이터);
INSERT INTO STUDENT (STU_NUM, STU_NAME, KOR_SCORE, ENG_SCORE) 
VALUES (1, '김자바', 90, 95);

# INSERT문에서 나열한 컬럼 순서에 맞게 데이터를 추가한다.
INSERT INTO STUDENT (KOR_SCORE, ENG_SCORE, STU_NUM, STU_NAME) 
VALUES (80, 99, 2, '이자바');

# INSERT시 모든 컬럼에 데이터를 넣을 필요는 없다. 단, 지정하지 않은 컬럼에는 NULL 데이터가 들어간다
INSERT INTO STUDENT (STU_NUM, STU_NAME) 
VALUES (3,'박자바');

# PRIMARY KEY로 인해 학번이 중복으로 못 들어간다
INSERT INTO STUDENT (STU_NUM, STU_NAME) 
VALUES (3,'윤자바');

INSERT INTO STUDENT (STU_NUM, STU_NAME) 
VALUES (4,'박자바');

# PRIMARY KEY로 인해 학번이 NULL인 경우 오류가 뜬다
INSERT INTO STUDENT (STU_NAME, KOR_SCORE) 
VALUES ('신자바', 92);



# 잘못된 데이터가 삽입될 때 데이터의 신뢰성은 무너진다
# 데이터의 변화가 발생하면 신뢰성이 무너진다 (데이터 추가, 삭제, 수정...)

# 취소 : ROLLBACK
# 확정 : COMMIT
ROLLBACK;
#DELETE FROM STUDENT;  데이터 지우는 코드
DELETE FROM STUDENT;

# 컬럼명은 안적어도 되지만 저장할 데이터는 갯수와 순서를 맞춰야한다.  (컬럼명) 생략가능
INSERT INTO STUDENT VALUES (10, 'KIM', 60, 75);
COMMIT;
ROLLBACK;

# 드래그 영역 실행 : Alt + x
INSERT INTO STUDENT VALUES (11, 'KIM', 100, 85);
INSERT INTO STUDENT VALUES (12, 'KIM', 89, 95);
INSERT INTO STUDENT VALUES (13, 'KIM', 80, 75);
INSERT INTO STUDENT VALUES (14, 'KIM', 91, 100);

# 데이터 삭제 : DELETE
# DELETE FROM 테이블명 WHERE 조건;
DELETE FROM STUDENT;
DELETE FROM STUDENT WHERE KOR_SCORE >=90;

# 데이터 수정 : UPDATE
# UPDATE
# 학번이 10번인 학생의 이름은 'LEE', 국어점수는 100점으로 변경하는 쿼리
UPDATE STUDENT
SET
STU_NAME = 'LEE',
KOR_SCORE = 100
WHERE
STU_NUM = 10;
# WHERE 없으면 전체를 바꿔버린다

SELECT *FROM STUDENT;


































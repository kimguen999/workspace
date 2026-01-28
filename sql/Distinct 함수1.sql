

# 중복 제거 (DISTINCT)
SELECT JOB FROM EMP;

# ex) EMP 테이블에 저장된 직급의 '종류'
SELECT DISTINCT JOB FROM EMP;

# ex) EMP 테이블에 저장된 부서의 '종류'
SELECT DISTINCT DEPTNO FROM EMP;

# DISTINCT 키워드는 하나만 붙이면 조회하는 모든 컬럼에 적용
SELECT DISTINCT JOB, DEPTNO FROM EMP ;
# JOB, DEPTNO가 둘다 중복(컬럼이 중복인 행)인 것은 제외하고 11개 출력

#########################################

# 1. 수치 관련 함수

# CEIL() = 올림
# FLOOR() = 내림
# ROUND() = 반올림
SELECT 70.5, CEIL(70.3), FLOOR(70.7), ROUND(70.5);

# TRUNCATE(숫자, 소수점자리) : 소수점자리 까지 버림
SELECT TRUNCATE(4335.8982,-2)
, TRUNCATE(4335.8982,0)
, TRUNCATE(4335.8982,2);

# ROUND(숫자, 소수점자리) : 소수점자리까지 반올림,
#						소수점자리 생략하면 정수로 반올림
SELECT ROUND(123.4567)
, ROUND(123.4567,2);

# MOD연산자(나머지 연산)
SELECT MOD(11,4);   # 나머지 3

# ex) EMP 테이블에서 사번이 짝수인 사원의 모든 정보 조회
SELECT * FROM EMP 
WHERE MOD(EMPNO,2)=0;

# 2. 문자 관련 함수
# 	1) 문자 일부 추출 함수
# SUBSTR(), SUBSTRING()
SELECT SUBSTR('ABCDEF',3)		# 3번째 부터 추출
	, SUBSTR('ABCDEF', 2, 3)	# 2번째 부터 3개 추출
	, SUBSTRING('ABCDEF',3)		# 3번째 부터 추출
	, SUBSTRING('ABCDEF', 2, 3);# 2번째 부터 3개 추출

#	2) 대소문자 변경 함수
# UPPER(문자) : 문자를 대문자로 변경
# LOWER(문자) : 문자를 소문자로 변경
SELECT 'Hello world'
	, UPPER('Hello world')
	, LOWER('Hello world');

#	3) 공백 제거 함수 (문자 사이 공백 제거 X)
# TRIM(문자), LTRIM(문자), RTRIM(문자)
SELECT TRIM('    DB    DB   ')	# 좌우 공백 제거
	, LTRIM('    DB    DB   ')	# 좌 공백 제거
	, RTRIM('    DB    DB   ');	# 우 공백 제거

#	4) 글자수 및 크기 확인
SELECT CHAR_LENGTH('안녕하세요')	# 글자의 길이
	, CHAR_LENGTH('HELLO')
	, LENGTHB('안녕하세요')		# 글자의 바이트 수
	, LENGTHB('HELLO');
	# 영어는 글자당 1바이트, 한글은 글자당 3바이트 (DB마다 다름)

#	5) 문자 나열 함수
SELECT CONCAT('A', 'B', 'C');
SELECT CONCAT(ENAME, '직원은 급여가 ',SAL,'입니다.') FROM EMP;

#	6) 자릿수 채우기
# LPAD(문자, 글자수, 채울문자)
# RPAD(문자, 글자수, 채울문자)
SELECT LPAD('ABC', 5, '1')	# 5자리로 맞추고 왼쪽 빈자리는 1로 채움
	, RPAD('ABC', 5, '1');	# 5자리로 맞추고 오른쪽 빈자리는 1초 채움

#	7) 문자 대체 함수
SELECT REPLACE('나는 자바를 잘한다', '자바', '파이썬');

#	2026.02.03 시험문제
#	8) 논리함수
#		8-1) IF(조건, 참일때값, 거짓일때값);
SELECT IF(10>2, '참', '거짓');
#		8-2) IFNULL(데이터, NULL일때 대체할 데이터)
SELECT EMPNO, ENAME, COMM, DEPTNO FROM EMP;
SELECT EMPNO, ENAME, IFNULL(COMM, 0) DEPTNO FROM EMP;
SELECT EMPNO, ENAME, NVL(COMM, 0) DEPTNO FROM EMP;
# COMM이 NULL을 0으로 바꿈
# 오라클DB에서는 IFNULL() 함수 없고, NVL() 함수 사용, 기능은 동일	
# IFNULL() = NVL()

#		8-3) CASE 문법
# ex)   부서번호 10 -> 개발부
#		부서번호 20 -> 영업부
#		부서번호 30 -> 인사부
SELECT ENAME, DEPTNO, IF(DEPTNO = 10, '개발부', '영업부') AS '부서명' FROM EMP;
# 조건이 1개일땐 IF가 편함
SELECT ENAME
	, DEPTNO
	, CASE DEPTNO
		WHEN 10 THEN '영업부',
		WHEN 20 THEN '인사부',
		ELSE '운영부' 
	END 부서명
	, CASE 
		WHEN DEPTNO = 10 THEN '영업부',
		WHEN DEPTNO = 20 THEN '인사부',
		ELSE '운영부' 
	END
FROM EMP;
# 조건이 여러개일때 CASE(데이터목록) WHEN(조건),THEN(응답) END

SELECT * FROM EMP;
SELECT * FROM DEPT;


##########################################

CREATE TABLE BOOK_STORE (
    BOOK_ID INT PRIMARY KEY,        -- 도서 번호
    TITLE VARCHAR(100),             -- 도서 제목
    AUTHOR VARCHAR(50),             -- 저자
    CATEGORY VARCHAR(20),           -- 카테고리
    PRICE DECIMAL(10, 2),           -- 가격
    STOCK INT,                      -- 재고 수량
    DISCOUNT_RATE DOUBLE            -- 할인율 (예: 0.15는 15%)
);

INSERT INTO BOOK_STORE VALUES 
(101, '  Java Programming  ', 'KIM', 'IT', 35000.55, 12, 0.1),
(102, 'Python Master', 'LEE', 'IT', 28000.40, 5, 0.2),
(103, 'SQL Beginner', 'PARK', 'DB', 22000.00, 3, NULL),
(104, 'The Great Gatsby', 'F. Scott', 'NOVEL', 15000.80, 8, 0.05),
(105, 'Data Science 101', 'CHOI', 'IT', 42000.00, 0, 0.3),
(106, 'Learning SQL', 'KIM', 'DB', 31000.25, 11, NULL);

SELECT * FROM BOOK_STORE;

#[Part 1: 중복 제거 및 수치 함수]
#BOOK_STORE 테이블에 있는 카테고리의 종류를 중복 없이 조회하세요.
SELECT DISTINCT CATEGORY FROM BOOK_STORE; 

#모든 도서의 가격(PRICE)을 소수점 첫째 자리에서 반올림하여 조회하세요.
SELECT ROUND(PRICE) FROM BOOK_STORE;

#도서 번호(BOOK_ID)가 홀수인 도서들의 제목과 저자를 조회하세요.
SELECT TITLE, AUTHOR FROM BOOK_STORE
	WHERE MOD(BOOK_ID,2)=1 ;

#가격(PRICE)을 소수점 이하를 버리고(FLOOR) '정수가격'이라는 별칭으로 조회하세요.
SELECT FLOOR(PRICE) AS '정수가격' FROM BOOK_STORE;

#[Part 2: 문자 함수]
#도서 제목(TITLE)의 좌우 공백을 제거하고, 모두 대문자로 변환하여 조회하세요.
SELECT UPPER(TRIM(TITLE)) FROM BOOK_STORE;

#저자(AUTHOR)의 이름이 3글자 이상이라면, 앞의 2글자만 추출하여 조회하세요.
SELECT IF(CHAR_LENGTH(AUTHOR) >=3, SUBSTR(AUTHOR, 1, 2), AUTHOR)
	FROM BOOK_STORE;

#제목(TITLE)에 있는 'SQL'이라는 단어를 'DATABASE'로 교체하여 조회하세요.
SELECT REPLACE(TITLE, 'SQL', 'DATABASE') FROM BOOK_STORE;

#저자(AUTHOR) 이름의 오른쪽에 '*'를 채워 총 5글자로 만드세요. (예: KIM -> KIM**)
SELECT RPAD(AUTHOR,5,'*') FROM BOOK_STORE;

#[Part 3: 논리 및 NULL 처리]
#DISCOUNT_RATE(할인율)가 NULL인 경우 0으로 표시하고, '할인율'이라는 별칭으로 조회하세요.
SELECT IFNULL(DISCOUNT_RATE,0) AS 할인율 FROM BOOK_STORE;

#IF 함수를 사용하여 재고(STOCK)가 0이면 '품절', 아니면 **'판매중'**이라고 표시되는 컬럼을 추가하세요.
SELECT *, IF(STOCK=0,'품절','**\'판매중\'**') AS '상태' FROM BOOK_STORE;
# 바로 뒤 문자취급 하고싶으면 \ 역슬러시를 앞에 넣으면된다

#CASE 문을 사용하여 카테고리별 위치를 출력하세요.
#IT -> 1층 로비
#DB -> 2층 사무실
#NOVEL -> 3층 서고
#그 외 -> 기타
# 조건이 여러개일때 CASE(데이터목록) WHEN(조건),THEN(응답) END
SELECT *, CASE(CATEGORY) 
	WHEN 'IT' THEN '1층 로비'
	WHEN 'DB' THEN '2층 사무실'
	WHEN 'NOVEL' THEN '3층 서고'
	ELSE '기타'
	END '책 위치'
FROM BOOK_STORE;

SELECT * FROM BOOK_STORE;
SELECT * FROM basic_board;
DESC basic_board;







































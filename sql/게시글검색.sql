
# 게시글 검색 및 댓글 테이블 생성, 외래키

# 외래키 제약조건 : 한 테이블이 다른 테이블의 데이터를 참조할 때 사용하는 제약조건
# FOREIGN KEY / FK
# FK 제약조건이 있어도 NULL 데이터는 들어올수 있음


# FK 제약조건은 테이블 생성 시 추가 문법

# 컬럼명 자료형 REFERENCES 참조테이블명(참조컬럼명)
# -> 부모 테이블의 데이터를 삭제하려면 자식 테이블의 데이터를 먼저 삭제

# 컬럼명 자료형 REFERENCES 참조테이블명(참조컬럼명) ON DELETE CASCADE
# -> 부모 테이블의 데이터를 삭제하면 자동으로 자식 테이블의 데이터가 삭제됨

# 특이사항 : 자식테이블에서 부모클래스의 컬럼값을 참조하고 있으면 
# 		   부모 테이블의 데이터 삭제가 불가
#		   ex) 3번글에 댓글이 달리면 3번 테이블 데이터 삭제 불가

# 제목에 @@~~ 가 포함된 게시글을 조회
SELECT BOARD_NUM
	, TITLE
	, WRITER
	, READ_CNT
	, CREATE_DATE
FROM BASIC_BOARD
WHERE UPPER(TITLE) LIKE CONCAT('%', UPPER(#{TITLE}), '%');
# 검색하는 글자와 기존 있던 데이터를 대소문자 맞춰준다.
# DB에서는 #을 주석처리하기 때문에 인식하지 못함
# 복사해서 SPRING MAPPER.XML에 적으면됨



 DROP TABLE BOARD_REPLY; 
--  테이블 지우는 명령어

# 댓글 정보 테이블
CREATE TABLE BOARD_REPLY(
	REPLY_NUM INT PRIMARY KEY AUTO_INCREMENT
	, CONTENT VARCHAR(100) NOT NULL
	, WRITER VARCHAR(50) NOT NULL
	, REG_DATE DATETIME DEFAULT SYSDATE()
#	 외래키 제약조건
	, BOARD_NUM INT NOT NULL REFERENCES BASIC_BOARD (BOARD_NUM)
	ON DELETE CASCADE
);
SELECT * FROM `BASIC_BOARD D`;
INSERT INTO BOARD_REPLY VALUES (1, 'AA', 'BB', SYSDATE(), 4);
-- 4번 게시글의 댓글 추가 후 4번 게시글 삭제 시 오류발생
DELETE FROM BASIC_BOARD WHERE BOARD_NUM = 4;
# 만약 4번 게시글을 삭제하려면
# 1. 4번 게시글에 달린 댓글 모두 삭제
# 2. 4번 게시글 삭제


# 댓글 목록 조회 쿼리
SELECT REPLY_NUM
	, WRITER
	, REG_DATE
	, CONTENT
FROM BOARD_REPLY
WHERE BOARD_NUM = #{boardNum}
ORDER BY REG_DATE DESC;


# 임의로 댓글 만들어주기 테스트
INSERT INTO BOARD_REPLY (
	BOARD_NUM
	, CONTENT
	, WRITER
) VALUES (26,'오늘 연습장 안가나?', '마린보이');

INSERT INTO BOARD_REPLY VALUES (5, 'AA', 'BB', SYSDATE(), 26);

















CREATE TABLE INDEX_MEMBER (
	MEMBER_ID INT PRIMARY KEY AUTO_INCREMENT
	, CITY VARCHAR(255)
	, LOCATION VARCHAR(255)
	, NAME VARCHAR(255)
);


DELIMITER $$

CREATE PROCEDURE insertMembers()
BEGIN
    DECLARE i INT DEFAULT 1;
    DECLARE j INT DEFAULT 1;
    DECLARE k INT DEFAULT 1;
    DECLARE c VARCHAR(200);
    DECLARE l VARCHAR(200);

    START TRANSACTION;
        WHILE i <= 2500 DO
            SET c = UUID();
            WHILE j <= 400 DO
                SET l = UUID();
                WHILE k <= 10 DO
                    INSERT INTO INDEX_MEMBER (CITY, NAME, LOCATION)
                    VALUES (c, UUID(), l);
                    SET k = k + 1;
                END WHILE;
                SET k = 1;
                SET j = j + 1;
            END WHILE;
            SET j = 1;
            SET i = i + 1;
        END WHILE;
    COMMIT;
END $$

DELIMITER ;



CALL insertMembers();


SELECT * FROM INDEX_MEMBER;


# 조회 속도의 차이는 INDEX 유무에 따라 달라짐
SELECT NAME FROM INDEX_MEMBER WHERE MEMBER_ID = 9900000;

SELECT * FROM INDEX_MEMBER WHERE NAME = '3b499fd6-2cab-11f1-8d67-a8a159f4a51c';

# 조회 할때 목차 부여해서 조회 속도를 빠르게 하기 위함.

# 테이블에 존재하는 INDEX 정보 확인
SHOW INDEX FROM INDEX_MEMBER;

# 테이블 생성 시 기본키, UNIQUE 제약조건이 있는 컬럼은 자옹으로 INDEX 부여

# NAME 컬럼에 INDEX 부여
# CREATE INDEX 인덱스이름 ON 테이블명 (컬럼명)
CREATE INDEX INDEX_NAME ON INDEX_MEMBER (NAME);
CREATE INDEX INDEX_NAME ON INDEX_MEMBER (NAME, LOCATION); # 두 컬럼에 동시에 인덱스 부여 가능

# INDEX 삭제
# DROP INDEX 인덱스이름 ON 테이블명
DROP INDEX INDEX_NAME ON INDEX_MEMBER;

# INDEX를 무분별하게 사용하면 데이터 삽입시 성능이 떨어짐
# 데이터가 추가되면 INDEX를 재정립하기 때문

# INDEX를 부여하면 좋을때
# 1. WHERE 조건절에 자주 등장하는 컬럼
# 2. JOIN의 ON절에 사용하는 컬럼
# 3. ORDER BY 절에 많이 사용하는 컬럼

# INDEX를 부여해도 효과가 미미한 경우
# 1. 중복 데이터가 많은 컬럼    ex) 성적 등급 - 'A', 'B', 'C'
# 2. 데이터 수가 작은 테이블




































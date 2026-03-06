

# 서브 쿼리 - 쿼리 안에 또 다른 쿼리

# 예시
# '김사랑' 사원과 같은 부서에 소속된 직원들의 사번, 사원명, 부서번호를 조회
SELECT * FROM EMP;

# 1. 김사랑 사원의 부서번호를 조회  -> 20
SELECT DEPTNO FROM EMP WHERE ENAME = '김사랑';

# 2. 부서번호가 20번인 사원들의 사번, 사원명, 부서번호를 조회
SELECT EMPNO, ENAME, DEPTNO FROM EMP WHERE DEPTNO = 20;

# 3. 1,2 쿼리를 하나로 작성
SELECT EMPNO, ENAME, DEPTNO FROM EMP WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = '김사랑');
# 하나의 쿼리 안에 또 들어간 쿼리를 서브쿼리라한다.
# 서브쿼리 먼저 해석한 후 메인 쿼리를 해석하는 순으로 한다.


# 강혜정 사원보다 급여를 더 많이 받는 사원들의 사번, 사원명, 급여를 조회
# 1. 강혜정 사원의 급여  -> 300
SELECT SAL FROM EMP WHERE ENAME = '강혜정';
# 2. 급여가 300 초과인 사원들의 사번, 사원명, 급여
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL > 300;
# 3. 1,2쿼리 합산
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL > (SELECT SAL FROM EMP WHERE ENAME = '강혜정');


# '김사랑' 사원의 사번, 사원명, 직급, 부서번호, 부서명을 조회
SELECT 
	EMPNO, ENAME, JOB, DEPTNO, (SELECT DNAME 
								FROM DEPT 
								WHERE DEPTNO = EMP.DEPTNO) DNAME
FROM EMP
WHERE ENAME = '김사랑';


# 인사부에 소속된 직원들의 급여 평균보다 더 높은 급여를 받는 사원들의
# 사번, 사원명, 급여, 부서명을 조회하시오.
SELECT 
	EMPNO, ENAME, SAL, (SELECT DNAME 
						FROM DEPT 
						WHERE DEPTNO = EMP.DEPTNO) DNAME
FROM EMP
WHERE SAL > (SELECT AVG(SAL) 
			 FROM EMP 
			 WHERE DEPTNO = (SELECT DEPTNO 
							 FROM DEPT 
							 WHERE DNAME = '인사부'));

SELECT * FROM EMP;
SELECT * FROM DEPT;



######################################################




# 장바구니 테이블의 데이터를 기준으로
# 장바구니 번호, 상품번호, 상품명, 상품가격을 조회

SELECT CART_NUM 장바구니번호
	, BOOK_NUM 상품번호
	, (SELECT BOOK_TITLE 
					FROM SHOP_BOOK 
					WHERE BOOK_NUM = SHOP_CART.BOOK_NUM) 상품명
	, (SELECT BOOK_PRICE 
					FROM SHOP_BOOK 
					WHERE BOOK_NUM = SHOP_CART.BOOK_NUM) 상품가격
FROM SHOP_CART;


# SHOP_BOOK 테이블을 기준으로
# 도서번호, 도서명, 가격, 메인이미지의 원본 파일명을 조회
SELECT BOOK_NUM 도서번호
	, BOOK_TITLE 도서명
	, BOOK_PRICE 가격
	, (SELECT ORIGIN_FILE_NAME 
		FROM BOOK_IMG 
		WHERE BOOK_NUM = SHOP_BOOK.BOOK_NUM AND IS_MAIN = 'Y') '메인 이미지 원본 파일명'
FROM SHOP_BOOK;


# 회원 이메일이 'bbb@naver.com'인 회원이 장바구니에 담은 상품 종류의 수  -> 3
SELECT COUNT(MEM_EMAIL)
FROM SHOP_CART
WHERE MEM_EMAIL ='bbb@naver.com';



# SHOP_CART 테이블을 기준으로
# 장바구니에서 세개 이상의 상품 종류를 담은 회원의 이메일 조회
SELECT DISTINCT MEM_EMAIL
FROM SHOP_CART 
WHERE (SELECT COUNT(MEM_EMAIL)
		FROM SHOP_CART
		WHERE MEM_EMAIL )>=3;


SELECT DISTINCT MEM_EMAIL
FROM SHOP_CART A
WHERE (
    SELECT COUNT(*)
    FROM SHOP_CART B
    WHERE A.MEM_EMAIL = B.MEM_EMAIL
) >= 3;



SELECT * FROM SHOP_CART;
SELECT * FROM SHOP_BOOK;
SELECT * FROM BOOK_IMG;


# 회원 이름에 'b'이라는 글자가 포함된 회원의 장바구니에 담긴 
# 상품번호, 장바구니담을일자를 조회
SELECT 























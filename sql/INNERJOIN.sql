
# 원래 컬럼 앞에는 테이블명.이 있지만 생략 가능하다
SELECT EMP.EMPNO, EMP.ENAME, EMP.SAL
FROM EMP;

# 별칭 사용법
# 테이블에 별칭 줄때는 AS 키워드 붙이지 않기!!!!!(오라클의 경우 AS 쓰면 오류남)
SELECT EMPNO, ENAME, SAL
FROM EMP E;
# 테이블 별칭은 간결하게 쓰기 위한것이 목적이므로 짧게 쓴다
SELECT E.EMPNO, E.ENAME, E.SAL
FROM EMP E;

# JOIN(조인) : 둘 이상의 테이블에서 데이터를 조회하기 위한 문법
SELECT * FROM EMP;
SELECT * FROM DEPT;

# 사번, 사원명, 급여, 부서명, 지역 조회

# CROSS조인 : ***사용 못하는 조인***, 의미 없는 조인
# 두 테이블의 데이터가 가능한 모든 조합을 조회
SELECT EMPNO, ENAME, SAL, DNAME, LOC  #, DEPTNO
# DEPTNO는 EMP와 DEPT 테이블 둘다 있기 때문에 단순히 DEPTNO만 적으면 오류발생
# EMP.DEPTNO or DEPT.DEPTNO 라고 작성
# 두 테이블에 공통으로 존재하는 컬럼 조회시 주의 필요!!!!
FROM EMP, DEPT;    # -> 14 X 4 = 56개

# INNER조인 : 유효한 데이터
# 조인 조건 : 조인 하고자 하는 두 테이블이 가진 공통 컬럼이 같은 값만 조회한다는 조건
SELECT EMPNO, ENAME, SAL, DNAME, LOC, E.DEPTNO, D.DEPTNO
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO ;

# ANSI 문법의 JOIN
# ANSI : 국제표준으로 만들어 놓은 SQL 문법
# ANSI 문법은 국제 표준이기 때문에 DB종류와 상관 없이 모든 디비에서 공통으로 사용 가능
# 위에서 배운 JOIN 문법은 ORACLE, MARIADB, MYSQL 디비의 문법
SELECT EMPNO, ENAME, E.DEPTNO, DNAME
FROM EMP E INNER JOIN DEPT D
ON E.DEPTNO = D.DEPTNO;


# 직급이 사원이 아닌 직원의 사번, 사원명, 직급, 부서번호, 부서명 조회
SELECT EMPNO, ENAME, JOB, E.DEPTNO, DNAME
FROM EMP E, DEPT D
WHERE JOB != '사원' 
AND E.DEPTNO = D.DEPTNO; 

SELECT EMPNO, ENAME, JOB, E.DEPTNO, DNAME
FROM EMP E INNER JOIN  DEPT D
ON E.DEPTNO = D.DEPTNO; 
WHERE JOB != '사원' 


# 부서번호가 10번 혹은 20번인 직원의 사번, 사원명, 부서명, 부서의 지역을 조회
SELECT EMPNO, ENAME, DNAME, LOC
FROM EMP E, DEPT D
WHERE  E.DEPTNO = D.DEPTNO
AND E.DEPTNO IN (10, 20);  # IN() : 일치하는 숫자!! 안에 숫자는 여러개 사용 가능
# AND (E.DEPTNO = 10 OR E.DEPTNO = 20) ;

SELECT EMPNO, ENAME, DNAME, LOC
FROM EMP E INNER JOIN DEPT D
WHERE E.DEPTNO IN (10, 20);
ON  E.DEPTNO = D.DEPTNO



SELECT * FROM EMP;
SELECT * FROM DEPT;











































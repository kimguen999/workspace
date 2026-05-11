package com.green.jpa_study.repository;

// MyBatis의 Mapper Interface 역할
// DB와 최초로 연결되는 부분



import com.green.jpa_study.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// @mapper 어노테이션 대신 extends JpaRepository 상속 사용
// JpaRepository<Entity 명, pk자료형>
// JpaRepository 인터페이스만 상속받으면, 어떠한 코드를 작성하지 않으면 이미 CRUD는 완성
public interface MemberRepository  extends JpaRepository<Member, Long>{
  // 회원 목록 조회
  // 상세 조회

}

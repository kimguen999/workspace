package com.green.jpa_study.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratedColumn;

import java.time.LocalDateTime;

// # DTO : DB 데이터를 실어나르는 객체
// # Entity : 테이블을 객체화 시킨 것


@Entity // DB랑 연결하겠다
@Table(name = "JPA_MEMBER") // 연결한 DB의 테이블 이름
@Getter
@Setter
@NoArgsConstructor // 기본생성자 생성 (jpa 사용 시 기본 생성자는 반드시 필요)
public class Member {


  @Id
  // PK일 경우 @Id : PK컬럼임을 나타냄
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  // DB 종류에 따라 PK 자동생성 전략이 달라짐
  // GenerationType.IDENTITY : MySQL, MariaDB
  // GenerationType.AUTO     : jpa에게 DB에 따라 알아서 만들라는 명령
  // GenerationType.SEQUENCE : Oracle
  // GenerationType.TABLE    : PK생성 전용 테이블 활용
  private Long memNum;
  // int 대신 Integer or Long 쓰는 이유
  // DB에서는 int에 null 가능
  // java 에서 int 가 null 일경우 오류발생
  // wrapper 클래스 : 기본자료형이랑 같은 역할이지만 null이 들어갈수 있는 참조자료형

  // 기본적으로 camelCase 기법으로 작성하면 name속성 안넣어도됨.
  @Column(name = "MEM_EMAIL", nullable = false, length = 50, unique = true)
  // 컬럼명 MEM_EMAIL, NOT NULL, 길이50, UNIQUE 과 같은 뜻
  private String memEmail;

  @Column(length = 50, nullable = false)
  private String memName;

  @Column()
  private Integer memAge;

  @Column(insertable = false, updatable = false)
  // DB에서 default 제약조건 사용시 해당 컬럼을 insert/update 쿼리에서 사용하지 마라는 문법
  private LocalDateTime createAt;



}

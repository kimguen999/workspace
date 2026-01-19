package com.green.rest_study;

import lombok.*;


// Lombok(롬북) 설치되어 있어야 사용 가능
@Getter
@Setter
@ToString
@NoArgsConstructor  // 아무 내용이 없는 생성자 생성
@AllArgsConstructor // 모든 내용이 있는 생성자 생성

// 게시글 하나의 정보를 저장할 수 있는 자료형
public class BoardDTO {

  private int boardNum;
  private String title;
  private String writer;
  private int readCnt;





}

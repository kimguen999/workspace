package com.green.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

// DTO : Data Transfer Object : 데이터 전송 객체
// 스프링과 BASIC_BOARD 테이블의 데이터를 주고 받을 수 있는 객체
@Getter
@Setter
@ToString
public class BoardDTO {
  private int boardNum;
  private String title;
  private String writer;
  private String content;
  private int readCnt;
  private LocalDateTime createDate;

}

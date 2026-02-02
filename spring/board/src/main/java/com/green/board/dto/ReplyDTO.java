package com.green.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class ReplyDTO {

  public int replyNum;
  public String content;
  public String writer;
  public LocalDateTime regDate;
  public int boardNum;

}

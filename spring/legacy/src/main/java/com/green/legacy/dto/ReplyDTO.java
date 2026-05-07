package com.green.legacy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReplyDTO {
  private int replyNum;
  private String replyContent;
  private String replyWriter;
  private LocalDateTime regDate;
  private int boardNum;

  // JOIN용 필드
  private String userName;
}
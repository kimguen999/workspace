package com.green.legacy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
  private int boardNum;
  private String title;
  private String content;
  private String writer;
  private LocalDateTime regDate;

  // JOIN용 필드 (작성자 이름 출력 시 활용)
  private String userName;
}
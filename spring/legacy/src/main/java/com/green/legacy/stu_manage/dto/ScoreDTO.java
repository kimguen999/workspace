package com.green.legacy.stu_manage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScoreDTO {

  private int scoreNum;
  private int korScore;
  private int engScore;
  private int mathScore;
  private int stuNum;
  private StuDTO stuDTO;


}



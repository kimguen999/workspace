package com.green.legacy.stu_manage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class StuDTO {

  private int stuNum;
  private String stuName;
  private int stuYear;
  private int classNum;
  private ClassDTO classDTO;

}

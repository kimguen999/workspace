package com.green.legacy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChickenDTO {
  private String chiName;
  private int chiCnt;
  private List<String> chiAdd;
  private String request;


}

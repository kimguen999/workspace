package com.green.jpa_study.dto;

import lombok.Getter;
import org.springframework.context.annotation.Primary;

// 쿼리 실행 시 빈값을 채워주기 위한 DTO
@Getter
public class MemberRequest {
  private String memEmail;
  private String memName;
  private Integer memAage;

}

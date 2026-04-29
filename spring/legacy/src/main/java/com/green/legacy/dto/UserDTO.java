package com.green.legacy.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
  private String userId;
  private String userName;
  private String userPw;
  private String userRole;
}
package com.green.restApi_test;

import lombok.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

  private int bookNum;
  private String bookTitle;
  private String author;
  private String bookIntro;
  private int bookPrice;


}

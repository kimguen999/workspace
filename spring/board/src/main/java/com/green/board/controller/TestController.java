package com.green.board.controller;


import com.green.board.dto.BoardDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// JSON

@RestController
public class TestController {

  @GetMapping("/test1")
  public ResponseEntity<String> test1(){
    // ResponseEntity<실제 보낼 body영역 자료형>
    String name = "kim";

    return ResponseEntity  // <-자료형
        .status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body(name);
    // status(HttpStatus.OK) = http상태가 좋다 = 상태번호 200
    // status(HttpStatus.NOT_FOUND) = 상태번호 404(URL오류)
    // status(HttpStatus.INTERNAL_SERVER_ERROR) = 상태번호 500 (자바오류)
    // status(HttpStatus.CREATED) = 상태번호 201
    // status(HttpStatus.NO_CONTENT) = 204
  }


  @GetMapping("/test2")
  public ResponseEntity<BoardDTO> test2() {
    BoardDTO dto = new BoardDTO();
    dto.setTitle("제목");
    dto.setBoardNum(3);
    dto.setWriter("저자");
    dto.setContent("내용");

    // header에 실을 데이터
    HttpHeaders header = new HttpHeaders(); // 변수 선언
    header.add("myName", "kim");
    header.add("myAge", "30");

    return ResponseEntity  // <-자료형
        .status(HttpStatus.CREATED)
        .headers(header)
        // .headers(변수)
        // Headers에 myName : kim, myAge : 30 출력됨
        .body(dto);
  }


  @GetMapping("/test3")
  public ResponseEntity<?> test3(){
    // ? : 와일드카드. 꺽새안에 리턴될 자료형이 없을때 와일드카드 쓰면 됨
    System.out.println("기능 성공");
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    // return할 데이터가 없으면 마지막에 .build()를 넣어줘야함
    // = 내용(body)없이 만든다는 뜻
  }



}











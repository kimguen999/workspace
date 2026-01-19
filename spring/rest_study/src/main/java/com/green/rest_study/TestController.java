package com.green.rest_study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

// react에서 들어온 요청에 대한 응답하는 클래스 == API
@RestController  // 객체 생성 + REST 문법을 적용한 컨트롤러 역할 여부
// 웹 브라우저에서 요청(react) -> 서버는 응답을 하면 됨(API)
// 지금 하고있는 것이 서버 만드는 것
// 회원 목록 조회해달라는 요청이 들어온다 가정 :
//      localhost:8080/members -> getMemberList 매서드 실행 (회원목록 조회)
public class TestController {


  // REST API , 요청에 응답하고있음
  // 회원 목록 조회 API
  @GetMapping("/members")  // 회원 조회
  // @PostMapping("/members")  회원 등록
  public String getMemberList(){
    System.out.println("회원 목록을 조회합니다");
    return "김자바, 박자바, 이자바";  // return이 요청에 대한 응답 (웹브라우저에 출력)
  }

  // 3번 회원의 정보를 조회하는 API
  @GetMapping("/members/3")  // 포트 뒷부분을 어노테이션 소괄호("/")에 넣으면됨
  // https://localhost:8080/members/3
  // https://192.167.23.7:8080/members/3
  public String getMemberDetail(){
    System.out.println("3번 회원의 정보를 조회합니다");
    return "김자바";
  }

  // 회원 등록 api
  @PostMapping("/members")
  // url을 직접 입력해서 실행하면 get방식만 실행됨 (post방식 실행하지 않음)
  // url이 중복이라서 실행이 안되는 것이 아님
  // post방식 실행하려면 postman 프로그램 써야함
  public int regMember(){
    System.out.println("회원을 등록합니다");
    return 1;  //ex) 1은 등록성공, 0은 등록실패
  }
}

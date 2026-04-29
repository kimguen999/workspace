package com.green.legacy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController {

  // localhost:8080
  @RequestMapping("/")
  public String start(){
    // 프로젝트 시작시 세팅되는 설정, 보안코드 작성
    return "redirect:/boards/getList";
  }

}

package com.green.legacy.controller;


import com.green.legacy.dto.BoardDTO;
import com.green.legacy.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//
@Controller   // 객체 생성, 해당 클래스는 컨트롤러 역할임을 스프링한테 인지 (비동기 미지원)
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {
  private final BoardService boardService;


  // @GetMapping("/getList") 예전 방식은 주체와 목적을 같이 사용
  // @GetMapping("/board") 요즘 방식은 주체만 씀

  // 게시글 목록 (`/boards/getList)
  // 조회, 등록, 삭제, 수정이든 전부 @RequestMapping 어노테이션 사용
  // 컨트롤러에서 요청을 처리하는 매서드의 리턴타입은 무조건 문자열(String)
  // 레거시 방식에서 리턴되는 정보는 보여질 html파일명을 의미함
  @RequestMapping("/getList")

  // 매개변수에 선언한 Model 인터페이스 객체는 데이터를 적재하는 역할
  public String getList(Model model){
    // 필요한 데이터 조회
    String name = "hong";
    int age = 20;


    // 조회한 데이터를 실음
    model.addAttribute("data", name); //key와 value
    model.addAttribute("ageData", age);
    model.addAttribute("boardList", boardService.selectBoardList());

    // html 파일은 무조건 resources/templates 폴더 안에 위치
    // css 파일은 무조건 resources/static 폴더 안에 위치
    return "board_list";
  };

  // 글쓰기 페이지로 이동
  @RequestMapping("/go-write")
  public String goWrite(){
    return "reg_board";
  }

  // 글쓰기 기능 실행
  // @ModelAttribute 클래스명 객체명
  // ㄴ> input 태그의 name 속성과 동일한 멤버변수를 가진 dto 클래스가 데이터 받음
  @RequestMapping("/write")
  public String write(@ModelAttribute BoardDTO boardDTO){
    System.out.println(boardDTO);
    boardService.insertBoard(boardDTO);

    // 방법1) 게시글 목록을 조회 -> boardList라는 이름으로 전달
    // 방법2) /boards/getList 요청 실행 == > 실행하면 조회도하고 board_list로 이동도하고

    // return에는 기본적으로 html 파일명을 작성
    // 추가적으로 html 파일명이 아니라 컨트롤러의 다른 메서드를 호출할수있음
    // -> "redirect:요청url"
//    return "redirect:/boards/getList";

    return  "reg_result"; // 게시글 등록 성공 여부에 따라 alert을 띄울 목적으 html
  }

  // @RequestParam(name = "") 자료형 객체명
  // ㄴ> @RequestParam 어노테이션을 이요하면 데이터를 하나씩 받을수있다.
  @RequestMapping("/write2")
  public String write2(@RequestParam(name = "name") String name,
                       @RequestParam(name = "age") int age){
    System.out.println("name : " + name);
    System.out.println("name : " + age);
    return "";
  }

  // 상세페이지로 이동
  // localhost:8080/boards/detail/1
  @RequestMapping("/detail")
  public String selectDetail(@RequestParam(name = "boardNum") int boardNum, Model model){
    System.out.println("boardNum : "+boardNum);
    model.addAttribute("board", boardService.selectDetail(boardNum));
    return "board_detail";
  }


  @RequestMapping("/delete")
  public String delete(@RequestParam(name="boardNum") int boardNum){
    System.out.println("삭제할글번호 : "+boardNum);
    boardService.deleteBoard(boardNum);
    return "delete_result";

  }

}

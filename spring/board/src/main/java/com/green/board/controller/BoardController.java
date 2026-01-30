package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//해당 파일을 요청에 대한 응답 기능을 API로 구현
//응답으로 주로 쿼리 실행을 한다.

//초기세팅
// 1. @RestController 어노테이션을 클래스 위에 선언
//    객체 생성 + 이 클래스가 요청에 대한 응답을 처리하는 클래스임을 스프링한테 알려줌
//2. 쿼리 실행 기능 메서드를 호출하기 위해
//2-1) Service 클래스의 객체를 맴버변수로 선언
//2-2) 생성자 의존성 주입 문법을 사용해서 Service 클래스의 객체를 생성
@RestController
@RequestMapping("/boards")
public class BoardController {
  private BoardService boardService; //2-1 코드

  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }

  //게시글 목록 조회 api
  //(GET) localhost:8080/boards
  @GetMapping("")
  public List<BoardDTO> getBoardList(){
    List<BoardDTO> list = boardService.getList();
    return list;
  }

  //게시글 등록 api
  // (POST) localhost:8080/boards
  @PostMapping("")
  public int regBoard(@RequestBody BoardDTO boardDTO){
    System.out.println(boardDTO);
    int result = boardService.regBoard(boardDTO);
    return result;
  }

  //게시글 상세 조회 + 조회수 증가 api
  // (Get) localhost:8080/boards/get/1  ---------> 게시글 상세조회
  // (Get) localhost:8080/boards/update/1    ----> 수정 위한 조회
  @GetMapping("/{type}/{boardNum}")
  public BoardDTO getBoard(@PathVariable("type") String type
                          ,@PathVariable("boardNum") int boardNum){
    return boardService.getBoard(boardNum, type);
  }

  // 게시글 삭제 api
  // (Delete) localhost:8080/boards/2
  @DeleteMapping("/{boardNum}")
  public int deleteBoard(@PathVariable("boardNum") int boardNum){
    return boardService.deleteBoard(boardNum);
  }

  // 수정 api
//   (Put) localhost:8080/boards/3
  @PutMapping("/{boardNum}")
  public void updateBoard(
      @PathVariable("boardNum")int boardNum
      ,@RequestBody BoardDTO boardDTO){
    System.out.println(boardNum);
    System.out.println(boardDTO);
    boardDTO.setBoardNum(boardNum);
    boardService.updateBoard(boardDTO);
  }





}










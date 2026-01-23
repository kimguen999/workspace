package com.green.basic_board.controller;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController // 이 클래스가 컨트롤러 한다는 것을 보여주는 역할
//@RequestMapping("/item") // 모든 url은 '/item'로 시작하겠다
public class BoardController {
  private BoardService boardService;

  @Autowired
  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }

  @GetMapping("/test1")
  public String test1(){
    String result = boardService.runTest1();
    return result;
  }

  @GetMapping("/test2")
  public List<Integer> test2(){
    List<Integer> result = boardService.runTest2();
    return result;
  }
  // URL : localhost:8080/test3/2
  @GetMapping("/test3/{boardNum}")
  public BoardDTO test3(@PathVariable("boardNum") int boardNum){
    BoardDTO result = boardService.runTest3(boardNum);
    return result;
  }

  @GetMapping("/test4")
  public List<BoardDTO> test4(){
    BoardDTO dto = new BoardDTO();  // boardNum : 0, readCnt : 0
    dto.setBoardNum(1);
    dto.setReadCnt(10);
    List<BoardDTO> result = boardService.runTest4(dto);
    return result;
  }

  @GetMapping("/test5/{boardNum}/{readCnt}")
  public List<BoardDTO> test5(
      @PathVariable("boardNum")int boardNum
      ,@PathVariable("readCnt")int readCnt){
    List<BoardDTO> result = boardService.runTest5(boardNum,readCnt);
    return result;
  }

  @PostMapping("/testinsert")
  public void regBoard(@RequestBody BoardDTO boardDTO){
    System.out.println(boardDTO);
    boardService.regBoard(boardDTO);
  }

  @DeleteMapping("/testdelete/{boardNum}")
  public int delBoard(@PathVariable("boardNum") int boardNum){
    int result = boardService.delBoard(boardNum);
    return result;
  }

  @PutMapping("/testupdate/{boardNum}")
  public void putBoard(
      @PathVariable("boardNum") int boardNum
      ,@RequestBody BoardDTO boardDTO){
    boardDTO.setBoardNum(boardNum);
    boardService.upBoard(boardDTO);
    System.out.println(boardDTO);
    System.out.println(boardNum);
  }
}


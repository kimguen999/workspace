package com.green.board.controller;


import com.green.board.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.green.board.service.BoardService;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
  private BoardService boardService;

  @Autowired
  public BoardController(BoardService boardService){
    this.boardService=boardService;
  }

  // 상품 조회 api
  @GetMapping("/book")
  public List<BoardDTO> selectBoardList(){
    List<BoardDTO> result = boardService.getSelect();
    return result;
  }


}

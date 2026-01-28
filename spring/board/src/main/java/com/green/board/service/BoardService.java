package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BoardService {

  @Autowired
  private BoardMapper boardMapper;

  // 조회 기능 실행 메서드
  public List<BoardDTO> getSelect(){
    List<BoardDTO> result = boardMapper.selectBoardList();
    return result;
  }









}

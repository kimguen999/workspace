package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface BoardMapper {

  // 목록 조회 쿼리 실행 추상메서드
  List<BoardDTO> selectBoardList();





}

package com.green.legacy.mapper;

import com.green.legacy.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
  List<BoardDTO> selectBoardList();

  void insertBoard(BoardDTO boardDTO);

  //상세페이지 쿼리 실행 메서드
  BoardDTO selectDetail(int boardNum);

  // 삭제 쿼리 실행 메서드
  void deleteBoard(int boardNum);

}

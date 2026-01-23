package com.green.basic_board.service;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Service 클래스 : 프로젝트에서 핵심 기능을 구현한 클래스
// 지금은 DB기능(조회,등록,삭제,수정)을 핵심기능이라 생각

@Service // 객체 생성 어노테이션
public class BoardService {
  // 쿼리 실행 추상메서드가 존재하는 객체를 선언
  private BoardMapper boardMapper;  // 보드매퍼 멤버변수
  // Mapper interface에 만든 test1() 추상메서드를 실행사는 메서드
  // 생성자 의존성 주입 (위에 선언만 되어있으므로)
  @Autowired //매개변수로 들어올수 있는 것을 자동으로 연결
  public BoardService(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }
  // Mapper interface에 정의된 test1()를 실행할 메서드
  public String runTest1(){
    String result = boardMapper.test1(); // 쿼리 실행됨
    return result;
  }




  // Mapper interface에 정의된 test2()를 실행할 메서드
  public List<Integer> runTest2(){
    List<Integer> result = boardMapper.test2();
    return result;
  }

  public BoardDTO runTest3(int boardNum){
    BoardDTO result = boardMapper.test3(boardNum);
    return result;
  }

  public List<BoardDTO> runTest4(BoardDTO boardDTO){
    List<BoardDTO> result = boardMapper.test4(boardDTO);
    return result;
  }

  public List<BoardDTO> runTest5(int boardNum, int readCnt){
    List<BoardDTO> result = boardMapper.test5(boardNum,readCnt);
    return result;
  }

  public void regBoard(BoardDTO boardDTO){
    boardMapper.insertBoard(boardDTO);
  }

  public int delBoard(int boardNum){
    int result = boardMapper.deleteBoard(boardNum);
    return result;
  }

  public void upBoard(BoardDTO boardDTO){
    boardMapper.updateBoard(boardDTO);

  }

}




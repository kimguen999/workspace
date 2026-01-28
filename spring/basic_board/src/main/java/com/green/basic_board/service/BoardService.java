package com.green.basic_board.service;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 서비스 초기 세팅
// 1. @Service
// 2. @Autowired
// 3. private A~Mapper a~Mapper;  의존성 주입
// 4. public 전체자료형 원하는서비스메서드명(){
//      전체자료형 result = a~Mapper.추상메서드명;
//      return result;
//    {
//    insert, update, delete의 경우 리턴타입은 void or int



// Service 클래스 : 프로젝트에서 핵심 기능을 구현한 클래스
//                인터페이스에서 선언한 추상메서드를 샐행할 메서드 구현
// 지금은 DB기능(조회,등록,삭제,수정)을 핵심기능이라 생각

@Service // 객체 생성 + 핵심기능(DB)이 구현된 클래스라는 것을 알리는 역할
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




package com.green.basic_board.mapper;

import com.green.basic_board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// 인터페이스에는 추상 메서드만 올수 있다
@Mapper  // 객체생성 + xml파일에서 만든 쿼리문을 실행시키는 interface라는 것을 지칭 (스프링이 run 하자마자 필요한 객체를 생성)

public interface BoardMapper {
  // 메서드명은 반드시 xml에서 정의한 쿼리의 id로 일치
  // 메서드의 리턴타입 : 쿼리 실행 결과 ***전체 데이터***를 담을 수 있는 자료형
  // 메서드의 매개변수 : 쿼리 실행 시 채워줘야 하는 메서드 (빈값)(빠진 곳이 없다면 매개변수 비워두면됨)

  String test1();
  List<Integer> test2();
  BoardDTO test3(int boardNum); // resultMap일때는 ~DTO사용, 변수일경우 매개변수사용
  List<BoardDTO> test4(BoardDTO boardDTO); // 변수가 2개일때는 변수가 포함된 클래스 자료형을 써버리면된다.
  List<BoardDTO> test5(int boardNum, int readCnt);
  // select : 조회되는 데이터에 따라 리턴 타입이 달라짐
  // insert, delete, update : 리턴타입이 정해져있음, (void or int)
  //                          ㄴ> 삽입,수정,지워지는 '데이터의 수'라서 int로 리턴
  //                          ㄴ> 리턴이 int라는 것의 의미는 쿼리 실행결과 영향 받는 행의 갯수
  void insertBoard(BoardDTO boardDTO);
  int deleteBoard(int boardNum);
  // int deleteBoard(BoardDTO boardDTO);
  void updateBoard(BoardDTO boardDTO);
}

package com.green.rest_study;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// 게시글과 관련된 요청에 대한 응답 클래스
// 요청 종류는 대표적으로 CRUD라고 부르는 4개가 존재
// C : CREATE -> 데이터 생성 (POST)
// R : READ -> 데이터 조회 (전체 조회, 특정 데이터만 조회) (GET)
// U : UPDATE -> 데이터 수정
// D : DELETE -> 데이터 삭제 (DELETE)
@RestController
// 모든 문법이 Rest에 맞춰저있으므로 Restful이라부름 => API 적용하면 Restful API라 부름
//@RequestMapping("/boards") // 해당 컨트롤러의 URL을 전부 "/boards"로 시작한다
public class BoardController {

  private List<BoardDTO> boardDTOList;
  public BoardController(){
    // 게시글 목록이 저장될 List 생성
    boardDTOList = new ArrayList<>();

    // 리스트에 게시글을 5개 저장
    boardDTOList.add(new BoardDTO(1,"첫번째 글","김자바",5));
    boardDTOList.add(new BoardDTO(2,"두번째 글","이자바",0));
    boardDTOList.add(new BoardDTO(3,"세번째 글","김자바",3));
    boardDTOList.add(new BoardDTO(4,"네번째 글","이자바",9));
    boardDTOList.add(new BoardDTO(5,"다섯번째 글","김자바",10));


  }

  // 게시글 목록을 조회하는 API
  // URL -> (GET) localhost:8080/boards
  @GetMapping("/boards")
  public List<BoardDTO> getBoardList(){
    System.out.println("게시글 목록을 조회합니다");
    return boardDTOList;
  }

  // 게시글 하나를 조회하는 API
  // URL -> (GET) localhost:8080/boards/5
  // URL에 {}를 사용하여 변수처럼 활용할 수 있음
  // 이 변수는 URL에 적용되었다는 의미에서 URL Parameter라 부른다
  // URL Parameter로 전달되는 데이터는 메서드의 매개변수에 @Pathvariable 어노테이션을 사용하여 활용 가능
  // 문법 : @Pathvariable("URL 파라미터 이름") 해당 데이터를 받을 자료형과 변수
  // @Pathvariable에 받은 데이터를 int num에 저장
  @GetMapping("/boards/{boardNum}")  // {boardNum} => 변수
  public BoardDTO getBoard(@PathVariable("boardNum") int num){
    System.out.println("num = "+num);
    System.out.println(num+"번 게시글을 조회합니다");
    BoardDTO result = null;
    for(BoardDTO e : boardDTOList){
      if (e.getBoardNum() == num){
        result = e;
        break;
      }
    }
    return result;
  }

  // 연습
  // URL -> (GET) localhost:8080/boards/5/java
  @GetMapping("/boards/{age}/{name}")
  public void test1(@PathVariable("age")int num, @PathVariable("name")String name){
    System.out.println("num = "+num);
    System.out.println("name = "+name);
  }


  // 게시글 등록하는 API
  // URL -> (POST) localhost:8080/boards
  // 데이터 등록(POST), 데이터 수정(PUT) 시 요청과 함께 전달되는 데이터는
  // @RequestBody 어노테이션으로 전달받음
  // @RequestBody 어노테이션 다음에 클래스 자료형을 매개변수로 선언하면 해당 클레스에 데이터를 받을 수 있음
  // 단 해당 클래스의 멤버변수명은 요청시 전달되는 객체의 key값과 동일해야함
  //{
  //    "boardNum" : 7,
  //    "title" : "신규게시글",
  //    "writer" : "Lee",
  //    "readCnt" : 7
  //}
  // postman에서 입력창에 raw JSON 설정하고 자바스크립트 객체 처럼 적고 POST로 Send하면 추가됨
  @PostMapping("/boards")
  public void regBoard(@RequestBody BoardDTO boardDTO){
    System.out.println(boardDTO);
    boardDTOList.add(boardDTO);
  }


  // 게시글 삭제하는 API
  // URL -> (DELETE) localhost:8080/boards/3
  @DeleteMapping("/boards/{boardNum}")

  public List<BoardDTO> BoardDTO(@PathVariable("boardNum")int num){
    for (int i = 0; i<boardDTOList.size(); i++){
      if (boardDTOList.get(i).getBoardNum() == num){
        boardDTOList.remove(i);
      }
    }
    return boardDTOList;

//    for (BoardDTO e : boardDTOList){
//      if (e.getBoardNum()==num){
//        boardDTOList.remove(i);
//        break;
//      }
//    }
//    return boardDTOList;
  }


  // 게시글 수정하는 API
  // @PathVariable, @RequestBody 어노테이션 둘다써야함
  // URL -> (PUT) localhost:8080/boards/3
  // 게시글의 제목과 작성자 변경일 경우
  // 삽입과 마찬가지로 전달되는 매개변수의 키값과 해당 클래스의 매개변수명이 동일해야함
  @PutMapping("/boards/{boardNum}")
  public List<BoardDTO> updateBoard(@PathVariable("boardNum") int boardNum, @RequestBody BoardDTO boardDTO){
    System.out.println(boardNum);
    System.out.println(boardDTO);
    for (BoardDTO e : boardDTOList){
      if (e.getBoardNum() == boardNum){
        e.setTitle(boardDTO.getTitle());
        e.setWriter(boardDTO.getWriter());
      }
    }
    return boardDTOList;


//    for (int i = 0; i<boardDTOList.size(); i++){
//      if (boardDTOList.get(i).getBoardNum()==boardNum){
//        boardDTOList.get(i).setTitle(boardDTO.getTitle());
//        boardDTOList.get(i).setWriter(boardDTO.getWriter());
//      }
//    }
  }
}

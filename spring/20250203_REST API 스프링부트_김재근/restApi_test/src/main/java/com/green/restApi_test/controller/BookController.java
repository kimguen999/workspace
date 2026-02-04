package com.green.restApi_test.controller;


import com.green.restApi_test.BookDTO;
import jakarta.annotation.PreDestroy;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/books")
@RestController
public class BookController {
  // 리스트 선언
  public List<BookDTO> bookDTOList;

  // 생성자
  public BookController(){
    // List 생성
    bookDTOList= new ArrayList<>();

    // 임의의 데이터 5개
    bookDTOList.add(new BookDTO(1,"해리포터","말포이","셔럽 말포이",10000));
    bookDTOList.add(new BookDTO(2,"반지의제왕","골룸","마 프레셔스",11000));
    bookDTOList.add(new BookDTO(3,"존윅","존윅","다죽여줄게",15000));
    bookDTOList.add(new BookDTO(4,"asdf","qwer","zxcv",20000));
    bookDTOList.add(new BookDTO(5,"tyui","ghjk","bnm,",25000));

  }

  // 모든 도서정보 조회하는 기능 제공 api
  //(get) http://localhost:8080/books
  @GetMapping("")
  public List<BookDTO> getBookList(){
    return bookDTOList;
  }


  // 하나의 도서정보 조회하는 기능 제공 api
  // (get) http://localhost:8080/books/5
  @GetMapping("/{bookNum}")
  public BookDTO getOneBook(@PathVariable("bookNum") int bookNum){
    BookDTO show = null;
    for (int i = 0; i<bookDTOList.size(); i++){
      if (bookDTOList.get(i).getBookNum() == bookNum){
        show = bookDTOList.get(i);
        break;
      }
    }
    return show;
  }


  // 하나의 도서정보 등록 기능 제공 api
  // (post) http://localhost:8080/books
  @PostMapping("")
  public List<BookDTO> postOneBook(@RequestBody BookDTO bookDTO){
    bookDTOList.add(bookDTO);
    System.out.println("도서번호 "+bookDTO.getBookNum()+"번이 등록되었습니다.");
    System.out.println("제목 : "+bookDTO.getBookTitle());
    System.out.println("저자 : "+bookDTO.getAuthor());
    System.out.println("도서설명 : "+bookDTO.getBookIntro());
    System.out.println("가격 : "+bookDTO.getBookPrice()+"원");
    return bookDTOList;
  }

  // 하나의 도서정보 삭제 기능 제공 api
  // (delete) http://localhost:8080/books/3
  @DeleteMapping("/{bookNum}")
  public String deleteOneBook(@PathVariable("bookNum") int bookNum){
    for (int i = 0; i<bookDTOList.size(); i++){
      if (bookDTOList.get(i).getBookNum() == bookNum){
        bookDTOList.remove(i);
        break;
      }
    }
    int b = bookNum;
    return "도서번호 "+bookNum+"번이 삭제되었습니다.";

  }

  // 하나의 도서정보에서 도서병과 저자, 도서가격을 수정하는 기능 제공 api
  // (put) http://localhost:8080/books/3
  @PutMapping("/{bookNum}")
  public List<BookDTO> putOneBook(
      @PathVariable("bookNum") int bookNum
      , @RequestBody BookDTO bookDTO){
    for (int i = 0; i<bookDTOList.size(); i++){
      if (bookDTOList.get(i).getBookNum() == bookNum){
        bookDTOList.get(i).setBookTitle(bookDTO.getBookTitle());
        bookDTOList.get(i).setAuthor(bookDTO.getAuthor());
        bookDTOList.get(i).setBookPrice(bookDTO.getBookPrice());
      }
    }
    System.out.println("도서번호 "+bookNum+"번의 제목, 저자, 가격이 수정되었습니다.");
    return bookDTOList;
  }

}

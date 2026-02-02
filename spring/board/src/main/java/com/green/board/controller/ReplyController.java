package com.green.board.controller;

import com.green.board.dto.ReplyDTO;
import com.green.board.service.ReplyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/replies")
public class ReplyController {

  private ReplyService replyService;

  public ReplyController(ReplyService replyService){
    this.replyService = replyService;
  }

  // 댓글 목록 조회 api
  // (GET) localhost:8080/replies/2
  @GetMapping("/{boardNum}")
  public List<ReplyDTO> getReplyList(@PathVariable("boardNum") int boardNum){
    List<ReplyDTO> list = replyService.getReplyList(boardNum);
    System.out.println(list);
    System.out.println(list.size());
//   데이터가 조회 안되면 리스트의 경우 배열에 길이는 0이다(null아님)
//   데이터를 담는 통이 없으면 null
//   통은 있지만 데이터가 없으면 길이 0
    return list;
  }

}

package com.green.legacy.controller;


import com.green.legacy.dto.ReplyDTO;
import com.green.legacy.service.BoardService;
import com.green.legacy.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reply")
@RequiredArgsConstructor
public class ReplyController {
  private final ReplyService replyService;

  // 댓글 등록
  @RequestMapping("/insert")
  public String insertReply(@ModelAttribute ReplyDTO replyDTO){
    System.out.println("replyDTO : "+replyDTO);
    replyService.insertReply(replyDTO);

    return  "redirect:/boards/detail?boardNum=" + replyDTO.getBoardNum();
  }

  // 댓글 삭제
  @RequestMapping("/delete")
  public String deleteReply(@RequestParam(name="replyNum") int replyNum,
                            @RequestParam(name="boardNum") int boardNum){
    System.out.println("삭제할 댓글 번호 : "+replyNum);
    replyService.deleteReply(replyNum);
    return "redirect:/boards/detail?boardNum=" + boardNum;
  }




}

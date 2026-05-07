package com.green.legacy.service;

import com.green.legacy.dto.ReplyDTO;
import com.green.legacy.mapper.ReplyMapper;
import com.green.legacy.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyService {
  private final ReplyMapper replyMapper;

  // 댓글 목록 조회 기능
  public List<ReplyDTO> selectReplyList(int boardNum){
    return replyMapper.selectReplyList(boardNum);
  }

  // 댓글 등록 기능
  public void insertReply(ReplyDTO replyDTO){
    replyMapper.insertReply(replyDTO);
  }

  // 댓글 삭제 기능
  public void deleteReply(int replyNum){
    replyMapper.deleteReply(replyNum);
  }


}

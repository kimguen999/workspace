package com.green.legacy.service;

import com.green.legacy.mapper.ReplyMapper;
import com.green.legacy.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReplyService {
  private final ReplyMapper replyMapper;
}

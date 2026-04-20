package com.green.security.service;

import com.green.security.dto.MemberDTO;
import com.green.security.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
  private final MemberMapper memberMapper;
  // 비밀번호 암호화
  private final PasswordEncoder passwordEncoder;



  // 회원가입
  public void join(MemberDTO memberDTO){

    // 회원가입시 입력한 비밀번호 암호화
    String encodedPw = passwordEncoder.encode(memberDTO.getMemPw());
    memberDTO.setMemPw(encodedPw);

    memberMapper.join(memberDTO);
  }


  public MemberDTO selectLoginInfo(String memEmail){
    return memberMapper.selectLoginInfo(memEmail);
  }


}

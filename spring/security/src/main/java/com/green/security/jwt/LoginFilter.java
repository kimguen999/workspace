package com.green.security.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.green.security.dto.MemberDTO;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class LoginFilter extends UsernamePasswordAuthenticationFilter {

  // 객체 선언 (필드)
  private final AuthenticationManager authenticationManager;

  // 생성자 의존성 주입 방식으로 멤버변수 authenticationManager를 생성
  public LoginFilter(AuthenticationManager authenticationManager){
    this.authenticationManager = authenticationManager;

    // 로그인 요청 url 변경
    setFilterProcessesUrl("/member/login");

    // 전달되는 아이디, 비번 key값 변경
    setUsernameParameter("memEmail");
    setPasswordParameter("memPw");


  }


  // public class 자식 extends 부모{
  //  상속
  // }
  // 오버라이딩 : 부모가 가진 메서드를 자식이 바꿔서 사용 가능한거 (덮어씌우기)

  // 다형성
  // Account a = new MyAccount();


  // spring security의 기본 로그인 절차
  // 1. 로그인 요청이 들어오면 UsernamePasswordAuthenticationFilter 클래스의
  //    attemptAuthentication 매서드가 실행되면서 로그인을 진행

  // 우리가 하고싶은 방식
  // 1. 로그인 요청이 들어오면 LoginFilter 클래스의 attemptAuthentication() 매서드를 실행
  // 2.
  @Override
  public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
    System.out.println("loginFilter 클래스의 attemptAuthentication 매서드 실행");

    // 잔달된 아이디 및 비번을 저장하기 위한 객체
    MemberDTO vo = new MemberDTO();

    // 로그인 요청시 전달되는 아이디 및 비번을 받는 코드
    try {
      ObjectMapper objectMapper = new ObjectMapper();
      ServletInputStream inputStream = request.getInputStream();
      String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
      vo = objectMapper.readValue(messageBody, MemberDTO.class);
    }catch (IOException e){
      throw new RuntimeException(e);

    }
    // 전달받은 로그인 정보 확인
    System.out.println("전달받은 아이디 : "+vo.getMemEmail());
    System.out.println("전달받은 비밀번호 : "+vo.getMemPw());

    // 전달받은 로그인 정보를 AuthenticationManager 객체에 전달
    // 그러면 AuthenticationManager 객체로 로그인 검증을 시작

    // 1) 전달받은 로그인 정보를 보안 기능이 추가된 객체에 등록
    UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
        vo.getMemEmail(), vo.getMemPw(), null
    );
    // 2) authenticationManager한테 로그인 정보가 담긴 상자(authToken)를 전달
    //    authenticationManager가 로그인 정보를 전달받으면 바로 로그인 검증 로직을 실행
    //    로그인 검증 로직을 실행하면 UserDetailsService 인터페이스 안에 정의된
    //    loadUserByUsername 메서드를 우선 호출한다.
    //
    //    authentication 객체에는 로그인 검증에 대한 결과 데이터가 들어있음
    Authentication authentication = authenticationManager.authenticate(authToken);

    // 검증 성공한 유저의 아이디(이메일)을 출력
    System.out.println("로그인 유저 : "+authentication.getName());

    // 로그인 검증 결과를 리턴
    // 결과에 따라 successfulAuthentication 혹은 unsuccessfulAuthentication 중 하나가 실행
    return authentication;
  }

  // 로그인 검증 성공 시 실행하는 메서드
  @Override
  protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
    System.out.println("로그인 검증 성공 = LoginFilter 클래스의 successfulAuthentication 메서드 실행");
  }

  // 로그인 검증 실패 시 실행하는 메서드
  @Override
  protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
    System.out.println("로그인 검증 실패 = LoginFilter 클래스의 unsuccessfulAuthentication 메서드 실행");
  }
}


// 1. 로그인 요청함(/login)
// 2. 우리는 로그인 요청 url을 /member/login으로 변경함
// 3. 로그인 요청이 들어오면 원래는 UsernamePasswordAuthenticationFilter의
//    attemptAutherntication() 메서드가 실행됨
//    이 메서드가 실행되면서 로그인 검증 로직이 시작
//    하지만 우리는 UsernamePasswordAuthenticationFilter 대신 우리가 만든 LoginFilter클래스의
//    attemptAuthentication() 메서드가 실행되게 변경
//    스프링시큐리티에서 자체적으로 제공하는 로그인기능 대신 jwt 토큰 사용하는 로그인 기능으로 변경하기 위해
//  ==>로그인 요청이 들어오면 LoginFilter 클래스의 attemptAuthentication() 메서드가 실행됨
// 4. attemptAuthentication() 메서드에서는 로그인 요청 시 전달되는 아이디, 비번을 받아
//    AuthenticationManager 객체한테 전달
// 5. 입력한 아이디와 비밀번호 정보를 받은 AuthenticationManager 객체는
//    로그인 검증을 하기 위해 필요한 DB에 저장된 아이디, 비밀번호 정보도 제공을 해야함
// 6. 5번 과정을 진행하기 위해 UserDetailsService 인터페이스 안의 loadUserByUsername() 메서드 호출
// 7. loadUserByUsername() 메서드에서는 로그인 하려는 회원의 정보를 DB에서 조회.
//    조회한 데이터를 리턴하면 리턴된 데이터를 AuthenticationManager가 가져감



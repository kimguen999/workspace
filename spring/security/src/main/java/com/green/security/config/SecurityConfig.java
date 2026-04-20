package com.green.security.config;

import com.green.security.jwt.LoginFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;




// 인증 및 인가에 대한 설정 내용을 작성하는 클래스
@Configuration  // 객체 생성 + 해당 클래스는 설정 내용이 작정된 파일임을 스프링한테 인지
@EnableWebSecurity  // 해당 파일이 security 설정파일이며, security 설정을 활성화
public class SecurityConfig {



  /**
   * Spring Security에서 HTTP 요청에 대한 보안 설정을 정의하는 메서드
   * 메서드의 형태가 정해져 있음
   *
   * 인증 및 인가 설정을 작성하는 메서드
   * 해당 메서드는 리턴타입과 매개변수는 정해져있다.
   */
  @Bean
  // Bean : 메서드 실행 결과 리턴되는 데이터를 객체로 가지고 있는 어노테이션
  //   ㄴ>인증 및 인가에 대한 설정내용이 담긴 http를 리턴
  public SecurityFilterChain filterChain(HttpSecurity http, AuthenticationConfiguration authConfig) throws Exception {


    AuthenticationManager authenticationManager = authConfig.getAuthenticationManager();

    // 스프링에서 주는 로그인기능 사용 안하기 때문에 disable처리
    http
        //CORS 설정. 아래 corsConfigurationSource() 메서드에서 정의한 Bean을 등록함.
        .cors(Customizer.withDefaults())
        //csrf disable  세션방식이 아니기 때문에 할 필요 없음
        .csrf(csrf -> csrf.disable())
        //form 로그인 방식 disable
        .formLogin(form -> form.disable())
        //http basic 인증 방식 disable
        .httpBasic(basic -> basic.disable())
        //세션을 STATELESS로 지정
        .sessionManagement(
            session ->
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        )
        //인증 및 인가에 대한 접근 설정*******************중요
        .authorizeHttpRequests(auth ->
            auth.anyRequest().permitAll()
            // 모든 요청에 대한 접근을 허용하겠다.
            // == 인증 및 인가를 받지 않아도 모든 곳에 접근 가능하다.
        );

    // 기존 로그인 처리를 담당하는 UsernamePasswordAuthenticationFilter를
    // LoginFilter 클래스로 대체
    http.addFilterAt(new LoginFilter(authenticationManager), UsernamePasswordAuthenticationFilter.class);

    return http.build();
  }

  //CORS 설정 Bean
  @Bean
  // 리액트의 허용 정보를 가진 config를 담은 source를 리턴
  public CorsConfigurationSource corsConfigurationSource() {
    CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials(true); //쿠키 정보를 통신하기 위한 설정
    config.addAllowedOrigin("http://localhost:5173"); //리액트에서의 요청 허용
    config.addAllowedHeader("*"); //모든 헤더 정보 허용
    config.addAllowedMethod("*"); //get, post, delete, put 등의 요청 메서드 허용

    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", config);
    return source;
  }

  //비밀번호 암호화 기능을 제공하는 객체
  @Bean
  public PasswordEncoder bCryptPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }

}
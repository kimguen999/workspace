package com.green.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

  private Cook chef;

  @Autowired  // 생성자 의존성 주입 (DI)
  // 생성된 객체 중 자료형이 일치하는 객체를 매개변수로 주입시켜주세요
  public Restaurant(Chef chef){
    // chef = new Chef();  Spring은 객체 생성을 자동으로 해줌 (IOC)
    // -> 결합도 낮아짐

    this.chef = chef;
  }

  public void run(){
    chef.cook();
  }

}

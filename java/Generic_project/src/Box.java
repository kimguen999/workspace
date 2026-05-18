
// Generic : 자료형을 클래스나 메서드 정의 단계에서 정하지 않고
//          객체 생성 시 자료형을 지정하는 코드 작성 문법


import java.security.PublicKey;


// Generic 이전 문법

// 오렌지, 사과를 저장하고 빼낼수 있는 상자
public class Box {
  private Object obj; // 상속 내용

  // 상속 - 상속한 클래스의 메서드, 변수를 내것처럼 사용
  //            ex) class Aaa extends Bbb{}
  //                  부모 : Bbb, 자식 : Aaa
  //      - 다형성 : 객체가 다양한 형태를 지닌다
  //                상속이 적용된 클래스의 객체를 만드는 형태가 다양
  //                  부모 클래스는 자식 클래스의 객체를 만들수있다.
  //                   ex) Bbb b = new Bbb();
  //                   ex) Bbb b = new Aaa();
  //                   ex) Object o = new Bbb();  Object는 모든 클래스의 부모
  //                  부모는 자식을 받아들이지만
  //                  자식은 부모를 받아들이지 못함
  //                    ex) Aaa a = new Bbb();  안됨.

  //      모바일 e = new 스마트폰();
  //        폰 주세요 했는데 스마트폰주면 맞음
  //      스마트폰 e = new 스마트폰();
  //        스마트폰 주세요 했는데 스마트폰 주면 맞음
  //      스마트폰 e = new 모바일폰(); x
  //        스마트폰 주세요 했는데 그냥 폰주면 안맞음.


//  public void set(Orange orange){
//    this.orange = orange;
//  }

  public void set(Object obj) {
    this.obj = obj;
  }

//  public Orange get(){
//    return orange;
//  }

  public Object get(){
    return obj;
  }
}



class Orange{
  public String say(){
    return "I am an Orange";
  }
}

class Apple{
  public String say(){
    return "I am an Apple";
  }
}

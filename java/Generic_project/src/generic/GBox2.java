package generic;
// Generic 클래스의 타입인자 제한
// 다양한 메서드를 사용해서 클래스를 구현



// <T extends generic.Phone> :
// 타입인자로 generic.Phone 클래스 그리고 generic.Phone 클래스를 상속한 클래스만 올수있음.
public class GBox2<T extends Phone>{
  private T t;
  // 자료형이 정해져 있지 않아 원하는걸 못쓴다.

  public void method1(){
    t.call();
    t.sendMsg();
  }
}

class Phone{
  public void call(){
    System.out.println("전화함");
  }
  public void sendMsg(){
    System.out.println("문자함");

  }
}


class SmartPhone extends Phone{
  public void playApp(){
    System.out.println("앱실행");
  }
}
package static_study;

public class Bank {

  private String owner;
  private int money;

  // static은 생성자에서 초기화 하면 안된다.
  // static 변수를 초기화히기 위한 별도의 문법이 존재

  static private double rate = 7.0;

  // static 변수의 초기화 구문
  static {
    rate = 9.0;
  }


  public Bank(){
    money = 10000;
    // rate = 7.0;
  }

}

package interface1;

public class TvUser {
  public static void main(String[] args) {

    // 인터페이스를 구현한 클래스의 객체를 해당 인터페이스 자료형으로 받을수있다
    Tv tv = new SamsungTV();
    tv.turnOn();
    tv.turnOff();
    tv.volumeUp();
    tv.volumeDown();


  }
}

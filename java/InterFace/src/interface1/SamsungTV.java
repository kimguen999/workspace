package interface1;

public class SamsungTV implements Tv{
  // 전원 on
  public void turnOn(){
    System.out.println("삼성 tv - 전원 켬");
  }
  // 전원 of
  public void turnOff(){
    System.out.println("삼성 tv - 전원 끔");
  }
  // 볼륨 up
  public void volumeUp(){
    System.out.println("삼성 tv - 소리 올림");
  }
  // 볼륨 down
  public void volumeDown(){
    System.out.println("삼성 tv - 소리 내림");
  }
}

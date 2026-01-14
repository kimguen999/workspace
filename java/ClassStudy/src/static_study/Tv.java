package static_study;

public class Tv {

  int price;
  double inch;
  static int channel;

  public void turnOn(){
    System.out.println("TV를 켭니다");
    storeLike();
  }

  public void storeLike(){
    System.out.println("TV 끄기 전 즐겨찾기 저장");
  }

  // static이 있는 메서드 안에서는 static이 없는 메서드 호출 불가
  public static void setChannelInfo(){
    System.out.println("전원이 들어오기 전 채널 정보를 받아옵니다;");
    //turnOn();
    //storeLike();
  }


}

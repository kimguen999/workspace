package study3;

public class Item {
  String grade;
  // 아이템 강화
  public void upgrade(){
    System.out.println("아이템을 강화합니다");
  }
}

// 이 클래스는 아주 희귀한 아이템
class Sword extends Item{
  // @ : annotation(어노테이션)
  // 어노테이션 마다 특정 역할을 수행
  // Override 어노테이션은 오버라이딩 문법에 맞는지 검사를 해줌.
  @Override
  public void upgrade() {
    System.out.println("강화 학률이 10% 내려갑니다");
  }
}

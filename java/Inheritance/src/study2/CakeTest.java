package study2;

public class CakeTest {
  public static void main(String[] args) {

    CheeseCake c1 = new StrawberryCheeseCake();
    // c1객체에서는 eatStrawberryCheeseCake() 메서드 호출 불가
    c1.eatCake();
    c1.eatCheeseCake();
    // c1.eatStrawberryCheeseCake();

    // 형변환을 통해 객체 변경 가능
    // 형변환 : int a = (int)10.5;
    // StrawberryCheeseCake c2 = c1;
    // c1의 자료형은 CheeseCake, 따라서 자료형이 StrawberryCheeseCake인 c2에 넣기위해선 형변환 필요
    StrawberryCheeseCake c2 = (StrawberryCheeseCake)c1;

    CheeseCake c3 = new CheeseCake();
    StrawberryCheeseCake c4 = (StrawberryCheeseCake)c3;


  }

}

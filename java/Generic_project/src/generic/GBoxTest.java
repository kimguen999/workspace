package generic;

import java.util.ArrayList;
import java.util.List;

public class GBoxTest {
  public static void main(String[] args) {

    // 클래스를 선언할때는 자료형을 안정하고 있다가
    // 객체 지정할때는 자료형을 써줌
    GBox<Orange> b1 = new GBox<Orange>();

    b1.set(new Orange());
    b1.get(); // 대놓고 리턴타입이 orange기때문에 형변환 필요없음
    Orange o = b1.get();

    GBox<Apple> b2 = new GBox<>(); // 객체 생성부분에는 뒤쪽에 자료형 생략해도됨
    List<Orange> list = new ArrayList<>();
    b2.set(new Apple());
    Apple a = b2.get();

    GBox2<Phone> g1 = new GBox2<>();
    GBox2<SmartPhone> g2 = new GBox2<>();
    // 상속한거만 들어올수있음.

//    generic.GBox2<generic.Orange> g3 = new generic.GBox2<>();
//    generic.GBox2<generic.Apple> g4 = new generic.GBox2<>();
//

    GBox3 box3 = new GBox3();
    GBox<Orange> ob = box3.<Orange>makeBox(new Orange());




  }
}

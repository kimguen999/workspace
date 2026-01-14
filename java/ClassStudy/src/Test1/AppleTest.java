package Test1;

import Test1.inner.Banana;
import Test2.Orange;
// 다른 패키지에 있는 클래스를 사용하려면 import 해야함.
import java.util.Scanner;
// Scanner도 마찬가지.
// Apple, AppleTest와 같이 같은 패기키면 import 없어도됨.

public class AppleTest {

  public static void main(String[] args) {
    Banana a = new Banana();
    Scanner sc = new Scanner(System.in);
    sc.nextInt();

    //사과 객체
    Apple ap = new Apple();
    //ap.price; 접근가능

    //오렌지 객체
    Orange or = new Orange();
    //or.price; 접근불가
  }

}

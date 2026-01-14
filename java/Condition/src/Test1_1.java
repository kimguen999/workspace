// 정수를 담을 수 있는 변수 두 개를 선언하고, 각각의 변수에 임의의 정수를 초기화하여라. 그리고 두 수의 합이 50보다 클 경우에는 ‘두 수의 합이 50보다 큽니다.’를 출력하고, 두
//수의 합이 50 이하일 경우에는 ‘두 수의 합이 50이하 입니다.’를 출력해보세요.

import java.util.Scanner;

public class Test1_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1 = 3;
    int num2 = 4;

    if (num1+num2>50) {
      System.out.println("두 수의 합이 50보다 큽니다.");
    }
    else {
      System.out.println("두 수의 합이 50이하 입니다.");
    }
    // 삼항연산자 : if else문을 대체해서 사용!
    // 조건 ?  참일때 실행코드 : 거짓일때 실행코드;
    int num = 10>3 ? 5:10;

    System.out.println( num1 + num2 > 50 ? "크다" : "작다");

  }
}

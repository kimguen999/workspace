//정수형 변수 하나를 선언하고 0 ~ 100까지의(0,100 포함) 숫자 중 임의의 값을 키보드로
//입력받아 초기화하자. 그 후 변수의 값이 90보다 크고 100보다 작거나 같으면 ‘학점은 A입니
//다.’를 출력하고, 80보다 크고 90보다 작거나 같으면 ‘학점은 B입니다.’를 출력하고, 80점 이
//하라면 ‘학점은 C입니다.’를 출력해보자.

import java.util.Scanner;

public class Test1_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    if (num>90&&num<=100) {
      System.out.println("학점은 A입니다.");
    } else if (num>80&&num<=90) {
      System.out.println("학점은 B입니다.");
    } else if (num<=80) {
      System.out.println("학점은 C입니다.");
    } else {
      System.out.println("잘못된 점수입니다. 다시 입력하세요.");
    }




    String grade = "";
    int num1 = sc.nextInt();
    if (num1>90&&num1<=100) {
      grade = "A";
    } else if (num1>80&&num1<=90) {
      grade = "B";
    } else if (num1<=80) {
      grade = "C";
    } else {
      System.out.println("잘못된 점수입니다. 다시 입력하세요.");
    }
    System.out.println("학점은 "+grade+"입니다.");

  }
}

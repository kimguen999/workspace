//키보드로 정수 하나를 입력받아, 그 값이 3의 배수이면 ‘3의 배수입니다’를 출력해보자.

import java.util.Scanner;

public class Test1_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    if (num%3==0) {
      System.out.println("3의 배수입니다");
    }

    System.out.println(num%3==0?"3의배수":"");

  }
}

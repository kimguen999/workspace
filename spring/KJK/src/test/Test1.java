package test;

// 세 정수를 Scanner로 입력받아 큰 수부터 나열하여 출력하는 프로그램을 작성하시오. 단 입력받는 세 수는 중복 값이 없다고 가정한다.
// (클래스명 : Test1.java)

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1, num2, num3;

    System.out.println("큰 수 부터 정수를 나열하겠습니다.");
    System.out.println("정수 세개를 입력해주세요.");
    System.out.print("첫번째 정수 : ");
    num1 = sc.nextInt();
    System.out.print("두번째 정수 : ");
    num2 = sc.nextInt();
    System.out.print("세번째 정수 : ");
    num3 = sc.nextInt();

    int max = 0;
    int mid = 0;
    int min = 0;
    if (num1>num2&&num1>num3) {
      max = num1;
      mid = num2>num3?num2:num3;
      min = num2>num3?num3:num2;
    } else if (num2>num3&&num2>num1) {
      max = num2;
      mid = num1>num3?num1:num3;
      min = num1>num3?num3:num1;
    } else {
      max = num3;
      mid = num1>num2?num1:num2;
      min = num1>num2?num2:num1;
    }
    System.out.println("입력하신 세 정수의 크기는 다음과 같습니다.");
    System.out.println(max+" > "+mid+" > "+min);







  }

}

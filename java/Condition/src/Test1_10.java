
//세 정수를 선언하고 scanner로 값을 입력받는다. 그리고 세 수를 큰 순서대로 출력하여
//보라.(난이도 높음)

import java.util.Scanner;

public class Test1_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1,num2,num3;

    System.out.print("첫번째 수 : ");
    num1 = sc.nextInt();
    System.out.print("두번째 수 : ");
    num2 = sc.nextInt();
    System.out.print("세번째 수 : ");
    num3 = sc.nextInt();

    int max, mid, min;

    //a가 가장 큰 경우
    if (num1>num2&&num1>num3) {
      max = num1;
      mid = num2>num3?num2:num3;
      min = num2>num3?num3:num2;
    }
    //b가 가장 큰 경우
    else if (num2>num1&&num2>num3) {
      max = num2;
      mid = num1>num3?num1:num3;
      min = num1>num3?num3:num1;
    }
    //c가 가장 큰 경우
    else {
      max = num3;
      mid = num1>num2?num1:num2;
      min = num1>num2?num2:num1;
    }
    System.out.println(max + " > " + mid + " > " + min);




    if (num1>num2&&num2>num3){
      System.out.println(num1 + " > " + num2 + " > " + num3);
    } else if (num1>num3&&num3>num2){
      System.out.println(num1 + " > " + num3 + " > " + num2);
    } else if (num2>num1&&num1>num3){
      System.out.println(num2 + " > " + num1 + " > " + num3);
    } else if (num2>num3&&num3>num1){
      System.out.println(num2 + " > " + num3 + " > " + num1);
    } else if (num3>num1&&num1>num2){
      System.out.println(num3 + " > " + num1 + " > " + num2);
    } else if (num3>num2&&num2>num1){
      System.out.println(num3 + " > " + num2 + " > " + num1);
    } else {
      System.out.println("같은 수가 있습니다. 다시 실행해주세요");
    }



  }
}

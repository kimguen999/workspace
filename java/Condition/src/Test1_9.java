
//정수형 변수를 두 개 선언하고, scanner로 값을 입력받는다. 입력받은 수의 크기를 비교하여 큰수부터 나열하여 출력하여라.(굵은 기울기체는 사용자가 입력하는 부분이다)

import java.util.Scanner;

public class Test1_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1, num2;
    System.out.print("첫번째 수 : ");
    num1 = sc.nextInt();
    System.out.print("두번째 수 : ");
    num2 = sc.nextInt();

    System.out.println(num1>num2?num1+" > "+num2:num2+" > "+num1);

    int max, min;



    max = num1>num2 ? num1:num2;
    min = num1>num2 ? num2:num1;
    // max = Math.max(num1, num2);
    // min = Math.min(num1, num2);
    System.out.println(max+" > "+min);
  }
}

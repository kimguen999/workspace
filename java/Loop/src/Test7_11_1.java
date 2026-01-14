
//키보드로 두 정수를 입력받아 입력받은 두 정수 사이의 모든 정수의 합을 출력하여라.

import java.util.Scanner;

public class Test7_11_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b;
    System.out.print("정수 두개 적어봐라. 정수 사이 합 알려주마 : ");
    a = sc.nextInt();
    b = sc.nextInt();
    int max = 0;
    int min = 0;
    // if 대신 삼항연산자도 가능
    // int max = a>b ? num1:num2
    // int min = a>b ? num2:num1
    if (a>=b){
      max = a;
      min = b;
    } else {
      max = b;
      min = a;
    }
    //for(int i = min + 1; i < max; i++){
    //  sum = sum+i
    //}


    int sum;
    for (sum = 0; max-1>min; min++){
      sum = sum+min+1;
    }
    System.out.println("두 정수 사이의 합은 "+sum+"이다.");

  }
}

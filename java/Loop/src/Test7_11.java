
//키보드로 두 정수를 입력받아 입력받은 두 정수 사이의 모든 정수의 합을 출력하여라.

import java.util.Scanner;

public class Test7_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a,b,sum;
    sum=0;
    System.out.print("두 정수를 입력하면 그 사이 정수 다 더해줄게 : ");
    a = sc.nextInt();
    b = sc.nextInt();
    int max = 0;
    int min = 0;
    if (a>b){
      max = a;
      min = b;
    } else if (b>a) {
      max = b;
      min = a;
    } else {
      System.out.println("두 정수가 같으므로 다시 적어라.");
    }
    while (max-1>min){
      min++;
      sum=sum+min;
    }
    System.out.println("니가 적은 두 정수 사이의 합은 "+sum+"이다.");




  }
}

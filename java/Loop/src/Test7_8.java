
//키보드로 정수를 입력받아 1부터 입력받은 수까지 중 짝수의 개수를 구하세요.

import java.util.Scanner;

public class Test7_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i = 1;
    int a, count;
    count = 0;
    System.out.print("정수입력해라 : ");
    a = sc.nextInt();
    while (i<=a){
      if (i%2==0){
        count++;
      }
      i++;
    }
    System.out.println("니가 입력한 "+a+" 중에 짝수는 "+count+"개 이다.");
  }
}

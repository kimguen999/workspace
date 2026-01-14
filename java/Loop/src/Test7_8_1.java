
//키보드로 정수를 입력받아 1부터 입력받은 수까지 중 짝수의 개수를 구하세요

import java.util.Scanner;

public class Test7_8_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수 입력해봐라. 1부터 정수까지 짝수 개수 세줄게. ");
    int a = sc.nextInt();
    int count = 0;
    for (int i = 1; i<=a; i++){
      if (i%2==0){
        count++;
      }
    }
    System.out.println("1부터 정수까지 짝수 개수는 "+count+"개다.");

  }
}

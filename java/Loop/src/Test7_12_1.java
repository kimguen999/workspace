
//구구단 2단을 아래와 같은 형태가 나오도록 반복문을 이용하여 출력하여라.

import java.util.Scanner;

public class Test7_12_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;

    System.out.print("구구단 몰라? 몇단 보여줄까? : ");
    n = sc.nextInt();
    for (int i = 1; i<10; i++){

      System.out.println(n+" * "+i+" = "+(n*i));
    }



  }
}

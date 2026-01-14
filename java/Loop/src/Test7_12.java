
// 구구단 2단을 아래와 같은 형태가 나오도록 반복문을 이용하여 출력하여라.

import java.util.Scanner;

public class Test7_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n;
    int i = 1;
    System.out.print("구구단 모르냐? 몇단 보여줄까? : ");
    n = sc.nextInt();

    while (i<20){

      System.out.println(n+" * "+i+" = "+(n*i));
      i++;
    }
    System.out.println(n+"단? 공부좀하자. 옛다~ ");


  }
}

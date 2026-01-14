//a, b 두 변수 선언 후 키보드로 입력받은 정수를 각각 저장한다. 그 후 a의 값이 크다면
//‘a가 큽니다.’를, b의 값이 크면 ‘b가 큽니다’를, 두 변수의 값이 같다면 ‘같습니다.’를 출력해
//보자.

import java.util.Scanner;

public class Test1_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a>b){
      System.out.println("a가 큽니다.");
    } else if (a<b) {
      System.out.println("b가 큽니다.");
    }
    else {
      System.out.println("같습니다.");
    }
    System.out.println(a>b?"a": b>a?"b":"같음");
  }
}

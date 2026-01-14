import java.util.EventListener;
import java.util.Scanner;

public class If_2 {
  public static void main(String[] args) {
    //키보드로 정수를 하나 입력받아 입력받은 정수가 3보다 클 때만
    //"정답" 이라는 문자열을 출력하는 프로그램

    Scanner sc = new Scanner(System.in);
    System.out.print("짝수만 입력해라 ");
    int num;
    num = sc.nextInt();
    if (num%2==0){
      System.out.println("정답");
    }

  }
}




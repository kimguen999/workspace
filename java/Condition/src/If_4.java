import java.util.Scanner;

public class If_4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 키보드로 정수를 하나 입력받아
    // 입력받은 정수가 양수면 1을 출력
    // 음수면 2를 출력, 0이면 3을 출력
    System.out.print("정수입력 ");
    int num = sc.nextInt();
    if (num>0) {
      System.out.println(1);
    }
    // 그렇지 않고 만약에...
    else if (num<0) {
      System.out.println(2);
    }
    else {
      System.out.println(3);
    }


  }
}

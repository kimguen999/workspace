import java.util.Scanner;

public class Switch_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = 3;

    // switch문은 조건이 일치하는 위치부터 코드 실행

    switch (num){
      case 1 :
        System.out.println("x");
        System.out.println("x");
        //브레이크 실행시 해석 종료
        break;
      case 2 :
        System.out.println("o");
        System.out.println("o");
        break;
      case 3 :
        System.out.println("x");
        System.out.println("x");
        break;
      default:  //위 케이스 말고 나머지 경우에는
        System.out.println("x");
        System.out.println("x");

    }

  }
}

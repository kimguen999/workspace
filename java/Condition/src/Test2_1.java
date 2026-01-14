import javax.swing.*;
import java.util.Scanner;

public class Test2_1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n1,n2,n3;

    System.out.println("정수 3개 적어봐라");
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    n3 = sc.nextInt();

    if (n1+n2>n3 && n2+n3>n1 && n3+n1>n2) {
      System.out.println("삼각형 만들기 가능");
    } else {
      System.out.println("삼각형 만들기 불가능");
    }


    String triangle = "";
    if (n1>=n2&&n1>=n3&&n2+n3>n1){
      triangle = "가능";
    } else if (n2>=n1&&n2>=n3&&n1+n3>n2) {
      triangle = "가능";
    } else if (n3>=n1&&n3>=n2&&n1+n2>n3) {
      triangle = "가능";

    } else {
      triangle = "불가능";
    }
    System.out.println("니가 적은 정수 3개로 삼각형 만들기는 "+triangle+"하다");
  }
}

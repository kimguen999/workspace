import java.util.Scanner;

public class Test3_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a,b;


    String cal;

    System.out.print("첫 번째 수 : ");
    a = sc.nextInt();
    System.out.print("두 번째 수 : ");
    b = sc.nextInt();
    System.out.print("연산자 : ");
    cal = sc.next();

    if (cal.equals("+")) {

      System.out.println(a+" "+cal+" "+b+" = "+ (a + b));
    } else if (cal.equals("-")) {

      System.out.println(a+" "+cal+" "+b+" = "+ (a - b));
    } else if (cal.equals("*")) {

      System.out.println(a+" "+cal+" "+b+" = "+ (a * b));
    } else if (cal.equals("/")) {
//
      System.out.println(a+" "+cal+" "+b+" = "+ (a/(double)b));
    } else {
      System.out.println("연산자를 잘못 입력하였습니다.");
    }






  }
}

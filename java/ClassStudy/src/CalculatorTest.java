import java.util.Scanner;

public class CalculatorTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Calculator c1 = new Calculator();
    System.out.print("첫 번째 수 : ");
    c1.num1 = sc.nextInt();
    System.out.print("두 번째 수 : ");
    c1.num2 = sc.nextInt();
    System.out.print("연산자 : ");
    c1.yunsan = sc.next();

//    c1.setCal(num1, nun2, yunsan);

    c1.printResult();

//    if (c1.yunsan.equals("+")){
//      c1.result=c1.num1+c1.num2;
//    } else if (c1.yunsan.equals("-")) {
//      c1.result=c1.num1-c1.num2;
//    } else if (c1.yunsan.equals("*")) {
//      c1.result=c1.num1*c1.num2;
//    } else if (c1.yunsan.equals("/")) {
//      c1.result=c1.num1/(double)c1.num2;
//    } else {
//
//    }

//    System.out.println(c1.getNum1()+" "+c1.getYunsan()+" "+c1.getNum2()+" = "+c1.getResult());



  }
}

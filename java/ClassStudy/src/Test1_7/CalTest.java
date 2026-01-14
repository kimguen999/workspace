package Test1_7;

import java.util.Scanner;

public class CalTest {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);



    Add add = new Add();
    Sub sub = new Sub();
    Mul mul = new Mul();
    Div div = new Div();


    System.out.print("첫 번째 수 : ");
    int num1 = sc.nextInt();
    System.out.print("두 번째 수 : ");
    int num2 = sc.nextInt();
    System.out.print("연산자 : ");
    String oper = sc.next();

    switch (oper){
      case "+":
        add.setValue(num1,num2);
        add.calculate();
        System.out.println(num1+" "+oper+" "+num2+" = "+add.calculate());
        break;
      case "-":
        sub.setValue(num1,num2);
        sub.calculate();
        System.out.println(num1+" "+oper+" "+num2+" = "+sub.calculate());
        break;
      case "*":
        mul.setValue(num1,num2);
        mul.calculate();
        System.out.println(num1+" "+oper+" "+num2+" = "+mul.calculate());
        break;
      case "/":
        div.setValue(num1,num2);
        div.calculate();
        System.out.println(num1+" "+oper+" "+num2+" = "+div.calculate());
        break;
      default:
        System.out.println("연산자를 잘못 입력했습니다.");
    }




  }
}

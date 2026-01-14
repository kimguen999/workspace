package study1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
  public static void main(String[] args) {

    // 예외처리 == 오류처리
    // 코딩 실수 or 문법 잘못적은것 -> 오류가 아님
    // 오류(예외) 발생 순간 -> 중간에 멈추고 강제 종료됨
    // ex) 0으로 나누거나(ArithmeticException),
    // 정수 입력에 문자가 들어갈 경우(InputMismatchException)

    /*
    *   예외처리 문법
    *   try{
    *     // 예외가 발생할 수 있는 코드 작성
    *     1. 첫번째 줄
    *     2. 두번째 줄
    *     3. 세번째 줄
    *
    *   } catch (Exception e){
    *     // 예외 발생 시 실행할 코드 작성, try에서 예외 발생하지 않으면 넘어감
    *     // ex) try 첫번째 줄에서 예외 적용 안하고, 두번째 줄에서 예외 발생시
    *            세번째 줄 실행하지 않고 바로 catch문 실행
    *            + 강제 종료하지 않고 끝까지 진행됨
    *   } catch (Exception e){
    *     // catch문 여려개 입력 가능
    *   }
    * */


    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("첫번째 수 : ");
      int a = sc.nextInt();
      System.out.print("두번째 수 : ");
      int b = sc.nextInt();
      System.out.print("세번째 수 : ");
      int c = sc.nextInt();

      System.out.println("a + c / b = "+(a+c)/b);
    } catch (ArithmeticException e){
      System.out.println("수학적 예외가 발생했습니다");
      System.out.println(e.getMessage());
      //e.getMessage() 예외 발생 이유를 문자열로 리턴
      e.printStackTrace();
      //e.printStackTrace() 예외 발생 이유, 위치, 등을 빨간색으로 출력
    } catch (InputMismatchException e){
      System.out.println("입력정보 예외가 발생했습니다");
      e.printStackTrace();
    } // catch를 여러개 사용해도 출력되는 것은 먼저 예외 처리되는 것 하나다.


    System.out.println("프로그램 종료");

  }
}

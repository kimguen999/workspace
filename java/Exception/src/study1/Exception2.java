package study1;

import java.util.Scanner;

public class Exception2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    try {
      int[] arr = {1,2,3};
      System.out.println(arr[4]);
    } catch (Exception e){
      //Exception e로 해도 되지만 ArrayIndexOutOfBoundsException도 가능
      // But, 배열이 넘어가는 수 호출 외에는 예외 처리 불가함.
      System.out.println("예외 발생");
      e.printStackTrace();
    }

    System.out.println("프로그램 종료");

  }
}

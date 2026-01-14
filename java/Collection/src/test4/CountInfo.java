package test4;

import java.util.Scanner;

public class CountInfo {
  Scanner sc = new Scanner(System.in);
  public void start(){

    System.out.println("계좌개설을 시작합니다.");
    System.out.println("이름 : ");
    sc.next();
    System.out.println("주민등록번호 : ");
    sc.nextInt();
    System.out.println("연락처 : ");
    sc.next();
    System.out.println("계좌번호 : ");
    sc.next();



  }

}

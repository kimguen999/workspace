package test;

// 1 ~ 999까지의 수 중 임의의 숫자를 Scanner를 통해 입력 받아, 입력받은 숫자의 369게임 결과를 출력하는 프로그램을 만드시오. 만약 박수가 없는 숫자라면 ‘박수 0번’, 박수 한 번이라면 ‘박수 1번’, 박수 두 번이라면 ‘박수 2번’, 박수가 3번이면 ‘박수 3번’이라는 문자열을 출력하면 된다. 단, 키보드로 숫자를 입력받을 때 1 ~ 999까지 숫자 이외의 데이터는 입력받지 않는다고 가정한다.
// (클래스명 : Test3.java)

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num, hunds, tens, ones, cnt;
    cnt = 0;
    System.out.println("369 게임입니다. 1~999까지 숫자 중 원하는 숫자를 입력해주세요.");
    num = sc.nextInt();

    hunds = num/100;
    tens = num/10;
    ones = num%10;

    if(hunds%3==0 && hunds!=0){
      cnt++;
    }
    if (tens%3==0 && tens!=0) {
      cnt++;
    }
    if (ones%3==0 && ones!=0) {
      cnt++;
    }

    switch (cnt){
      case 0:
        System.out.println("박수 0번");
        break;
      case 1:
        System.out.println("박수 1번");
        break;
      case 2:
        System.out.println("박수 2번");
        break;
      case 3:
        System.out.println("박수 3번");

    }


  }

}

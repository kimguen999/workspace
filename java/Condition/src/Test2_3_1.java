import javax.swing.event.SwingPropertyChangeSupport;
import java.util.Scanner;

public class Test2_3_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1~99 정수 입력
    int n, clapCnt, tens, ones;
    clapCnt = 0; //박수의 갯수


    System.out.print("1~99 사이의 숫자를 입력해봐라 : ");
    n = sc.nextInt();



    // 박수짝, 박수짝짝
    // 1. 일의자리 십의자리 분리
    tens = n / 10;
    ones = n % 10;
    // 2. 십의자리 확인 n/10 -> 박수 갯수 1증가
//    if (tens == 3 || tens == 6 || tens == 9) {
    if (tens%3==0 && tens!=0) {
      clapCnt++;
    }
    // 3. 일의자리 확인 n%10 -> 박수 갯수 1증가
    if (ones%3==0 && ones!=0) {
      clapCnt++;
    }
    switch (clapCnt){
      case 1:
        System.out.println("박수짝");
        break;
      case 2:
        System.out.println("박수짝짝");
    }
  }
}

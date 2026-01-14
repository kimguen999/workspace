import java.util.Scanner;

public class Test8_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 입력하면 소수 다 적어드리고 갯수 세 드림 : ");
    int a = sc.nextInt();
    int count = 0;
    for (int i = 2; i<a; i++){

      int cnt = 0; //나누어 떨어지는 갯수, 매번 0으로 초기화 되어야하므로 for문 안으로 넣어야함.
      for(int j = 1; j < i; j++) {

        if (i % j == 0) {
          cnt++;
//          if (cnt>2){
//            break;
//          }
        }
      }
      if (cnt == 1){
        System.out.println(i);
        count++;
      }
    }
    System.out.println("니가 적은 "+a+"까지의 정수 중 소수는 "+count+"개다");
  }
}

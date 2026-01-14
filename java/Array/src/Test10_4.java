import java.util.Scanner;

public class Test10_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Math.random(); 이라는 메소드가 있다. 이 메소드는 0 ~ 1까지 사이의 실수 중 랜덤한 수를 전달해준다. 예를 들어 double d = Math.random();을 하면 0.0 <= d < 1 중 임의의 실수 값이 d에 할당된다. 이를 활용하여 정수형 변수 I에 50 <= I < 100 의 임의의 정수를 저장해보라.(배열문제아님)
    // Math.random() : 0.0~0.99999 까지의 랜덤한 샐수를 반환
    double d = Math.random();
    System.out.println(d);

    // Math.random()을 이용하여 1~10까지의 랜덤한 정수
    int a = (int)(Math.random()*10+1);
    System.out.println(a);

    // 50~100까지
    int i = (int)(Math.random()*50+50);
      System.out.println(i);

  }
}

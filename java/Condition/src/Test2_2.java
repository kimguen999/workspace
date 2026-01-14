import java.util.Scanner;

public class Test2_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("니가 사각형 안에 있다고 생각하는 두 점 x y 값을 입력해봐라 ");
    int n1, n2, n3;
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    String square;

    if (n1>=50&&n1<=100&&n2>=50&&n2<=100){
      n3 = 1;

    } else {
      n3 = 0;
    }
    if (n3==1) {
      square = "있네. 정답이다.";
    } else {
      square = "없다. 다시해라.";
    }
    System.out.println("니가 적은 두 점은 사각형 안에 "+square );

  }
}

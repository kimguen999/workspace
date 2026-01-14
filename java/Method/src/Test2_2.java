import java.util.Scanner;

public class Test2_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int gop = printA(a,b);
    System.out.println(gop);
  }

  public static int printA(int a, int b){

    return a*b;
  }

}

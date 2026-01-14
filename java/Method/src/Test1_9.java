import java.util.Scanner;

public class Test1_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    printSum(a,b);

  }
  public static void printSum(int a, int b){
    System.out.println(a+b);
  }
}

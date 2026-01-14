import java.util.Scanner;

public class Test7_13_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i =1;
    int sum = 0;
    while (true){
      sum = sum+i;
      if(sum>301){
        break;
      }
      i++;


    }
    System.out.println(sum);
    System.out.println(i);
  }
}

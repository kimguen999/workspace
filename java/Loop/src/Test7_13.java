
//1부터 누적해서 합을 구하다 300이 최초로 넘었을 때 for문을 멈추고 그때까지의 합과 마지막으로 더해진 값을 각각 출력하여라.

import java.util.Scanner;

public class Test7_13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;
    int i = 0;
    while (sum<=300){
      sum=sum+i;
      i++;
    }
    System.out.println("1부터 누적해서 300 넘었을때 값 : "+sum);
    System.out.println("그때 마지막으로 더해진 값 : "+(i-1));

  }
}

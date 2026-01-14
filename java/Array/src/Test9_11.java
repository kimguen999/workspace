import java.util.Scanner;

public class Test9_11 {
  public static void main(String[] args) {
    //1, 2, 3, 4, 5, 6 ,7 ,8 로 초기화된 배열을 만들고, 배열의 요소 중 짝수의 개수를 구하는 프로그램을 만들어라.
    Scanner sc = new Scanner(System.in);
    System.out.print("몇짜리 배열을 만들까? : ");
    int a = sc.nextInt();
    int cnt = 0;
    int[] arr1 = new int[a];
    int i = 0;
    for (i = 0; i<arr1.length; i++){
      arr1[i]=i-1;
      if (arr1[i]%2==0){
        cnt++;
      }
    }
    System.out.println(i+"로 초기화된 배열의 짝수 개수는 "+cnt+"개이다.");


  }
}

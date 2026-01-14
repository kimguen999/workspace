import java.util.Scanner;

public class Test10_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //scanner로 정수 하나를 입력받아, 입력받은 정수만큼의 길이를 갖는 배열을 생성하고 배열에 각 요소에 1 ~ 입력 받은 정수로 값을 저장한다. 예를 들어 5를 입력했으면 길이가 5인 배열을 만들고 각 요소에 1,2,3,4,5가 들어가야 한다. 그 후 배열에 들어간 수의 평균을 출력해보자.
    int a;
    System.out.print("만들고자 하는 배열 길이를 입력해라 : ");
    a=sc.nextInt();

    int[] arr1 = new int[a];
    int sum = 0;
    double avg = 0;

    for (int i = 0; i<arr1.length; i++){
      arr1[i] = i+1;
    }
    for (int i = 0; i<arr1.length; i++){
      sum = sum+arr1[i];
      avg = (double) sum/arr1[i];

    }
    System.out.println("배열에 들어간 수의 합은 "+sum+", 평균은 "+avg+"이다.");



  }
}

import java.util.Arrays;
import java.util.Scanner;

public class Test9_12_1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    //간단한 성적처리 시스템을 만들어보자. 국어, 영어, 수학점수를 입력받아 각
    //과목에 대한 점수 및 총점, 평균을 출력하는 프로그램을 만들어보자. 반드시 배열을 사용하도록 한다.

    int[] scores = new int[4];
    // 배열 0:국어 1:영어 2:수학 3:총점
    String[] name = {"국어","영어","수학"};
    double avg;
    for (int i = 0; i<scores.length-1; i++){
      while (true){
        System.out.print(name[i]+" 점수를 입력하시오 : ");
        scores[i]=sc.nextInt();
        if (scores[i]>=0 && scores[i]<=100){
          break;
        }
      }
    }
    for (int i = 0; i<scores.length-1; i++){
      scores[scores.length-1] = scores[scores.length-1]+scores[i];
    }
    avg = scores[scores.length-1]/(double)scores.length-1;

    for (int i = 0; i<scores.length-1; i++){
      System.out.println(name[i]+"점수 - "+scores[i]+"점");
    }
    System.out.println("총점 : "+scores[scores.length-1]);
    System.out.println("평균 : "+avg);

  }
}

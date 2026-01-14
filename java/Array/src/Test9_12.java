import java.util.Scanner;

public class Test9_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //간단한 성적처리 시스템을 만들어보자. 국어, 영어, 수학점수를 입력받아 각
    //과목에 대한 점수 및 총점, 평균을 출력하는 프로그램을 만들어보자. 반드시 배열을 사용하도록 한다.

    int[] score = new int[3];
    System.out.print("국어 점수를 입력하시오 : ");
    score[0]=sc.nextInt();
    System.out.print("수학 점수를 입력하시오 : ");
    score[1]=sc.nextInt();
    System.out.print("영어 점수를 입력하시오 : ");
    score[2]=sc.nextInt();


    System.out.println("총점 : "+(score[0]+score[1]+score[2]));
    System.out.println("평균 : "+(score[0]+score[1]+score[2])/3.0);



  }
}

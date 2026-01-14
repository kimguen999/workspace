import java.util.Scanner;

public class 성적 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("국어점수를 입력하세요 : ");
    int korScore = sc.nextInt();
    System.out.print("영어점수를 입력하세요 : ");
    int engScore = sc.nextInt();
    System.out.print("수학점수를 입력하세요 : ");
    int mathScore = sc.nextInt();

    System.out.println("국어점수 : "+korScore+"점");
    System.out.println("영어점수 : "+engScore+"점");
    System.out.println("수학점수 : "+mathScore+"점");
    System.out.println("총점 : "+(korScore+engScore+mathScore)+"점");
    System.out.println("평균 : "+(korScore+engScore+mathScore)/3.0+"점");

  }
}

import java.util.Scanner;

public class Infinity_loop {
  public static void main(String[] args) {

    // 무한루프
    // 반복을 끝내지 않고 진행하는 문법
    // 반복 횟수를 모를 때 사용

    // while, for 둘 다 무한루프 사용 가능
    // 대부분은 while문으로 무한루프를 완성

    //    // while문 무한루프
//    while (true) {
//
//    }

//    // for문 무한루프
//    for(;;){
//
//    }


    Scanner sc = new Scanner(System.in);

    while (true){
      System.out.print("점수입력(0~100) : ");
      int score = sc.nextInt();
      //입력받은 점수가 0~100이라면 반복을 벗어난다
      if (score>=0 && score<=100) {
        // switch 문에서의 break랑 다름.
        // 반복문 안에서의 break는 가장 가까운 반복문(for,while)을 벗어나는 명령
        break;
      }
    }





  }
}

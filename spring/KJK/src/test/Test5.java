package test;

// 요구사항
// 1) 먼저 크기가 3인 정수형 배열을 생성하고 배열의 각 요소에 1 ~ 9사이의 랜덤한 정수를 저장한다. 중복 불허.
// 2) 3스트라이크가 될 때까지 프로그램을 지속되어야 하며 실행 결과 3스트라이크를 맞춘 도전 횟수를 출력
// 3) Scanner를 통해 입력한 세 수와 요구사항 1)에서 생성한 랜덤한 세 수를 비교하여 스트라이크와 볼을 결정한다.
// 4) 키보드로 입력한 수가 1)에서 만든 배열의 수와 일치하며 위치도 같다면 스트라이크, 수는 일치하지만 위치가 다르면 볼이다.

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean a = true;
    int[] baseball = new int[3];
//    while (a){
//      for (int i = 0; i< baseball.length; i++){
//        baseball[i] = (int)(Math.random()*9+1);
//        if (baseball[0]!=baseball[1] && baseball[0]!=baseball[2] && baseball[1]!=baseball[2]){
//          a=false;
//          break;
//        }
//      }
//    }
    // 숫자 랜덤 중복 방지
    for (int i = 0; i< baseball.length; i++){
      baseball[i] = (int)(Math.random()*9+1);
      // 방금 넣은 정수가 중복인지 확인
      for (int j = 0; j<i; j++){
        if (baseball[j]==baseball[i]){
          i--;
          break;
        }
      }
    }
    System.out.println(Arrays.toString(baseball));

    // 정답을 맞출때까지 정답지 작성
    int tryCnt = 0; // 도전 횟수
    int[] answer = new int[3];

    while (true){
      int strike = 0;
      int ball = 0;
      System.out.print(++tryCnt+" >> ");
      answer[0] = sc.nextInt();
      answer[1] = sc.nextInt();
      answer[2] = sc.nextInt();

      for (int i = 0; i<baseball.length; i++){ // baseball 배열 수만큼 반복
        for (int j = 0; j<answer.length; j++){ // answer 배열 수만큼 반복
          if (baseball[i]==answer[j]){ // 배열안에 같은수 있으면
            if (i==j){  // 그중에서 위치까지 같으면 strike
              strike++;
            } else {   // 위치만 다르면 ball
              ball++;
            }
          }
        }
      }
      System.out.println(strike+"스트라이크, "+ball+"볼");
      if (strike==3){
        System.out.println(tryCnt+"회 만에 정답을 맞췄습니다.");
        break; // while문 벗어남
      }
    }


















  }
}

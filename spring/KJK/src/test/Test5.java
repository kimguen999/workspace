package test;

// 요구사항
// 1) 먼저 크기가 3인 정수형 배열을 생성하고 배열의 각 요소에 1 ~ 9사이의 랜덤한 정수를 저장한다. 중복 불허.
// 2) 3스트라이크가 될 때까지 프로그램을 지속되어야 하며 실행 결과 3스트라이크를 맞춘 도전 횟수를 출력
// 3) Scanner를 통해 입력한 세 수와 요구사항 1)에서 생성한 랜덤한 세 수를 비교하여 스트라이크와 볼을 결정한다.
// 4) 키보드로 입력한 수가 1)에서 만든 배열의 수와 일치하며 위치도 같다면 스트라이크, 수는 일치하지만 위치가 다르면 볼이다.

import java.util.Arrays;

public class Test5 {
  public static void main(String[] args) {

    boolean a = true;
    int[] baseball = new int[3];
    while (a){
      for (int i = 0; i< baseball.length; i++){
        baseball[i] = (int)(Math.random()*9+1);
        if (baseball[0]!=baseball[1] && baseball[0]!=baseball[2] && baseball[1]!=baseball[2]){
          a=false;
          break;
        }
      }
    }
    System.out.println(Arrays.toString(baseball));









  }
}

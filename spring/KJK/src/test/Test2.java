package test;

// 간단한 로또 번호 생성 프로그램을 만들어보자. 이를 위해 정수 6개를 저장할 수 있는 배열을 만들어, 배열 요소에 1~46 사이의 난수를 저장한다. 단, 중복 값은 허용하며 46은 포함하지 않는다. 배열에 난수를 저장한 후 배열의 모든 요소의 값을 출력하세요.
// (클래스명 : Test2.java)

import java.util.Arrays;

public class Test2 {
  public static void main(String[] args) {

  int[] lotto = new int[6];

  for (int i = 0; i< lotto.length; i++){
    lotto[i] = (int)(Math.random()*45+1);

  }
  System.out.println("로또 번호 생성 프로그램으로 만들어진 번호 6개는 다음과 같습니다.");
  System.out.println(Arrays.toString(lotto));




  }
}

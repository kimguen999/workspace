package test1;


//리스트에 1~100까지의 랜덤한 정수를 10개 넣어보자. 그 후 저장된 데이터 중 짝수의 개수와 모든 짝수를 출력하는 프로그램을 만드세요.
//(Math.random()이라는 메소드는 0 <= x < 1의 실수를 리턴)

import java.util.ArrayList;
import java.util.List;

public class Test4 {
  public static void main(String[] args) {

    List<Integer> listI = new ArrayList<>();
    int cnt = 0;
    for (int i = 0; i<10; i++){
      listI.add((int)(Math.random()*100+1));
      if (listI.get(i)%2==0){
        System.out.println(listI.get(i));
        cnt++;
      }
    }
    System.out.println("랜덤 정수 10개 중 짝수는 "+cnt+"개이다");



  }
}

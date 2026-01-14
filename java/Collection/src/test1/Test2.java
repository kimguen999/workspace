package test1;

//정수를 저장할 수 있는 리스트를 만들고 5개의 정수를 scanner를 통해 입력받아 리스트에 저장한다. 리스트에 저장된 모든 데이터의 합을 출력하여라.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> listI = new ArrayList<>();
    System.out.print("첫번째 수 : ");
    listI.add(sc.nextInt());
    System.out.print("두번째 수 : ");
    listI.add(sc.nextInt());
    System.out.print("세번째 수 : ");
    listI.add(sc.nextInt());
    System.out.print("네번째 수 : ");
    listI.add(sc.nextInt());
    System.out.print("다섯번째 수 : ");
    listI.add(sc.nextInt());
    int sum = 0;
    for (int i = 0; i<listI.size(); i++){
      sum = sum + listI.get(i);
    }
    System.out.println(sum);





  }
}

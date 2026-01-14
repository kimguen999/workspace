package list_study;

import java.util.ArrayList;
import java.util.List;

public class List1 {
  public static void main(String[] args) {

    // 리스트 : 배열과 같음, 같은 자료형만 저장 가능

    // <>사이에 int 못들어옴. 대신 Integer 넣으면됨
    // <>사이에 double 못들어옴. 대신 Double 넣으면됨
    // <>사이에 boolean 못들어옴. 대신 Boolean 넣으면됨
    // float -> Float .....
    // -> <>사이에 기본자료형은 못들어온다

    // 정수를 여러개 저장할 수 있는 리스트를 생성
    List<Integer> list1 = new ArrayList<>();

    // 리스트에 데이터를 추가
    list1.add(1);
    list1.add(5);
    list1.add(10);

    // 리턴가능
    int a = list1.get(2);  // 10

    // 데이터 읽기
    list1.get(0);  // 1
    list1.get(2);  // 10
    System.out.println(list1.get(2));  // 10

    // 데이터 삭제
    list1.remove(1);  // 1번째 요소 5 삭제
    System.out.println(list1.get(1));  // 10
    // 삭제하면 뒤 요소들이 한칸씩 땡겨진다

    // 리스트 크기(저장된 요소 수)
    list1.size();
    System.out.println(list1.size());

    // 실수를 여러개 저장할 수 있는 리스트
    List<Double> list2 = new ArrayList<>();
    list2.add(3.4);
    list2.add(10.3);

    double b = list2.get(0);  // 3.4

    // 문자열을 여러개 저장할 수 있는 리스트
    List<String> list3 = new ArrayList<>();
    list3.add("asdf");
    list3.add("bb");
    list3.get(0);  // asdf
    String c = list3.get(1);  // bb







  }
}

package list_study;

import java.util.ArrayList;
import java.util.List;

public class List3 {
  public static void main(String[] args) {

  // Man 자료형을 다수 저장할 수 있는 리스트 생성
    List<Man> listm = new ArrayList<>();

  // 리스트에 Man 객체 3개 저장
    Man m1 = new Man("kim", 20);
    Man m2 = new Man("Lee", 25);
    Man m3 = new Man("Park", 38);

    listm.add(m1);
    listm.add(m2);
    listm.add(m3);

    // 1. 나이가 30 이상인 사람 이름 출력
    for (int i = 0; i<listm.size(); i++){
      if (listm.get(i).getAge() > 30){
        System.out.println(listm.get(i).getName());
      }
    }



    for (Man e : listm){
      if (e.getAge() > 30){
        System.out.println(e.getName());
      }
    }



  }
}

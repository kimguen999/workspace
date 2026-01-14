package test1;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
  public static void main(String[] args) {

    // 멤버 3명 정보 입력
    List<Member> listM = new ArrayList<>();

    Member m1 = new Member("asdf","asdf","aaa",20);
    Member m2 = new Member("java","qwer","bbb",30);
//    Member m3 = new Member("erty","erty","ccc",40);

    //생성자 없을때
//    Member listM = new Member();
//    m1.setId("shdag");
//    m1.setPw("e34h");
//    m1.setName("rrgegd");
//    m1.setAge(41);

    listM.add(m1);
    listM.add(m2);
    listM.add(new Member("erty","erty","ccc",40));

//    System.out.println(listM.toString());

    // 멤버 3명 정보 출력
    for (Member m : listM){
      System.out.println(m);
    }

    // 멤버 3명 나이 합
    int agesum = 0;
    for (int i = 0; i< listM.size(); i++){
      agesum = agesum + listM.get(i).getAge();
    }
    System.out.println("멤버 3명 나이 합은 "+agesum+"이다");

    // 멤버 3명 중 id가 java 인 사람 지우기
    for (int i = 0; i< listM.size(); i++){
      if (listM.get(i).getId().equals("java")){
        listM.remove(i);
      }
    }

    // id가 java 인 사람 지우고 난 후 멤버 출력
    for (Member m : listM){
      System.out.println(m);
    }



  }
}

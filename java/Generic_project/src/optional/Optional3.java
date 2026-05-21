package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optional3 {
  public static void main(String[] args) {

    List<Member> memberList = new ArrayList<>();
    memberList.add(new Member("kim", 20));
    memberList.add(new Member("lee", 30));
    memberList.add(new Member("part", 40));
    memberList.add(new Member("choi", 50));
    memberList.add(new Member("shin", 60));
    memberList.add(new Member("jung", 70));

    // list에서 나이가 35세 이상인 회원의 나이만 추출
    Optional<List<Member>> op = Optional.of(memberList);
//    op.filter((e)->{})


  }
}

class Member{
  private String name;
  private int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
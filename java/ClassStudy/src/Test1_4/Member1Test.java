package Test1_4;

public class Member1Test {
  public static void main(String[] args) {

    Member1 m1 = new Member1();
    m1.setMember1("자바", "java", "123");
    m1.displayInfo();
    System.out.println(m1.toString());
    // 객체명만 출력하면 자동으로 toString() 메서드가 호출됨
    System.out.println(m1);


  }


}

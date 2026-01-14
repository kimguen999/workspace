public class ManTest {
  public static void main(String[] args) {

    Man m = new Man();

    m.setManInfo("Kim", 30, "울산");
    System.out.println(m.getName());
    System.out.println(m.name);
    m.setName("Park");
    System.out.println(m.getName());
    m.printInfo();

    System.out.println("-------------------------");

    Man m1 = new Man();
    // 객체의 값 변경
    m1.name = "Kim";
    m1.age = 30;
    m1.add = "부산";
    // 객체의 값 출력
    System.out.println(m1.name);
    System.out.println(m1.age);
    System.out.println(m1.add);

    System.out.println("=========================");

    Man m2 = new Man();
    // 객체의 값 변경
    m2.setName("Lee");
    m2.setAge(19);
    m2.setAdd("경주");
    // 객체의 값 출력
    System.out.println(m2.getName());
    System.out.println(m2.getAge());
    System.out.println(m2.getAdd());

    System.out.println("+++++++++++++++++++++++");

    Man m3 = new Man();
    m3.setManInfo("Shin", 24, "서울");
    m3.printInfo();

    // bbb만 호출해도 aaa가 bbb 안에 있기때문에
    // 출력은 b a 둘다 된다.
    m.bbb();

  }
}

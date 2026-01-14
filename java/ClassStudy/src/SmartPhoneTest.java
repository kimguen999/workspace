public class SmartPhoneTest {
  public static void main(String[] args) {
    SmartPhone p1 = new SmartPhone();

    // p1 객체의 데이터를 수정
    p1.brand = "KJK";
    p1.modelName = "JK26";
    p1.color = "WhiteSilver";
    p1.price = 10000000;
    p1.phoneNumber = "010-9876-5432";

    // p1 객체의 정보 출력
    System.out.println(p1.brand);
    System.out.println(p1.modelName);
    System.out.println(p1.color);
    System.out.println(p1.price);
    System.out.println(p1.phoneNumber);

    System.out.println();
    System.out.println("-----------------------------");
    System.out.println();

    SmartPhone p2 = new SmartPhone();
    p2.printAllData();
    p2.setBrand("apple");
    p2.setModelName("I33");
    p2.setColor("SilverBlack");
    p2.setPrice(50000);
    p2.setPhoneNumber("010-1234-5678");
    System.out.println("--------------------");
    p2.printAllData();
  }
}

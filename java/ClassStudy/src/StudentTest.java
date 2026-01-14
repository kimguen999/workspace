import javax.lang.model.element.Name;

public class StudentTest {
  public static void main(String[] args) {

    Student s1 = new Student();
    s1.setName("John Constantine");
    s1.setAge(38);
    s1.setAdd("NewYork.US");
    s1.setNumber(356761);
    s1.setContact("010.5356.8212");
    System.out.println("이름 : "+s1.getName());
    System.out.println("나이 : "+s1.getAge());
    System.out.println("주소 : "+s1.getAdd());
    System.out.println("학번 : "+s1.getNumber());
    System.out.println("연락처 : "+s1.getContact());

    System.out.println("-------------------------------");

    Student s2 = new Student();
    s2.setInfo("John Wick", 47, "NewYork.US", 23623, "010.9325.2658");
    s2.printInfo();




  }
}

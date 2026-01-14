public class MemberTest {
  public static void main(String[] args) {

    Member m1 = new Member();

    m1.printAllData();
    System.out.println("----------------");
    m1.setMemberInfo("Daenerys Targaryen", "MamaDragon", "***********", 19);
    m1.printAllData();
    System.out.println("---------------------");
    m1.setMemberInfo("John Wick", "babayaga", "***********", 42);
    m1.printAllData();

  }
}

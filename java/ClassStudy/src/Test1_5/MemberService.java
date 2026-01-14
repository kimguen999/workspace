package Test1_5;

public class MemberService {

  private String id;
  private String password;

  public boolean login(String id, String password) {
    this.id = id;
    this.password = password;
//    if (this.id.equals("hong") && this.password.equals("12345")){
//      return true;
//    } else
//    return false;

     return this.id.equals("hong") && this.password.equals("12345");
  }

  public void logout(String id) {
    this.id = id;
    System.out.println("로그아웃 되었습니다.");

  }
}

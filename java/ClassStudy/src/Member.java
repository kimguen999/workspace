//회원정보로는 이름, 아이디, 비밀번호, 나이를 관리할 것이다. 이 데이터를 가지는 클래스를 만들어
// 10. 회원의 모든 정보를 변경하는 기능을 가진 메소드를 만들어보세요.
// 11. 등록한 회원의 정보를 확인하기 위해 모든 정보를 출력하는 메소드를 만들어 보세요.
// 12. 9~11번의 내용을 실행할 클래스를 만들고 작성한 메서드를 테스트해 보세요.

public class Member {

  String name;
  String id;
  String pw;
  int age;

  public void setMemberInfo(String name1, String id1, String pw1, int age1){
    name = name1;
    id = id1;
    pw = pw1;
    age = age1;
  }


  public void printAllData(){
    System.out.println("이름 : "+name);
    System.out.println("아이디 : "+id);
    System.out.println("비밀번호 : "+pw);
    System.out.println("나이 : "+age);
  }




}

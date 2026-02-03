package test;

public class Member {

  private String id;
  private String pw;
  private String name;
  private int age;

  public Member() {
  }

  public void setMember(String id, String pw, String name, int age) {
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.age = age;
  }


  public void setId(String id) {
    this.id = id;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }


  public String getId() {
    return id;
  }

  public String getPw() {
    return pw;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void showInfo() {
    System.out.println("아이디 : " + id);
    System.out.println("비밀번호 : " + pw);
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
  }
}

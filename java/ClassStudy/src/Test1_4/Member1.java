package Test1_4;

public class Member1 {

  private String name;
  private String id;
  private String pw;

  // 기본생성자
  public Member1(){

  }
  // 모든 데이터를 변경할 수 있는 생성자
  public void setMember1(String name, String id, String pw){
    this.name = name;
    this.id = id;
    this.pw = pw;
  }

  // setter
  public void setName(String name){
    this.name = name;
  }
  public void setId(String id){
    this.id = id;
  }
  public void setPw(String pw){
    this.pw = pw;
  }

  // getter
  public String getName(){
    return name;
  }
  public String getId(){
    return id;
  }
  public String getPw(){
    return pw;
  }

  public void displayInfo(){
    System.out.println("이름 : "+name);
    System.out.println("아이디 : "+id);
    System.out.println("비밀번호 : "+pw);
  }

//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public String getId() {
//    return id;
//  }
//
//  public void setId(String id) {
//    this.id = id;
//  }
//
//  public String getPw() {
//    return pw;
//  }
//
//  public void setPw(String pw) {
//    this.pw = pw;
//  }

  @Override
  public String toString() {
    return "Member1{" +
        "name='" + name + '\'' +
        ", id='" + id + '\'' +
        ", pw='" + pw + '\'' +
        '}';
  }
}

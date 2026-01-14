//아래의 문제를 풀면서 사람을 표현하는 Man 클래스를 만들어보자.
// 1) Man 클래스는 이름, 나이, 주소를 멤버로 가지고 있다. 모든 멤버변수를 선언하세요.
// 2) 맴버변수의 모든 값을 초기화 할 수 있는 메소드를 만드세요,
// 3) 맴버변수 각각의 값을 변경하는 메소드를 3개를 만드세요.
// 4) 각 맴버변수의 값을 리턴하는 메소드를 3개 만드세요.
// 5) 맴버변수의 모든 정보를 출력하는 메소드를 만드세요.
// 6) Man 클래스로 객체를 만들어 위에서 만든 메소드가 잘 작동되는지 테스트하세요.

import java.time.Year;

public class Man {

  String name;
  int age;
  String add;

  // 값 변경 메소드 == 메소드 초기화
  // this.name : 클래스에 정의된 name
  // this 키워드는 멤버변수 및 메서드에 사용 가능
  public void setManInfo(String name, int age, String add){
    this.name = name;
    this.age = age;
    this.add = add;
  }






//  // setter : 클래스가 가진 각각의 변수 값을 변경하는 메서드
//  //          메서드 명은 반드시 'set멤버변수명'으로 지정해줘야함
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void setAdd(String add){
    this.add = add;
  }

//
//  // getter : 클래스의 각각의 멤버변수 값을 리턴하는 메서드
//  //          메서드 명은 반드시 'get멤버변수명'으로 지정해줘야함
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public String getAdd() {
      return add;
  }


  public void printInfo(){
    System.out.println("이름 : "+this.name);
    System.out.println("나이 : "+this.age);
    System.out.println("주소 : "+this.add);
  }

  public void aaa(){
    System.out.println("a");
  }
  public void bbb(){
    System.out.println("b");
    aaa();
  }





}

package study1;


public class Student extends Person {
  int stuNum;  //학번

  public Student(){
    // super();
    System.out.println("기본생성자 호출");
  }

  // 상속관계에 있는 클래서의 생성자의 첫줄에는 부모클래스의 생성자를 호출하는 super()가 숨겨져있음
  // 단, this() 명령어로 해당클래스의 생성자를 호출하는 문법이 있다면 super() 명령어는 실행되지 않는다.
  public Student(int stunum){
    this();
    this.stuNum = stunum;
    System.out.println("정수 매개변수 생성자 호출");
  }


  public void aaa(){
    System.out.println(name);
    System.out.println(super.name);
    System.out.println(this.name);
    tellname();
    super.tellname();
    this.tellname();
  }

}

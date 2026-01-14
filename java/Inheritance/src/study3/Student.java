package study3;

import study2.Cake;
import study2.Dog;
import study2.UnivFriend;

// 클래스 선언 시 어떠한 클래스도 상속받지 않으면 자동으로 Object 클래스를 상속한다. (Object 부모클래스가 생략된거)
// 결론 : 자바의 모든 클래스는 Object 클래스를 상속한다.
// 파생 결론 : Object 클래스로 모든 클래스의 객체를 받을 수 있다.
public class Student extends Object{
   String stuNum;
  private String name;
  private int score;


  // 매개변수에 Object가 들어오면 무엇이든 다 넣을수있음.
  public void aaa(Object aa){

  }


  // Student 클래스의 객체가 같다라는 의미를 재정의
  @Override
  public boolean equals(Object obj) { //Object obj = new Student();
    Student a = (Student)obj;
    return stuNum==a.stuNum;
    // stuNum이 같으면 (주소공유x) true 나오도록 하는 코딩
  }

  //StudentTest 클래스 51~53줄
//  @Override
//  public String toString() {
//    return "학번 : "+stuNum+", 이름 : "+name+", 점수"+score;
//  }


  @Override
  public String toString() {
    return "Student{" +
        "stuNum='" + stuNum + '\'' +
        ", name='" + name + '\'' +
        ", score=" + score +
        '}';
  }




}



package study3;


import study2.Cake;
import study2.Dog;
import study2.UnivFriend;

public class StudentTest extends Student{
  public static void main(String[] args) {

    Student s = new Student();
    Object a = new Student();
    Object[] b = new Dog[5];
    Object c = new Cake();
    Object d = new UnivFriend("aaa","bbb","ccc");

    // Object 클래스에 선언된 equals() 메서드
    // public boolean equals(Object a)
    // 현재 객체와 매개변수로 전달된 데이터가 같으면 true를 리턴하는 메서드
    // 같다라는 의미는 개발자가 정하는거다.
    // 자바에서 의미하는 기본적인 같다의 의미 : 같은 주소값을 참조하고 있다
    // 값이 동일하더라도 같은 주소를 공유하고 있지 않는 이상 boolean은 false다.
    // equals 메서드를 원래 기능대로 쓰지 말고, 개발자가 입맛대로 같다는 의미를 재정의해서 사용해라는 뜻

    String o = "aa";
    String p = "bb";
    System.out.println(o.equals(p)); //false
    o=p;
    System.out.println(o.equals(p)); //true

    // 숫자 비교의 경우 같다 안해도 true 나온다
    int u = 5;
    int i = 5;
    System.out.println(u==i); //true
    u=i;
    System.out.println(u==i); //true


    Student s1 = new Student();
    s1.stuNum = "1";
    Student s2 = new Student();
    s2.stuNum = "1";

    System.out.println(s1.equals(s2));

    // Object 클래스의 toString() 메서드
    // public String toString()
    // -> 기본정의 : 객체의 정보를 문자열로 리턴하는 메서드
    // 문자열로 표현할 정보를 개발자가 재정의해서 사용하세요
    // -> 객체가 가진 멤버변수의 정보를 문자열로 리턴
    System.out.println(s1.toString());
    // 객체명만 출력하면 자동으로 toString() 메서드가 호출
    System.out.println(s1);

    //배열도 객체다
    String[] arr = new String[3];
    System.out.println(arr); //몇번째 배열을 안적으면 객체가 저장되어있는 주소를 보여줌
    System.out.println(arr.toString());






  }


}

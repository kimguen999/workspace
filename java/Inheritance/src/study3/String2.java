package study3;

public class String2 {
  public static void main(String[] args) {

    // String은 immutable 변수다
    // immutable : 한번 값이 저장되면 값 변경 불가능

    String a = "java";
    String b = a;

    a="python";

    System.out.println(a); //
    System.out.println(b); //

    // String은 참조자료형이니 a=python, b=python 나와야하지만 변태같은놈이라
    // a=java, b=python가 출력된다.
    // String은 특이한놈이라 참조자료형이지만 기본자료형처럼 봐라





  }
}

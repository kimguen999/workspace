public class Datatype2 {
  public static void main(String[] args) {

    // 변수선언시 주의!!
    // 정수를 사용하면 자바는 기본적을 int 타입으로 해석
    // 실수를 사용하면 자바는 기본적으로 double 타입으로 해석

    float num1 = 10.5f;
    float num2 = 10.5F;

    int num3 = 1000000000;
    long num4 = 1000000000;
    long num5 = 10000000000L;

    // 정수와 실수의 연산 결과
    // 정수끼리의 연산결과는 정수
    // 실수가 연산에 포함되어있으면 결과는 실수

    System.out.println(10/3);
    System.out.println(10.0/3);
    System.out.println(10/3.0);
    System.out.println(2+3/2-1.0);


  }
}

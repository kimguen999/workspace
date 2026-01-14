public class Datatype3 {
  public static void main(String[] args) {

    // 형변환 (정수와 실수의 형변환)
    // 자바는 자료형이 다른 데이터를 저장할 수 없다는 것이 원칙

    int num1 = 10;
    // 1. num1을 실수로 변환 (내부적으로) -> 10.0 자동형변환, promotion
    // 2. 실수로 변경된 데이터를 num2에 저장
    double num2 = num1;
    System.out.println(num2);

    double num3 = 5.9;
    int num4 = (int) num3;
    // 개발자가 강제적(직접)으로 자료형 변경 가능 -> 강제형변환, casting
    // 강제형변환 : (바꾸고자 하는 자료형) 데이터
    System.out.println(num4);


  }
}

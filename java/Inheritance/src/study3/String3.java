package study3;

public class String3 {
  public static void main(String[] args) {

    // String 클래스에서 많이 사용하는 메서드들
    String s1 = "Simple";
    String s2 = "String";

    // concat : 문자열 나열, +와 같은 역할
    // "a" + "b" => 내부적으로 "a".concat("b")를 실행
    System.out.println(s1.concat(s2));

    // length : 문자열의 길이 (정수)
    System.out.println(s1.length());

    // String.valueOf(숫자) : 매개변수로 전달된 정수, 실수 모두를 문자열로 변환
    int s3 = 10;
    System.out.println(String.valueOf(s3));
    String.valueOf(10);
    String.valueOf(10.5);
    String.valueOf("10");

    // contains : 매개변수로 전달된 문자열의 포함 여부
    System.out.println(s1.contains("p"));

    // substring() : 일부 문자열 추출
    String s4 = "abcdefg";
    // 문자열의 두번째 요소부터 추출 (0번 부터 시작)
    System.out.println(s4.substring(2)); //cdefg
    // 문자열의 두번째 요소부터 다섯번째 전 까지
    System.out.println(s4.substring(2,5)); //cde
    // 문자열 중 cde 를 p로 교체
    System.out.println(s4.replace("cde","p"));

    String s5 = "010-1111-2222";
    String[] result = s5.split("-");
    System.out.println(result[1]);

    String s6 = "    a b c";
    System.out.println(s6.trim());
    System.out.println(s6);


  }
}

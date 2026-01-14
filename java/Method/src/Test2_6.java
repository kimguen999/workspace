public class Test2_6 {
  public static void main(String[] args) {
    String c = printA(50);
    System.out.println(c);

  }
  public static String printA(int a){

    // 문자열 -> 정수
    // Interger.parseInt("숫자"); -> 숫자
    int b = Integer.parseInt("60");

    // 정수 -> 문자열
    // String.valueOf(숫자); -> "숫자"
    String c = String.valueOf(80);
    return a + ""; // 야매 방법
  }
}

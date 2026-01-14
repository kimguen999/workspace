import java.sql.SQLOutput;

public class Datatype1 {
  public static void main(String[] args) {
    int num1 = 10;
    byte num2 = 100;
    short num3 = 100;
    long num4 = 100;

    double num6 = 10.5;
//    float num5 = 10.5;
    //boolean 값은 쌍따옴표 없이 넣는다.
    //boolean num7 = "false";
    boolean num7 = false;

    System.out.println(num7);

    //char 값은 쌍따옴표 X 홀따옴표 O
    //문자 : 홀따옴표 한글자
    //문자열 : 쌍따옴표 0개이상 글자
    char c = 'a';
    // 'a' : 문자
    // 'A' : 문자
    // "a": 문자열
    // "aaaa" : 문자열
    // 'aaa' : 문자도 아니고 문자열도 아님
    System.out.println(c);

    //문자는 캐릭터에 저장가능하고 숫자에도 저장할수 있다
    //문자는 저장될 때 숫자화되서 저장되기 때문, (유니코드)
    int num9 = 'd';
    System.out.println(num9);

    String name = "동길홍";
    System.out.println(name);

  }
}

import java.util.Scanner;

public class 문자열비교 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 문자열 비교에는 equals() 매소드를 사용
    String addr = "울산";
    // addr 데이터랑 서울이랑 같나? 물어보는거.
    System.out.println(addr.equals("서울"));
    System.out.println(addr.equals("울산"));
    // 앞에 문자열과 같은지
    System.out.println("서울".equals("울산"));
    System.out.println("울산".equals("울산"));

    String tel = "010-1111-2222";
    System.out.println(addr.equals(tel));

    //--------------------------------------------------
    String name = "홍길동";
    // name 변수에 저장된 문자열이 "홍길동"이라면....
    // 문자열 비교에는 '==' 사용하면 안됨.
    if (name.equals("홍길동")) {

    }

  }
}

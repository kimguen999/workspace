public class Method_1 {

  // 이름과 나이를 출력하는 메서드 정의
  public static void printNameAndAge(){
    System.out.println("이름 : 동길홍");
    System.out.println("나이 : 20살");
  }

  public static void main(String[] args) {
    System.out.println("시작");
    printNameAndAge();
    printNameAndAge();
    printHello();
    System.out.println("종료");
  }

  // "안녕" 문자열을 출력하는 기능을 가진 메서드를 정의
  public static void printHello(){
    System.out.println("안녕");
  }


}

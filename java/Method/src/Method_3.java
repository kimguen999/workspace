public class Method_3 {
  public static void main(String[] args) {

    System.out.println("시작");
    printAge(50);
    printAge(30);
    printAge(10);

    int age = 40;
    printAge(age);
    printAge(90);

    int num = 50;
    printAge(num);

    System.out.println("종료");

  }

  // 나이를 출력하는 메서드 정의
  public static void printAge(int age){
    System.out.println("나이는 "+age);
  }







}

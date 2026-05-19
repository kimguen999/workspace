package lambda;

public class PrinterTesr2 {
  public static void main(String[] args) {

    Printable prn = new Printable() {
      @Override
      public void print() {
        System.out.println(111);
      }
    };

    Printable prn2 =

      () -> {
        System.out.println(111);
      };


// 람다 :
// 인터페이스에 정의되어있는 추상메서드를 내가 최대한 간결하게 쓰고싶은게 목적

    // 람다식 ( 람다표편식 )
    // Printable 메서드가 하나만 있는 인터페이스여야함.
    // 람다가 적용되려면 추상메서드가 하나바께어 없는 인터페이스가 존재해야함
    // 자바측에서 람다 활용성을 높이기 위해 추상메서드가
    // 하나밖에 없는 인터페이스를 다수 만들어놨음
    // 이처럼 추상메서드가 하나밖에 없는 인터페이스를 "함수형 인터페이스"라 부른다.
    Printable prn1 = () -> {
      System.out.println(111);
    };


    prn.print();

  }
}

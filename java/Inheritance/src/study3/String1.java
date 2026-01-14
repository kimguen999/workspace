package study3;

public class String1 {
  public static void main(String[] args) {

    // String 클래스 자료형
    Student s = new Student(); //클래스를 사용하는 방법
    String str = "java";

    // String도 객체를 생성해서 사용할 수 있음
    String str2 = new String("java");

    // 문자열 객체를 생성하는 두 방법은 차이가 있음
    // 기본 자료형처럼 문자열 객체를 생성하면 같은 문자열은 하나의 데이터만 저장
    String a = "java";
    String b = "java";
    String c = new String("java");
    String d = new String("java");
    int e = 5;
    int f = 5;

    // '==' : 숫자 비교시 두 수가 같은지 비교
    //        숫자를 제외한 나머지 자료형에 대해서는 '주소가 같은지 비교'
    //        equals()와 같은 역할

    if (a==b){
      System.out.println("a와 b가 같습니다");
    }
    if (c==d){
      System.out.println("c와 d가 같습니다");
    }
    if (e==f){
      System.out.println("e와 f가 같습니다");
    }

    // 문자열이 같은지 비교하기 위해서는 equals() 메서드를 사용
    // String 클래스 안데 equals() 메서드가 정의되어 있기 때문에 점(.)찍고 사용 가능
    // -> String 클래스는 Object 클래스를 상속하고 있다.
    // 그리고 Object 클래스 안에 equals() 메서드가 정의되어있다.
    // 결론 : String 클래스의 equals() 메서드는, Object 클래스의 equals() 메서드를 오버라이딩 한것이다
    if (a.equals(b)){

    }



  }
}

package lambda;

public interface Printable {

  void print();

  // 클래스는 객체 만들때 생성자 호출
  // 인터페이스는 생성자 못만들기 때문에 클래스에 얹혀감
  // 인터페이스는 인증마크 같은것이다

  // 인터페이스 사용법
  // 인터페이스 -> 클래스 생성 -> 객체를 사용
  // 인터페이서 -> x(이너페이스) -> 객체
  // 인터페이스 ->사용(람다)

}




interface  Test1{
  void aaa(int a);
}

interface  Test2{
  void bbb(String a, int b);
}


interface  Test3{
  int ccc(int a);
}


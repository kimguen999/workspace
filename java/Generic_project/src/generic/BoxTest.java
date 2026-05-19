package generic;

public class BoxTest {
  public static void main(String[] args) {

    // Generic 이전 문법

    // 가능한것
    // 1. 박스에 오렌지, 사과 등 다른 자료형을 저장할수 있다.
    // 불편한점 :
    // 1) 박스는 오렌지, 사과만 저장할수 있는게 아니다.
    // 2) 데이터를 뺄때 형변환 코드를 넣어줘야함.

    Box b1 = new Box();
    b1.set(new Orange());
    Object orange = b1.get();
    // Object 에서 빼냈지만, Object는 모든게 다 들어가기 때문에
    // orange라는걸 확인시켜줌
    Orange orange1 = (Orange)orange;
    // 형변환을 안하면 .say를 붙일 수 없다.(데이터를 뺄수 없음)
    // 좋은 코드는 런타임메러보다 컴파일 에러가 나야한다.
    // 런티임에어 : 빨간줄 없음.    컴파일에러 : 빨간줄 있음.
    // (Apple)로 잘못 넣더라도 컴파일에러가 나서 알수는 있음.
    orange1.say();

    Box b2 = new Box();
    b2.set(new Apple());
    Object apple = b2.get();
    Apple apple1 = (Apple)apple;
    apple1.say();

  }
}

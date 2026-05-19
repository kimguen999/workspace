package generic;
// Generic 문법 사용
//  클래스를 만드는 시점에서 자료형을 안정하겠다.
// generic.GBox<T>에서 <T> : 타입 매개변수 (Type Parameter)
// 타입인자 : 타입 매개변수에 전달된 자료형

// 매개변수 : 공간 개념
// 인자 : 값

// 타입 매개변수 자리에 타입 인자가 전달됨

public class GBox<T> {
  private T obj;

  public void set(T obj){
    this.obj = obj;
  }
  public T get(){
    return obj;
  }

}


// Generic 문법을 직접 쓰는게 목표가 아님
// 만들어진거를 해석하는 것이 목표다.
// 직접 쓰는거는 5년 이상 경력을 가진 뒤다.
// 또한 해석이 가능해야 람다,스트림 알수있다.

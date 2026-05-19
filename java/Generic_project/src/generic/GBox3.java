package generic;
// 특정 메서드에만 Generic 적용

public class GBox3 {

  public void aaa(){

  }

  //
  // Generic 문법이 적용된 메서드 -> 잘 사용안함 -> 와일드카드 사용
  // 매개변수로 객체가 전달되면 그 객체를 담고있는 상자를 리턴
  public <T> GBox<T> makeBox(T t){
    GBox<T> box = new GBox<>();
    box.set(t);
    return box;
  }




  public <T> void aaa(GBox<T> t){

  }
  // 위 아래 동일한 역할을함.
  //  public <T> void aaa(generic.GBox<T> t){
  //  === public void bbb(generic.GBox<?> t){
  // 와일드카드 (선호함)
  public void bbb(GBox<?> t){
    // 무엇이든 담을수 있는 박스
  }

  // 와일드카드 + 상한제한 (목적 : 개발자 실수 방지) (데이터 읽는거에 집중)
  public void ccc(GBox<? extends Phone> t){
  //  public void ccc(generic.GBox<generic.Phone> t){
    // 폰을 담을수 있거나 상속하는 박스
  }

  // 와일드카드 + 하한제한 (목적 : 개발자 실수 방지) (데이터 쓰는거에 집중)
  public void ddd(GBox<? super Phone> t){
//  public void ddd(generic.GBox<generic.Phone or Object> t){
    // 폰을 담을수 있거나, 폰의 부모 클래스가 들어오거나
  }


  // 개발자 실수 방지 예시
  // 박스에 저장된 데이터를 읽고 싶은게 목적
  public void outBox(GBox<? extends Toy> box){
    box.get();

//    box.set(new generic.Toy());
    // 문법적으로는 오류 아님
    // 넣는 것을 막음
    // 하지만 상한제한을 걸었더니 내가 의도하지 않은 코드를 에러내버림
  }

  // 개발자 실수 방지 예시
  // 박스에 저장된 데이터를 넣고 싶은게 목적
  public void outBox1(GBox<? super Toy> box){
//    generic.Toy y = box.get();
//     Toy의 상위인 Plastic을 Toy에 담지 못하기 때문

    box.set(new Toy());
    // 문법적으로는 오류 아님
    // 읽는 것을 막음
    // 하지만 하한제한을 걸었더니 내가 의도하지 않은 코드를 에러내버림
  }

  // 결론 : Toy가 들어오는 GBox라고만 생각하자

}
























package optional;

import java.util.Optional;
import java.util.function.Consumer;

public class Optional1 {
  public static void main(String[] args) {

    String name = null;


    // Optional :
    //      null 체크 (if문 없이)

    // null 체크 기능이 있는 Optional 상자에 데이터를 담는 코드

//    Optional<String> op1 = Optional.of(name);
    // null 데이터 허용 안함 , 상자에 들어갈 데이터는 절대 null이 아닐경우

    Optional<String> op2 = Optional.ofNullable(name);
    // null 데이터 허용 ,

    // op1 상자에 현재 데이터가 있으면 (null이 아니면)
//    if (op1.isPresent()) {
//      System.out.println(op1.get());
//    }
    // op2 상자에 현재 데이터가 있으면 (null이 아니면)
    if (op2.isPresent()) {
      System.out.println(op2.get());
    }

    // 데이터가 null이 아닐 때만 실행 코드 작성하는 방법
    // if + isPresent
    // 매개변수 : Consumer<String> : void accept(T t);
    Consumer<String> c = str->System.out.println(str);
    op2.ifPresent(c);
    // =====================
    op2.ifPresent(str->System.out.println(str));


    Optional<String> op3 = Optional.of("hello World");
    // map과 for의 차이 :  map은 반복 + 리턴 가능
    // map() : 반복 + 리턴
    // Function<String, R> : R apply(String t);
    String a = op3.map((String s)->{return s.replace("","_");})
        .map((String s) -> s.toLowerCase()).get();
    // hello World 글자가 아닌 상자 채로 리턴됨. 하지만 get()을 사용하면 상자 안에 데이터(글자)를 리턴함.

  }
}

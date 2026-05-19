package lambda;

// 자바에서 만들어준 함수형 인터페이스의 대표들
// 1. Predicate<T> : boolean test(T t);
//      전달 인자를 근거로 참 또는 거짓 결과를 반환

// 2. Supplier<T> : T get();
//      메서드 결과 데이터를 반환

// 3. Consumer<T> : void accept(T t);
//      인자로 데이터를 받아가고 결과 데이터는 반환하지 않음

// 4. Function<T, R> : R apply(T t);
//      매개변수와 리턴데이터가 전부 있는 기능



//    // 매개변수로 문자열이 들어가는건 확실하지만
//    // 1개, 2개, 3 , 4....
//    public void aaa(String... a){
//
//    }

import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda2 {
  public static void main(String[] args) {

    // 문자열 데이터가 주어지면 해당 문자열의 길이를 리턴하는 기능
    Function<String, Integer> f = str->str.length();
    System.out.println(f.apply("asdf"));



    List<Integer> list = Arrays.asList(1,2,3,4,5);

    // 매개변수로 Consumer<? extends Integer> action
    // == Consumer<Integer> action
    // Consumer<T> : void accept(T t);
    Consumer<Integer> c = num->System.out.println(num);
    list.forEach(c);
    // 리스트의 정수를 차례로 출력
    list.forEach(num-> System.out.println(num));

    System.out.println();
    System.out.println();

    // 짝수만 삭제하는 기능
    list.removeIf(num -> num%2==0);

    // Predicate<T> : boolean test(T t);
    // 짝수의합
    Predicate<Integer> p1 = (num)->num%2==0;

    sum(list, p1);

    // 홀수의합
    Predicate<Integer> p2 = (num)->num%2==1;

    sum(list, p1);


  }
  // 짝수들의 합 X 아니고  내 입맛에 맞는 합을 리턴하는 메서드
  public static int sum(List<Integer> list, Predicate<Integer> p){
    int sum = 0;
    for(int e : list){
      if(p.test(e)){
        sum = sum+e;
      }
    }
    return sum;
  }










}

//    // 짝수의 합
//    // 배열만큼 반복을 돌려서 if로 짝수만 찾아낸다. %==0, 나온거를 다 더한다.
//    int sum1 = 0;
//    for (int e : list){
//      if(e%2==0){
//        sum1 = sum1 + e;
//      }
//    }
//    System.out.println(sum1);
//
//    // 홀수의 합
//    int sum2 = 0;
//    for (int e : list){
//      if(e%2==1){
//        sum2 = sum2 + e;
//      }
//    }
//    System.out.println(sum2);
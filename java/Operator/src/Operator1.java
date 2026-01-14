public class Operator1 {
  public static void main(String[] args) {

    // 산술 연산자 (+,-,*,/,%)
    // % : mod연산자, 나눗셈의 나머지를 구하는 연산자
    int result1 = 10%4;
    System.out.println(result1);
    int result2 = 239868997%880279;
    System.out.println(result2);

    // 비교 연산자
    // >,<,>=,<=,==,!=
    // 크다, 작다, 크거나같다, 작거나같다, 같다, 다르다
    System.out.println(10>3);
    System.out.println(3==3.0);

    boolean result3 = 10<3;
    System.out.println(result3);

    // 논리부정 연산자
    // ! : boolean 값을 반대로 해버림
    // ex) !true -> false
    // ex) !false -> true

    // 논리 연산자
    // &&, ||(버티컬바), &, |
    // 그리고(and연산) : &&
    // 또는(or연산) : ||
    // 비교연산자가 우선순위가 높다
    System.out.println(3>1 && 2>1);
    System.out.println(3<1 && 2>1);
    System.out.println(3<1 || 2>1);

    int num1 = 5;
    int num2 = 7;
    boolean result4 = num1>3 || num2!=7;
    System.out.println(result4);

    boolean result5 = num1 * 2 > 10 && !(num2 % 2==1);
    System.out.println(result5);
  }
}

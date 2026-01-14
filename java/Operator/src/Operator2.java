public class Operator2 {
  public static void main(String[] args) {

    // 증감 연산자

    int num1 = 5;
    num1++; //num1의 값을 1 증가
    System.out.println(num1);

    --num1; //num1의 값을 1 감소
    System.out.println(num1);

    int num2 = 5;
    int num3 = ++num2;
    System.out.println(num3);

    int num4 = (num3++);
    System.out.println(num4); //6
    System.out.println(num3); //7
    num4 = num3++-5;
    System.out.println(num3);
    System.out.println(num4);

    // 복합대입 연산자
    int a = 3;
    int b = 7;
    a += b; //a = a + b;
    a += 1; //a = a + 1;
    a /= 3; //a = a / 3;
    a *= b; // a = a * b;

    int score = 90;
    System.out.println(score);
    //score 값을 1증가 시키는 코드들
    ++score;
    System.out.println(score);
    score++;
    System.out.println(score);
    score = score + 1;
    System.out.println(score);
    score += 1;
    System.out.println(score);


  }
}

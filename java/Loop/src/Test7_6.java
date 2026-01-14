
//1 ~ 100까지 숫자 중 3의 배수인 수의 개수를 구하세요.

public class Test7_6 {
  public static void main(String[] args) {

    int a = 1;
    int count = 0;
    while (a<=100){
      if (a%3==0){
        count++;
      }
      a++;
    }
    System.out.println(count);


  }
}

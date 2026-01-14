
//1 ~ 100까지 숫자 중 3의 배수인 수의 개수를 구하세요.

public class Test7_6_1 {
  public static void main(String[] args) {

    int count = 0;
    for (int i = 1; i<101; i++){
      if (i%3==0){
        count++;
      }
    }
    System.out.println(count);
  }
}

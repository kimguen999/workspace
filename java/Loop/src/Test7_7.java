
//1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고, 5의 배수인 수의 개수도 출력해보세요.

public class Test7_7 {
  public static void main(String[] args) {

    int a = 1;
    int count = 0;
    while (a<101){
      if (a%5==0){
        System.out.print(a+" ");
        count++;
      }
      a++;
    }
    System.out.println();
    System.out.println("5의 배수는 "+count+"개 입니다.");

  }
}

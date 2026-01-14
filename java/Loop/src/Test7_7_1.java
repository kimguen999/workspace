
//1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고, 5의 배수인 수의 개수도 출력해보세요.

public class Test7_7_1 {
  public static void main(String[] args) {

    int count = 0;
    for (int i = 1; i<101; i++){
      if (i%5==0){
        System.out.print(i+" ");
      }
      count++;
    }
    System.out.println();
    System.out.println("5의 배수는 "+count+"개 입니다.");

  }
}

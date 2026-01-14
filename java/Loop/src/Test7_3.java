
//출력문을 한번만 사용하여 ‘2 4 6 8 10’을 출력해 보세요.

public class Test7_3 {
  public static void main(String[] args) {

    int a = 2;
    while (a<11){
      System.out.println(a);
      a=a+2;
    }

    System.out.println("--------------------------");

    // 다른방법

    int i = 2;
    while (i<11){
      if (i%2==0){
        System.out.println(i);
      }
      i++;
    }

  }
}

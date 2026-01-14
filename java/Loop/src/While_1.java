public class While_1 {
  public static void main(String[] args) {

    int num = 0;
    // num이 10보다 작은 동안에만 반복

    while (num<10) {
//      System.out.println(1);
      System.out.println(num);
      num++;
    }
    System.out.println("num은 "+num);

    System.out.println("-------------------------------------");

    for (int n = 0; n<10; n++){
      System.out.println("num은 "+n);
    }

  }
}

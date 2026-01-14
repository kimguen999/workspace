public class Test2_9 {
  public static void main(String[] args) {
    int b = printA(8);
    System.out.println(b);

  }
  public static int printA(int a){
    int sum = 0;
    for (int i = 1; i<a+1; i++) {
      if (i%2==1) {
        sum = sum + i;
      }
    }
    return sum;
  }

}

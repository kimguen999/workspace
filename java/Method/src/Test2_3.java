public class Test2_3 {
  public static void main(String[] args) {
    int a = printA(5,9);
    System.out.println(a);
  }
  public static int printA(int a, int b){
    if (a>b){
      return a;
    } else {
      return b;
    }
  }
}

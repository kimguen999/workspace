public class Test2_5 {
  public static void main(String[] args) {
    String a = printA(85);
    System.out.println(a);
  }
  public static String printA(int a){
    if (a>=90){
      return "A";
    } else if (a>=70) {
      return "B";
    } else {
      return "C";
    }
  }
}

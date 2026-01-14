public class Test3_3 {
  public static void main(String[] args) {
    int b = printA();
    System.out.println(b);
  }
  public static int printA(){
    int result = (int)(Math.random()*50+1);
    return result;
  }
}

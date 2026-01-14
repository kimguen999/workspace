public class Test1_11 {
  public static void main(String[] args) {
    printA(6,8);
  }
  public static void printA(int a, int b){
    if (a%2==0 && b%2==0){
      System.out.println("둘다 짝수다");
    } else if (a%2==0 || b%2==0){
      System.out.println("하나만 짝수다");
    } else {
      System.out.println("둘다 홀수다");
    }
  }
}

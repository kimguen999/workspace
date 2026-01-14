public class Test1_13 {
  public static void main(String[] args) {
    printA(4,9);
  }
  public static void printA(int a, int b){

    int max = Math.max(a, b);
    int min = Math.min(a, b);



    for (int i = min+1; i<max; i++){
      System.out.println(i);
    }
  }
}

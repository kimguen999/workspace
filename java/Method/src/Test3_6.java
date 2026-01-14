public class Test3_6 {
  public static void main(String[] args) {
    int[] aa = {1,2,7,5,8,2,4,2};
    int a = printA(aa);
    System.out.println(a);
  }
  public static int printA(int[] a){
    int max = 0;
    for (int j : a) {

      if (max < j) max = j;
    }
    return max;
  }
}

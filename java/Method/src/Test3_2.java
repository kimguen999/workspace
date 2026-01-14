public class Test3_2 {
  public static void main(String[] args) {
    printA(21);
  }
  public static void printA(int a){
    for (int i = 1; i<101; i++){
      if (i%a==0){
        System.out.println(i);
      }
    }
  }
}

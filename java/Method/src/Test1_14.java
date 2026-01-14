public class Test1_14 {
  public static void main(String[] args) {
    printA(4,11);
  }
  public static void printA(int a, int b){
    int max = Math.max(a,b);
    int min = Math.min(a,b);
    int cnt = 0;

    for (int i = min+1; i<max; i++){
      if (i%5==0) cnt++;
    }
    System.out.println("5의 배수는 "+cnt+"개");
  }
}

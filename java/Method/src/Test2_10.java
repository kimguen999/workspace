public class Test2_10 {
  public static void main(String[] args) {
    boolean b = printA("집 가고싶다");
    System.out.println(b);
  }

  public static boolean printA(String a){
    if (a.length()%2==0){
      return true;
    } else {
      // return str.Length() % ==0? true:false;
      return false;
    }
  }
}

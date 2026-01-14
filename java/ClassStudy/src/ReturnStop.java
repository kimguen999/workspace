public class ReturnStop {

  public void printEven(int num){
    if (num%2!=0){
      return;
    }
    System.out.println(num);
  }

  public static void main(String[] args) {
    ReturnStop r1 = new ReturnStop();
    r1.printEven(6);
  }
}

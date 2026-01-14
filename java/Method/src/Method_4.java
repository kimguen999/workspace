import javax.sound.midi.Soundbank;

public class Method_4 {
  public static void main(String[] args) {

    printSum(2,8);

    printInfo("동길홍", 20);
  }

  // 매개변수로 전달된 이름과 나이 출력하는 메서드
  public static void printInfo(String sdf,int ffs){
    System.out.println(sdf);
    System.out.println(ffs);

  }
  // 매개변수로 들어온 두 정수의 합을 출력하는 메서드
  // 매개변수로 a,b가 들어온다 생각하면 안됨
  // 매개변수로 정수 2개가 들어온다 봐야함
  public static void printSum(int a, int b){
    System.out.println(a+b);
  }



}

import java.util.Scanner;

public class Test2_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1, n2;
    String clap1, clap2;


    n1 = sc.nextInt();
    if (n1==33||n1==36||n1==39||n1==63||n1==66||n1==69||n1==93||n1==96||n1==99) {
      System.out.println("박수짝짝");
      //10 40 70
    } else if (n1==10||n1==40||n1==70) {
      System.out.println("");
      //0~9
    } else if (n1 / 10 == 0 && n1 % 3 == 0) {
      System.out.println("박수짝");
      //10~19
    } else if (n1 >= 10 && n1 <= 19 && n1 % 3 == 1) {
      System.out.println("박수짝");
      //20~29
    } else if (n1 >= 20 && n1 <= 29 && n1 % 3 == 2) {
      System.out.println("박수짝");

      //40~49
    } else if (n1 >= 41 && n1 <= 49 && n1 % 3 == 1) {
      System.out.println("박수짝");
      //50~59
    } else if (n1 >= 50 && n1 <= 59 && n1 % 3 == 2) {
      System.out.println("박수짝");

      //70~79
    } else if (n1 >= 70 && n1 <= 79 && n1 % 3 == 1) {
      System.out.println("박수짝");
      //80~89
    } else if (n1 >= 80 && n1 <= 89 && n1 % 3 == 2) {
      System.out.println("박수짝");

      //30~39
    } else if (n1 / 30 == 1 ) {
      System.out.println("박수짝");
      //60~69
    } else if (n1 / 60 == 1) {
    System.out.println("박수짝");
      //90~99
    } else if (n1 / 90 == 1 ) {
      System.out.println("박수짝");
    }
  }
}

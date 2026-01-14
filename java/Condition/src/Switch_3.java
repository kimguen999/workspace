import javax.swing.*;
import java.util.Scanner;

public class Switch_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //st
    //스코어 변수의 값이


    int score = 87;
    String grade;
    switch (score/10){
      case 10,9 :
        grade = "A";
        break;
      case 8 :
        grade = "B";
        break;

      case 7 :
        grade = "C";

      case 6 :
        grade = "D";
    }

  }
}

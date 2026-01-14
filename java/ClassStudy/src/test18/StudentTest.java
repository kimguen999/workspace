package test18;

import java.util.Scanner;

public class StudentTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean isRunning = true;
    StudentService studentService = new StudentService();


    System.out.println("학생관리 프로그램을 실행합니다.");
    while (isRunning){
      System.out.println();
      System.out.print("1)학생등록  2) 학생정보변경(연락처)  3)학생정보출력  4)모든학생정보출력  5)프로그램 종료 : ");
      String menu = sc.next();

      switch (menu){
        case "1":
          //학생등록 기능 실행
          studentService.regStudent();
          break;
        case "2":
          //학생정보변경(연락처) 기능 실행
          studentService.changeStuTell();
          break;
        case "3":
          //학생정보출력 기능 실행
          studentService.printStuInfo();
          break;
        case "4":
          //모든학생정보출력 기능 실행
          studentService.printStuInfoAll();
          break;
        case "5":
          System.out.println("프로그램을 종료할까말까");
          isRunning = false;
          break;
        default:
          System.out.println("메뉴를 다시 선택해라");
      }




    }



  }
}

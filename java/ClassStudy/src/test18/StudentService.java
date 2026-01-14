package test18;

import javax.naming.Name;
import java.util.Scanner;

//선언
public class StudentService {
  private Scanner sc;   //키보드 선언
  private int stuCnt; //등록된 학생수 선언
  // 학생 3명이 저장될 공간
  private Student[] students;//자료형[] 객체  //배열 선언

  //생성자
  public StudentService() {
    sc = new Scanner(System.in);    //키보드 생성
    students = new Student[3];    //배열 생성
    stuCnt = 0;   //학생수 생성
  }

  //학생등록
  public void regStudent(){
    System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");
    System.out.print("이름 : ");
    String name = sc.next();
    System.out.print("나이 : ");
    int age = sc.nextInt();
    System.out.print("연락처 : ");
    String tell = sc.next();
    System.out.print("학점 : ");
    String grade = sc.next();

    // 학생 1명 입력받은 정보 객체 생성
    Student s = new Student(name,age,grade,tell);
    //객체 저장
    students[stuCnt++] = s; //학생 1명 저장될 때 마다 0부터 1씩 증가
  }

  //학생정보변경(연락처)
  public void changeStuTell(){
    System.out.println("학생의 연락처를 변경합니다.");
    System.out.print("변경학생 : ");
    String chName = sc.next();

    int matchedIndex = -1;
    for (int i = 0; i<stuCnt; i++){
      if (chName.equals(students[i].getName())){
        matchedIndex = i;
        break;
      }
    }
    if (matchedIndex==-1){
      System.out.println("일치하는 학생이 없습니다.");
    } else {
      System.out.print("연락처 : ");
      String chTell = sc.next();
      students[matchedIndex].setTell(chTell);
      System.out.println(students[matchedIndex]);
      System.out.println("변경 완료 되었습니다.");
    }




  }

  //학생정보출력
  public void printStuInfo(){

    System.out.print("정보를 열람할 학생 : ");
    String info = sc.next();
    int matchedIndex = -1;
    for (int i = 0; i<stuCnt; i++){
      if (info.equals(students[i].getName())){
        matchedIndex = i;
        break;
      }
    }

    if (matchedIndex==-1){
      System.out.println("요청하신 학생의 정보가 없습니다.");
    } else {
      System.out.println("요청하신 학생의 정보입니다.");
      System.out.println(students[matchedIndex]);
    }

  }

  //모든학생정보출력
  public void printStuInfoAll(){
    System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 "+stuCnt+"명입니다.");
    for (int i = 0; i<stuCnt; i++){
      System.out.println(students[i]);
    }
  }
}

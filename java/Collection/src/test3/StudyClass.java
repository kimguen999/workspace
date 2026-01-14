package test3;

//교실 클래스
//- 맴버 변수 : 학생 다수(List를 사용할 것), 반이름, 담담교사명
//- 메소드
// 1) 해당 반의 모든 학생의 모든 정보를 출력하는 기능
// 2) 해당 반의 평균 성적을 리턴하는 기능
// 3) 해당 반에서 최고 성적을 지닌 학생을 리턴하는 기능

import java.util.ArrayList;
import java.util.List;

public class StudyClass {

  private List<Student> stuList;
//  private List<Student> manyStudents2;
//  private List<Student> manyStudents3;
  private String className;
  private String teacherName;

  public StudyClass(String className, String teacherName, List<Student> stuList){

    this.className = className;
    this.teacherName = teacherName;
    this.stuList = stuList;

  }

  public void setStuList(List<Student> stuList){
    this.stuList = stuList;
  }

  public void setClassName(String className){
    this.className = className;
  }

  public void setTeacherName(String teacherName){
    this.teacherName = teacherName;
  }

  public List<Student> getStuList(){
    return stuList;
  }

  public String getClassName() {
    return className;
  }

  public String getTeacherName() {
    return teacherName;
  }

  @Override
  public String toString() {
    return "StudyClass{" +
        "stuList=" + stuList +
        ", className='" + className + '\'' +
        ", teacherName='" + teacherName + '\'' +
        '}';
  }

  // 1) 해당 반의 모든 학생의 모든 정보를 출력하는 기능
  public void stuAllInfo(){

    stuList = new ArrayList<>();
//    manyStudents2 = new ArrayList<>();
//    manyStudents3 = new ArrayList<>();

    stuList.add(new Student("ㄱㄱㄱ",20,91));
    stuList.add(new Student("ㄴㄴㄴ",22,92));
    stuList.add(new Student("ㄷㄷㄷ",24,93));

//    manyStudents2.add(new Student("ㄹㄹㄹ",26,94));
//    manyStudents2.add(new Student("ㅁㅁㅁ",28,95));
//    manyStudents2.add(new Student("ㅂㅂㅂ",30,96));
//
//    manyStudents3.add(new Student("ㅅㅅㅅ",32,97));
//    manyStudents3.add(new Student("ㅇㅇㅇ",34,98));
//    manyStudents3.add(new Student("ㅈㅈㅈ",36,99));


    for (int i = 0; i<stuList.size(); i++){
      System.out.println(stuList.get(i));
    }
  }

  // 2) 해당 반의 평균 성적을 리턴하는 기능

  public int avgScore(){
    int sum = 0;
    int avg = 0;
    int cnt = 0;
    for (int i = 0; i<stuList.size(); i++){
      sum = sum + stuList.get(i).getScore();
      cnt++;
    }
    avg = sum/cnt;
    return avg;
  }


  // 3) 해당 반에서 최고 성적을 지닌 학생을 리턴하는 기능
  public Student highScore(){
    int max = 0;

    Student highStu = null;
    for (int i = 0; i<stuList.size(); i++){
      if (max<stuList.get(i).getScore()){
        max = stuList.get(i).getScore();
        highStu = stuList.get(i);
      }
    }
    return highStu;
  }




}

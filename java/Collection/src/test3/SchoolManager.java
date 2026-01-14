package test3;

import java.util.ArrayList;
import java.util.List;

public class SchoolManager {
  public static void main(String[] args) {

    Student s1 = new Student("ㄱㄱㄱ",18,91);
    Student s2 = new Student("ㄴㄴㄴ",19,92);
    Student s3 = new Student("ㄷㄷㄷ",20,93);
    Student s4 = new Student("ㄹㄹㄹ",21,94);
    Student s5 = new Student("ㅁㅁㅁ",22,95);
    Student s6 = new Student("ㅂㅂㅂ",23,96);
    Student s7 = new Student("ㅅㅅㅅ",24,97);
    Student s8 = new Student("ㅇㅇㅇ",25,98);
    Student s9 = new Student("ㅈㅈㅈ",26,99);

    //학급별 저장되어야 하는 학생 목록 생성
    List<Student> stuList1 = new ArrayList<>();
    stuList1.add(s1);
    stuList1.add(s2);
    stuList1.add(s3);
    List<Student> stuList2 = new ArrayList<>();
    stuList2.add(s4);
    stuList2.add(s5);
    stuList2.add(s6);
    List<Student> stuList3 = new ArrayList<>();
    stuList3.add(s7);
    stuList3.add(s8);
    stuList3.add(s9);

    // 학급 3개 생성
    StudyClass cls1 = new StudyClass("A","ㅎㅎㅎ",stuList1);
    StudyClass cls2 = new StudyClass("B","ㅍㅍㅍ",stuList2);
    StudyClass cls3 = new StudyClass("C","ㅌㅌㅌ",stuList3);

    List<StudyClass> clsList = new ArrayList<>();
    clsList.add(cls1);
    clsList.add(cls2);
    clsList.add(cls3);


    // 학교 생성
    School school = new School(clsList);

    //문제1
    int a = school.getClassList().get(1).getStuList().get(1).getAge();
    System.out.println(a);
    //문제2
    String b = school.getClassList().get(2).getTeacherName();
    System.out.println(b);







    cls1.stuAllInfo();
    System.out.println("평균 : "+cls1.avgScore()+"점");
    System.out.println("최고성적 : "+cls1.highScore());



  }
}

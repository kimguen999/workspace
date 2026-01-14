package test;

import java.awt.font.ImageGraphicAttribute;

public class MyStudent implements StudentUtil {


  @Override
  public int getTotalScore(Student student) {
    return student.getKorScore() + student.getEngScore() + student.getMathScore();
  }

  @Override
  public Student getHighScoreStudent(Student student1, Student student2) {

    return getTotalScore(student1) > getTotalScore(student2) ? student1 : student2;
  }

  @Override
  public String getGradeByStudentName(Student[] students, String name) {

    String result = "학생 정보 없음";
    for (Student e : students) {  //(자료형 요소1개 : 반복돌릴것)
      if (e.getName().equals(name)) {
        double avg = getTotalScore(e) / 3.0;
        getGrade(avg);
        break;
      }
    }
    return result;
  }

  @Override
  public int[] getTotalScoresToArray(Student[] students) {

    int[] totalScoreArr = new int[students.length];
    for (int i = 0; i<totalScoreArr.length; i++) {
      totalScoreArr[i] = getTotalScore(students[i]);
    }
    return totalScoreArr;
  }


  // 점수에 따른 등급을 리턴하는 메서드
  public String getGrade(double avg) {
    String result = null;
    if (avg >= 90 && avg < 100) {
      result = "A";
    } else if (avg >= 80 && avg < 90) {
      result = "B";
    } else if (avg >= 70 && avg < 80) {
      result = "C";
    } else if (avg < 70) {
      result = "D";
    } return result;
  }

}

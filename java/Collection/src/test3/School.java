package test3;

//학교 클래스
//- 맴버변수 : 교실 다수(List를 사용할 것) - 메소드
// 1) 매개변수로 담당교사명을 받아, 해당 담당교사가 맡고 있는 모든 반의 학생 정보를 출력
// 2) 각 반별로 반별 평균 점수 및 전체 학급에 대한 평균 점수를 출력
// 3) 모든 반에서 최고 성적을 가진 학생의 이름과 점수를 출력
// 4) 매개변수로 반 이름을 받아, 해당 반의 평균을 리턴하는 기능

import java.util.ArrayList;
import java.util.List;

public class School {

  private List<StudyClass> classList;

  public School(List<StudyClass> classList) {
    this.classList = classList;
  }

  public List<StudyClass> getClassList() {
    return classList;
  }

  public void setClassList(List<StudyClass> classList) {
    this.classList = classList;
  }


// 1) 매개변수로 담당교사명을 받아, 해당 담당교사가 맡고 있는 모든 반의 학생 정보를 출력












}

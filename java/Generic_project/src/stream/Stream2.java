package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream2 {
  public static void main(String[] args) {

    List<Student> stuList = new ArrayList<>();
    stuList.add(new Student("kim", 100, 91));
    stuList.add(new Student("kim1", 101, 92));
    stuList.add(new Student("kim2", 102, 93));
    stuList.add(new Student("kim3", 103, 94));
    stuList.add(new Student("kim4", 104, 95));
    stuList.add(new Student("kim5", 105, 96));

    // 1. 국어점수가 80점 이상인 학생 추출
    List<Student> l1 =  stuList.stream()
        .filter(stu -> stu.getKorScore() >= 80)
        .toList();

    // 2. 국어 102 이상, 영어 91이상인 학생만 추출
    List<Student> l2 = stuList.stream()
        .filter(stu->stu.getKorScore()>=102 && stu.getEngScore()>=91).toList();

    List<Student> l3 = stuList.stream()
        .filter(stu->stu.getKorScore()>=102)
        .filter(stu->stu.getEngScore()>=91)
        .toList();

    // 3. 국어점수만 리프트로 추출
    List<Integer> l4 = stuList.stream()
        .map(stu->stu.getKorScore())
        .toList();


    // 4. 총점 195점 이상 학생들의 이름을 리스트로 반환
    List<String> l5 =  stuList.stream()
        .filter(stu->(stu.getKorScore() + stu.getEngScore()) >= 195)
        .map(stu->stu.getName())
        .toList();

    // 국어 점수의 합
    int l6 = stuList.stream()
        .mapToInt(stu->stu.getKorScore()).sum();

    // 평균 국어점수
    double l7 = stuList.stream()
        .mapToInt(stu->stu.getKorScore()).average().getAsDouble();

    // 가장 큰수
    int l8 = stuList.stream()
        .mapToInt(stu->stu.getKorScore())
        .max().getAsInt();

    // 가장 작은 수
    int l9 = stuList.stream()
        .mapToInt(stu->stu.getKorScore())
        .min().getAsInt();

    // 학생수
    long l10 = stuList.stream()
        .mapToInt(stu->stu.getKorScore()).count();



  }
}

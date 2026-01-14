package test18;

public class Student {

  private String name;
  private int age;
  private String grade;
  private String tell;

  public Student(String name, int age, String grade, String tell) {
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.tell = tell;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTell() {
    return tell;
  }

  public void setTell(String tell) {
    this.tell = tell;
  }

  public String toString() {
    return "이름 : " + name + ", 나이 : " + age +
        ", 학점 : " + grade + ", 연락처 : " + tell;
  }
}

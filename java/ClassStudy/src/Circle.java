import javax.sound.midi.Soundbank;

public class Circle {

  // 접근제한자 : 멤버변수 및 메서드의 접근 범위를 지정하는 문법
  // public > default > protected > private
  // private : 멤버 변수 및 메서드를 정의한 클래스 내에서만 접근 허용
  // protected : pass (상속 개념 알아야함)
  // default : 같은 패키지 내에서 접근 허용 (접근제한자를 작성하지 않는 것이 default 접근제한자)
  // public : 같은 프로젝트 내에서 접근 허용

  // 결론
  // 멤버변수는 항상 private 접근제한자를 사용!
  // 메서드의 접근제한자는 일단은 public 사용.

  private double r;
  // Circle 클래스 안에서만 사용 가능
  // ㄴ> CircleTest에서는 사용 불가. 오류
  //    멤버 변수 앞에는 private 쓰자.

  int i;
  //ㄴ> default 접근제한자가 생략된것.


  public void setR(double r) {
    if (r < 0) this.r = 0.0;
     else
       this.r = r;
  }

  // 원의 둘레를 리턴 2*pi*r
    public double getSize(){
      // 상수 Math.PI;   상수라서 앞뒤 다 대문자
      return 2* Math.PI*r;
    }

  // 원의 넓이를 리턴 pi*r*r
    public double getArea(){
      return Math.PI*r*r;
    }


}

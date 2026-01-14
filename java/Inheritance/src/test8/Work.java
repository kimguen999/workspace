package test8;

// 좋은 코딩이란 ★결합도는 낮고, 응집도는 높아야★한다.
// 응집도 높다 : 한 클래스 안에 필요한건 그 안에 다 있는것.

public class Work {
  public static void main(String[] args) {


    B bp = new B();
    B bp1 = new B(10);
    B bp2 = new B(10,20);
    B bp3 = new B(10,20,30);
    B bp4 = new B(10,20,30,40);
    bp.disp();
    bp1.disp();
    bp2.disp();
    bp3.disp();
    bp4.disp();

  }
}

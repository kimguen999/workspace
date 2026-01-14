package test8;

public class A {
  private int x;
  private int y;

  public A(){
    x = 1;
    y = 1;
  }

  public void disp(){
    System.out.print("x : "+x+", y : "+y);
  }
//  public int getX() {
//    return x;
//  }
//  public int getY() {
//    return y;
//  }
  public A(int x){
    this.x = x;
    y = 1;
  }
  public A(int x, int y){
    this.x = x;
    this.y = y;
  }

}

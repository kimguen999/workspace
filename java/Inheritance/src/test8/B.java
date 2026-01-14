package test8;

public class B extends A{
  private int x;
  private int y;

  public B(){
  //  super(); super()안적어도 자동으로 호출
    x = 1;
    y = 1;
  }
  public void disp(){
    super.disp();
    System.out.println(", x : "+x+", y : "+y);
    //  A클래스에 getter setter 가져와서 쓰면 응집도가 낮은 코딩이 된다.
    //  System.out.println(super.getX()+super.getY());
  }
  public B(int x){
    super(x);
    this.x = 1;
    y = 1;
  }
  public B(int x, int y){
    super(x,y);
    this.x = 1;
    this.y = 1;
  }
  public B(int x, int y, int x1){
    super(x,y);
    this.x = x1;
    this.y = 1;
  }
  public B(int x, int y, int x1, int y1){
    super(x,y);
    this.x = x1;
    this.y = y1;
  }

}

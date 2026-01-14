package test;

public class Math implements MathUtil{

  // 1
  public boolean isEven(int a, int b, int c){
    return (a+b+c)%2==0 && (a+b+c)%5==0;
  }

  // 2

  public double getSumFromOne(int num){
    int sum = 0;
    for (int i = 1; i<num+1; i++){
      sum = sum + i;
    }
    return sum;
  }

  // 3
  public double getCircleArea(int rad){
    if (rad<0){
      return 0;
    } else {
      return java.lang.Math.PI * (double) rad * rad;
    }
    // return rad<0 ? 0 : java.lang.Math.PI * (double) rad * rad;
  }

}

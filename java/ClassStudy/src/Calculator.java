import com.sun.source.tree.CaseTree;

public class Calculator {

  int num1;
  int num2;
  String yunsan;
//  double result;

  public void setCal(int num1, int num2, String yunsan){
    this.num1 = num1;
    this.num2 = num2;
    this.yunsan = yunsan;
  }

//  public int getNum1() {
//    return num1;
//  }
//
//  public void setNum1(int num1) {
//    this.num1 = num1;
//  }
//
//  public int getNum2() {
//    return num2;
//  }
//
//  public void setNum2(int num2) {
//    this.num2 = num2;
//  }
//
//  public String getYunsan() {
//    return yunsan;
//  }
//
//  public void setYunsan(String yunsan) {
//    this.yunsan = yunsan;
//  }
//
//  public double getResult() {
//    return result;
//  }
//
//  public void setResult(double result) {
//    this.result = result;
//  }
//


  //연산 결과 출력
  public void printResult(){

    if (!yunsan.equals("+")&&!yunsan.equals("-")&&!yunsan.equals("*")&&!yunsan.equals("/")){
      System.out.println("연산자를 잘못입력했음");
      return;
    } else{

    System.out.print(num1+" "+yunsan+" "+num2+" = ");
    switch (yunsan) {
      case "+":
        System.out.print(num1 + num2);
        break;
      case "-":
        System.out.print(num1 - num2);
        break;
      case "*":
        System.out.print(num1 * num2);
        break;
      case "/":
        System.out.print(num1 / (double) num2);
    }
    }

  }





}

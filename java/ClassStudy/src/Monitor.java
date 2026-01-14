public class Monitor {

  String modelName;
  int price;
  double inch;

  public Monitor(){

  }
  // 생성자 오버로딩
  public Monitor(String a){

  }
  // 생성자 오버로딩
  public Monitor(int num, int b){

  }




  // 생성자
  public Monitor(int price){
    modelName = null;
    this.price = price;
    inch = 0.0;
  }

  // 매서드 오버로딩
  // 매서드의 매개변수의 갯수, 매개변수의 자료형이 다르면 매서드명 중복 선언 가능
  public void aaa(){
    System.out.println(10);
  }
  public void aaa(int a){

  }
  public void aaa(String a){

  }



}

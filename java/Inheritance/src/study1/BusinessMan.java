package study1;

public class BusinessMan extends Man{
  String company;

  // 모든 멤버변수를 초기화 하는것이 좋은 코드.
  // 상속받은 변수는 어디서 초기화하는 것이 좋을까?

  public BusinessMan(String company){
    //상속 관계에 있는 클래스의 생성자 첫 줄에는 super()가 숨겨져있음.
    // super(); //부모클래스 중 매개변수가 없는 생성자 호출, 부모클래스에 생성자가 없을 시 자동으로 매개변수가 없는 생성자가 만들어지기 때문에 오류x, but 부모클래스에 매개변수가 있는 생성자 만들었을 시 오류 발생
    super("kimguen"); // 부모클래스 중 매개변수가 문자열 하나인 생성자 호출
    this.company = company;
  //  name = null; 상속받은 변수는 부모클래스(Class Man)에서 초기화하는것이 좋은 코드
  }

  public void tellCompany(){
    System.out.println("Company = "+company);
  }

}

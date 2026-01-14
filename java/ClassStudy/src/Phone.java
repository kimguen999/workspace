// 핸드폰 객체 생성을 위한 설계도
// 클래스의 구성요소 : 변수, 메서드, 생성자
// 1. 변수(멤버변수, 필드)
  // 지금까지(메서드 안에서) 선언한 변수는 지역변수(local variable)라 부른다.
  // 지역변수는 반드시 초기화가 필요!, 멤버변수는 자동으로 초기화 진행
// 2. 메서드의 정의
// 메서드 정의 문법
// 접근제한자 리턴타입 메서드명(매개변수){
// }
  //
  //
// 3. 생성자
//
//
//



public class Phone {
  // 변수로 정보 표현
  int price; //가격
  String modelName; //모델명
  String brand; //브랜드


  // 문자 기능(메서드 정의)
  public void sendSms(String msg){
    int age; // 지역변수
  //System.out.println(age); 오류발생
    System.out.println(price); //오류발생x
    System.out.println("문자를 보냅니다 : "+msg);
  }

  // 전화하기 기능
  public void call(String sender){
    System.out.println(sender+"님으로 부터 전화가 왔습니다.");
  }

  // 지금까지 변수 선언을 메서드 정의 안에서 했음






}

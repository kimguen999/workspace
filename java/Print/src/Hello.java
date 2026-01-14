//자바의 모든 내용은 클래스 안에 작성한다!
//클래스 안데는 반드시 main  매소드가 존재해야한다.
//우리가 작성하는 코드는 반드시 main 매소드 안데 작성한다
//코드 해석은 main 매소드 안듸 첫줄부터 차례로 해석함
//명령어가 끝나면 반드시 세미콜론을 붙인다.

public class Hello {
  public static void main(String[] args){ //메인 매소드
    System.out.println("hello~"); //출력문 (한줄 개행)
    //소괄호 안의 내용 출력
    //문자열을 출력할 경우 반드시 쌍따옴표로 감싸야한다.
    //Shift+F10 누르면 나오는 창은 출력창, 콘솔창이라 부른다.
    //문자 : 한글자
    //문자열 : 한글자 이상의 글자
    System.out.println("a");
    System.out.print("hi~"); //소괄호 안의 내용을 출력만함 (한줄 개행 안함)
    System.out.print("hi~");
    System.out.println("hi~");
    //숫자는 쌍따옴표에 감싸지 않는다
    System.out.println(8);  //숫자취급, 계산가능
    System.out.println("8");//문자열취급, 연산필요없는경우

  }
}

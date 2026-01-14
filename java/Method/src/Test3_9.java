import java.util.Arrays;

public class Test3_9 {
  public static void main(String[] args) {
    //정수형 배열 하나를 매개변수로 받아 배열의 요소 중 홀수를 제거한 새로운 배열을 리턴하는 메소드를 만들어보세요.
    int[] a = {1,4,8,2,3};
    int[] result = test3_9(a);
    System.out.println(Arrays.toString(result));


  }
  public static int[] test3_9(int[] a){
    // 한번 만들어진 배열의 크기는 변경 불가
    // 5개의 배열 중 홀수 제거하고 새로운 배열을 만들어야함
    // ex) a = {1,4,5,6,3} -> {4,6}
    // 1. 배열 요소에서 짝수의 갯수를 구한다.
    int cnt = 0;
    for (int i = 0; i<a.length; i++){
      if(a[i]%2==0){
        cnt++;
      }
    }
    // 2. 답을 저장할 배열 생성
    int[] b = new int[cnt];
    // 3. 요소 중 짝수만 저장시킴
    // 답이 들어갈 배열의 인덱스 번호
    int index = 0;
    for (int i = 0; i<a.length; i++){
      if (a[i]%2==0){
        b[index] = a[i];
        index++;
        // == b[index++] = a[i];
      }
    }
    return b;




  }
}

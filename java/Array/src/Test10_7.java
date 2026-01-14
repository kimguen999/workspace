import java.util.Arrays;

public class Test10_7 {
  public static void main(String[] args) {

    //정수 10개를 담을 수 있는 배열을 생성하고, Math.random()함수를 사용하여 1 ~ 100의 정수를 배열 각 요소에 저장하자. 배열에 저장된 모든 정수 및 최소값, 최대값 출력해보라. (Math.random() 메소드는 0 <= x < 1 사이의 실수를 리턴한다.)
    int max = 0;
    int min = 100;
    int[] arr = new int[10];
    for (int i = 0; i<arr.length; i++){
      arr[i] = (int)(Math.random()*100+1);
    }
    System.out.print(Arrays.toString(arr));
    for (int j : arr) {
      if (max < j) {
        max = j;
      }
    }
    for (int i = 9; i>0; i--){
      if (min>arr[i]){
        min = arr[i];
      }
    }
    System.out.println();
    System.out.println("최대값 : "+max);
    System.out.println("최소값 : "+min);

  }
}

import java.util.Arrays;

public class Test10_5 {
  public static void main(String[] args) {

    //간단한 로또번호 생성기를 만들어보자. 길이가 6인 정수형 배열을 생성하고, 배열의 모든 요소에 1에서 45까지의 랜덤한 정수를 넣어보자. 그리고 배열의 모든 요소를 출력해보자.(1과 45를 포함하고, 중복값은 허용한다.)

    int[] arr = new int[6];

    for (int i = 0; i<arr.length; i++){
      arr[i] = (int)(Math.random()*45+1);
      System.out.print(arr[i]+" ");
    }

    System.out.println(Arrays.toString(arr));


  }
}

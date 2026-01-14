public class Test10_8 {
  public static void main(String[] args) {

    //길이가 100인 배열을 만들고 각 요소의 값을 1 ~ 100으로 변경하자. 그 후 배열에 들어간 수 중 소수만 출력해보자. (소수란 1과 자신의 수로만 나누어 떨어지는 수이다. ex> 2,3,5,7..)

    int[] arr = new int[100];
    for (int i = 0; i<arr.length; i++){
      arr[i] = i+1;
    }
    for (int i = 2; i<arr.length; i++){

      int cnt = 0;
      for(int j = 1; j < arr[i]; j++) {

        if (arr[i] % j == 0) {
          cnt++;
          if (cnt>2){
            break;
          }
        }
      }
      if (cnt == 1){
        System.out.println(i);

      }
    }


  }
}

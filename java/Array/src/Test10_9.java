public class Test10_9 {
  public static void main(String[] args) {

    //위 5번 문제를 토대로 풀어본다. 로또는 1 ~ 45의 수 중 랜덤한 수를 6개 고르는 것이다. 그리고 6개의 수들은 중복되지 않는 각기 다른 수를 가진다. 위 5번 문제는 중복을 허용했지만 실제 로또처럼 중복 값은 없게 풀어보아라.

    int[] arr = new int[6];
    int re = 0;
    for (int i = 0; i<arr.length; i++){
      arr[i] = (int)(Math.random()*45+1);
      for (int j = 0; j<arr.length; j++){

      }

      if (arr[i]==arr[i-1]) {
        i--;
      }

      System.out.print(arr[i]+" ");
    }
  }
}

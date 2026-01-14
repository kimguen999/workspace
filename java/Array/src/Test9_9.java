public class Test9_9 {
  public static void main(String[] args) {
    //1,5,7을 초기값으로 저장하고 있는 배열을 만들고, 배열의 모든 요소의 합을 출력해보아라
    int sum = 0;
    int[] arr1 = {1,5,7};
    for (int i = 0; i<arr1.length; i++){
      sum = sum + arr1[i];
    }
    System.out.println(sum);
  }
}

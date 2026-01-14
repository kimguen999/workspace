package array;

public class EnhancedFor {
  public static void main(String[] args) {

    // for문의 다른 형태 (향상된 for문, for-each문, Enhanced-for)
    int[] arr1 = {1,3,5,7,9};

    // for-each문 (배열의 요소를 하나씩 데이터에 지칭할 변수 : 반복할 데이터)
    for (int e : arr1){
      System.out.println(e);
    }

    String[] arr2 = {"A", "B", "C"};
    for (String e:arr2){
      System.out.println(e);
    }

    System.out.println();

    // 배열의 요소 중 2.0 이상의 요소만 출력 (for-each문)
    double[] arr3 = {1.1, 2.2, 3.3};
    for (double e : arr3){
      if (e>=2.0){
        System.out.println(e);
      }
    }



  }
}

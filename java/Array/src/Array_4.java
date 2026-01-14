import java.util.Arrays;

public class Array_4 {
  public static void main(String[] args) {

    // 배열이 자료형이라는 의미
    int[] a1 = {1,2,3};
    // String[] a2 = ai; ai과 a2는 자료형이 다르다
    // int d = ai; 정수와 정수배열은 자료형이 다르다

    int[] a3 = a1;

    int[] arr1 = {1,3,5};
    int[] arr2 = {4,5};
    arr2 = arr1;
    arr2[0] = 6;
    arr1[1] = 7;
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));


  }
}

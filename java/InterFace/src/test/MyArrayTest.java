package test;

import java.util.Arrays;

public class MyArrayTest {
  public static void main(String[] args) {

    ArrayUtil ar = new MyArray();
      int[] ar1 = {20,9,5};
      int[] ar2 = {15,8,5};
      int result1 = ar.getArraySum(ar1,ar2);
      System.out.println(result1);

      int[] ar3 = {2,4,6};
      boolean result2 = ar.isEvenArray(ar3);
      System.out.println(result2);


      String[] a = {"a","aaa","aa"};
      int[] result3 = ar.getStrLengthArray(a);
      System.out.println(Arrays.toString(result3));


  }

}

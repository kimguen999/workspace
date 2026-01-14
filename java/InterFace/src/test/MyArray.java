package test;

public class MyArray implements ArrayUtil{


  @Override
  public int getArraySum(int[] arr1, int[] arr2) {
    int sum1 = 0;
    int sum2 = 0;

    for (int e : arr1){
      sum1 = sum1 + e;
    }
    for (int e : arr2){
      sum2 = sum2 + e;
    }
    return (sum1+sum2)/(arr1.length+arr2.length);
  }

  @Override
  public boolean isEvenArray(int[] arr) {
    boolean isAllEven = true;
      for (int e : arr){
        if (e%2!=0){
          isAllEven = false;
          break;
        }
      }
    return isAllEven;

//    for (int i = 0; i<arr.length; i++){
//      if (arr[i]%2==0){
//      }
//    } return true;
  }

  @Override
  public int[] getStrLengthArray(String[] arr) {
    int[] a = new int[arr.length];
    for (int i = 0; i<arr.length; i++){
      a[i] = arr[i].length();
    }
    return a;
  }


}

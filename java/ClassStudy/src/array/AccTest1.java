package array;

public class AccTest1 {
  public static void main(String[] args) {




    // 계좌를 3개 저장할 수 있는 배열 arr[]을 생성
    // int[] arr = new int[3]
    Acc[] arr = new Acc[3];
    // ㄴ>계좌를 3개 만든게 아니라 계좌가 들어갈수 있는 공간 3개를 만든것
    System.out.println(arr[0]);

    // arr 배열에 계좌 정보 저장
    // 1. 계좌 정보 생성
    Acc a1 = new Acc("kim", "12345", 10000);
    Acc a2 = new Acc("Lee", "23456", 20000);
    Acc a3 = new Acc("Park", "34567", 30000);

    // 2. 생성한 계좌 정보를 배열에 저장
    arr[0] = a1;
    arr[1] = a2;
    arr[2] = a3;

    // 문제1. 배열의 0번째 요소에 저장된 예금액 출력
    System.out.println(arr[0].getBalance());

    // 문제2. 배열의 1번 요소에 저장된 계좌의 모든 정보 출력
    System.out.println(arr[1]);

    // 문제3. 배열에 저장된 모든 계좌의 예금액 합을 출력
    int sum = 0;
    for (int i = 0; i<arr.length; i++){
      sum = sum + arr[i].getBalance();
    }
    System.out.println(sum);

    System.out.println("------------------------------");

    // 문제3. for-each문
    int sum1 = 0;
    for (Acc e : arr){
      sum1 = sum1 + e.getBalance();
    }
    System.out.println(sum1);

    System.out.println("----------------------------------");

    // 문제4. 배열에 저장된 계좌정보 중 계좌번호가 '23456'인 계좌를 찾고, 해당 계좌의 계좌주를 출력
    for (int i = 0; i<arr.length; i++){
      if (arr[i].getAccNum().equals("23456")){
        System.out.println(arr[i].getOwner());
      }
    }
    System.out.println("===========================");

    // 문제4. for-each문
    for (Acc e:arr){
      if (e.getAccNum().equals("34567")){
        System.out.println(e.getOwner());
      }
    }


  }
}

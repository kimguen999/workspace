package test1;

//이름을 저장하는 리스트를 만들고 리스트에 적당히 데이터를 저장한다. 그 후 저장된 이름 중 ‘홍길동’이라는 이름이 있다면 ‘해당 이름이 존재합니다.’라는 문구를 출력하는 프로그램을 만들어라.

import java.util.ArrayList;
import java.util.List;

public class Test3 {
  public static void main(String[] args) {

    List<String> listS = new ArrayList<>();
    listS.add("ㅁㅁㅁ");
    listS.add("홍길동");
    listS.add("ㄱㄱㄱ");
    listS.add("ㄴㄴㄴ");
    listS.add("ㄷㄷㄷ");

    for (int i = 0; i<listS.size(); i++){
      if (listS.get(i).equals("홍길동")){
        System.out.println(listS.get(i));
        break;
      }
    }




  }
}

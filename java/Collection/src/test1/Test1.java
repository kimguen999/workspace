package test1;

import java.util.ArrayList;
import java.util.List;

//문자열을 저장하는 리스트를 만들고 3개의 데이터를 넣어보자. 그 후 리스트에 저장된 3개의 데이터를 출력해보라.

public class Test1 {
  public static void main(String[] args) {

    List<String> listm = new ArrayList<>();
    listm.add("문자열1");
    listm.add("문자열2");
    listm.add("문자열3");

    for (int i = 0; i<listm.size(); i++){
      System.out.println(listm.get(i));
    }
    System.out.println("---------------------");
    for (String e : listm){
      System.out.println(e);
    }



  }

}

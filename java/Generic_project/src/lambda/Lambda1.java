package lambda;

public class Lambda1 {
  public static void main(String[] args) {

    Test1 t1 = s->System.out.println(s);
    ;
    t1.aaa(10);

    Test2 t2 = (a,b)->{
      System.out.println(a);
      System.out.println(b);
    };
    t2.bbb("쩡이",20);

//    Test3 t3 = (num)->{
//      return num + 3;
//    };
//    t3.ccc(30);

    Test3 t3 = num->num+3;
    int result = t3.ccc(30);
    System.out.println(result);
  }
}

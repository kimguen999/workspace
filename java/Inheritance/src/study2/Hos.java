package study2;

public class Hos {
  public static void main(String[] args) {

    // 다형성
    Animal[] cage = new Animal[5];
    cage[0] = new Dog();
    cage[1] = new Cat();
    cage[2] = new Cow();
    cage[3] = new Dog();
    cage[4] = new Cow();
// 오버라이딩과 다형성을 같이 사용하면 다양한 메서드를 부모로 상속 해서 반복문 적고, 자기자신의 결과만 도출 가능
    for (int i = 0; i<cage.length; i++){
      cage[i].cry();
    }



    Dog[] dogCage = new Dog[5];
    Cat[] catCage = new Cat[5];
    Cow[] CowCage = new Cow[5];

    dogCage[0] = new Dog();
    dogCage[1] = new Dog();
    catCage[0] = new Cat();
    catCage[1] = new Cat();
    CowCage[0] = new Cow();
    CowCage[1] = new Cow();



  }
}

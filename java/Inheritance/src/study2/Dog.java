package study2;

class Animal{
  public void cry(){
    System.out.println("동물이 웁니다");
  }
}


public class Dog extends Animal{
  // 오버라이딩
  public void cry(){
    System.out.println("강아지가 웁니다");
  }
}

class Cat extends Animal{
  public void cry(){
    System.out.println("고양이가 웁니다");
  }
}

class Cow extends Animal{
  public void cry(){
    System.out.println("소갈비가 웁니다");
  }
}
public class Student {

  String name;
  int age;
  String add;
  int number;
  String contact;

  public void setInfo(String name, int age, String add, int number, String contact){
    this.name = name;
    this.age = age;
    this.add = add;
    this.number = number;
    this.contact = contact;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAdd() {
    return add;
  }

  public void setAdd(String add) {
    this.add = add;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public void printInfo(){
    System.out.println("이름 : "+name);
    System.out.println("나이 : "+age);
    System.out.println("주소 : "+add);
    System.out.println("학번 : "+number);
    System.out.println("연락처 : "+contact);
  }
}

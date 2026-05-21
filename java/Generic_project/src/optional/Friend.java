package optional;

import java.util.Optional;

public class Friend {
  String name;
  Company company;

  public Friend(String name, Company company) {
    this.name = name;
    this.company = company;
  }

  public String getName() {
    return name;
  }

  public Company getCompany() {
    return company;
  }

  // Optional 안썼을 경우

  // 매개변수로 Friend 객체가 전달되면 주소 정보를 출력하는 기능
  public void printAddress(Friend friend){

    Optional<Friend> o = Optional.ofNullable(friend);

    String address = o.map((e)->{return e.getCompany();})
        .map((e)->{return e.getContact();})
        .map((e)->{return e.getAddress();})
        .orElseGet(()->{return "연락처 없음";});
    System.out.println(address);


    /// /////////////////////////////////////////////////////////

    // null 체크 하면 다털림(데이터가 null일 경우 가정) 안정성 X
    // if로 null이 아니라고 가정해야함
    String address1 = null;
    if(friend != null){
      Company c = friend.getCompany();
      if (c != null){
        Contact contact = c.getContact();
        if (contact != null){
          address1 = contact.getAddress();
        }
      }
    }
    if (address1 == null){
      System.out.println("주소 정보가 존재하지 않습니다.");
    } else {
      System.out.println(address1);
    }

    // ===============

    String address2 = friend.getCompany().getContact().getAddress();
    // 안정성 떨어져서 실무에서 사용 X
    System.out.println(address1);



  }
}




class Company{
  String compName;
  Contact contact;

  public Company(String compName, Contact contact){
    this.compName = compName;
    this.contact = contact;
  }
  public String getCompName(){
    return compName;
  }
  public Contact getContact(){
    return contact;
  }
}



class Contact{
  String phone;
  String address;
  /// 생성자
  public Contact(String phone, String address){
    this.phone = phone;
    this.address = address;

  }
  public String getPhone(){
    return phone;
  }
  public String getAddress(){
    return address;
  }

}

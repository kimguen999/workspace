package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
  Scanner sc = new Scanner(System.in);

  //사원 관리 프로그램을 만들어보자. 먼저 사원정보를 갖는 사원클래스(Emp)를 만들어야 하고, 사원클래스의 정보로는 사번(정수), 이름, 부서명, 연락처, 월급의 데이터가 있다.
  //두 번째로 EmpService라는 클래스를 만들어라. EmpService는 사원과 관련한 기능이 선언된 클래스이다. 해당 클래스에서 기능을 구현하기 전 사원 객체를 다수 저장할 수 있는 List객체를 만들고, 생성자에서는 List 객체에 임의로 데이터로 초기화된 사원 객체를 5 ~ 10개 정도 추가하는 코드를 작성한다. 그 후 아래의 문제를 해결할 수 있는 메서드를 구현하여라.

  private List<Emp> empList;

  public EmpService(){
    empList = new ArrayList<>();

    empList.add(new Emp(1,"김자바", "개발부","010-1134-1111", 12340));
    empList.add(new Emp(2,"김자반", "개발부","010-1111-2222", 15340));
    empList.add(new Emp(3,"김지바", "생산부","010-4361-3333", 1600));
    empList.add(new Emp(4,"김지반", "생산부","010-1111-4444", 1064));
    empList.add(new Emp(5,"김자부", "총무부","010-1167-5555", 108540));
    empList.add(new Emp(6,"김자비", "인사부","010-1341-6666", 1540));

  }
//1) EmpService 클래스에 로그인하는 메소드를 구현하여라. 메소드를 호출하면 아래와 같은 결과가 나와야한다
  public void login(){
    boolean muhan = true;
    while (muhan){
      System.out.print("사번 : ");
      int sabun = sc.nextInt();
      System.out.print("비밀번호(연락처의 마지막 4자리) : ");
      String bibun = sc.next();
      for (int i = 0; i<empList.size(); i++){
        if (sabun == empList.get(i).getEmpNo() && bibun.equals(empList.get(i).getTel().substring(9))){
          System.out.println("로그인 하였습니다.");
          System.out.println("'"+empList.get(i).getImpName()+"'님 반갑습니다.");
          muhan = false;
          break;
        }
      } System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
    }
  }

  //2) 키보드로 부서명을 입력받아, 해당 부서에 소속된 사원들의 월급 정보를 출력하는 메소드를 구현하여라.(부서명을 잘못 입력 받는 경우는 없다고 가정한다)
  public void salaryInfo(){
    int salarySum = 0;
    double salaryAvg = 0;
    int salarycnt = 0;
    System.out.print("부서명 : ");
    String buseo = sc.next();
    System.out.println("=="+buseo+"부 월급 현황==");
    for (int i = 0; i<empList.size(); i++){
      if (buseo.equals(empList.get(i).getDeptName())){
        System.out.println("이름 : "+empList.get(i).getImpName()+",  월급 : "+empList.get(i).getSalary());
        salarySum = salarySum + empList.get(i).getSalary();
        salarycnt++;
      }
    }
    salaryAvg = salarySum / (double)salarycnt;

    System.out.println(buseo+"서의 월급 총액은 "+salarySum+"원이며, 평균 급여는 "+salaryAvg+"원입니다.");

  }


  //3) 키보드로 입력받은 부서에 소속된 모든 사원의 월급을 인상하는 메소드를 구현하여라.(부서명을 잘못 입력 받는 경우는 없다고 가정한다)
  public void incSalary(){
    System.out.print("부서명 : ");
    String buseo2 = sc.next();
    System.out.print("인상급여 : ");
    int incMoney = sc.nextInt();
    System.out.println(buseo2+" 각 사원의 급여가 각각 "+incMoney+"원씩 인상됩니다.");
    System.out.println("==월급 인상 후 "+buseo2+" 월급 현황==");
    for (int i = 0; i<empList.size(); i++){
      if (buseo2.equals(empList.get(i).getDeptName())){
        empList.get(i).setSalary(empList.get(i).getSalary()+incMoney);
        System.out.println("이름 : "+empList.get(i).getImpName()+",  월급 : "+empList.get(i).getSalary());

      }
    }



  }



}

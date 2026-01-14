package test2;

public class Emp {

  private int empNo;
  private String impName;
  private String deptName;
  private String tel;
  private int salary;

  public int getEmpNo() {
    return empNo;
  }

  public void setEmpNo(int empNo) {
    this.empNo = empNo;
  }

  public String getImpName() {
    return impName;
  }

  public void setImpName(String impName) {
    this.impName = impName;
  }

  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public Emp(int empNo, String impName, String deptName, String tel, int salary) {
    this.empNo = empNo;
    this.impName = impName;
    this.deptName = deptName;
    this.tel = tel;
    this.salary = salary;
  }
}

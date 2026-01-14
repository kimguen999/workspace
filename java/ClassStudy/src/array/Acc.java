package array;

public class Acc {

  private String owner;
  private String accNum;
  private int balance;

  public Acc() {
    this.owner = "확인안됨";
    this.accNum = "미정";
    this.balance = 0;
  }
  public Acc(String owner, String accNum, int balance) {
    this.owner = owner;
    this.accNum = accNum;
    this.balance = balance;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public String getAccNum() {
    return accNum;
  }

  public void setAccNum(String accNum) {
    this.accNum = accNum;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Acc{" +
        "owner='" + owner + '\'' +
        ", accNum='" + accNum + '\'' +
        ", balance=" + balance +
        '}';
  }
}

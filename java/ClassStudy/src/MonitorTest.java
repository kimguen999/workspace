public class MonitorTest {
  public static void main(String[] args) {

    Monitor m1 = new Monitor(1000);
    System.out.println(m1.price);

    Monitor m2 = new Monitor();
    System.out.println(m2.price);

    Monitor m3 = new Monitor("자바");


  }
}

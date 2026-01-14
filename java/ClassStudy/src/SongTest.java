public class SongTest {
  public static void main(String[] args) {

    Song s1 = new Song();

    s1.printSongInfo();
    System.out.println();
    System.out.println("======================");
    String[] composer = {"KJK", "OIB", "EAD"};
    s1.setSongInfo("좋은날", "IU", "좋은날", 2011, composer);
    s1.printSongInfo();

  }
}

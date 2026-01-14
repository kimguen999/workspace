//아래의 조건을 보고 노래를 나타내는 Song 클래스를 만들어 보세요. Song 클래스는 다음과 같은 필드를 갖는다.
// - 노래 제목을 나타내는 title / - 가수를 나타내는 artist
// - 노래가 속한 앨범 제목을 나타내는 album / - 노래가 발표된 연도를 나타내는 year
// - 노래의 작곡가를 나타내는 compose

import java.util.Arrays;

public class Song {

  String title;
  String artist;
  String album;
  int year;
  // 배열 사용을 위해서는 반드시 배열 생성까지 해야한다.
  String[] composer = new String[3];


  public void setSongInfo(String title1, String artist1, String album1, int year1, String[] composer1){
    title = title1;
    artist = artist1;
    album = album1;
    year = year1;
    composer = composer1;

    }



  public void printSongInfo(){
    System.out.println("노래 제목 : "+ title);
    System.out.println("가수 : "+ artist);
    System.out.println("앨범 제목 : "+ album);
    System.out.println("발표 연도 : "+ year);
    System.out.print("작곡가 : ");

    for (int i = 0; i<composer.length; i++){
      System.out.print(composer[i]+" ");
    }

  }


}

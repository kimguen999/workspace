package board;

// 하나의 게시글 정보를 표현하는 클래서
public class Board {

  private int boardNum;
  private String title;
  private String writer;
  private int reedCnt;

  public Board(int boardNum, String title, String writer, int reedCnt) {
    this.boardNum = boardNum;
    this.title = title;
    this.writer = writer;
    this.reedCnt = reedCnt;
  }

  public int getBoardNum() {
    return boardNum;
  }

  public void setBoardNum(int boardNum) {
    this.boardNum = boardNum;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public int getReedCnt() {
    return reedCnt;
  }

  public void setReedCnt(int reedCnt) {
    this.reedCnt = reedCnt;
  }

  @Override
  public String toString() {
    return "Board{" +
        "boardNum=" + boardNum +
        ", title='" + title + '\'' +
        ", writer='" + writer + '\'' +
        ", reedCnt=" + reedCnt +
        '}';
  }
}

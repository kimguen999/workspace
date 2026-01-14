package study2;

public class FriendManager {
  public static void main(String[] args) {

    Friend[] fs = new Friend[10];
    int cnt = 0; // 저장된 인맥수

    fs[cnt++] = new UnivFriend("Constantine", "evil", "010");
    fs[cnt++] = new UnivFriend("Wick", "kill", "111");
    fs[cnt++] = new CompFriend("Hong", "won", "234");
    fs[cnt++] = new CompFriend("Park", "obj", "444");

    for (int i = 0; i<cnt; i++){
      fs[i].showInfo();
      System.out.println("----------------------");
    }

    // 대학 동창 5명을 저장할수 있는 공간
    UnivFriend[] ufs = new UnivFriend[5];
    int ucnt = 0;
    // 직장 동료 5명을 저장할수 있는 공간
    CompFriend[] cfs = new CompFriend[5];
    int ccnt = 0;

    ufs[ucnt++] = new UnivFriend("Constantine", "evil", "010");
    ufs[ucnt++] = new UnivFriend("Wick", "kill", "111");

    cfs[ccnt++] = new CompFriend("Hong", "won", "234");
    cfs[ccnt++] = new CompFriend("Park", "obj", "444");

//    for (int i = 0; i<ucnt; i++){
//      ufs[i].showUnivInfo();
//    }
//    for (int i = 0; i<ccnt; i++){
//      cfs[i].showCompInfo();
//    }
  }
}

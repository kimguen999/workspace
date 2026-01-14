public class a {
  public static void main(String[] args) {

    Solution s = new Solution();
    int result = s.solution(23);
    System.out.println(result);


  }
}
class Solution {
  public int solution(int angle) {
    String answer;
    if (angle>0&&angle<90){
      answer = "예각";
    } else if (angle==90) {
      answer = "직각";
    } else if (angle>90&&angle<180) {
      answer = "둔각";
    } else {
      answer = "평각";
    }
    return answer;
  }
}





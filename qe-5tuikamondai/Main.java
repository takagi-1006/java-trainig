public class Main {
    public static void main(String[] args) {
      int[] scores = { 20, 30, 40, 50, 80 };
      int sum = SumScores(scores);
      int ave = AveregeScores(scores);
      System.out.println("合計点：" + sum);
      System.out.println("平均点：" + ave);
    }
  
    public static int SumScores(int[] scores) {
      int SumScores= 0;
      for (int i = 0; i < scores.length; i++) {
       SumScores+=scores[i];
      }
      return SumScores;
    }
    public static int AveregeScores(int[] ans){
      int AveregeScores=SumScores(ans);
      int input;
      input=AveregeScores/5;
      return input;
    }
  }
  
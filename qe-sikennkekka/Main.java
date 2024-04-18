public class Main {
    public static void main(String[] args) {
      System.out.print("自己採点結果を入力>");
      int input = new java.util.Scanner(System.in).nextInt();
      if (input >= 60) {
        System.out.println("合格");
      } else if (input < 60) {
        System.out.println("不合格");
      }
      if (input >=80) {
        System.out.println("たいへんよくできました");
      } else if (input >=60) {
        System.out.println("よくできました");
      }else{
        System.out.println("ざんねんでした");
      }
      if (input >= 80) {
        System.out.println("優");
      } else if (input >= 70) {//>=80に当てはまらない時点で80未満であることがわかるので、70以上を書くだけで条件にあてはめれる
        System.out.println("良");
      } else if (input >= 60) {
        System.out.println("可");
      } else 
        System.out.println("不可");
    }
  }
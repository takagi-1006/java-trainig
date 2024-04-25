public class Main {
    public static void main(String[] args) {
      System.out.println("【数あてゲーム】");
      int ans= new java.util.Random().nextInt(10);
      
      for (ans = 0; ans < 5; ans++)
        ;
  
      System.out.println("0~9の数字を入力してください");
      String s = new java.util.Scanner(System.in).nextLine();
      int num = Integer.parseInt(s);
  
      if (ans == num) {
        System.out.println("アタリ！");
      } else {
        System.out.println("違います");
      }
      System.out.println("ゲームを終了します");
    }
  }
  
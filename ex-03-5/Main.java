public class Main {
    public static void main (String[] args) {
     System.out.println("【数あてゲーム】");
     int r=new java.util.Random().nextInt(10);
     int ans=r;
     for (r=0;r<5; r++);

     System.out.println("0~9の数字を入力してください");
     String s=new java.util.Scanner(System.in).nextLine();
     int num=s;
     
     if (ans==num) {
      System.out.println("アタリ！");
     }else{
      System.out.println("違います");
     }
     System.out.println("ゲームを終了します");
    }
}

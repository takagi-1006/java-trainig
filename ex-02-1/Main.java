

public class Main {
    public static void main (String[] args) {
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        String name=new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        int age=new java.util.Scanner(System.in).nextInt();
        int fortune=new java.util.Random().nextInt(3);
        fortune++;
        fortune=new java.util.Random().nextInt(4);
        System.out.println("占いの結果が出ました！");
        System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fortune);
      }
 }

   